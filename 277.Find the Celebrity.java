/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); 
*/

/*
    思路是首先循环一遍，找到可能是名人的那个人，再判断这个人是否真的是名人。数学上很好证明，如果有名人存在，则一定会被筛选出来。思路大概如下：
    1.首先如果0位置即为名人，由于他不认识其他人，最后cur的结果一定为0;
    2.若名人不在0位置，当i=名人时，knows(cur,名人)一定为true，此时将cur赋值给名人的位置，之后cur不会再被修改.

    另外，判断时有个小trick，即cur一定不会认识 cur+1~n 这部分人，否则第一次初选的结果就不会是cur了。
*/

      public class Solution extends Relation {
        /**
         * @param n a party with n people
         * @return the celebrity's label or -1
         */
        public int findCelebrity(int n) {
            int cur = 0;
            for(int i=1;i<n;i++){
                if(knows(cur,i)){
                    cur=i;
                }
            }
            
            for(int i=0;i<cur;i++){
                if(!knows(i,cur) || knows(cur,i)){
                    return -1;
                }
            }
            for(int i=cur+1;i<n;i++){
                if(!knows(i,cur)){
                    return -1;
                }
            }
            return cur;
        }
    }