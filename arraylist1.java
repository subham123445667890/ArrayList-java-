import java.util.ArrayList;

public class arraylist1{
  public static void main(String[] args) {
    ArrayList<Integer> list= new ArrayList<>();
    ArrayList<Integer> list2= new ArrayList<>();
    ArrayList<Integer> list3= new ArrayList<>();

    list.add(1);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);

    System.out.println(list);
    
    int b = list.get(2);
    System.out.println(b);
    
    list.remove(3);
    System.out.println(list);
    
     list.set(3,5);
    System.out.println(list);
    System.out.println(list.contains(5));
    System.out.println(list.contains(10));
    
    list.add(2, 8);
    System.out.println(list);
    
    System.out.println(list.size());
    System.out.println(list2.size());
    
    for(int i=0; i<list.size(); i++){
        System.out.println(list.get(i));
    }
    
    
  }
}