package com.sandislonjsak.kutils

import org.junit.Assert.assertEquals
import org.junit.Test

class BenchmarkUtilsTest {
  //TODO: This is a bad test and needs to be refactored
  @Test
  fun `test measureExecTimeMillis pass function as an arg`() {
    fun func() = (0..100000).forEach {
      if (it % 99999 == 0) println("test")
    }

    val result = BenchmarkUtils.measureExecTimeMillis(::func)

    assertEquals(true, result > 1L)
  }

  //TODO: This is a bad test and needs to be refactored
  @Test
  fun `test measureExecTimeMillis pass lambda expression`() {
    val result = BenchmarkUtils.measureExecTimeMillis {
      (0..100000).forEach {
        if (it % 99999 == 0) println("test")
      }
    }

    assertEquals(true, result > 1L)
  }
}
