package Bai1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyList<Integer> listInteger= new MyList<>();
        listInteger.add(5);
        System.out.println(listInteger.get(0));
    }
}