package java_collection_framework.queue_interface;
import java.util.*;

public class PriorityQueueImp {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();  //Min Heap
        // Adding elements in priority queue
        pq.add(5);
        pq.add(2);
        pq.add(3);
        pq.add(1);
        pq.add(4);

        // Print the queue
        System.out.println("Priority queue: " + pq);

        // Size of pq
        System.out.println("Size of Priority Queue: "+ pq.size());

        // Peek at the top element of the queue
        System.out.println("Peek: " + pq.peek());

        // Remove the top element of the queue
        System.out.println("Remove top element: "+pq.poll());

        // Check if the queue contains a specific element
        System.out.println("Does the queue contain 3? " + pq.contains(3));

        //Min Heap sorted in ascending order
        System.out.println("Min Heap:");
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        pq.add(8);
        pq.add(10);
        // Remove all elements from the queue
        pq.clear();

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + pq.isEmpty());




    }
}
