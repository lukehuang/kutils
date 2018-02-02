package com.sandislonjsak.kutils

/**
 * Operations on String object.
 */
object StringUtils {
  /**
   * Removes all whitespaces from given String on every position.
   *
   * @param target String that needs to be cleared
   * @return String that has no whitespaces.
   */
  fun removeAllWhitespaces(target: String): String {
    return target.replace(" ", "")
  }
}
