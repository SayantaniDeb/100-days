package Linkedlist;

public class Second {
    Node head;
    //merge two linkedlist
    public Node merge(Node a,Node b){
        Node dummy=new Node();
        Node tail=dummy;
        while(a!=null && b!=null){
            if(a.val<=b.val){
                tail.next=a;
                a=a.next;
            }
            else{
                tail.next=b;
                b=b.next;
            }
            tail=tail.next;

        }
        if(a!=null){
            tail.next=a;
            a=a.next;
        }
        else{
            tail.next=b;
            b=b.next;
        }
        tail=tail.next;  
        return dummy.next;   
    }
     
   public void insertLast(int val) {
    Node newNode = new Node(val);

    if(head == null) {
        head = newNode;
        return;
    }

    Node lastNode = head;
    while(lastNode.next != null) {
        lastNode = lastNode.next;
    }

    lastNode.next = newNode;
}

    //print linkedlist
    public void printList(){
        Node node=head;
        while(node!=null){
            System.out.print(node.val+" -> ");
            node=node.next;
            
        }
        System.out.println("null");
    }

public static void main(String[] args) {
    Second list1=new Second();
        Second list2=new Second();
        list1.insertLast(0);
        list1.insertLast(5);
        list1.insertLast(7);
        list1.printList();
        list2.insertLast(1);
        list2.insertLast(3);
        list2.insertLast(9);
        list2.printList();
        list1.head = new Second().merge(list1.head,
                                            list2.head);
        System.out.println("Merged Linked List is:");
        list1.printList();
}
}
        class Node{
            int val;
            Node next;
            Node(){};
        
        Node(int val){
            this.val=val;
        }
        Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
        }