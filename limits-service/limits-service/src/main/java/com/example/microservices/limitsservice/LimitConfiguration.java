package com.example.microservices.limitsservice;

/**
 * The Class LimitConfiguration.
 */
public class LimitConfiguration {

	/** The maximum. */
	private int maximum;
	
	/** The minimum. */
	private int minimum;

	/**
	 * Gets the maximum.
	 *
	 * @return the maximum
	 */
	public int getMaximum() {
		return maximum;
	}

	/**
	 * Sets the maximum.
	 *
	 * @param maximum the new maximum
	 */
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	/**
	 * Gets the minimum.
	 *
	 * @return the minimum
	 */
	public int getMinimum() {
		return minimum;
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
	 * Instantiates a new limit configuration.
	 *
	 * @param maximum the maximum
	 * @param minimum the minimum
	 */
	public LimitConfiguration(int maximum, int minimum) {
		
		this.maximum = maximum;
		this.minimum = minimum;
	}

	
	
}
