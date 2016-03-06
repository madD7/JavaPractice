package linkedliststackcasestudy;

abstract class Stack {
    int pushcnt=0;
    int popcnt=0;
    
    public int getTotalPushCount()
    {
        return pushcnt;
    }
    
    public int getTotalPopCount()
    {
        return popcnt;
    }
    
    abstract public void push(int v);
    abstract public int pop();
}
