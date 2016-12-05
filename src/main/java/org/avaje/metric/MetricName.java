package org.avaje.metric;

/**
 * The name of the metric.
 */
public interface MetricName extends Comparable<MetricName> {

  /**
   * Create a Metric name by parsing a name that is expected to include periods (dot notation
   * similar to package.Class.method).
   */
  static MetricName of(String name) {
    return MetricManager.name(name);
  }

  /**
   * Create a MetricName based on a class and name.
   * <p>
   * Often the name maps to a method name.
   */
  static MetricName of(Class<?> cls, String name) {
    return MetricManager.name(cls, name);
  }

  /**
   * Create a Metric name based on group, type and name.
   *
   * @param group
   *          The group which often maps to a package name.
   * @param type
   *          The type which often maps to a simple class name.
   * @param name
   *          The name which often maps to a method name.
   */
  static MetricName of(String group, String type, String name) {
    return MetricManager.name(group, type, name);
  }

  /**
   * Returns the group to which the metric belongs. For class-based metrics, this will be the
   * package name.
   */
  String getGroup();

  /**
   * Returns the type to which the Metric belongs. For class-based metrics, this will be the simple
   * class name.
   */
  String getType();

  /**
   * Returns the name of the metric.
   */
  String getName();

  /**
   * Return a simple java like name.
   */
  String getSimpleName();

  /**
   * Create and return another MetricName based on this instance with an additional suffix added to
   * the name.
   * 
   * @param nameSuffix
   *          The addition text added to this metrics name.
   */
  MetricName withSuffix(String nameSuffix);
}