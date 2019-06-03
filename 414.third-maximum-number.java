/**
 * 用first，second，third分别记录最大的三个数
 */
class Solution {
    public int thirdMax(int[] nums) {
        long first = (long)Integer.MIN_VALUE - 1;
        long second = (long)Integer.MIN_VALUE - 1;
        long third = (long)Integer.MIN_VALUE - 1;
        
        for (int num:nums){
            if (num>first){
                third = second;
                second = first;
                first = num;
            } else if (num==first){
                continue;
            } else if (num>second){
                third = second;
                second = num;
            } else if (num==second){
                continue;
            } else if (num > third){
                third = num;
            }
        }
        
        if (third == (long)Integer.MIN_VALUE-1){
            return (int)first;
        } else {
            return (int)third;
        }
    }
}