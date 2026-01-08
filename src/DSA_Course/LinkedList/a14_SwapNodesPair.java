package DSA_Course.LinkedList;

public class a14_SwapNodesPair {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    //Approach 1 -> Using extra memory
    public ListNode swapPairs1(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newNode = new ListNode(-1);
        ListNode newHead = newNode;
        ListNode curr = head;
        ListNode currNext = head.next;
        while ( curr != null && currNext != null ){
            ListNode ans = new ListNode(currNext.val);
            ListNode ans1 = new ListNode(curr.val);
            newNode.next = ans;
            ans.next = ans1;
            newNode = ans1;
            curr = curr.next.next;
            if(currNext.next == null || curr.next == null){
                newNode.next = curr;
                break;
            }
            currNext = currNext.next.next;
        }
        return newHead.next;
    }
    //Approach 2 Changing the same List
    public ListNode swapPairs2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = new ListNode(-1);
        ListNode prevHead = prev;
        ListNode curr = head;
        ListNode currNext = head.next;
        while (curr != null && currNext != null ) {
            prev.next = currNext;
            curr.next = currNext.next;
            currNext.next = curr;
            prev = curr;
            curr = prev.next;
            if (curr != null) {
                currNext = curr.next;
            }

        }
        return prevHead.next;
    }
    //Approach 3 -> Using Recursion
    public ListNode swapPairs3(ListNode head) {
        ListNode left = head;
        ListNode right = left.next;
        while (right == null && right.next == null){
            return right;
        }
        left.next = swapPairs3(right.next);
        right.next = left;
        return right;

    }
}
