package DSA_Course.LinkedList;

import java.util.HashMap;

public class a4_CycleInLL {
    private class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    //Method 1 -> Using HashMap
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        HashMap<ListNode,Integer> map = new HashMap();
        ListNode node = head;
        while(node.next != null){
            if(map.containsKey(node)){
                return true;
            }else {
                map.put(node, 1);
            }
            node = node.next;
        }
        return false;
    }
    //Method Two -> Using fast and slow pointer
    public boolean hasCycle1(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(slow != null){
            if(fast == slow){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
