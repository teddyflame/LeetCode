package algorithms;

public class Q83 {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		
		head.next = node1;
		node1.next =node2;
		node2.next = node3;
		
		ListNode res = deleteDuplicates(head);
		
		System.out.println("");
		
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }

        ListNode node = head;
        while(node.next!=null){
            if(node.next.val != node.val){
                node = node.next;
            }else{
                ListNode searchNode = node;
                boolean flag = false;
                while(searchNode.next!=null){
                    if(searchNode.next.val!=searchNode.val){
                        node.next = searchNode.next;
                        flag = true;
                        break;
                    }else{
                        searchNode = searchNode.next;
                    }
                }
                
                if(flag==false){
                    node.next=null;
                }else{
                    node = node.next;
                }
            }
        }
        
        return head;
    }

}
