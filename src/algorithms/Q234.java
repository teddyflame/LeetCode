package algorithms;

public class Q234 {

	public static void main(String[] args) {

		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(2);
		ListNode node5 = new ListNode(1);
		
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		
		System.out.println(isPalindrome(node1));
	}
	
	public static boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)return true;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode fast = dummy;
        ListNode slow = dummy;
        
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        dummy = slow;   //joinPoint
        slow = slow.next;
        ListNode dummyNext = dummy.next;
        
        while(slow.next!=null){
            dummy.next = slow.next;
            slow.next = dummy.next.next;
            dummy.next.next = dummyNext;
            dummyNext = dummy.next;
        }
        
        fast = head;
        slow = dummy.next;
        
        while(slow!=null){
            if(fast.val!=slow.val)return false;
            fast = fast.next;
            slow = slow.next;
        }
        
        return true;
    }

}
