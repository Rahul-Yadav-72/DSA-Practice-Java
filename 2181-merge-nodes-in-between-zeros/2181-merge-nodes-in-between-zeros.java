/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        ListNode curr = head.next;
        int sum =0;
        while(curr != null){
            if(curr.val != 0){
                sum += curr.val;
            }else{
                ListNode temp = new ListNode(sum);
                dummy.next = temp;
                dummy = dummy.next;
                sum = 0;
            }
            curr = curr.next;
        }
        return ans.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna