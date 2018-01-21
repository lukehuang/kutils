package com.gmail.slonjsak.sandi

class Kutils {
  /**
   * @param target Array from which to remove duplicate entries.
   * @return Array with no duplicate entries.
   */
  fun removeDuplicates(target: Array<*>): Array<*> {
    return setOf(*target).toTypedArray()
  }
}
