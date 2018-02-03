package com.sandislonjsak.kutils

import org.junit.Assert.assertEquals
import org.junit.Test

class ObjectUtilsTest {
  data class TestHelper(val name: String = "", val age: Int = 0)

  @Test
  fun `test getPropertiesAndValues`() {
    val testHelper = TestHelper("test", 10)
    val expected =
      mapOf("name" to "test", "age" to 10, "class" to TestHelper::class.java)

    assertEquals(expected, ObjectUtils.getPropertiesAndValues(testHelper))
  }
}
