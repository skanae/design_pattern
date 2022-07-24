public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();
    private static int ticket = 1000;

    private TicketMaker(){
        System.out.println("インスタンス生成");
    }

    public static TicketMaker getInstance(){
        return ticketMaker;
    }

    public int getTicketNumber() {
        return ++ticket;
    }
}

