package com.sandislonjsak.kutils

import org.junit.Assert.assertEquals
import org.junit.Test

class ObjectUtilsTest {
  @Test
  fun `test getPropertiesAndValues`() {
    val testHelper = TestHelper("test", 10)
    val expected =
      mapOf("name" to "test", "age" to 10, "class" to TestHelper::class.java)

    assertEquals(expected, ObjectUtils.getPropertiesAndValues(testHelper))
  }

  @Test
  fun `test checkIfObjectHasProperty`() {
    val testHelper = TestHelper("test", 10)

    assertEquals(true, ObjectUtils.checkIfObjectHasProperty(testHelper, "name"))
    assertEquals(true, ObjectUtils.checkIfObjectHasProperty(testHelper, "age"))
    assertEquals(
      false, ObjectUtils.checkIfObjectHasProperty(testHelper, "surname")
    )
  }
}
