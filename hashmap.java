import java.util.HashMap;

public class main {
   public static void main(String[] args){
    HashMap<Integer,String> m=new HashMap<>();
    m.put(101,"alice");
    m.put(102,"bob");
    System.out.println("the containts is:"+m);
   System.out.println("the size of the list is:"+m.size()); 
    m.remove(2);
    System.out.println("after removing the index 2:"+m);
     m.clear();
    System.out.println("after clearing:"+m);
}
}
