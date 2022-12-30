import re
from sys import argv

if len(argv) < 2:
    raise Exception("Length argumen minimal harus 2")

soalPattern = re.compile(r"^\d+\..*(\.{3}|=|\?|\.{3} |= |\? )$", re.IGNORECASE | re.MULTILINE)
jawabPattern = re.compile(r"^[a-d|A-D]*\.", re.IGNORECASE)

base_source = ""
out_soal = ""
out_jawab = ""
out_kunci = ""

with open(argv[1]) as f:
    x = f.read().split("\n")
    if len(x) < 4 or len(x) > 4:
        raise Exception("Length file {} harus 4".format(argv[1]))
    base_source = x[0].split("=")[1]
    out_soal = x[1].split("=")[1]
    out_jawab = x[2].split("=")[1]
    out_kunci = x[3].split("=")[1]

soal = []
jawab = []
kunci_jawab = []

with open(base_source, "r") as f:
    s = f.read()
    pecahan = s.split("\n")
    st = ""
    for idx in range(0, len(pecahan)):
        i = pecahan[idx]
        if i.lower() == "--kunci":
            break
        if len(i) < 1:
            continue

        is_soal = soalPattern.search(i) is not None
        is_jawaban = jawabPattern.search(i) is not None
        if not is_soal and not is_jawaban:
            st += i + "\n"
        
        if is_soal:
            soal.append(i)
        
        if is_jawaban:
            jawab.append(i)
            if len(st) > 0:
                soal.append(st)
                st = ""
    encountered_kunci = False
    kunci_jawaban = []
    for i in pecahan:
        if i.lower() == "--kunci":
            encountered_kunci = True
        
        if encountered_kunci and i.lower() != "--kunci":
            should = 0
            if i.lower() == "b":
                should = 1
            elif i.lower() == "c":
                should = 2
            elif i.lower() == "d":
                should = 3
            kunci_jawaban.append(should)
            if len(kunci_jawaban) == 3:
                kunci_jawab.append(kunci_jawaban)
                kunci_jawaban = []


soal_len = len(soal)
remain = soal_len % 3
if soal_len < 3 or remain != 0:
    raise Exception("Jumlah soal harus berbasis 3, Hanya terdapat {} soal, kurang {} soal lagi".format(soal_len, 3 - remain))

del soal_len
del remain

temp = jawab
jawab = []
jtmp = []

for i in range(0, 2):
    if i == 1:
        temp = jawab
        jawab = []
        jtmp = []
    for i in temp:
        jtmp.append(i)
        if len(jtmp) == 3:
            jawab.append(jtmp)
            jtmp = []
del temp
del jtmp


len_kunci = len(kunci_jawab)
len_jawaban = len(jawab)

if len_kunci != len_jawaban:
    if len_kunci > len_jawaban:
        raise Exception("Kunci jawaban melebihi jawaban segmen, harusnya terdapat {} kunci segmen, tetapi lebih {}."
        .format(len_jawaban, len_kunci - len_jawaban)
        + " (Segmen Kunci Jawaban: {}, Segmen Jawaban: {})".format(len_kunci, len_jawaban))
    else:
        raise Exception("Kunci jawaban kurang dari jawaban segmen, harusnya terdapat {} kunci segmen, tetapi kurang {}."
        .format(len_jawaban, len_jawaban - len_kunci)
        + " (Segmen Kunci Jawaban: {}, Segmen Jawaban: {})".format(len_kunci, len_jawaban))

del len_kunci
del len_jawaban

with open(out_soal, "w") as f:
    counter = 1
    f.write("listOf(\n")
    for i in soal:
        if counter % 3 == 0:
            if counter == len(soal):
                f.write('"{}")'.format(i))
            else:
                f.write('"{}"),\n\nlistOf('.format(i))
        else:
            f.write('"{}",\n'.format(i))

        counter += 1

with open(out_jawab, "w") as f:
    len_jwb = len(jawab)
    f.write("listOf(\n")
    for i in range(0, len_jwb):
        f.write("listOf(")
        for x in range(0, len(jawab[i])):
            for j in range(0, len(jawab[i][x])):
                if j == len(jawab[i][x])-1:
                    f.write('"{}"'.format(jawab[i][x][j]))
                else:
                    f.write('"{}",'.format(jawab[i][x][j]))
            if x == len(jawab[i])-1:
                f.write(")\n")
            else:
                f.write("),\nlistOf(")    
        if i == len_jwb-1:
            f.write(")")
        else:
            f.write("),\nlistOf(\n")

with open(out_kunci, "w") as f:
    f.write("listOf(")
    jwb_k = len(kunci_jawab)
    for i in range(0, jwb_k):
        for j in range(0, len(kunci_jawab[i])):
            if j == len(kunci_jawab[i])-1:
                f.write("{}".format(kunci_jawab[i][j]))
            else:
                f.write("{},".format(kunci_jawab[i][j]))
        if i == jwb_k-1:
            f.write(")\n")
        else:
            f.write("),\nlistOf(")