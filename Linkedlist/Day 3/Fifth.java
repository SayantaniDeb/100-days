package Linkedlist.Day3;

public class Fifth {
    class Solution {
        public void reorderList(ListNode head) {
            if(head==null || head.next==null){
                return;
            }
            ListNode mid=middle(head);
            ListNode hs=reverse(mid);
            ListNode hf=head;
    
            while(hf!=null && hs!=null){
                ListNode temp=hf.next;
                hf.next=hs;
                hf=temp;
                temp=hs.next;
                hs.next=hf;
                hs=temp;
            }
            if(hf!=null){
                hf.next=null;
            }
        }
        public ListNode middle(ListNode head){
            ListNode slow=head;
            ListNode fast=head;
    
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
    
            }
            return slow;
        }
        public ListNode reverse(ListNode head){
            if(head==null || head.next==null){
                return head;
            }
            ListNode newHead= reverse(head.next);
            ListNode headNext=head.next;
            headNext.next=head;
            head.next=null;
            return newHead;
        }
    }
    
}
