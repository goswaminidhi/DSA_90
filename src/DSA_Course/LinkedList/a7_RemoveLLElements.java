package DSA_Course.LinkedList;

public class a7_RemoveLLElements {
    private static class ListNode {
        int val;
       ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
       ListNode newNode = new ListNode(0);
       newNode.next = head;
       ListNode node = head;
       ListNode prev = newNode;
        while (node != null) {
            if (node.val == val && node.next == null) {
                prev.next = node.next;
                node = prev;
            } else if (node.val == val) {
                prev.next = prev.next.next;
                node = prev.next;
            } else{
                node = node.next;
                prev = prev.next;
            }

        }

        prev.next = prev.next.next;
        return newNode.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(3);
        System.out.println(removeElements(head,3));
    }
}
