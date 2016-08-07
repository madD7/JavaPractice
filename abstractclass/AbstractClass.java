package abstractclass;

/**
 * @author madD7
 *
 * This example is to demonstrate abstract class.
 * 
 * To define any abstract method in a class, the class must be abstract class.
 * Abstract methods dont have body. But its body must be present in every child class that inherits parent class.
 * 
 * An abstract class that doesnt not have any abstract methods is complete class.
 * 
 */



// To define any abstract method in a class, the class must be abstract class
// class Communication // is not valid. Reason stated in above line
abstract class Communication{
	private int chnOpnFlg=0;
	
	final int getPortStatus()
	{
		return chnOpnFlg;
	}
	
	final void setPortStatus(int flg)
	{
		chnOpnFlg = flg;
	}
	
	/**
	 * Abstract methods doesnt have a body. But its body must be present in every child class that inherits parent class 
	 */
	abstract int openPort();
	abstract int closePort();
	abstract int transmitData(String data);
	abstract int receiveData();
}


abstract class CompleteAbstract
{
	void hello()
	{
		System.out.println("Hello method of random abstract class");
	}
}


class EthernetPort extends Communication{

	int openPort()
	{
		System.out.println("In ethernet open port method");
		
		setPortStatus(1);
		
		return 0;		// 0 for success, 1 for error
	}
	
	int closePort()
	{
		if(getPortStatus() == 0)
			return -1;
		
		System.out.println("In ethernet close port method");
		return 0;
	}
	
	int transmitData(String data)
	{		
		if(getPortStatus() == 0)
			return -1;
		
		int txbytes=0;
		
		System.out.println("In ethernet transmit data method");
		System.out.println("Transmitting " + data );
		
		return txbytes;
	}
	
	int receiveData()
	{
		if(getPortStatus() == 0)
			return -1;
		
		int rxbytes=0;
		
		System.out.println("In ethernet receive data method");
		
		return rxbytes;
	}
}



class SerialPort extends Communication{

	int openPort()
	{
		System.out.println("In serial open port method");
		
		setPortStatus(1);
		
		return 0;		// 0 for success, 1 for error
	}
	
	int closePort()
	{
		if(getPortStatus() == 0)
			return -1;
		
		System.out.println("In serial close port method");
		return 0;
	}
	
	int transmitData(String data)
	{
		if(getPortStatus() == 0)
			return -1;
		
		int txbytes=0;
		
		System.out.println("In serial transmit data method");
		System.out.println("Transmitting " + data);
		
		return txbytes;
	}
	
	int receiveData()
	{
		if(getPortStatus() == 0)
			return -1;
		
		int rxbytes=0;
		
		System.out.println("In serial receive data method");
		
		return rxbytes;
	}
}



public class AbstractClass {
	
	public static void main(String[] args) {
		
		/**
		 * Objects of abstract class cant be created.
		 * However, Instance of an abstract class, whether complete or incomplete, can be created. 
		 * Thus handle of abstract class can be created.
		 * Hence, we say, "When we create object of a class, we are instantiating that class" 
		 * */
		Communication port;
		port = new SerialPort();
		sendData(port, "Hello");
		
		port = new EthernetPort();
		sendData(port, "Hi");
		
		/* Objects of a complete but abstract class cant be instantiated */
		// CompleteAbstract ab = new CompleteAbstract();
		
		/* This is not an instance of abstract class "CompleteAbstract"
		 * Rather it is an instance of an anonymous subclass of "CompleteAbstract".
		 * If this class was instantiated in a different java file, then a extra .class file will be created in the source folder.
		 * This implies that a different class is being instantiated   
		 * */ 
		CompleteAbstract anonymous = new CompleteAbstract () {};
		anonymous.hello();
	}
	
	private static int sendData(Communication p, String strdata)
	{
		int status=0;
		
		status = p.openPort();
		if(status != 0)
		{
			System.out.println("Failed to open the port");
		}
		
		status = p.transmitData(strdata);
		
		if(status < 0)
		{
			System.out.println("Failed to transmit data");
		}
		
		return status;
	}

}
