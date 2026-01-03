package DSA_Course.LinkedList;

public class a5_PalindromeLL {
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean isPalindrome(ListNode head) {
        //Step 1 -> Find the middle
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;

        }
        //Step 2 -> Reverse the second part of the LL
        ListNode curr = slow;
        while (curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        //Step 3 -> check for palindrome
        ListNode end = prev;
        ListNode start = head;
        while (start != slow){
            if(start.val != end.val){
                return false;
            }
            end = end.next;
            start = start.next;
        }
        return true;
    }
}
