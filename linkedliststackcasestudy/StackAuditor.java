package linkedliststackcasestudy;

public abstract class StackAuditor implements IAuditor{
    protected int pushcount;
    protected int popcount;
    
    @Override
    public int getPushcount() {
        return pushcount;
    }

    @Override
    public int getPopcount() {
        return popcount;
    }
    
    @Override
    public void incrementPushCount(){
        pushcount++;
    }
    
    @Override
    public void incrementPopCount(){
        popcount++;
    }
}
