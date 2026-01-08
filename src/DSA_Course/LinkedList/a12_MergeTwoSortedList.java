package DSA_Course.LinkedList;

public class a12_MergeTwoSortedList {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode newList = new ListNode(-1);
//        ListNode newListHead = newList;
//        ListNode temp1 = list1;
//        ListNode temp2 = list2;
//        while (temp1 != null && temp2 != null){
//            if(temp1.val > temp2.val){
//                ListNode ans = new ListNode(temp2.val);
//                newList.next = ans;
//                newList = newList.next;
//                temp2 = temp2.next;
//            }
//            else if(temp1.val == temp2.val){
//                ListNode ans = new ListNode(temp2.val);
//                newList.next = ans;
//                newList = newList.next;
//                temp2 = temp2.next;
//            }else{
//                ListNode ans = new ListNode(temp1.val);
//                newList.next = ans;
//                newList = newList.next;
//                temp1 = temp1.next;
//            }
//        }
//        while (temp1 != null){
//            ListNode ans = new ListNode(temp1.val);
//            newList.next = ans;
//            newList = newList.next;
//            temp1 = temp1.next;
//        }
//        while (temp2 != null){
//            ListNode ans = new ListNode(temp2.val);
//            newList.next = ans;
//            newList = newList.next;
//            temp2 = temp2.next;
//        }
//        return newListHead.next;
        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        while (list1 != null && list2 != null){
            if(list1.val <= list2.val){
                curr.next = list1;
                list1 = list1.next;
            }else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if(list1 != null){
            curr.next = list1;
        }if(list2 != null){
            curr.next = list2;
        }
        return temp.next;
    }

}
