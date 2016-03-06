package linkedliststackcasestudy;

public class Client {
    public static void useStack(IStack s){
       
        s.push(10);
        System.out.println("Client pushed 10");
        s.push(20);
        System.out.println("Client pushed 20");
        s.push(30);
        System.out.println("Client pushed 30");
        System.out.println("Client popped "+s.pop());
    
    }   
}