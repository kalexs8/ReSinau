package com.example.alat

import java.util.*

class Time {
    var calendarInstance: Calendar

    constructor() {
        calendarInstance = Calendar.getInstance(TimeZone.getDefault())
    }

    constructor(fromMilli: Long) {
        calendarInstance = Calendar.getInstance(TimeZone.getDefault())
        calendarInstance.timeInMillis = fromMilli
    }

    var day: Int
        get() = calendarInstance[Calendar.DAY_OF_MONTH]
        set(day) {
            calendarInstance[Calendar.DAY_OF_MONTH] = day
        }
    var year: Int
        get() = calendarInstance[Calendar.YEAR]
        set(year) {
            calendarInstance[Calendar.YEAR] = year
        }
    var month: Int
        get() = calendarInstance[Calendar.MONTH]
        set(month) {
            calendarInstance[Calendar.MONTH] = month
        }
    var minute: Int
        get() = calendarInstance[Calendar.MINUTE]
        set(minute) {
            calendarInstance[Calendar.MINUTE] = minute
        }
    var hour: Int
        get() = calendarInstance[Calendar.HOUR_OF_DAY]
        set(hour) {
            calendarInstance[Calendar.HOUR_OF_DAY] = hour
        }
    var second: Int
        get() = calendarInstance[Calendar.SECOND]
        set(second) {
            calendarInstance[Calendar.SECOND] = second
        }

    override fun toString(): String {
        val year = year
        val month = month
        val day = day
        val hour = hour
        val minute = minute
        val second = second
        return "$year-$month-$day:$hour-$minute-$second"
    }
}