package com.gmail.slonjsak.sandi

import org.junit.Test
import org.junit.Assert.assertEquals

class StringUtilsTest {
  @Test
  fun `test remove all whitespaces`() {
    assertEquals("test", StringUtils.removeAllWhitespaces(" te s t   "))
  }
}
