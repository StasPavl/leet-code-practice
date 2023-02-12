public class ReverseInteger {
    public static void main(String[] args) {
        int number = 1534236469;
        System.out.println(reverse(number));
    }
    public static int reverse(int x){
        long rev = 0;

        while( x !=0){
            rev += x % 10;
            rev = rev * 10;
            x = x / 10;
        }
        rev = rev / 10;

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*rev);
        }
        return (int)rev;

    }
}
/*
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range , then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
Examples:
Input: x = 123
Output: 321

Input: x = -123
Output: -321

Input: x = 120
Output: 21
 */
