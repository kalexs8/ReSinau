import re

soalPattern = re.compile(r"^\d+\..*(\.{3}|=|\?|\.{3} |= |\? )$", re.IGNORECASE | re.MULTILINE)
jawabPattern = re.compile(r"^[a-d|A-D]*\.", re.IGNORECASE)

soal = []
jawab = []

with open("data.txt", "r") as f:
    s = f.read()
    pecahan = s.split("\n")
    st = ""
    for idx in range(0, len(pecahan)):
        i = pecahan[idx]
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

with open("soal.txt", "w") as f:
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

with open("jawaban.txt", "w") as f:
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