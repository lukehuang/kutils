package com.gmail.slonjsak.sandi

/**
 * Manipulations over given String object.
 */
object StringUtils {
  /**
   * Removes all whitespaces from given String on every position.
   */
  fun removeAllWhitespaces(target: String): String {
    return target.replace(" ", "")
  }
}
