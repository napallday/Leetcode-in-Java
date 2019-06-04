/**
 * Recursively
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head==null || head.next==null){
            return head;
        }
        
        ListNode next = head.next;
        ListNode newHead = reverseList(next);
        next.next = head;
        head.next = null;
        return newHead;
    }
}
/**
 * Iteratively
 * }
 */
/*
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode res = new ListNode(0);
        ListNode pre = res;
        ListNode cur = head;
        while(head!=null){
            ListNode next = head.next;
            head.next = pre.next;
            pre.next = head;
            head = next;
        }
        
        return res.next;
    }
}
*/