package com.sandislonjsak.kutils

import java.beans.Introspector
import java.beans.PropertyDescriptor

/**
 * Operations on Any object.
 */
object ObjectUtils {
  /**
   * Checks if given object has a property with given name.
   *
   * @param obj Target object that needs to be evaluated
   * @param propertyName Name of a property that needs to be checked for
   * existence
   * @return {@code true} if object has property with given name, {@code false}
   * if not.
   */
  fun checkIfObjectHasProperty(obj: Any, propertyName: String): Boolean {
    val propertyDescriptors = getPropertyDescriptors(obj)

    return propertyDescriptors.any { propertyDescriptor ->
      propertyName == readPropertyName(propertyDescriptor)
    }
  }

  /**
   * Retrieves property names and values from Any object and returns them as
   * HashMap<K,V> where property name is K and property value is V
   *
   * @param obj Object that needs to be inspected
   * @return Map with property name as key and property value as value
   */
  fun getPropertiesAndValues(obj: Any): HashMap<String, Any> {
    val map = HashMap<String, Any>()
    val propertyDescriptors = getPropertyDescriptors(obj)

    propertyDescriptors.forEach { descriptor ->
      map.put(readPropertyName(descriptor), readPropertyValue(descriptor, obj))
    }

    return map
  }

  /**
   * Gets all propertyDescriptors from object
   *
   * @param obj Object from which propertyDescriptors need to be retrieved.
   * @return Array of propertyDescriptors from object.
   */
  private fun getPropertyDescriptors(obj: Any) =
    Introspector.getBeanInfo(obj::class.java).propertyDescriptors

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
