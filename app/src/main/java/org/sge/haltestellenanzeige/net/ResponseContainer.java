package org.sge.haltestellenanzeige.net;

public class ResponseContainer {
	public boolean status = false;
	public String content = "";
	public boolean timedOut = false;

	ResponseContainer(boolean statusPara, String contentPara, boolean timedOutPara) {
		status = statusPara;
		content = contentPara;
		timedOut = timedOutPara;
	}
}
