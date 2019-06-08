/**
 * 先找到链表中点，再将后半部分倒置，逐一进行比较。
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head==null||head.next==null){
            return true;
        }
        
        int num = 0;
        ListNode cur = head;
        while (cur!=null){
            cur=cur.next;
            num++;
        }
        ListNode cur1=head,cur2=head;
        int numShift = (num+1)/2;
        for(int i=0;i<numShift;i++){
            cur2=cur2.next;
        }
        cur2 = reverse(cur2);
        while(cur2!=null){
            if (cur1.val!=cur2.val){
                return false;
            }
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return true;
        
    }
    public ListNode reverse(ListNode head){
        if (head ==null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur.next!=null){
            ListNode next = cur.next;
            cur.next=next.next;
            next.next=pre.next;
            pre.next = next;
        }
        return dummy.next;
    }
}