package be.iccpoo;

public class InvalidDurationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public InvalidDurationException() {
		super("---Error,la durée de location ne peut-être négative !!---");
	}
	
}
