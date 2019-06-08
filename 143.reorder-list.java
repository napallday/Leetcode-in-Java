/**
 * 找中点-翻转-合并
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head==null||head.next==null){
            return;
        }
        ListNode fast=head, slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode last = slow.next;
        slow.next=null;
        ListNode cur1=head,cur2=reverse(last);
        
        while(cur2!=null){
            ListNode next = cur2.next;
            cur2.next=cur1.next;
            cur1.next=cur2;            
            cur1=cur2.next;
            cur2=next;
        }
    }
    
    public ListNode reverse(ListNode head){
        if (head ==null || head.next==null){
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        while(cur.next!=null){
            ListNode next=cur.next;
            cur.next=next.next;
            next.next=pre.next;
            pre.next=next;
        }
        return dummy.next;        
    }
}