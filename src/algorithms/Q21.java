package algorithms;

public class Q21 {
	

	public static void main(String[] args) {
		
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		ListNode node7 = new ListNode(7);
		ListNode node8 = new ListNode(8);
		ListNode node9 = new ListNode(9);
		ListNode node10 = new ListNode(10);
		
		node1.next=node3;
		node3.next=node5;
		node5.next=node7;
		node7.next=node9;
		
		node2.next=node4;
		node4.next=node6;
		node6.next=node8;
		node8.next=node10;
		
		ListNode res =  mergeTwoLists(node1, node2);
		
		
		while(res!=null){
			System.out.print(res.val+" ");
			res = res.next;
		}
		

	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		//ListNode out = null;
		
		if(l1==null&&l2==null){
			return null;
		}else if(l1==null){
			return l2;
		}else if(l2==null){
			
			return l1;
		}else if(l1.val<l2.val){
			ListNode out = new ListNode(l1.val);

			out.next=mergeTwoLists(l1.next, l2);
			return out;
		}else{
			ListNode out = new ListNode(l2.val);

			out.next=mergeTwoLists(l1, l2.next);
			return out;
		}	
        
    }
	
	
	/**
	 * Definition for singly-linked list.
	 * */
	  public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }

}



 
