package priorityqueue;

import java.util.ArrayList;
import java.util.ListIterator;
import javax.print.attribute.standard.JobSheets;

public class PriorityQueue <T> {
    
    private static final int MOST_IMPORTANT = 5;
    private static final int LEAST_IMPORTANT = 0;
    
    private ArrayList<T>[] jobs = new ArrayList[6];
    
    public PriorityQueue(){
        for(int i = 0; i < jobs.length; i++){
            jobs[i] = new ArrayList();
        }
    }
    
    public void add(int priority, T element){
        jobs[priority].add(element);
    }
    
    public T get(){
        int i = MOST_IMPORTANT;
        while(jobs[i].isEmpty()){
            i--;
        }
        if(i >= LEAST_IMPORTANT){
            return jobs[i].remove(0);
        }
        return null;
    }
    
}
