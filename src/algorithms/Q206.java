package algorithms;

public class Q206 {

	public static void main(String[] args) {

	}
	
	 public static ListNode reverseList(ListNode head) {
	        if(head==null){
	        	return null;
	        }else if(head.next==null){
	        	return head;
	        }
	        
	        if(head.next.next==null){
	        	ListNode res = head.next;
	        	res.next = head;
	        	head.next=null;
	        	return res;
	        }else{
	        	ListNode res=reverseList(head.next);
	        	head.next.next = head;
	        	head.next=null;
	        	return res;
	        }
	        
	  }

}
