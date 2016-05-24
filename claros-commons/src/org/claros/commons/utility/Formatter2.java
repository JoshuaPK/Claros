package org.claros.commons.utility;


public interface Formatter2 {

	/**
	 * 
	 * @param number
	 * @param groupingActive
	 * @return
	 */
	public String formatDecimal(Object number, boolean groupingActive);

	/**
	 * 
	 * @param number
	 * @param groupingActive
	 * @return
	 */
	public String formatInteger(Object number, boolean groupingActive);

	/**
	 * 
	 * @param number
	 * @param groupingActive
	 * @param digits
	 * @return
	 */
	public String formatSensitive(Object number, boolean groupingActive, int digits);

	/**
	 * 
	 * @param obj
	 * @param pattern
	 * @return
	 */
	public String formatNumberWithPattern(Object obj, String pattern);

	/**
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public String formatDateWithPattern(Object date, String pattern);

	/**
	 * 
	 * @param obj
	 * @return
	 */
	public double getDouble(Object obj);

}