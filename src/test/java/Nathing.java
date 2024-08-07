

import java.util.ArrayList;
import java.util.Arrays;

public class Nathing {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(12,23,45,45,79,78,52));
        System.out.println("list = " + list);
            for(Object each:list){
                if(each.equals(45)){

                    continue;

                }
                System.out.println("each = " + each);
            }
       ArrayList<ArrayList<Integer>> list1=new ArrayList<>();
        boolean add = list1.add(list);
        System.out.println("list1 = " + list1);
      // for(ArrayList each1:list1);


    }


    }





