package be.iccpoo;

public class InvalidDurationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public InvalidDurationException() {
		super("---Error,la dur�e de location ne peut-�tre n�gative !!---");
	}
	
}
