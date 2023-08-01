package SLList;

import Inheritance.ListCS61b;

public class RotatingSLList extends SLList_inherited {
    /**
     * This class has a new feature as rotatingRight() addition to SLList
     */

    public void rotateRight() {
        int temp = this.deleteFromRear();
        this.add(temp);
    }


    public static void main(String[] args) {
        RotatingSLList list = new RotatingSLList();

        list.add(22);
        list.add(11);
        list.add(9);
        list.add(19);

        list.rotateRight();
        list.print();


    }

}
