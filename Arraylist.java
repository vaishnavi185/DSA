import java.util.*;

public class Arraylist {
    public static void main (String []args){
        ArrayList<Integer>list = new ArrayList<Integer>();
        list.add(3);
        list.add(6);
        list.add(8);
         
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));    //get is used to get element index wise

        }
      int ele= list.get(0);
   
      System.out.println(ele);

      list.remove(0);
      System.out.print(list);    //remove element through index
      list .set(0,78);
      System.out.print(list);    // set will set element at 0 index
       
      Collections.sort(list);
      System.out.print(list);    //sort to sort list
     
    }
}
