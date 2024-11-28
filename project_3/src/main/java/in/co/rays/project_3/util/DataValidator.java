package in.co.rays.project_3.util;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * DataValidator class is used to validate the data entered by user
 * 
 * @author Lokesh Solanki
 *
 */
public class DataValidator {
	
	
	   
	/**
	 * Test Above Methods
	 * 
	 * @param args :args
	 */
	public static void main(String[] args) {
		System.out.println("Not Null 2"+isNotNull("ABC"));
		System.out.println("Not Null 3"+isNotNull(null));
		System.out.println("Not Null 4"+isNull("123"));
		
		
		System.out.println("is int"+isInteger(null));
		System.out.println("Is int"+isInteger("ABC1"));
		System.out.println("Is Int"+isInteger("123"));
		System.out.println("is Int"+isNotNull("123"));
	    System.out.println(isName("Ankur Agrawal"));
	}
		public static boolean isNull(String val){
		if(val==null || val.trim().length()==0){
			return true;
		}else{
			return false ;
		}
	}
	public static boolean isNotNull(String val){
		return !isNull(val);
		
	}
	public static boolean isInteger(String val){
		if(isNotNull(val)){
			try{
				int i=Integer.parseInt(val);
				return true;
			}catch(NumberFormatException e){
					return false;
			}
		}else{
			return false;
		}
	}
	public static boolean isLong(String val){
		if(isNotNull(val)){
			try{
				long i=Long.parseLong(val);
				return true;
			}catch(NumberFormatException e){
				return false;
			}
		}else{
			return false;
		}
	} 
	

	  public static boolean isEmail(String val) {
		  
	        String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
                                    
	        if (isNotNull(val)) {
	            try {
	                return val.matches(emailreg);
	            } catch (NumberFormatException e) {
	                return false;
	            }

	        } else {
	            return false;
	        }
	    }

	
	public static boolean isDate(String val){

		Date today = new Date();
    	Date enterDate = DataUtility.getDate(val);
    	
    	int age = today.getYear() - enterDate.getYear();

    	if(age > 18 && isNotNull(val)){
    		return true;
    	}else{
    		return false;							
    	}
	}
	public static boolean isName(String val) {

		String namereg = "^[^-\\s][\\p{L} .'-]+$";

		if (isNotNull(val)) {
			try {
				return val.matches(namereg);
			} catch (NumberFormatException e) {
				return false;
			}

		} else {
			return false;
		}
	}
	public static boolean isPassword(String val) {

		String passreg = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,12}";

		if (isNotNull(val)) {
			try {
				return val.matches(passreg);
			} catch (NumberFormatException e) {
				return false;
			}

		} else {
			return false;
		}
	}
	public static boolean isPasswordLength(String val) {

		if (isNotNull(val) && val.length() >= 8 && val.length() <= 12) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Checks if value is valid Phone No.
	 * 
	 * @param val
	 * @return
	 */
	public static boolean isPhoneNo(String val) {

		String phonereg = "^[6-9][0-9]{9}$";

		if (isNotNull(val)) {
			try {
				return val.matches(phonereg);
			} catch (NumberFormatException e) {
				return false;
			}

		} else {
			return false;
		}
	}

	/**
	 * Checks if value of Mobile No is 10
	 * 
	 * @param val
	 * @return
	 */
	public static boolean isPhoneLength(String val) {

		if (isNotNull(val) && val.length() == 10) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Checks if value is Date
	 * 
	 * @param val
	 * @return
	 */
	
	/**
	 * Checks if Date is on Sunday
	 * 
	 * @param val
	 * @return
	 */
	
	public static boolean isRollNo(String val) {

		String rollreg = "[a-zA-Z]{2}[0-9]{3}";

		if (isNotNull(val)) {
			try {
				return val.matches(rollreg);
			} catch (NumberFormatException e) {
				return false;
			}

		} else {
			return false;
		}
	}
	public static boolean isAge(String val){
	    
    	Date today = new Date();
    	Date enterDate = DataUtility.getDate(val);
    	
    	int age = today.getYear() - enterDate.getYear();

    	if(age > 18 && isNotNull(val)){
    		return true;
    	}else{
    		return false;							
    	}
    }
	 public static boolean isMobileNo(String val){
	    	
	    	String mobreg = "^[6-9][0-9]{9}$";
	    	
	    			if (isNotNull(val) && val.matches(mobreg)) {
						
							return true;
	    				}else
	    				{	
	    					return false;
						}	
	    		}
	 
	 public static boolean isTooLong(String val, int maxLength) {
		    if (isNotNull(val)) {
		        return val.length() > maxLength;
		    } else {
		        return false;
		    }
	 }

		// Method to check if a string is alphanumeric
		public static boolean isAlphanumeric(String s) {
			if (s == null) {
				return false;
			}

			// Check if the string is alphanumeric
			if (!s.matches("[a-zA-Z0-9]+")) {
				return false;
			}

			// Check if the string contains both letters and numbers
			boolean hasLetter = false;
			boolean hasDigit = false;

			for (char c : s.toCharArray()) {
				if (Character.isLetter(c)) {
					hasLetter = true;
				} else if (Character.isDigit(c)) {
					hasDigit = true;
				}
				// If both letter and digit are found, no need to check further
				if (hasLetter && hasDigit) {
					return true;
				}
			}

			return false;
		}
		//-------------------------------------------------------
		
		 public static boolean isStringLengthValid(String input, int minLength) {
		        return input != null && input.length() >= minLength;
		    }
		
		 public static boolean isvalidateStringLength(String input, int minLength) {
		        if (input == null) {
		            System.out.println("Input cannot be null.");
		            return false;
		        }

		        if (input.length() < minLength) {
		            System.out.println("Input must be at least " + minLength + " characters long.");
		            return false;
		        }

		        return true;
		    }


	
	
	
}

