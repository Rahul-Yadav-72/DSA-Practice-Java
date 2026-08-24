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
    public ListNode reverseLL(ListNode head){
        ListNode curr = head;
        ListNode pre = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode newHead = reverseLL(head);
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        int curry = 0;

        while(newHead != null){
            int sum = newHead.val + newHead.val + curry;
            int d = sum%10;
            curry = sum/10;
            ListNode temp = new ListNode(d);
            dummy.next = temp;
            dummy = dummy.next;

            newHead = newHead.next;
        }
        if(curry>0){
            ListNode temp = new ListNode(curry);
            dummy.next = temp;
            dummy = dummy.next;
        }

        return reverseLL(ans.next);

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna