package linkedliststackcasestudy;


public class StackCaseStudy {
    public static void main(String[] args) {
      AStack s1 = new AStack();
      Client1.useAStack(s1);
      Client.useStack(s1);
      Auditor.audit(s1);
      s1.print();
      LStack s2 = new LStack();
      Client2.useLStack(s2);
      Client.useStack(s2);
      Auditor.audit(s2);
      s1.print();
    }
}