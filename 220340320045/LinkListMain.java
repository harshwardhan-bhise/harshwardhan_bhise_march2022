//Q2:Reverse a Linked List


public class LinkListMain{
	public static LinkedListNode reverse(LinkedListNode head){
	LinkedListNode next=null;
	LinkedListNode curr= head;
	LinkedListNode prev=null;
	
	while(curr !=null){
		next = current.next;
		curr.next =prev;
		prev=curr;
		curr=next;
	}
	
	LinkedListNode l=prev;
	return l;
}

	public static void main(String []args){
		LinkedList l1=new LinkedList();
		l1.push(1);
		l1.push(2);
		l1.push(3);
		l1.push(4);
		l1.push(5);
		l1.LinkedListNode reverse(head);
	}
}