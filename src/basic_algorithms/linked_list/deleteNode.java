package basic_algorithms.linked_list;

public class deleteNode {

    public void deleteNode(ListNode node) {
        
        // 1 2c 3 4 del 2 -> 1 3 3 4 -> 1 3 4

        node.val = node.next.val;
        node.next = node.next.next;
        
    }
    
}
