import java.util.*;
public class pairsum{
    public static void main(String ars[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        
        int target =12;
        
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i) + list.get(j) == target){
                    System.out.println("true"+" " + i+ " "+ j);
                }
            }
        }
        
      
    }
}