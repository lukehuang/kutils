package com.sandislonjsak.kutils

import java.beans.Introspector
import java.beans.PropertyDescriptor

/**
 * Operations on Any object.
 */
object ObjectInspector {
  /**
   * Retrieves property names and values from Any object and returns them as
   * HashMap<K,V> where property name is K and property value is V
   *
   * @param obj Object that needs to be inspected
   * @return Map with property name as key and property value as value
   */
  fun getPropertiesAndValues(obj: Any): HashMap<String, Any> {
    val map = HashMap<String, Any>()
    val propertyDescriptors = Introspector.getBeanInfo(obj::class.java)
      .propertyDescriptors

    propertyDescriptors.forEach { descriptor ->
      map.put(readPropertyName(descriptor), readPropertyValue(descriptor, obj))
    }

    return map
  }

  /**
   * Returns PropertyDescriptor name
   *
   * @param propertyDescriptor PropertyDescriptor whose name needs to be
   * returned
   * @return PropertyDescriptor's name
   */
  private fun readPropertyName(propertyDescriptor: PropertyDescriptor): String =
    propertyDescriptor.name

  /**
   * Returns PropertyDescriptor name
   *
   * @param propertyDescriptor PropertyDescriptor whose name needs to be
   * returned
   * @param obj Object whose value needs to be read
   * @return PropertyDescriptor's value in given object
   */
  private fun readPropertyValue(
    propertyDescriptor: PropertyDescriptor,
    obj: Any
  ) = propertyDescriptor.readMethod.invoke(obj)
}
