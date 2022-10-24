import java.util.*;

public class MergeTwoSortedLists {

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1, // root elem, val = 1, next = 2
                new ListNode(2, // second elem, val = 2, next = 4
                        new ListNode(4) // third(last in this case) elem, val4, next = null
                ));

        ListNode list2 = new ListNode(1, // root elem, val = 1, next = 3
                new ListNode(3, // second elem, val = 3, next = 4
                        new ListNode(4) // third(last in this case) elem, val 4, next = null
                ));

        ListNode listNode = mergeTwoLists(list1, list2);

        while(listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null) {
            return list2;
        }

        if(list2 == null) {
            return list1;
        }

        ListNode root;
        ListNode current; // temp

        if(list1.val <= list2.val) {
            root = current = new ListNode(list1.val);
            list1 = list1.next;
        } else {
            root = current = new ListNode(list2.val);
            list2 = list2.next;
        }

        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                current.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                current.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            current = current.next;
        }

        while(list1 != null) {
            current.next = new ListNode(list1.val);
            list1 = list1.next;
            current = current.next;
        }

        while(list2 != null) {
            current.next = new ListNode(list2.val);
            list2 = list2.next;
            current = current.next;
        }

        return root;
    }

    // node
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
