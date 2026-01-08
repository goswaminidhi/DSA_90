package DSA_Course.LinkedList;

public class a13_RotateList {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    //Approach 1
    public ListNode rotateRight1(ListNode head, int k) {
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        if (k > len) {
            k = k % len;
        }
        for (int i = 0; i < k; i++) {
            ListNode t = head;
            while (t.next.next != null) {
                t = t.next;
            }
            ListNode node = t.next;
            t.next = null;
            node.next = head;
            head = node;
        }
        return head;
    }

    //Approach 2
    public ListNode rotateRight2(ListNode head, int k) {

        if(head == null || head.next == null){
            return head;
        }
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        if (k >= len) {
            k = k % len;
        }
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = head;
        ListNode newHead = slow.next;
        slow.next = null;
        return newHead;
    }

}
