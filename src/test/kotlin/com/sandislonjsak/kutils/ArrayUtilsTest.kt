package com.sandislonjsak.kutils

import org.junit.Assert.assertEquals
import org.junit.Test

class ArrayUtilsTest {
  @Test
  fun `test removeDuplicates`() {
    assertEquals(
      arrayOf(1, 2, 3), ArrayUtils.removeDuplicates(arrayOf(1, 2, 2, 3, 3, 3))
    )

    assertEquals(
      arrayOf("a", "b", "c"), ArrayUtils.removeDuplicates(
        arrayOf("a", "a", "b", "c")
      )
    )
  }
}
