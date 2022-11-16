

public class Sixth {
    public class Solution {

        public ListNode detectCycle(ListNode head) {
            if(head==null){
                return null;
            }
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){
                    while(head!=slow){
                        head=head.next;
                        slow=slow.next;
                    }
                   return head; 
                }
    
            }
          return null;  
    }
    }
}
