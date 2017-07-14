import javax.xml.bind.annotation.XmlRootElement;


public class TwilioDetails {

	public String accountId;
	public String authToken;
	public String reciepientPhoneNumber;
	public String senderPhoneNumber;
	public String message;
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAuthToken() {
		return authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public String getReciepientPhoneNumber() {
		return reciepientPhoneNumber;
	}
	public void setReciepientPhoneNumber(String reciepientPhoneNumber) {
		this.reciepientPhoneNumber = reciepientPhoneNumber;
	}
	public String getSenderPhoneNumber() {
		return senderPhoneNumber;
	}
	public void setSenderPhoneNumber(String senderPhoneNumber) {
		this.senderPhoneNumber = senderPhoneNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
