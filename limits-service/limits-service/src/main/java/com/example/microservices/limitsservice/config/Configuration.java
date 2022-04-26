package com.example.microservices.limitsservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// TODO: Auto-generated Javadoc
/**
 * The Class Configuration.
 */
@Component
@ConfigurationProperties("limits-service")
public class Configuration {

	/** The minimum. */
	private int minimum;
	
	/** The maximum. */
	private int maximum;

	/**
	 * Gets the minimum.
	 *
	 * @return the minimum
	 */
	public int getMinimum() {
		return minimum;
	}

	/**
	 * Gets the maximum.
	 *
	 * @return the maximum
	 */
	public int getMaximum() {
		return maximum;
	}

	/**
	 * Sets the minimum.
	 *
	 * @param minimum the new minimum
	 */
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	/**
	 * Sets the maximum.
	 *
	 * @param maximum the new maximum
	 */
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

}
