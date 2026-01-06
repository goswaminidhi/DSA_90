package DSA_Course.LinkedList;

public class a11_AddTwoNumbers {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean flag = false;
        ListNode sentinel1 = new ListNode(-1);
        sentinel1.next = l1;
        ListNode sentinel2 = new ListNode(-1);
        sentinel2.next = l2;
        ListNode temp1 = sentinel1;
        ListNode temp2 = sentinel2;
        int carry = 0;
        while (temp1.next != null && temp2.next != null) {
            int sum = temp1.next.val+temp2.next.val+carry;
            carry = sum /10;
            temp1.next.val = sum%10;
            temp2.next.val = sum%10;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while (temp1.next != null){
            flag = true;
            int sum = temp1.next.val+carry;
            carry = sum /10;
            temp1.next.val = sum%10;
            temp1 = temp1.next;
        }
        while (temp2.next != null){

            int sum = temp2.next.val+carry;
            carry = sum /10;
            temp2.next.val = sum%10;
            temp2 = temp2.next;
        }
        if(carry != 0){
            ListNode node = new ListNode(carry);
            if(flag){
                temp1.next = node;
            }else {
                temp2.next = node;
            }
        }

        if(flag){
            return l1;
        }else {
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(2);
        node.next = new ListNode(4);
        node.next.next = new ListNode(3);

        ListNode node1 = new ListNode(5);
        node1.next = new ListNode(6);
        node1.next.next = new ListNode(4);

        addTwoNumbers(node, node1);

    }
}
