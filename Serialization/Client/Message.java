package serializabledatatransfer;

import java.io.*;
import java.util.*;

public class Message implements Serializable {

	private int iMsgType;
	private int iMsgLength;
	private InfoData;
	
	public int getMsgType() {
		return iMsgType;
	}

	public int getMsgLength() {
		return iMsgLength;
	}

	public void setMsgType(int type) {
		iMsgType = type;
	}

	public void setMsgLength(int len) {
		iMsglLength = len;
	}

	public void setInfoData(InfoData ifdt) {
		InfoData = ifdt;
	}
}
