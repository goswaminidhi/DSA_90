package DSA_90_Patternwise.LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class ReverseList {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode currNode = head;
        ListNode leftPrev = dummy;
        for (int i = 0; i < left - 1; i++) {
            leftPrev = leftPrev.next;
            currNode = currNode.next;
        }

        ListNode pre = null;
        ListNode subListNode = currNode;
        for (int i = 0; i < right - left + 1; i++) {
            ListNode nextNode = currNode.next;
            currNode.next = pre;
            pre = currNode;
            currNode = nextNode;
        }
        leftPrev.next = pre;
        subListNode.next = currNode;

        return  dummy.next;
    }
}
