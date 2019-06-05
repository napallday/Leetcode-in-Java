/**
 * 新建两个链表头，分别用来储存奇数项和偶数项。
 * 注意易错点，最后合并的时候要让偶数项最后一个项的next指向null，否则形成了环。
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode oddDummy = new ListNode(0);
        ListNode evenDummy = new ListNode(0);
        ListNode oddCur=oddDummy, evenCur = evenDummy;
        
        while (head!=null){
            oddCur.next=head;
            oddCur = oddCur.next;
            head=head.next;
            
            if (head==null){
                break;
            }
            evenCur.next = head;
            evenCur = evenCur.next;            
            head=head.next;
        }
        oddCur.next = evenDummy.next;
        evenCur.next = null;
        return oddDummy.next;
    }
}