package com.sandislonjsak.kutils

import java.util.*

/**
 * Operations on java.util.Date class.
 */
object DateUtils {
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
}
