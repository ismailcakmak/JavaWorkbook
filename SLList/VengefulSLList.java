package SLList;

import Inheritance.ListCS61b;

public class VengefulSLList extends SLList_inherited{

    /**
     * This is a fun class that is written to practice inheritance.
     * This class extends from SLList and has a feature to show which items are deleted so far from list.
     */

    ListCS61b lostItems = new SLList_inherited();

    public void printLostItems(){
        lostItems.print();
    }


    public VengefulSLList() {
        super(); // Bunu yazmasak da üstclass ın default constructor ı çağırılır.

        System.out.println("Constructor of VengefulSLList is called");
    }


    @Override
    public Integer removeLast() {
        int temp = super.removeLast();
        lostItems.add(temp);
        return temp;
    }


    public static void main(String[] args) {
        VengefulSLList list = new VengefulSLList();
        list.add(10);
        list.add(11);
        list.add(12);

        list.removeLast();
        list.removeLast();

        list.printLostItems();
    }



}
