package Linkedlist;

import Linkedlist.First.Node;

public class First {
    Node head;
 First(){};

public class Node{
    
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
//inserFirst
public void insertFirst(int val){
    Node node=new Node(val);
    node.next=head;
    head=node;
}

//Find the middle of a node

    public Node middleNode() {
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("The middle node is ["+slow.val+"]");
        return slow;
    }

//Binary to Decimal convertor
public int getDecimalValue(){
        int ans=0;
        Node temp=head;
        while(head!=null){
            ans*=2;
            if(head.val==1){
                ans++;
            }
            head=head.next;
        }
        head=temp;
        return ans;
    }
    //Reverse a Linkedlist
    public Node reverseList(Node head) {
        
        if(head==null || head.next==null){
            return head;
        }
        Node newHead=reverseList(head.next);
        Node headNext= head.next;
        headNext.next=head;
        head.next=null;
        return newHead;
    }
    
    //print the list
    public void printList(Node a) {
        Node currNode = a;
  
        while(currNode != null) {
            System.out.print(currNode.val+" -> ");
            currNode = currNode.next;
        }
  
        System.out.println("null");
    }
} 

class Main{
    public static void main(String[] args){
        First list=new First();
    list.insertFirst(1);
    list.insertFirst(0);
    list.insertFirst(1);
        System.out.println(list.getDecimalValue());
        System.out.println("Given linked list:");
        for(int i=0;i<9;i++){
            list.insertFirst(i);
        }
        list.printList(list.head);
        list.middleNode();
        
        System.out.println("After Reversing:");
        Node a=list.reverseList(list.head);
        list.printList(a);
        
    }
}
    


