package serializabledatatransferserver;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
	public static void main(String[] args) throws Exception {
		ServerSocket sServ = new ServerSocket(9081);
		Socket Soc = sServ.accept();
		
		InfoData InInfo = new InfoData();
		Message mIn = new Message();
		mIn.setInfoData(OutInfo); 

		byte[] bIn = new byte[50];
		ByteArrayInputStream baisIn = new ByteArrayInputStream(bIn);
		ObjectInputStream oisIn = new ObjectInputStream(baisIn);
		
		mIn = oisIn.readbject();
	}
}
