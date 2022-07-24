import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Triple {
    private static Map<String,Triple> map = new HashMap<>();

    static{
        String[] names = {"alpha","beta","gamma"};
        Arrays.stream(names).forEach(s->map.put(s, new Triple()));
    }

    private String name;

    private Triple(String name){
    
    
        System.out.println("インスタンス"+name+"生成");
        this.name = name;
    }

    public static Triple getInstance(String name){
        return map.get(name);
    }

    @Override
    public String toString(){
        return this.name;
    }
}
