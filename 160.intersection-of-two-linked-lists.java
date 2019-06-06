/**
 * 先求得两个链表的长度。再将长的一个链表前面截去，最后每位比较。
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null || headB == null){
            return null;
        }
        int countA=0, countB=0;
        ListNode cur = headA;
        while (cur!=null){
            countA++;
            cur=cur.next;
        }
        cur = headB;
        while (cur!=null){
            countB++;
            cur=cur.next;
        }
        if(countA>countB){
            int diff = countA-countB;
            for(int i=1;i<=diff;i++){
                headA=headA.next;
            }
        } else {
            int diff = countB-countA;
            for (int i=1;i<=diff;i++){
                headB = headB.next;
            }
        }
        
        while (headA!=null){
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        
        return null;
        
    }
}