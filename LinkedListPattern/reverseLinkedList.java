class Solution {
    public ListNode reverseList(ListNode head) {
        
    
        ListNode previous = null;
        ListNode nextOne = null;
        ListNode current = head;
        
        while (current != null) {
            nextOne = current.next;
            current.next = previous;
            previous = current;
            current = nextOne; 
        }
        head = previous;
        
        return head;
        
    }
}
