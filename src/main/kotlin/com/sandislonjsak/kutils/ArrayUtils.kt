package com.sandislonjsak.kutils

/**
 * Operations on Array object.
 */
object ArrayUtils {
  /**
   * Removes duplicate entries from array.
   *
   * @param target Array that needs to have duplicates removed.
   * @return Array with no duplicates.
   */
  fun removeDuplicates(target: Array<Any>): Array<Any> {
    return target.toHashSet().toArray()
  }
}
