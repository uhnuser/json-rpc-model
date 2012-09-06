package ca.uhn.model.json.exception;

public class LimitReachedException extends MinorException {

	private static final long serialVersionUID = 1L;
	
	public LimitReachedException(String message) {
		super(message);
	}

}
