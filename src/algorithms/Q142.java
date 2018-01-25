package algorithms;

import org.w3c.dom.NodeList;

public class Q142 {

	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		ListNode node = new ListNode(2);
		
		head.next = node;
		node.next = head;
		
		ListNode res = detectCycle(head);
		
		System.out.println("");

	}
	public static ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null && slow!=null){
//            ListNode tmp1 = fast.next;
//            ListNode tmp2 = slow;
            
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast==slow){
                if(fast.next==slow.next){
                    return slow.next;
                }else{
                    return slow;
                }
            }
        }
        
        return null;
    }

}
