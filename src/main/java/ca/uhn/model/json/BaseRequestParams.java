package ca.uhn.model.json;

import java.util.Map;

public class BaseRequestParams {

	protected String url;
	protected String clientId;
	protected String clientPass;
	protected String auditSourceId;	
	protected Map<String, String> args;

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientPass(String clientPass) {
		this.clientPass = clientPass;
	}
	public String getClientPass() {
		return clientPass;
	}
	public Map<String, String> getArgs() {
		return args;
	}
	public void setArgs(Map<String, String> args) {
		this.args = args;
	}

	public String getArg(String key) {
		return null == args ? null : args.get(key);
	}
	
	public String toString() {
		return "url: " + url + ", clientId: " + clientId + ", clientPass: ******" + ", auditSourceId: " + auditSourceId ;
	}

	
	public String getAuditSourceId() {
		return auditSourceId;
	}
	public void setAuditSourceId(String auditSourceId) {
		this.auditSourceId = auditSourceId;
	}
}
