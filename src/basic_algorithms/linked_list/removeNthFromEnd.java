package basic_algorithms.linked_list;

public class removeNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        int length = getLength(head);
        
        ListNode dummy = new ListNode(0, head);
        ListNode curr = dummy;

        for(int i = 0; i < length - n; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return dummy.next;
        
    }

    private int getLength (ListNode head) {
        int length = 0;
        ListNode curr = head;
        while(curr != null) {
            length++;
            curr = curr.next;
        }
        return length;
    }
    
}
