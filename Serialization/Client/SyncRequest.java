package serialclient;

import java.io.*;

public class SyncRequest implements Serializable {
	private InterfaceHeader interfaceHeader;
	private int iExpSeqNmbr;
	
	public InterfaceHeader getInterfaceHeader() {
		return interfaceHeader;
	}
	public void setInterfaceHeader(InterfaceHeader intrfcHdr) {
		this.interfaceHeader = intrfcHdr;
	}
	public int getiExpSeqNmbr() {
		return iExpSeqNmbr;
	}
	public void setiExpSeqNmbr(int iExpSeqNmbr) {
		this.iExpSeqNmbr = iExpSeqNmbr;
	}
	
	
}
