package AList;

public class Alist_inherited<Type> {


    private int size;
    private Type[] arr;

    public Alist_inherited(){
        size = 0;
        //arr = new Type[100];    Cant do this
        arr = (Type[]) new Object[100];
    }

    public int size() {
        return size;

    }


    public void resize(int newsize) {
        Type[] temp = (Type[]) new Object[newsize];
        System.arraycopy(arr,0,temp,0,size);
        arr = temp;
    }

    public void add(Type obj) {

        if(size == arr.length){
            this.resize(size * 2); // we should always use * instead of + due to high cost of +
        }

        arr[size] = obj;
        size++;
    }


    public Type getLast() {
        return arr[size-1];
    }

    public Type removeLast() {
        size = size - 1; //if Type object is a costly onei then making it null before size-- is important.
        return arr[size];
    }

    public Type get(int i) {
        return arr[i];
    }
    
    public static void main(String[] args) {
        AList<Integer> list = new AList<Integer>();

        for(int i = 0; i<10000; i++){
            list.add(i);
        }

        System.out.println(list);

        for(int i = 0; i<10000; i++){
            list.removeLast();
        }

        System.out.println(list);


    }
}
