package com.wyj.leecode.LinkedList;

import java.util.List;

/**
 * @author wangyujue
 */
public class DeleteDuplicates {
    public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    '}';
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;
        head.next =a;
        ListNode listNode = solution.deleteDuplicates(head);
        System.out.println(listNode);
    }
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    static class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode e,j;
            if (head == null || head.next == null ) {
                return head;
            }
            ListNode newHead = new ListNode(0);
            newHead.next = head;

            head = newHead;

            while (head.next!= null && head.next.next != null) {
                if (head.next.val == head.next.next.val) {
                    int val = head.next.val;
                    while (head.next != null && head.next.val == val) {
                        head.next = head.next.next;
                    }
                } else {
                    head = head.next;
                }
            }
            return newHead.next;
        }
    }
}
