package ca.uhn.model.json;

public class Request {

	String jsonrpc = "2.0";
	String method = null;
	Object params = null;
	Integer id;
	
	public Request (String method, Object params) {
		this.method = method;
		this.params = params;
	}
	
	public Request(String method, Object params, Integer id) {
		this.method = method;
		this.params = params;
		this.id = id;
	}	
}
