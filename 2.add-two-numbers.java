/**
 * 注意判断最后carry是否为1
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode pre = res;
        ListNode cur;
        int carry=0;
        while(true){
            if(l1==null && l2==null){
                break;
            }
            
            int val1 = l1==null?0:l1.val;
            int val2 = l2==null?0:l2.val;
            
            int sum = val1+val2+carry;
            cur = new ListNode(sum%10);
            carry = sum/10;
            
            pre.next=cur;
            pre=pre.next;
            
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        
        if(carry==1){
            pre.next=new ListNode(1);
        }
        return res.next;
    }   
}