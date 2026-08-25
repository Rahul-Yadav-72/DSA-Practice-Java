/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int sizeLL(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null && headB == null){
            return null;
        }
        int diff = sizeLL(headA) - sizeLL(headB);
        if(diff > 0){
            while(diff>0){
                headA = headA.next;
                diff--;
            }
        }else{
            while(diff<0){
                headB = headB.next;
                diff++;
            }
        }
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna