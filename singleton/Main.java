public class Main {
    public static void main(String[] args) {
        System.out.println("start");
        // TicketMaker obj1 = TicketMaker.getInstance();
        // TicketMaker obj2 = TicketMaker.getInstance();
        // if(obj1 == obj2){
        //     System.out.println("同じ");
        // }
        // else{
        //     System.out.println("ちがう");
        // }
        // System.out.println(obj1.getTicketNumber());
        // System.out.println(obj2.getTicketNumber());
        // System.out.println(obj1.getTicketNumber());
        // System.out.println(obj2.getTicketNumber());
        // System.out.println(obj1.getTicketNumber());
        // System.out.println(obj2.getTicketNumber());
        // System.out.println(obj1.getTicketNumber());
        Triple a1 = Triple.getInstance("alpha");
        Triple b1 = Triple.getInstance("beta");
        Triple c1 = Triple.getInstance("gamma");
        Triple a2 = Triple.getInstance("alpha");
        Triple b2 = Triple.getInstance("beta");
        Triple c2 = Triple.getInstance("gamma");
            
        System.out.println("end");
    }    
}
