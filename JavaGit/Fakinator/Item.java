import java.util.ArrayList;

public class Item{

    private String name;
    private ArrayList<String> list;
    
    public Item(String name, ArrayList<String> list){
        this.name = name;
        this.list = list;
    }

    public String getName(){
        return name;
    }

    public ArrayList<String> getList(){
        return list;
    }
}