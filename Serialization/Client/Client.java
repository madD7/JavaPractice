package serialclient;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
	static Socket Soc = null;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			Soc = new Socket("127.0.0.1", 8080);
			int iRetVal;
			
			iRetVal = SendLogonRequest();
			iRetVal = RecvResponse();
			
			iRetVal = SendSyncRequest();
			iRetVal = RecvResponse();
			
			
		}catch (Exception e)
		{
			
		}
	}
	
	private static int SendLogonRequest() throws Exception {
		LogonRequest logReq = new LogonRequest();
		InterfaceHeader intrfcHdr = new InterfaceHeader();
		
		intrfcHdr.setiTrdrNmbr(0);
		intrfcHdr.setiLogTimeStmp(0);
		intrfcHdr.setShTrnsCode((short)1000);
		intrfcHdr.setShErrCode((short)0);
		intrfcHdr.setiBcSeqNmbr(0);
		intrfcHdr.setlLongTimeStmp(0);
		intrfcHdr.setShMsgLength((short)66);
		
		logReq.setInterfaceHeader(intrfcHdr);
		
		ByteArrayOutputStream baosOut = new ByteArrayOutputStream();
		ObjectOutputStream oosOut = new ObjectOutputStream(baosOut);
		
		oosOut.writeObject(logReq);
		byte[] bOut = baosOut.toByteArray();
		
		DataOutputStream dosOut = new DataOutputStream(Soc.getOutputStream());
		dosOut.write(bOut,0,66);
		
		System.out.println(bOut);
		return 0;
	}
	
	private static int SendSyncRequest() throws Exception {
		SyncRequest syncReq = new SyncRequest();
		InterfaceHeader intrfcHdr = new InterfaceHeader();
		
		intrfcHdr.setiTrdrNmbr(0);
		intrfcHdr.setiLogTimeStmp(0);
		intrfcHdr.setShTrnsCode((short)1004);
		intrfcHdr.setShErrCode((short)0);
		intrfcHdr.setiBcSeqNmbr(0);
		intrfcHdr.setlLongTimeStmp(0);
		intrfcHdr.setShMsgLength((short)42);
		
		syncReq.setInterfaceHeader(intrfcHdr);
		
		ByteArrayOutputStream baosOut = new ByteArrayOutputStream();
		ObjectOutputStream oosOut = new ObjectOutputStream(baosOut);
		
		oosOut.writeObject(syncReq);
		byte[] bOut = baosOut.toByteArray();
		
		DataOutputStream dosOut = new DataOutputStream(Soc.getOutputStream());
		dosOut.write(bOut,0,42);
		
		System.out.println(bOut);
		return 0;
	}
	
	private static int RecvResponse() throws Exception {		
		int bytesRead = -1;
		byte[] bBuf = new byte[512];
		
		InterfaceHeader intrfcHdr = new InterfaceHeader();
		LogonRequest logReq = new LogonRequest();
		logReq.setInterfaceHeader(intrfcHdr);
		
		DataInputStream disIn = new DataInputStream(Soc.getInputStream());
		if( (bytesRead = disIn.read(bBuf)) != -1 )
		{
			ByteArrayInputStream baisIn = new ByteArrayInputStream(bBuf);
			ObjectInputStream oisIn = new ObjectInputStream(baisIn);
		
			logReq = (LogonRequest) oisIn.readObject();
			intrfcHdr = (InterfaceHeader) logReq.getInterfaceHeader();
			
			System.out.println("getShMsgLength()" + intrfcHdr.getShMsgLength());
            System.out.println("getiTrdrNmbr()" + intrfcHdr.getiTrdrNmbr());
            System.out.println("getiLogTimeStmp()" + intrfcHdr.getiLogTimeStmp());
            System.out.println("getShTrnsCode()" + intrfcHdr.getShTrnsCode());
		}
		else 
			return -1; 
		
		return -0;
	}
	
}
