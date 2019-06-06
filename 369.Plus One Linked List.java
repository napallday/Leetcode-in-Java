/**
 * 先翻转 加1 再翻转
 */

public class Solution {
    /**
     * @param head: the first Node
     * @return: the answer after plus one
     */
    public ListNode plusOne(ListNode head) {
        // Write your code here
        ListNode newHead = reverse(head);
        ListNode cur = newHead;
        ListNode pre = cur;
        int carry = 1;
        while(cur!=null){
            int val = cur.val+carry;
            if (val<10){
                cur.val=val;
                carry=0;
                break;
            }
            cur.val=0;
            carry=1;
            pre = cur;
            cur=cur.next;
        }
        if (carry == 1){
            pre.next = new ListNode(1);
        }
        return reverse(newHead);
        
    }
    
    public ListNode reverse(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode pre = dummy;
        ListNode cur = head;
        while(cur.next!=null){
            ListNode next = cur.next;
            cur.next = next.next;
            next.next=pre.next;
            pre.next=next;
        }
        return dummy.next;
        
    }
}