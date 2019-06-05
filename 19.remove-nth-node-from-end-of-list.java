/**
 * 设置left，right指针，先让right移动n个单位。再让left和right同时移动。
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode left = dummy, right = dummy;
        for(int i=0;i<n;i++){
            right=right.next;
        }
        while(right.next!=null){
            left=left.next;
            right=right.next;
        }
        left.next = left.next.next;
        return dummy.next;
    }
}