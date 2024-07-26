/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    int getLen(ListNode head){
        ListNode cur = head;
        int ans = 0;
        while(cur!=null){
            ans++;
            cur = cur.next;
        }
        return ans;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLen(headA);
        int lenB = getLen(headB);

        while(lenA>lenB){
            lenA--;
            headA = headA.next;
        }
        while(lenB>lenA){
            lenB--;
            headB = headB.next;
        }
        while(headA!=headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}
