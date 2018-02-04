package com.sandislonjsak.kutils

import java.util.*

/**
 * Operations on java.util.Date class.
 */
object DateUtils {
  /**
   * Date operation types
   */
  private enum class OperationType {
    ADDITION, SUBTRACTION
  }

  /**
   * Adds days to target Date.
   * If days are negative returns date without modifying it.
   *
   * @param date Date to which days need to be added.
   * @param days Amount of days to be added to date.
   * @return Date plus days
   */
  fun addDays(date: Date, days: Int): Date =
    add(date, Calendar.DAY_OF_MONTH, days)

  /**
   * Adds hours to target Date.
   * If hours are negative returns date without modifying it.
   *
   * @param date Date to which hours need to be added.
   * @param hours Amount of hours to be added to date.
   * @return Date plus hours
   */
  fun addHours(date: Date, hours: Int): Date =
    add(date, Calendar.HOUR, hours)

  /**
   * Adds milliseconds to target Date.
   * If milliseconds are negative returns date without modifying it.
   *
   * @param date Date to which milliseconds need to be added.
   * @param milliseconds Amount of milliseconds to be added to date.
   * @return Date plus milliseconds
   */
  fun addMilliseconds(date: Date, milliseconds: Int): Date =
    add(date, Calendar.MILLISECOND, milliseconds)

  /**
   * Adds minutes to target Date.
   * If minutes are negative returns date without modifying it.
   *
   * @param date Date to which minutes need to be added.
   * @param minutes Amount of minutes to be added to date.
   * @return Date plus minutes
   */
  fun addMinutes(date: Date, minutes: Int): Date =
    add(date, Calendar.MINUTE, minutes)

  /**
   * Adds seconds to target Date.
   * If seconds are negative returns date without modifying it.
   *
   * @param date Date to which seconds need to be added.
   * @param seconds Amount of seconds to be added to date.
   * @return Date plus seconds
   */
  fun addSeconds(date: Date, seconds: Int): Date =
    add(date, Calendar.SECOND, seconds)

  /**
   * Subtract days from target Date.
   * If days are negative returns date without modifying it.
   *
   * @param date Date from which days need to be subtracted.
   * @param days Amount of days to be subtracted from date.
   * @return Date minus days
   */
  fun subtractDays(date: Date, days: Int): Date =
    subtract(date, Calendar.DAY_OF_MONTH, days)

  /**
   * Subtracts milliseconds from target Date.
   * If milliseconds are negative returns date without modifying it.
   *
   * @param date Date from which milliseconds need to be subtracted.
   * @param milliseconds Amount of milliseconds to be subtracted from date.
   * @return Date minus milliseconds
   */
  fun subtractMilliseconds(date: Date, milliseconds: Int): Date =
    subtract(date, Calendar.MILLISECOND, milliseconds)

  /**
   * Subtracts minutes from target Date.
   * If minutes are negative returns date without modifying it.
   *
   * @param date Date from which minutes need to be subtracted.
   * @param minutes Amount of minutes to be subtracted from date.
   * @return Date minus minutes
   */
  fun subtractMinutes(date: Date, minutes: Int): Date =
    subtract(date, Calendar.MINUTE, minutes)

  /**
   * Subtracts seconds from target Date.
   * If seconds are negative returns date without modifying it.
   *
   * @param date Date from which seconds need to be subtracted.
   * @param seconds Amount of seconds to be subtracted from date.
   * @return Date minus seconds
   */
  fun subtractSeconds(date: Date, seconds: Int): Date =
    subtract(date, Calendar.SECOND, seconds)

  /**
   * Add given amount of measurement to date.
   *
   * @param date Date that needs to be changed.
   * @param measurement Calendar field that needs to be manipulated by amount.
   * @param amount Amount of measurement to change.
   * @return Date plus given amount of measurement
   */
  private fun add(date: Date, measurement: Int, amount: Int): Date =
    changeTime(date, measurement, amount, OperationType.ADDITION)

  /**
   * Subtract given amount of measurement to date.
   *
   * @param date Date that needs to be changed.
   * @param measurement Calendar field that needs to be manipulated by amount.
   * @param amount Amount of measurement to change.
   * @return Date minus given amount of measurement
   */
  private fun subtract(date: Date, measurement: Int, amount: Int): Date =
    changeTime(date, measurement, amount, OperationType.SUBTRACTION)

  /**
   * Change time for given date by given amount in given measurement.
   * If amount is negative return date. Operation type is used to indicate
   * addition or subtraction operation.
   *
   * @param date Date that needs to be changed.
   * @param measurement Calendar field that needs to be manipulated by amount.
   * @param amount Amount of measurement to change.
   * @param operationType Defines if amount is to be added or subtracted to
   * date.
   * @return Date that is changed by given amount in given measurement.
   */
  private fun changeTime(
    date: Date,
    measurement: Int,
    amount: Int,
    operationType: OperationType
  ): Date {
    if (amount <= 0) return date

    val calendar = Calendar.getInstance()
    calendar.time = date

    if (operationType == OperationType.ADDITION) {
      calendar.add(measurement, amount)
    } else {
      calendar.add(measurement, amount * -1)
    }

    return calendar.time
  }
}
