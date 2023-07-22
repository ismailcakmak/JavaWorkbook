package SLList;

public class SLList_sentinel {

    public static class Node {

        int value;
        Node next;

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }

    public SLList_sentinel() {
        sentinel = new Node(63,null);
    }

    private Node sentinel;
    private int size;

    // .add()  .addLast() .size() .delete()


    public void add(int value){
        sentinel.next = new Node(value,sentinel.next);

        size++;
    }

    public void addLast(int value) {

        Node temp = sentinel;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(value, null);

        size++;
    }

    public int size() {
        return size;
    }

    public void delete() {

        if(sentinel.next == null) {
            System.out.println("Linkedlist is alreadty empty!");
            return;
        }

        else{
            sentinel.next = sentinel.next.next;
        }

    }

    public void deleteFromRear() {

        if(sentinel.next == null) {
            System.out.println("Linkedlist is alreadty empty!");
            return;
        }

        else{

            Node temp = sentinel;

            while(temp.next.next != null) {
                temp = temp.next;
            }

            temp.next = null;

        }
    }

    public static void main(String[] args) {
        SLList_sentinel list = new SLList_sentinel();

        list.add(3);
        list.add(4);
        list.add(5);
        list.addLast(6);
        list.delete();
        list.deleteFromRear();

    }
}
