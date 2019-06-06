/**
 * 
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null && l2==null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        while (l1!=null || l2!=null){
            if (l1==null){
                pre.next = l2;
                break;
            }
            if (l2==null){
                pre.next=l1;
                break;
            }
            if (l1.val<=l2.val){
                pre.next=l1;
                l1=l1.next;
            } else {
                pre.next=l2;
                l2=l2.next;
            }
            pre=pre.next;
        }
        return dummy.next;
    }
}