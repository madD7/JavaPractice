package serialserver;

import java.io.*;
import java.net.*;

public class Server {
	public static void main (String[] args) throws Exception {
		try {
			ServerSocket sServ = new ServerSocket(8080);
			
			while(true) {
				Socket Soc = sServ.accept();
				System.out.println("Connection established with client ");
				
				int bytesRead = -1;
				byte[] bBuf = new byte[512];
				
				InterfaceHeader intrfcHdrRcvd = new InterfaceHeader();
				InterfaceHeader intrfcHdrSend = new InterfaceHeader();
				
				LogonRequest logReq = new LogonRequest();
				logReq.setInterfaceHeader(intrfcHdrRcvd);
				
				Response respOut = new Response(); 
				respOut.setIntrfcHdr(intrfcHdrSend);
				
				InputStream disIn = new DataInputStream(Soc.getInputStream());
				while( (bytesRead = disIn.read(bBuf)) != -1 )
				{
					ByteArrayInputStream baisIn = new ByteArrayInputStream(bBuf);
					ObjectInputStream oisIn = new ObjectInputStream(baisIn);
				
					logReq = (LogonRequest) oisIn.readObject();
										
					intrfcHdrRcvd = (InterfaceHeader) logReq.getInterfaceHeader();
					
					System.out.println("getShMsgLength()" + intrfcHdrRcvd.getShMsgLength());
	                System.out.println("getiTrdrNmbr()" + intrfcHdrRcvd.getiTrdrNmbr());
	                System.out.println("getiLogTimeStmp()" + intrfcHdrRcvd.getiLogTimeStmp());
	                System.out.println("getShTrnsCode()" + intrfcHdrRcvd.getShTrnsCode());
	                
	                switch (intrfcHdrRcvd.getShTrnsCode())
	                {
	                	case 1000:
	                		intrfcHdrSend.setShTrnsCode((short)1001);
	                		intrfcHdrSend.setShMsgLength((short)42);
	                		respOut.setiSeqNmbr(0);
	                		break;
	                		
	                	case 1004:
	                		intrfcHdrSend.setShTrnsCode((short)1005);
	                		intrfcHdrSend.setShMsgLength((short)42);
	                		respOut.setiSeqNmbr(1);
	                		break;
	                }
	                
	                ByteArrayOutputStream baosOut = new ByteArrayOutputStream();
	        		ObjectOutputStream oosOut = new ObjectOutputStream(baosOut);
	        		
	        		oosOut.writeObject(respOut);
	        		byte[] bOut = baosOut.toByteArray();
	        		
	        		DataOutputStream dosOut = new DataOutputStream(Soc.getOutputStream());
	        		dosOut.write(bOut,0,42);
				}
			}			
		} catch (Exception e)
		{
			
		}
	}
}
