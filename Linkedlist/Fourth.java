package Linkedlist;
public class Fourth {
    //Linkedlist Cycle
    public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode fast=head;
            ListNode slow=head;
    
            while(fast!=null&&fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){
                    return true;
                }
            }
            return false;
        }
    }
    //Get intersection node of linkedlist
    public class Solution2 {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode p1=headA;
            ListNode p2=headB;
            while(p1!=p2){
                p1=p1==null?headB:p1.next;
                p2=p2==null?headA:p2.next;
        }
        return p1;
        
    }
    }
    //Remove items from LL
    class Solution3 {
        public ListNode removeElements(ListNode head, int val) {
            ListNode temp=head;
            if(head==null){
                return null;
            }
            ListNode dummy=new ListNode();
            ListNode curr=dummy;
            dummy.next=head;
            while(curr.next!=null){
                if(curr.next.val==val){
                    curr.next=curr.next.next;
                }
                else{
                    curr=curr.next;
                }
            }
            return dummy.next;
           
            
        }
    }

}
