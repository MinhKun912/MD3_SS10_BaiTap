package Bai1;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size=0;
     static final int DEFAULT_CAPACITY=10;
        Object element[];
        public MyList(){
        }
        public MyList(int capacity){

        }
       public void add(E e){
            if(size==element.length){
                element= Arrays.copyOf(element,element.length+1);
            }
         element[size++]=e;
        }
        public E remmove(int index){

            return null;
        }
        public int size(){

            return 0;
        }
       public E clone(){

           return null;
       }
       public void indexOf(E o){

       }
       public E get(int i){
if (i>size||i<0) {
    throw new IndexOutOfBoundsException("Get"+i+"size"+i);
}
return (E) element[i];
       }

}
