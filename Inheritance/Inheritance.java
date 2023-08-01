package Inheritance;

import AList.Alist_inherited;
import SLList.SLList_inherited;

public class Inheritance {

    public static int biggestItem(ListCS61b list) {

        int biggestVal = (int) list.getLast();
        list.removeLast();

        for(int i=0; i<list.size(); i++){
            if((int)list.get(i) > biggestVal) {
                biggestVal = (int)list.get(i);
            }
        }

        return biggestVal;

    }


    public static void main(String[] args) {
        Alist_inherited<Integer> alist = new Alist_inherited<Integer>();
        SLList_inherited sllist        = new SLList_inherited();

        alist.add(1);
        alist.add(2);
        alist.add(3);
        alist.add(4);

        sllist.add(1);
        sllist.add(2);
        sllist.add(3);
        sllist.add(4);


        int a = biggestItem(sllist);

        System.out.println(a);

    }

    
}
