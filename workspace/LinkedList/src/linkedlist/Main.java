package linkedlist;

public class Main {
    
    public static void main(String[] args){
        
        // make a new linked-list
        LinkedList<String> ll = new LinkedList<>();
        
        ll.insertAtHead("hello");
        ll.insertAtHead("my");
        ll.insertAtHead("name");
        ll.insertAtHead("is");
        ll.insertAtHead("slim");
        ll.insertAtHead("shady");
        
        ll.insertAtEnd("Hi, my name is slim shady!");
        
        ll.printList();
        
    }
    
}
