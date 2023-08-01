package SLList;

public class mymain {

    public static void main(String[] args) {

        VengefulSLList vsl = new VengefulSLList();
        SLList_inherited sl = vsl;

        vsl.add(30);
        vsl.add(20);

        sl.add(10);
        sl.add(5);

        sl.removeLast();
        vsl.printLostItems();

        SLList_inherited sl2 = vsl;

    }





}
