import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("hiroshi yuki");
        Product card2 = factory.create("tomura");
        Product card3 = factory.create("hiroshi sato");
        card1.use();
        card2.use();
        card3.use();
    }
}
