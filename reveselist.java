import java.util.ArrayList;

public class reveselist{
  public static void main(String[] args) {
    ArrayList<Integer> list= new ArrayList<>();
    ArrayList<Integer> list2= new ArrayList<>();
    ArrayList<Integer> list3= new ArrayList<>();

    list.add(1);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);

    for(int i=list.size()-1; i>=0; i--){
    System.out.print(list.get(i)+ "");
   
    }
    
    
  }
}