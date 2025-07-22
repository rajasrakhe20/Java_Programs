package java_collection_framework.queue_interface;

import java.util.* ;

public class PriorityQueueMaxHeapImp {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq  = new PriorityQueue<>((Integer a, Integer b) -> b-a);  // Max Heap;
        // PriorityQueue<Integer> pq  = new PriorityQueue<>(comparator.reverseOrder());
        // Adding elements in priority queue
        pq.add(5);
        pq.add(2);
        pq.add(3);
        pq.add(1);
        pq.add(4);

        // Max Heap
        System.out.println("Max Heap:");
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
