package linkedliststackcasestudy;

public class Client2 {
    public static void useLStack(LStack s){
       
        s.push(10);
        System.out.println("Client2 pushed 10");
        s.push(20);
        System.out.println("Client2 pushed 20");
        s.push(30);
        System.out.println("Client2 pushed 30");
        System.out.println("Client2 popped "+s.pop());
    
    }   
}
