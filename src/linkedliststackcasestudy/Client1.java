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
        
        s.push(10);
        System.out.println("Client1 pushed 10");
        s.push(11);
        System.out.println("Client1 pushed 11");
        s.push(12);
        System.out.println("Client1 pushed 12");
        s.push(13);
        System.out.println("Client1 pushed 13");
        s.push(14);
        System.out.println("Client1 pushed 14");
        s.push(15);
        System.out.println("Client1 pushed 15");
        s.push(16);
        System.out.println("Client1 pushed 16");
        s.push(17);
        System.out.println("Client1 pushed 17");
        s.push(18);
        System.out.println("Client1 pushed 18");
        s.push(19);
        System.out.println("Client1 pushed 19");
        s.push(20);
        System.out.println("Client1 pushed 20");

        System.out.println("Client1 poped "+s.pop());
        System.out.println("Client1 poped "+s.pop());
        System.out.println("Client1 poped "+ s.pop());
        System.out.println("Client1 poped "+s.pop());
        System.out.println("Client1 poped "+s.pop());
        System.out.println("Client1 poped "+s.pop());
        System.out.println("Client1 poped "+s.pop());
        System.out.println("Client1 poped "+s.pop());
        System.out.println("Client1 poped "+s.pop());
        System.out.println("Client1 poped "+s.pop());
        System.out.println("Client1 poped "+s.pop());
        System.out.println("Client1 poped "+s.pop());
       
        s.push(106);
        System.out.println("Client1 pushed 106");
        s.push(107);
        System.out.println("Client1 pushed 107");
        s.push(108);
        System.out.println("Client1 pushed 108");
        s.push(109);
        System.out.println("Client1 pushed 109");
        s.push(200);
        System.out.println("Client1 pushed 200");
        s.push(201);
        System.out.println("Client1 pushed 201");
        s.push(202);
        System.out.println("Client1 pushed 202");
    }
}