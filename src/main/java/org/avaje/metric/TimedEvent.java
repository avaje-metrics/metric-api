package org.avaje.metric;

/**
 * A TimedEvent that is ended with either success or error.
 * 
 * @see TimedMetric#startEvent()
 */
public interface TimedEvent {

  /**
   * End specifying whether the event was successful or in error.
   */
  public void end(boolean withSuccess);

  /**
   * This timed event ended with successful execution (e.g. Successful SOAP
   * Operation or SQL execution).
   */
  public void endWithSuccess();

  /**
   * This timed event ended with an error or fault execution (e.g. SOAP Fault or
   * SQL exception).
   */
  public void endWithError();

}