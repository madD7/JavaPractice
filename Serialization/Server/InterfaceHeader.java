package serialserver;

import java.io.*;

public class InterfaceHeader implements Serializable {
	private int iTrdrNmbr;
	private int iLogTimeStmp;
	private byte baAlphaIndc[] = new byte [2];
	private short shTrnsCode;
	private short shErrCode;
	private int iBcSeqNmbr;
	private byte bCheckByteIndc;
	private byte baCharFllr[] = new byte [3];
	private long lLongTimeStmp;
	public void setlLongTimeStmp(long lLongTimeStmp) {
		this.lLongTimeStmp = lLongTimeStmp;
	}
	private byte baCharFllr2[] = new byte [8];
	private short shMsgLength;
	
	public int getiTrdrNmbr() {
		return iTrdrNmbr;
	}
	public void setiTrdrNmbr(int iTrdrNmbr) {
		this.iTrdrNmbr = iTrdrNmbr;
	}
	public int getiLogTimeStmp() {
		return iLogTimeStmp;
	}
	public void setiLogTimeStmp(int iLogTimeStmp) {
		this.iLogTimeStmp = iLogTimeStmp;
	}
	public byte[] getBaAlphaIndc() {
		return baAlphaIndc;
	}
	public void setBaAlphaIndc(byte[] baAlphaIndc) {
		this.baAlphaIndc = baAlphaIndc;
	}
	public short getShTrnsCode() {
		return shTrnsCode;
	}
	public void setShTrnsCode(short shTrnsCode) {
		this.shTrnsCode = shTrnsCode;
	}
	public short getShErrCode() {
		return shErrCode;
	}
	public void setShErrCode(short shErrCode) {
		this.shErrCode = shErrCode;
	}
	public int getiBcSeqNmbr() {
		return iBcSeqNmbr;
	}
	public void setiBcSeqNmbr(int iBcSeqNmbr) {
		this.iBcSeqNmbr = iBcSeqNmbr;
	}
	public byte getbCheckByteIndc() {
		return bCheckByteIndc;
	}
	public void setbCheckByteIndc(byte bCheckByteIndc) {
		this.bCheckByteIndc = bCheckByteIndc;
	}
	public byte[] getBaCharFllr() {
		return baCharFllr;
	}
	public void setBaCharFllr(byte[] baCharFllr) {
		this.baCharFllr = baCharFllr;
	}
	public long getlLongTimeStmp() {
		return lLongTimeStmp;
	}
	public void setlLongTimeStmp(byte lLongTimeStmp) {
		this.lLongTimeStmp = lLongTimeStmp;
	}
	public byte[] getBaCharFllr2() {
		return baCharFllr2;
	}
	public void setBaCharFllr2(byte[] baCharFllr2) {
		this.baCharFllr2 = baCharFllr2;
	}
	public short getShMsgLength() {
		return shMsgLength;
	}
	public void setShMsgLength(short shMsgLength) {
		this.shMsgLength = shMsgLength;
	}
}
