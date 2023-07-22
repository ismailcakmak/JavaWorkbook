package SLList;

public class SLList {

    public static class Node {

        int value;
        Node next;

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }

    private Node head;
    private int size;



    public SLList() {
        head = null;
        size = 0;
    }


    public void add(int value) {
        head = new Node(value, head);
    }


    public void addLast(int value) {

        Node temp = head;

        if(size != 0) {
            while(temp.next != null) {
                temp = temp.next;
            }

            temp.next = new Node(value, null);
        }

    }

    public int size() {
        return size;
    }


    public void delete(){

        if(head != null) {
            head = head.next;
        }

        else
            System.out.println("SLList is already empty!");
    }


    public static void main(String[] args) {
        SLList list = new SLList();
        list.delete();
        list.addLast(1);
        list.add(1);
    }

}
