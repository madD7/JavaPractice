package linkedliststackcasestudy;



public class Auditor {
    public static void audit(IAuditor s){
        System.out.println("Entering Auditor");
        System.out.println("Push Count is "+s.getPushcount());
        System.out.println("Pop Count is "+s.getPopcount());
        System.out.println("Leaving Auditor");
    }    
}
