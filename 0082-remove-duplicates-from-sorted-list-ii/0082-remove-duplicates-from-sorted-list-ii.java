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
    public ListNode deleteDuplicates(ListNode head) {
    ListNode dummyNode = new ListNode(0);
    dummyNode.next = head;

    ListNode curr = head;
    ListNode prev = dummyNode;

    while(curr != null){
        if(curr.next != null && curr.val == curr.next.val){
            while(curr.next != null && curr.val == curr.next.val){
                curr = curr.next;
            }
            prev.next = curr.next;
        }else{
            prev = prev.next;
        }
        curr = curr.next;
    }
    return dummyNode.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna