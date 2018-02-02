package com.sandislonjsak.kutils

import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.*

class DateUtilsTest {
  @Test
  fun `test addMinutes add ten minutes`() {
    val date = Date()

    assertEquals(Date(date.time + 600000), DateUtils.addMinutes(date, 10))
  }

  @Test
  fun `test addMinutes add negative minutes`() {
    val date = Date()

    assertEquals(date, DateUtils.addMinutes(date, -10))
  }

  @Test
  fun `test subtractMinutes subtract ten minutes`() {
    val date = Date()

    assertEquals(Date(date.time - 600000), DateUtils.subtractMinutes(date, 10))
  }

  @Test
  fun `test subtractMinutes subtract negative minutes`() {
    val date = Date()

    assertEquals(date, DateUtils.subtractMinutes(date, -10))
  }
}
