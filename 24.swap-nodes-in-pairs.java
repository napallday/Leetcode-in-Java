/*
 * 把图画出来就很好分析了
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while (pre.next!=null && pre.next.next!=null){
            ListNode cur = pre.next;
            pre.next = cur.next;
            cur.next = pre.next.next;
            pre.next.next=cur;
            pre = cur;
        }
        return dummy.next;
    }
}

