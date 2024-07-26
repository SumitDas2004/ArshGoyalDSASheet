class Solution {
    public boolean isPalindrome(ListNode head) {
        StringBuilder str = new StringBuilder();
        while(head!=null){
            str.append(head.val);
            head = head.next;
        }
        return str.toString().equals(str.reverse().toString());
    }
}
