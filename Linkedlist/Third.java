package Linkedlist;
//Palindrome
public class Third {
    ListNode head;
    Third(){};
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
        }
        public ListNode middle(ListNode head){
            ListNode fast=head;
            ListNode slow=head;
            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow;
        }
        public ListNode reverse(ListNode head){
            
            ListNode curr=head;
            ListNode prev=null;
            while(curr!=null){
                ListNode temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
            return prev;
        }
        public boolean isPalindrome(ListNode head) {
            if(head==null){
                return true;
            }
            ListNode mid=middle(head);
            ListNode last=reverse(mid);
            ListNode curr=head;
            
            while(last!=null){
                if(last.val!=curr.val){
                    return false;
                }
                last=last.next;
                curr=curr.next;
            }
            return true;
            
        }
        public void insertLast(int val){
            ListNode node=new ListNode(val);
            if(head==null){
                head=node;
                return;
            }
            ListNode temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
        public void printList(){
            ListNode temp=head;
            while(temp!=null){
                System.out.print(temp.val+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
    public static void main(String[] args) {
        Third list=new Third();
        list.insertLast(0);
        list.insertLast(5);
        list.insertLast(7);
        list.printList();
        System.out.println(list.isPalindrome(list.head));
        
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(){};

ListNode(int val){
    this.val=val;
}
ListNode(int val,ListNode next){
    this.val=val;
    this.next=next;
}
}
