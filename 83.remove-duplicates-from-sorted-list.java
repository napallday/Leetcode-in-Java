/**
 * 
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null){
            return head;
        }
        ListNode dummy = new ListNode(head.val-1);
        dummy.next = head;
        ListNode cur = dummy;
        while(cur.next!=null){
            if(cur.val<cur.next.val){
                cur=cur.next;
            } else {
                cur.next = cur.next.next;
            }
        }
        return dummy.next;
    }
}