
/**
 * 不能用pre.next=node.next删除node，只能依次向前移动每个node的val值。
 */
/**
 * 看到了一个更简单的方法，把node后面的一个点的值向前移动到node上，再删去node之后的那个点。
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
/*
class Solution {
    public void deleteNode(ListNode node) {
        ListNode pre = node;
        while(node.next!=null){
            node.val=node.next.val;
            pre = node;
            node=node.next;
        }
        pre.next=null;
    }
}
*/