package ca.uhn.model.json.exception;

public class ServiceException extends Exception {

	private static final long serialVersionUID = 1L;
	private Integer severity = null;
	
	public ServiceException(String message, int severity) {
		super(message);
		this.severity = severity;
	}

	public void setSeverity(Integer severity) {
		this.severity = severity;
	}

	public Integer getSeverity() {
		return severity;
	}
}
