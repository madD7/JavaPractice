package serializabledatatransferclient;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client {

	public static void main(String[] args) throws Exception
	{
		Socket Soc = new Socket("127.0.0.1", 9081);
		
		char[] MyName = new char[10];
		
		MyName[0] = 'D';
		MyName[1] = 'h';
		MyName[2] = 'a';
		MyName[3] = 'v';
		MyName[4] = 'a';
		MyName[5] = 'l';

		InfoData OutInfo = new InfoData();
		Message OutMsg = new Message();

		OutInfo.setId(5);
		OutInfo.setName(MyName);
		OutInfo.setEmpCode(4707);

		OutMsg.setMsgType(1001);
		OutMsg.setMsgLength(26);
		OutMsg.setInfoData(OutInfo);
 		
		BytesArrayOutputStream basOut = new BytesArrayOutputStream;
		ObjectOutputStream oosOut = new ObjectOutputStream(basOut);

		oosOut.writeObject(OutMsg);
		bytes bOut = basOut.toByteArray();
		
		DataOutputStream dOut = new DataOutputStream(Soc.getOutputStream());
		dOut.write(bOut);		
	}

}
