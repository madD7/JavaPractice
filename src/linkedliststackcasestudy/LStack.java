package linkedliststackcasestudy;



public class LStack {
    private Node head;
    private int pushcnt=0;
    private int popcnt=0;
    
    public void push(int v){
        head = new Node(v,head);
        pushcnt++;
    }
    public int pop(){
        if(head==null) return -1;
        Node t = head;
        head = head.getNext();
        popcnt++;
        return t.getV();
    }
    public void print(){
        System.out.println("Printing LStack");
        Node t = head;
        while(t != null){
            System.out.println(t.getV());
            t = t.getNext();
        }
    }
    
    public int getTotalPushCount()
    {
        return pushcnt;
    }
    
    public int getTotalPopCount()
    {
        return popcnt;
    }
}
