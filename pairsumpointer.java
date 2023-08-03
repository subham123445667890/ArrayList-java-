import java.util.*;
public class pairsumpointer{
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
        int lp=0;
        int rp=list.size()-1;
        
        Collections.sort(list);
        
        while(lp != rp){
            if(list.get(lp) +list.get(rp) == target){
                System.out.print("true");
            }
            if(list.get(lp) +list.get(rp) < target){
                lp++;
            }
            else {
                rp++;
            }
        
        }
        
      
    }
}