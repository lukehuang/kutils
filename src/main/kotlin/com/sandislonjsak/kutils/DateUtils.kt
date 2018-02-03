package com.sandislonjsak.kutils

import java.util.*

/**
 * Operations on java.util.Date class.
 */
object DateUtils {
  /**
   * Adds days to target Date.
   * If days are negative returns date without modifying it.
   *
   * @param date Date to which days need to be added.
   * @param days Amount of days to be added to date.
   * @return Date plus days
   */
  fun addDays(date: Date, days: Int): Date {
    if (days <= 0) return date

    return Date(date.time + 1000 * 60 * 60 * 24 * days)
  }

  /**
   * Adds minutes to target Date.
   * If minutes are negative returns date without modifying it.
   *
   * @param date Date to which minutes need to be added.
   * @param minutes Amount of minutes to be added to date.
   * @return Date plus minutes
   */
  fun addMinutes(date: Date, minutes: Int): Date {
    if (minutes <= 0) return date

    return Date(date.time + 1000 * 60 * minutes)
  }

  /**
   * Adds seconds to target Date.
   * If seconds are negative returns date without modifying it.
   *
   * @param date Date to which seconds need to be added.
   * @param seconds Amount of seconds to be added to date.
   * @return Date plus seconds
   */
  fun addSeconds(date: Date, seconds: Int): Date {
    if (seconds <= 0) return date

    return Date(date.time + 1000 * seconds)
  }

  /**
   * Subtract days from target Date.
   * If days are negative returns date without modifying it.
   *
   * @param date Date from which days need to be subtracted.
   * @param days Amount of days to be subtracted from date.
   * @return Date minus days
   */
  fun subtractDays(date: Date, days: Int): Date {
    if (days <= 0) return date

    return Date(date.time - 1000 * 60 * 60 * 24 * days)
  }

  /**
   * Subtracts minutes from target Date.
   * If minutes are negative returns date without modifying it.
   *
   * @param date Date from which minutes need to be subtracted.
   * @param minutes Amount of minutes to be subtracted from date.
   * @return Date minus minutes
   */
  fun subtractMinutes(date: Date, minutes: Int): Date {
    if (minutes <= 0) return date

    return Date(date.time - 1000 * 60 * minutes)
  }

  /**
   * Subtracts seconds from target Date.
   * If seconds are negative returns date without modifying it.
   *
   * @param date Date from which seconds need to be subtracted.
   * @param seconds Amount of seconds to be subtracted from date.
   * @return Date minus seconds
   */
  fun subtractSeconds(date: Date, seconds: Int): Date {
    if (seconds <= 0) return date

    return Date(date.time - 1000 * seconds)
  }
}
