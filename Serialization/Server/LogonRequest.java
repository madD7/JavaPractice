package serialserver;

import java.io.*;

public class LogonRequest implements Serializable {
	private InterfaceHeader interfaceHeader;
	private byte baUserId[] = new byte [10];
	private byte baOldPasswd[] = new byte [8];
	private byte baNewPasswd[] = new byte [8];
	
	public InterfaceHeader getInterfaceHeader() {
		return interfaceHeader;
	}
	public void setInterfaceHeader(InterfaceHeader interfaceHeader) {
		this.interfaceHeader = interfaceHeader;
	}
	public byte[] getBaUserId() {
		return baUserId;
	}
	public void setBaUserId(byte[] baUserId) {
		this.baUserId = baUserId;
	}
	public byte[] getBaOldPasswd() {
		return baOldPasswd;
	}
	public void setBaOldPasswd(byte[] baOldPasswd) {
		this.baOldPasswd = baOldPasswd;
	}
	public byte[] getBaNewPasswd() {
		return baNewPasswd;
	}
	public void setBaNewPasswd(byte[] baNewPasswd) {
		this.baNewPasswd = baNewPasswd;
	}
}
