package com.sandislonjsak.kutils

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.util.Calendar
import java.util.Date
import java.util.GregorianCalendar

class DateUtilsTest {
  private var date = Date()

  @Before
  fun `prepare test date`() {
    date = prepareDate(1994, 10, 10, 9, 8, 7, 6)
  }

  @Test
  fun `test addDays`() {
    assertEquals(
      prepareDate(1994, 10, 11, 9, 8, 7, 6), DateUtils.addDays(date, 1)
    )
    assertEquals(date, DateUtils.addDays(date, -10))
  }

  @Test
  fun `test addHours`() {
    assertEquals(
      prepareDate(1994, 10, 10, 10, 8, 7, 6), DateUtils.addHours(date, 1)
    )
    assertEquals(date, DateUtils.addHours(date, -10))
  }

  @Test
  fun `test addMilliseconds`() {
    assertEquals(
      prepareDate(1994, 10, 10, 9, 8, 7, 16),
      DateUtils.addMilliseconds(date, 10)
    )
    assertEquals(date, DateUtils.addMilliseconds(date, -10))
  }

  @Test
  fun `test addMinutes`() {
    assertEquals(
      prepareDate(1994, 10, 10, 9, 18, 7, 6), DateUtils.addMinutes(date, 10)
    )
    assertEquals(date, DateUtils.addMinutes(date, -10))
  }

  @Test
  fun `test addMonths`() {
    assertEquals(
      prepareDate(1994, 11, 10, 9, 8, 7, 6), DateUtils.addMonths(date, 1)
    )
    assertEquals(date, DateUtils.addMinutes(date, -10))
  }

  @Test
  fun `test addSeconds`() {
    assertEquals(
      prepareDate(1994, 10, 10, 9, 8, 17, 6), DateUtils.addSeconds(date, 10)
    )
    assertEquals(date, DateUtils.addSeconds(date, -10))
  }

  @Test
  fun `test addWeeks`() {
    assertEquals(
      prepareDate(1994, 10, 17, 9, 8, 7, 6), DateUtils.addWeeks(date, 1)
    )
    assertEquals(date, DateUtils.addWeeks(date, -10))
  }

  @Test
  fun `test addYears`() {
    assertEquals(
      prepareDate(1995, 10, 10, 9, 8, 7, 6), DateUtils.addYears(date, 1)
    )
    assertEquals(date, DateUtils.addYears(date, -10))
  }

  @Test
  fun `test subtractDays`() {
    assertEquals(
      prepareDate(1994, 10, 9, 9, 8, 7, 6), DateUtils.subtractDays(date, 1)
    )
    assertEquals(
      date, DateUtils.subtractDays(date, -10)
    )
  }

  @Test
  fun `test subtractHours`() {
    assertEquals(
      prepareDate(1994, 10, 10, 8, 8, 7, 6), DateUtils.subtractHours(date, 1)
    )
    assertEquals(date, DateUtils.subtractHours(date, -10))
  }

  @Test
  fun `test subtractMilliseconds`() {
    assertEquals(
      prepareDate(1994, 10, 10, 9, 8, 7, 5),
      DateUtils.subtractMilliseconds(date, 1)
    )
    assertEquals(date, DateUtils.subtractMilliseconds(date, -10))
  }

  @Test
  fun `test subtractMinutes`() {
    assertEquals(
      prepareDate(1994, 10, 10, 9, 7, 7, 6), DateUtils.subtractMinutes(date, 1)
    )
    assertEquals(date, DateUtils.subtractMinutes(date, -10))
  }

  @Test
  fun `test subtractMonths`() {
    assertEquals(
      prepareDate(1994, 9, 10, 9, 8, 7, 6), DateUtils.subtractMonths(date, 1)
    )
    assertEquals(date, DateUtils.subtractMonths(date, -10))
  }

  @Test
  fun `test subtractSeconds`() {
    assertEquals(
      prepareDate(1994, 10, 10, 9, 8, 6, 6), DateUtils.subtractSeconds(date, 1)
    )
    assertEquals(date, DateUtils.subtractSeconds(date, -10))
  }

  @Test
  fun `test subtractWeeks`() {
    assertEquals(
      prepareDate(1994, 10, 3, 9, 8, 7, 6), DateUtils.subtractWeeks(date, 1)
    )
    assertEquals(date, DateUtils.subtractWeeks(date, -10))
  }

  @Test
  fun `test subtractYears`() {
    assertEquals(
      prepareDate(1993, 10, 10, 9, 8, 7, 6), DateUtils.subtractYears(date, 1)
    )
    assertEquals(date, DateUtils.subtractYears(date, -10))
  }

  private fun prepareDate(
    year: Int,
    month: Int,
    day: Int,
    hours: Int,
    minutes: Int,
    seconds: Int,
    millis: Int
  ): Date {
    val calendar = GregorianCalendar(year, month, day, hours, minutes, seconds)
    calendar.set(Calendar.MILLISECOND, millis)

    return calendar.time
  }
}
