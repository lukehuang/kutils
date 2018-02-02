package com.sandislonjsak.kutils

import org.junit.Assert.assertEquals
import org.junit.Test

class StringUtilsTest {
  @Test
  fun `test remove all whitespaces`() {
    assertEquals("test", StringUtils.removeAllWhitespaces(" te s t   "))
  }
}
