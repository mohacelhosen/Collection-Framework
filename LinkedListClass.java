import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
//      Add item in the last
        ll.add(2);
        ll.add(5);
        ll.add(8);
        ll.add(10);
        ll.add(11);
        ll.add(10);
        ll.add(13);
        ll.add(10);
        ll.add(17);
        System.out.println(ll);

//      Add item in the given index
        ll.add(1,3);
        System.out.println(ll);

//       Check whether the item is present or not
        System.out.println(ll.contains(11));

//      Set(update) item at given index
        ll.set(3,7);
        System.out.println(ll);

//      find the first index of an item
        System.out.println("First index(10): "+ll.indexOf(10));

//      find the last index of an item
        System.out.println("Last index(10): "+ll.lastIndexOf(10));

//       Remove an item from the first because it implements Queue interface
        ll.remove();
        System.out.println(ll);

//       Remove an item from the first using value
        ll.remove((Integer) 10);
        System.out.println(ll);

/*
        If you remove any mid-element using forEach method it can create  Exception 'ConcurrentModificationException'
 */
//        ll.forEach(x->{
//            if (x.equals(10)){
//                ll.remove(x);
//            }
//        });

        Iterator it = ll.iterator();
        while (it.hasNext()){
            if((int)it.next()==10){
                it.remove();
            }
        }
        System.out.println(ll);
        System.out.println("Is this LinkedList empty: "+ll.isEmpty());

    }
}
