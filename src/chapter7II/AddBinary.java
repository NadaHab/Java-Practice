/*                                Add Binary (LeetCode 67)
Presented on 28 April, 2021 by Limin An
Link: https://leetcode.com/problems/add-binary/
Problem:
Given two binary strings a and b, return their sum as a binary string.
--------------------------------------------------------------------------------------------------------
Example 1:

Input: a = "11", b = "1"
Output: "100"

Example 2:

Input: a = "1010", b = "1011"
Output: "10101"

Constraints:
1 <= a.length, b.length <= 10000
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
--------------------------------------------------------------------------------------------------------


Solution:
Calculate the numbers bit by bit starting from the lowest one and consider the carry.
--------------------------------------------------------------------------------------------------------
*/

package chapter7II;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder answer = new StringBuilder();
        int carry = 0;
        for(int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--){
            //Assign carry to sum before calculate the next bit
            int sum = carry;
            //sum is the sum of a[i] + b[j].
            sum += i >= 0 ? a.charAt(i) - '0' : 0;  // using a.charAt(i) - '0' to cast the character to digit
            sum += j >= 0 ? b.charAt(j) - '0' : 0;  // using b.charAt(i) - '0' to cast the character to digit
            //result of sum mod 2 is the current bit
            answer.append(sum % 2);
            carry = sum / 2;
        }
        //Finally, if we have a carry, append carry to answer or append nothing
        answer.append(carry == 1 ? carry : "");
        //We need to reverse the answer which is the final result
        return answer.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        String a = "11", b = "1";
        System.out.println(addBinary.addBinary(a, b));
    }
}
