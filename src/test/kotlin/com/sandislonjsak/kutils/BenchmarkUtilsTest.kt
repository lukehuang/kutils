package com.sandislonjsak.kutils

import org.junit.Assert.assertEquals
import org.junit.Test

class BenchmarkUtilsTest {
  @Test
  fun `test measureExecTimeMillis`() {
    fun func() = Thread.sleep(2)

    assertEquals(true, BenchmarkUtils.measureExecTimeMillis(::func) > 1L)
    assertEquals(true, BenchmarkUtils.measureExecTimeMillis {
      Thread.sleep(2)
    } > 1L)
  }
}
