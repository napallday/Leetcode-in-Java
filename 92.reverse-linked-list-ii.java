/**
 * 先计算pre位置和翻转的次数，再进行翻转。
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        int count=0;
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode cur = dummy;
        ListNode pre = cur;
        for(int i=1;i<m;i++){
            pre=pre.next;
        }
        cur = pre.next;
        
        for(int i=0;i<n-m;i++){
            ListNode next = cur.next;
            cur.next = next.next;
            next.next = pre.next;
            pre.next=next;
        }
        
        return dummy.next;
    }
}