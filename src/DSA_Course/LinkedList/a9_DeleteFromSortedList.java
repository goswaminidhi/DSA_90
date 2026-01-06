package DSA_Course.LinkedList;


public class a9_DeleteFromSortedList {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp1 = head;

        while (temp1 != null && temp1.next != null){
            if(temp1.val == temp1.next.val){
                temp1.next = temp1.next.next;
            }else{
                temp1 = temp1.next;
            }
        }
        return head;
    }
}
