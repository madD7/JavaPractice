package linkedliststackcasestudy;



public class LStack extends StackAuditor implements IStack{
    private Node head;
    
    @Override
    public void push(int v){
        incrementPushCount();
        head = new Node(v,head); 
    }
    
    @Override
    public int pop(){
        incrementPopCount();
        if(head==null) return -1;
        Node t = head;
        head = head.getNext();
        return t.getV();
    }
    
    @Override
    public void print(){
        System.out.println("Printing LStack");
        Node t = head;
        while(t != null){
            System.out.println(t.getV());
            t = t.getNext();
        }
    }
    
}