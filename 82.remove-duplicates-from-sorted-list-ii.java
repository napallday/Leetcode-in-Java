/**
 * Recursively
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null || head.next==null){
            return head;
        }
        if (head.val==head.next.val){
            while(head.val==head.next.val){
                head=head.next;
                if (head.next==null){
                    return null;
                }
            }
            return deleteDuplicates(head.next);
        } else {
            head.next = deleteDuplicates(head.next);
            return head;
        }
    }
}
/**
 * 思路是找到先确定一个pre指针，对于cur指针
 （1）若cur的next是null，则令pre.next=cur，结束
 （2）若cur的next和cur内容一样，则不断移动cur一直到null或者下一个值。
 （3）若cur的next和cur内容不一样，则pre.next=cur;pre=pre.next;cur=cur.next;
 * }
 */
/*
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return head;
        }
        
        ListNode dummy = new ListNode(head.val-1);
        ListNode cur = head;
        ListNode pre = dummy;
        while (cur!=null){
            if (cur.next==null){
                pre.next=cur;
                break;
            }
            if (cur.val==cur.next.val){
                while(cur.val==cur.next.val){
                    cur = cur.next;
                    if (cur.next==null){
                        pre.next = null;
                        break;
                    }
                }
                cur=cur.next;
            } else {
                pre.next = cur;
                pre = pre.next;
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
*/