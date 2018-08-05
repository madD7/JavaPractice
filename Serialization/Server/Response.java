package serialserver;

import java.io.*;

public class Response implements Serializable {
	private InterfaceHeader intrfcHdr;
	private int iSeqNmbr;
	public InterfaceHeader getIntrfcHdr() {
		return intrfcHdr;
	}
	public void setIntrfcHdr(InterfaceHeader intrfcHdr) {
		this.intrfcHdr = intrfcHdr;
	}
	public int getiSeqNmbr() {
		return iSeqNmbr;
	}
	public void setiSeqNmbr(int iSeqNmbr) {
		this.iSeqNmbr = iSeqNmbr;
	}
	
	
}
