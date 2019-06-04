/*
* Follow up 不用链表反转，用stack
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        
        while(l1!=null){
            s1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            s2.push(l2.val);
            l2=l2.next;
        }
        
        int carry = 0;
        ListNode res = new ListNode(0);
        ListNode pre = res;
        
        while(true){
            if (s1.isEmpty() && s2.isEmpty()){
                break;
            }
            
            int val1 = s1.isEmpty()?0:s1.pop();
            int val2 = s2.isEmpty()?0:s2.pop();
            
            int sum = val1+val2+carry;
            carry = sum/10;
            ListNode cur = new ListNode(sum%10);
            cur.next = pre.next;
            pre.next = cur;
            
        }
        if (carry == 1){
            ListNode cur = new ListNode(1);
            cur.next = pre.next;
            pre.next = cur;
        }
        return res.next;
    }
}
/**
 * 链表反转后 用 Problem 2 的方法得到结果
 * }
 */
/*
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = reverse(l1);
        ListNode l4 = reverse(l2);
        
        ListNode res = new ListNode(0);
        ListNode pre = res;
        int carry=0;
        while(true){
            if(l3==null&&l4==null){
                break;
            }
            
            int val1=l3==null?0:l3.val;
            int val2=l4==null?0:l4.val;
            
            int sum = val1 + val2 + carry;
            pre.next = new ListNode(sum%10);
            carry = sum/10;
            pre=pre.next;
            
            if(l3!=null){
                l3=l3.next;
            }
            if(l4!=null){
                l4=l4.next;
            }
        } 
        if(carry==1){
            pre.next=new ListNode(1);
        }
        return reverse(res.next);
    }
    public ListNode reverse(ListNode l){
        ListNode res = new ListNode(0);
        ListNode pre = res;
        
        while(l!=null){
            ListNode next = l.next;
            l.next = pre.next;
            pre.next=l;
            l=next;
        }
        
        return res.next;
    }
}
*/