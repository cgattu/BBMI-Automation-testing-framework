package gov.va.bbmi.automatedtesting;

public class BBMIException extends Exception {

	String message;
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/*public BBMIException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
		this.message	=	msg;
	}*/
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return message;
	}
	
}
