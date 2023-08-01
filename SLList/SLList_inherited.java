package SLList;

import Inheritance.ListCS61b;

public class SLList_inherited implements ListCS61b<Integer> {

    public static class Node {

        int value;
        SLList_inherited.Node next;

        public Node(int value, SLList_inherited.Node next){
            this.value = value;
            this.next = next;
        }

    }

    public SLList_inherited() {
        sentinel = new SLList_inherited.Node(63,null);
    }

    private SLList_inherited.Node sentinel;
    private int size;

    // .add()  .addLast() .size() .delete()


    public void add(Integer value){
        sentinel.next = new SLList_inherited.Node(value,sentinel.next);

        size++;
    }

    public Integer getLast() {
        return sentinel.next.value;
    }

    public void addLast(int value) {

        SLList_inherited.Node temp = sentinel;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = new SLList_inherited.Node(value, null);

        size++;
    }

    public int size() {
        return size;
    }

    public Integer removeLast() {

        if(sentinel.next == null) {
            System.out.println("Linkedlist is alreadty empty!");
            return null;
        }

        else{
            Integer temp = sentinel.next.value;
            sentinel.next = sentinel.next.next;
            return temp;
        }

    }

    public int deleteFromRear() {

        if(sentinel.next == null) {
            System.out.println("Linkedlist is alreadty empty!");
            return -1;
        }

        else{

            SLList_inherited.Node temp = sentinel;

            while(temp.next.next != null) {
                temp = temp.next;
            }

            int tempVal = temp.next.value ;
            temp.next = null;

            return tempVal;
        }
    }

    public Integer get(int index) {
        //this is not implemented
        return null;
    }

    public void print() {

        for(Node temp = sentinel.next; temp!=null; temp=temp.next){
            System.out.print(temp.value + " ");
        }
    }

    public static void main(String[] args) {
        SLList_inherited list = new SLList_inherited();

        list.add(3);
        list.add(4);
        list.add(5);
        list.addLast(6);
        list.removeLast();
        list.deleteFromRear();
        list.print();

    }

}
