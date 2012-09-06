package ca.uhn.model.json.exception;

public class AuthorizationErrorException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public AuthorizationErrorException(String message) {
		super(message);
	}
}
