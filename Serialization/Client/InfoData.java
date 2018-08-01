package serializabledatatransfer;

import java.io.*;
import java.net.*;
import java.util.*;

public class InfoData implements Serializable {
	
	int iId;
	char[] cName;
	long lEmpCode;

	int getId() {
		return iId;
	}

	char[] getName() {
		return cName;
	}

	long getEmpCode(){
		return lEmpCode;
	}

	void setId(int id){
		iId = id;
	}

	void setName(char[] name){
		cName = name;
	}

	void setEmpCode(long num){
		lEmpCode = num;
	}

}
