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
   * Adds moths to target Date.
   * If moths are negative returns date without modifying it.
   *
   * @param date Date to which months need to be added.
   * @param months Amount of months to be added to date.
   * @return Date plus months
   */
  fun addMonths(date: Date, months: Int): Date =
    add(date, Calendar.MONTH, months)

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
   * Adds weeks to target Date.
   * If weeks are negative returns date without modifying it.
   *
   * @param date Date to which weeks need to be added.
   * @param weeks Amount of weeks to be added to date.
   * @return Date plus weeks
   */
  fun addWeeks(date: Date, weeks: Int): Date =
    add(date, Calendar.WEEK_OF_YEAR, weeks)

  /**
   * Adds years to target Date.
   * If years are negative returns date without modifying it.
   *
   * @param date Date to which years need to be added.
   * @param years Amount of years to be added to date.
   * @return Date plus years
   */
  fun addYears(date: Date, years: Int): Date =
    add(date, Calendar.YEAR, years)

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
   * Subtract hours from target Date.
   * If hours are negative returns date without modifying it.
   *
   * @param date Date from which hours need to be subtracted.
   * @param hours Amount of hours to be subtracted from date.
   * @return Date minus hours
   */
  fun subtractHours(date: Date, hours: Int): Date =
    subtract(date, Calendar.HOUR, hours)

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
   * Subtracts months from target Date.
   * If months are negative returns date without modifying it.
   *
   * @param date Date from which months need to be subtracted.
   * @param minutes Amount of months to be subtracted from date.
   * @return Date minus months
   */
  fun subtractMonths(date: Date, months: Int): Date =
    subtract(date, Calendar.MONTH, months)

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
   * Subtracts weeks from target Date.
   * If weeks are negative returns date without modifying it.
   *
   * @param date Date from which weeks need to be subtracted.
   * @param seconds Amount of weeks to be subtracted from date.
   * @return Date minus weeks
   */
  fun subtractWeeks(date: Date, weeks: Int): Date =
    subtract(date, Calendar.WEEK_OF_YEAR, weeks)

  /**
   * Subtracts years from target Date.
   * If years are negative returns date without modifying it.
   *
   * @param date Date from which years need to be subtracted.
   * @param years Amount of years to be subtracted from date.
   * @return Date minus years
   */
  fun subtractYears(date: Date, years: Int): Date =
    subtract(date, Calendar.YEAR, years)

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
