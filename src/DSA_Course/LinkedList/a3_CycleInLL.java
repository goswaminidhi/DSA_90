package DSA_Course.LinkedList;

import java.util.HashMap;

public class a3_CycleInLL {
    private class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
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
    public static void main(String[] args) {

    }
}
