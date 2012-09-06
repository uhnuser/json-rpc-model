package ca.uhn.model.json;

public class Response {

	Integer id = null;
	String jsonrpc = "2.0";
	Object result = null;
	
	public Response(Object result) {
		this.result = result;
	}
	
	public Response(Object result, Integer id) {
		this.result = result;
		this.id = id;
	}
}
