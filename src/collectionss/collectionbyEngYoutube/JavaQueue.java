package collectionss.collectionbyEngYoutube;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class JavaQueue {

    public static void main(String[] args) {


        //LIFO
        Stack<Integer> list=new Stack<>();
        list.push(2);
        list.push(6);
        list.push(9);
        System.out.println(list);
        list.pop();
        System.out.println(list);
        list.pop();
        System.out.println(list);

        //FIFO
        LinkedList<Integer> linkedList=new LinkedList();
        List<Integer> lisr=new ArrayList<>();
        lisr.sort(Comparator.reverseOrder());



        linkedList.addFirst(2);
        linkedList.addFirst(3);

        linkedList.addFirst(6);
        linkedList.addFirst(3);
        linkedList.addFirst(1);
        linkedList.removeFirst();

        System.out.println("lisssh "+linkedList);


        Queue<Integer>  queue=new ArrayBlockingQueue<>(2);
        queue.offer(1);
        System.out.println(queue.size() );


        Queue<Integer>  queue1=new PriorityQueue<>();
        System.out.println(queue1.size() );









    }
}
