/**
 * 快慢指针法
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast=head, slow=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        if (fast.next==null){
            return slow;
        } else {
            return slow.next;
        }
    }
}