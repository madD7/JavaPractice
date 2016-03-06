package linkedliststackcasestudy;

public class AStack extends StackAuditor implements IStack{

    private int[] stk = new int[10];
    private int sp = 10;
    
    @Override
    public void push(int v) {
        incrementPushCount();
        if (sp == 0) {
            System.out.println("Stack Overflow");
        } else {
            sp = sp - 1;
            stk[sp] = v;
        }
    }

    @Override
    public int pop() {
        incrementPopCount();
        int temp = -1;
        if (sp == 10) {
            System.out.println("Stack Underflow");
        } else {
            temp = stk[sp];
            sp = sp + 1;
        }
        return temp;
    }
    
    @Override
    public void print() {
        System.out.println("Printing AStack");
        if (sp == 10) {
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = sp; i < 10; i++) {
            System.out.println(stk[i]);
        }
    }
}
