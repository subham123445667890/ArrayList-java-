import java.util.*;
public class multilist{

public static void main(String[] args) {
      ArrayList<ArrayList<Integer>>mainlist =new ArrayList<>();
      ArrayList<Integer>list =new ArrayList<>();
      
      list.add(1);
      list.add(6);
      list.add(9);
      list.add(8);
      list.add(5);
      
      mainlist.add(list);
      
       ArrayList<Integer>list2 =new ArrayList<>();
      
      list2.add(7);
      list2.add(0);
      list2.add(2);
      list2.add(7);
      list2.add(8);
      
      mainlist.add(list2);
      
      ArrayList<Integer>list3 =new ArrayList<>();
      
      list3.add(8);
      list3.add(5);
      list3.add(6);
      list3.add(7);
      list3.add(0);
      
      mainlist.add(list3);
      
      for(int i=0;i<mainlist.size(); i++){
           ArrayList<Integer>currList =mainlist.get(i);
           for(int j=0; j<currList.size(); j++);{
               System.out.print(currList.get(j));
           }
          
      }
     System.out.println(mainlist);
     

}}