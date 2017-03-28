package algorithms;

public class Q445 {

	public static void main(String[] args) {

		ListNode l1 = new ListNode(1);
		ListNode l12 = new ListNode(2);
		ListNode l13 = new ListNode(3);
		
		l1.next = l12;
		l12.next = l13;
		
		
		ListNode l2 = new ListNode(2);
		ListNode l22 = new ListNode(2);
		
		l2.next = l22;
		
		ListNode outListNode = addTwoNumbers(l1, l2);
		
		System.out.println("");
	}
	
	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        int num1=0,num2=0;
	        
	        while(l1!=null){
	            num1=num1*10+l1.val;
	            l1=l1.next;
	        }
	        
	        while(l2!=null){
	            num2=num2*10+l2.val;
	            l2=l2.next;
	        }
	        
	        int sum = num1+num2;
	        
	        ListNode res = null;
	        ListNode node = new ListNode(sum%10);
	        ListNode before = null;
	        ListNode after = node;
	        while(true){
	            sum/=10;
	            if(sum==0){
	                return after;
	            }
	            ListNode now = new ListNode(sum%10);
	            now.next = after;
	            
	            after = now;
	        }
	    }

}
