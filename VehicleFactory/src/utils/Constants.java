/**
 * Constants for the entire project
 */
package utils;
import java.io.Serializable;

/**
 * @author Java spring 2017
 *
 */
public class Constants implements Serializable {
    	private static final long serialVersionUID = 1L;
	/** Number of characters in a vehicle identification number */
	public static final int NUM_OF_VIN_CHARACTERS = 17;
	/** Array of characters that cannot be in a VIN */
	public static final char[] FORBIDDEN_VIN_CHARACTERS = {'I', 'O', 'Q'};
	/** Number of digits in id */
	public static final int ID_DIGITS = 9;
	/** Shift length in hours */
	public static final int SHIFT_LENGTH = 8;
	/** Slot length in hours */
	public static final int SLOT_LENGTH = 1;
        /** CSV file name */
        public static final String CSV_FileName = "input.csv";
        /** Data ser file name */
        public static final String Ser_FileName = "data.ser";
        /* Admin designs ser file name */
        public static final String Ser_AdminDesignsFileName = "designs.ser";
        /* Admin locks ser file name */
        public static final String Ser_AdminLocksFileName = "locks.ser";
        /* Admin message ser file name */
        public static final String Ser_AdminMessageFileName = "message.ser";
        /* Admin volume ser file name */
        public static final String Ser_AdminVolumeFileName = "volume.ser";
        /* Max message admin text area characters */
        public static final int MaxCharLength = 119;
	/**
	 * Checks if a string can be parsed to an integer
	 * @param s String to check
	 * @return True if string is integer
	 */
	public static boolean isNumeric(String s) {
		try {
			@SuppressWarnings("unused")
			int x = Integer.parseInt(s);
		}
		catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}
