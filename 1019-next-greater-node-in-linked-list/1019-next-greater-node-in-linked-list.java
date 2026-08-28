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
    public int sizeLL(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    public ListNode reverseLL(ListNode head){
        ListNode pre = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }
    public int[] nextLargerNodes(ListNode head) {
        int size = sizeLL(head);
        int[] arr = new int[size];
        ListNode newHead = reverseLL(head);
        Stack<Integer> st = new Stack<>();
        st.push(newHead.val);
        ListNode curr = newHead.next;
        int ptr = size - 2;
        while(ptr >=0){
            int ele = curr.val;
            curr = curr.next;
            //check and pop
            while(st.size()>0 && st.peek()<=ele){
                st.pop();
            }
            // put in arrays
            if(st.size() == 0){
                arr[ptr] = 0;
            }else{
                arr[ptr] = st.peek();
            }
            //push element in stak
            st.push(ele);
            ptr--;
        }
        return arr;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna