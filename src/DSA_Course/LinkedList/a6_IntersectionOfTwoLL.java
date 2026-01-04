package DSA_Course.LinkedList;

import java.util.HashMap;

public class a6_IntersectionOfTwoLL {
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //Approach 1 -> Using Set or HashMap
        if (headA == null || headB == null) {
            return null;
        }
        HashMap<ListNode, Integer> set = new HashMap<>();
        ListNode node = headB;
        while (node != null) {
            set.put(node, 1);
            node = node.next;
        }
        ListNode node2 = headA;
        while (node2 != null) {
            if (set.containsKey(node2)) {
                return node2;
            }
            node2 = node2.next;
        }
        return null;
    }

    //Approach 2
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        //Calculate the length of both the LinkedList
        int len1 = 0;
        ListNode node1 = headA;
        while (node1 != null) {
            len1++;
            node1 = node1.next;
        }

        int len2 = 0;
        ListNode node2 = headB;
        while (node2 != null) {
            len2++;
            node2 = node2.next;
        }
        //Length with the greater length moving its pointer ahead
        int point = len1 - len2;
        ListNode temp1 = headA;
        ListNode temp2 = headA;
        int move = 0;
        if (point > 0) {
            while (move != point && temp1 != null) {
                temp1 = temp1.next;
                move++;
            }
        } else {
            point = point * (-1);
            while (move != point && temp2 != null) {
                temp2 = temp2.next;
                move++;
            }
        }
        //checking if intersecting or not
        while (temp1 != null && temp2 != null) {
            if (temp2 == temp1) {
                return temp2;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
    //Approach 3
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while (temp1 != temp2){

            if(temp1 == null){
                temp1 = headB;
            }else{
                temp1=temp1.next;
            }
            if(temp2 == null){
                temp2 = headA;
            }else {
                temp2 = temp2.next;
            }
        }
        return temp1;
    }
}
