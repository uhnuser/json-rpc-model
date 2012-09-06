package ca.uhn.model.json;


public class Error {
	private String jsonrpc = "2.0";
	private Integer id = null;	
	private ErrorData error = null;
	
	public static final int INVALID_REQUEST = -32600;
	public static final int METHOD_NOT_FOUND = -32601;
	public static final int INVALID_PARAMS = -32602;
	public static final int INTERNAL_ERROR = -32603;
	public static final int AUTHORIZATION_ERROR = -32604;
	public static final int LIMIT_REACHED_ERROR = -32605;
	
	public static final int WARNING = -1;
	public static final int ERROR = -2;
	public static final int FATAL = -3;
	
		
	public Error(String message, int code) {
		this.setError(new ErrorData(message, code));		
	}

	public void setJsonrpc(String jsonrpc) {
		this.jsonrpc = jsonrpc;
	}
	
	public String getJsonrpc() {
		return jsonrpc;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
	
	public void setError(ErrorData error) {
		this.error = error;
	}

	public ErrorData getError() {
		return error;
	}

	public static class ErrorData {
		public ErrorData() {
			
		}
		
		public ErrorData(String message, int code) {
			this.message = message;
			this.code = code;
		}
		public String message = null;
		public Integer code = null;				
	}
}