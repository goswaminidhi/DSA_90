package DSA_Course.LinkedList;

import java.util.List;

public class a8_RemoveNthNodeFromLast {
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    //Approach 1
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newNode = new ListNode(0);
        newNode.next = head;
        int len = 0;
        ListNode node = head;
        while (node != null){
            node = node.next;
            len++;
        }
        int prevLen = len-n;
        ListNode prev = newNode;
        for (int i = 0; i < prevLen; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return newNode.next;
    }
    //Approach 2
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode newNode = new ListNode(0);
        newNode.next = head;
        ListNode fast = head;
        ListNode slow = newNode;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return newNode.next;
    }
}
