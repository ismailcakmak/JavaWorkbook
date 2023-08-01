package Inheritance;

public interface ListCS61b<Item>{

    public void add(Item x);
    public Item getLast();
    public Item get(int i);
    public int size();
    public Item removeLast();
    default public void print() {
        for (int i = 0; i < size(); i += 1) {
            System.out.print(get(i) + " ");
        }
    }

}
