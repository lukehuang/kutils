package com.sandislonjsak.kutils

import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.*

class DateUtilsTest {
  @Test
  fun `test addDays`(){
    val date = Date()

    assertEquals(Date(date.time + 86400000), DateUtils.addDays(date, 1))
    assertEquals(Date(date.time + 172800000), DateUtils.addDays(date, 2))
    assertEquals(date, DateUtils.addDays(date, -10))
  }

  @Test
  fun `test addMilliseconds`() {
    val date = Date()

    assertEquals(Date(date.time + 10), DateUtils.addMilliseconds(date, 10))
    assertEquals(Date(date.time + 100), DateUtils.addMilliseconds(date, 100))
    assertEquals(date, DateUtils.addMilliseconds(date, -10))
  }

  @Test
  fun `test addMinutes`() {
    val date = Date()

    assertEquals(Date(date.time + 600000), DateUtils.addMinutes(date, 10))
    assertEquals(Date(date.time + 6000000), DateUtils.addMinutes(date, 100))
    assertEquals(date, DateUtils.addMinutes(date, -10))
  }

  @Test
  fun `test addSeconds`() {
    val date = Date()

    assertEquals(Date(date.time + 10000), DateUtils.addSeconds(date, 10))
    assertEquals(Date(date.time + 100000), DateUtils.addSeconds(date, 100))
    assertEquals(date, DateUtils.addSeconds(date, -10))
  }

  @Test
  fun `test subtractDays`(){
    val date = Date()

    assertEquals(Date(date.time - 86400000), DateUtils.subtractDays(date, 1))
    assertEquals(Date(date.time - 172800000), DateUtils.subtractDays(date, 2))
    assertEquals(date, DateUtils.subtractDays(date, -10))
  }

  @Test
  fun `test subtractMinutes`() {
    val date = Date()

    assertEquals(Date(date.time - 600000), DateUtils.subtractMinutes(date, 10))
    assertEquals(Date(date.time - 60000), DateUtils.subtractMinutes(date, 1))
    assertEquals(date, DateUtils.subtractMinutes(date, -10))
  }

  @Test
  fun `test subtractSeconds`() {
    val date = Date()

    assertEquals(Date(date.time - 10000), DateUtils.subtractSeconds(date, 10))
    assertEquals(Date(date.time - 100000), DateUtils.subtractSeconds(date, 100))
    assertEquals(date, DateUtils.subtractSeconds(date, -10))
  }
}
