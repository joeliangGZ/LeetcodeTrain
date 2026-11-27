package basic_algorithms.linked_list;

public class reverseList_iter {

    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null) {

            ListNode temp = curr.next; // save next as temp 
            curr.next = prev; // point to prev 
            prev = curr; // prev move right 1 step 
            curr = temp; // curr move right 1 step 
        }

        return prev;
    }
    
}
