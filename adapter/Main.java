// public class Main{
//     public static void main(String[] args) {
//         Print p = new PrintBanner("hello");
//         p.printWeak();
//         p.printStrong();
//     }
// }



import java.io.IOException;
public class Main{
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        // var filename = "C:/Users/kanae/Source/design_pattern/adapter/file.txt";
        try{
            f.readFromFile("C:/Users/kanae/Source/design_pattern/adapter/file.txt");
            f.setValue("width","100");
            f.setValue("hight","100");
            f.setValue("depth","100");
            f.writeToFile("C:/Users/kanae/Source/design_pattern/adapter/file.txt");
            System.out.println("file create");
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}