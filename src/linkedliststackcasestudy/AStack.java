package linkedliststackcasestudy;

public class AStack {

    int[] stk = new int[10];
    int sp = 10;
    private int validpushcnt=0;
    private int validpopcnt=0;
    private int pushcnt=0;
    private int popcnt=0;

    public void push(int v) {
        if (sp == 0) {
            System.out.println("Stack Overflow");
        } else {
            sp = sp - 1;
            stk[sp] = v;
            validpushcnt++;
        }
        pushcnt++;
    }

    public int pop() {
        int temp = -1;
        if (sp == 10) {
            System.out.println("Stack Underflow");
        } else {
            temp = stk[sp];
            sp = sp + 1;
            validpopcnt++;
        }
        popcnt++;
        return temp;
    }

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
    
    public int getValidPushCount()
    {
        return validpushcnt;
    }
    
    public int getValidPopCount()
    {
        return validpopcnt;
    }
    
    public int getTotalPushCount()
    {
        return pushcnt;
    }
    
    public int getTotalPopCount()
    {
        return popcnt;
    }
    
    public int getFailedPushCount()
    {
        return (pushcnt - validpushcnt);
    }
    
    public int getFailedPopCount()
    {
        return (popcnt-validpopcnt);
    }
}