package com.sandislonjsak.kutils

import java.io.ByteArrayOutputStream
import java.io.ObjectOutputStream

/**
 * Everything regarding serialization of objects.
 */
object SerializationUtils {
  /**
   * Serializes any object to ByteArray.
   *
   * @param target Target object that needs to be serialized.
   * @return ByteArray representing serialized object.
   */
  fun serialize(target: Any): ByteArray {
    val baos = ByteArrayOutputStream()
    val oos = ObjectOutputStream(baos)

    oos.writeObject(target)
    oos.close()

    return baos.toByteArray()
  }
}
