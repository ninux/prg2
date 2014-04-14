package linkedlist;

public class LinkedList <T> {
    
    private Node head;
    private Node tail;
    private Node current;
    
    public LinkedList(){
       head = null;
       tail = null;
       current = null;
    }
    
    public void insertAtHead(T obj){
        if(head == null){   // the list is empty
            Node nn = new Node(obj);
            nn.setNext(null);
            nn.setPrevious(null);
            head = nn;
            tail = nn;
        }
        else{               // the list isn't empty
            Node nn = new Node(obj);
            nn.setNext(null);
            nn.setPrevious(head);
            head.setNext(nn); 
            head = nn;
        }
    }
    
    public void insertAtEnd(T obj){
        if(head == null){   // the lsit is empty
            Node nn = new Node(obj);
            nn.setNext(null);
            nn.setPrevious(null);
            head = nn;
            tail = nn;
        }
        else{               // the list isn't empty
            Node nn = new Node(obj);
            nn.setNext(tail);
            nn.setPrevious(null);
            tail.setPrevious(nn);
            tail = nn;
        }
    }
    
    public void printList(){
        Node ptr = tail;
        while(ptr != null){
            System.out.println(ptr.getData());
            ptr = ptr.getNext();
        }
    }
    
}
