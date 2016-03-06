package linkedliststackcasestudy;

public class Client1 {
    public static void useAStack(AStack s){
        
        s.push(10);
        System.out.println("Client1 pushed 10");
        s.push(20);
        System.out.println("Client1 pushed 20");
        s.push(30);
        System.out.println("Client1 pushed 30");
        System.out.println("Client1 popped "+s.pop());
        
    }
}
