package priorityqueue;

public class Main {
    
    public static void main(String[] args){
        
        PriorityQueue<String> pq = new PriorityQueue<>();
        
        pq.add(5, "A");
        pq.add(1, "E");
        pq.add(3, "C");
        pq.add(4, "B");
        pq.add(2, "D");
        
        System.out.println(pq.get());
        System.out.println(pq.get());
        System.out.println(pq.get());
        System.out.println(pq.get());
        System.out.println(pq.get());
        
    }
    
}
