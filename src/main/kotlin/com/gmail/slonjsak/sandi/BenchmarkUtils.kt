package com.gmail.slonjsak.sandi

/**
 * Gives info about function performance.
 */
object BenchmarkUtils {
  /**
   * Measure execution time of any function.
   *
   * @param body Function whose execution time will be measured
   * @return How long it took for function to complete in milliseconds.
   */
  fun <T> measureExecTimeMillis(body:() -> T): Long {
    val start = System.currentTimeMillis()

    body.invoke()

    return System.currentTimeMillis() - start
  }
}
