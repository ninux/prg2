package linkedlist;

public class Node <T> {
    
    private Node next = null;
    private Node previous = null;
    
    private T data = null;
    
    public Node(T d){
        data = d;
    }
    
    public Node(Node<T> n, Node<T> p, T d){
        next = n;
        // previous = p;
        data = d;
    }
    
    public void setNext(Node<T> n){
        next = n;
    }
    
    public Node<T> getNext(){
        return next;
    }
    
    public void setPrevious(Node<T> p){
        previous = p;
    }
    
    public Node<T> getPrevious(){
        return previous;
    }
    
    public void setData(T d){
        data = d;
    }
    
    public T getData(){
        return data;
    }
    
}
