package linkedlist;

public class SimpleLinkedList {

	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void printList(){
		
		Node n = head;
		
		while(n != null){
			System.out.print(n.data+"    ");
			n = n.next;
		}
		
	}
	
	
	//add new node at the first position
	public void push(int newData){
		
		Node newNode = new Node(newData);
		
		newNode.next = head;
		head = newNode;
		
	}
	
	public void insertAfter(Node prevNode,int newData){
		
		if (prevNode == null){
	        System.out.println("The given previous node cannot be null");
	        return;
	    }
		
		Node newNode = new Node(newData);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}
	
	
	//add new node at the last position
	public void append(int newData){
		
		Node newNode = new Node(newData);
		
		if(head == null){
			head = newNode;
			return;
		}
		
		newNode.next = null;
		
		Node last = head;
		while(last.next != null){
			last = last.next;
		}
		
		last.next = newNode;
		return;
	}
	
	public void deleteNode(int key){
		
		Node temp = head;
		Node prev = null;
		
		if(temp != null && temp.data == key){
			head = temp.next;
			return;
		}
		
		while(temp != null && temp.data != key){
			prev = temp;
			temp = temp.next;
		}
		
		if(temp == null) return;
		
		prev.next = temp.next;
		
	}
	
	public void deleteNodeWithPosition(int position){
		
		if(head == null) return;
		
		Node temp = head;
		
		if(position == 0){
			head = temp.next;
		}
		
		for(int i=0;temp!=null && i<position-1;i++){
			temp = temp.next;
		}
		
		if(temp == null || temp.next == null) return ;
		
		Node next = temp.next.next;
		
		temp.next = next;
	}
	
	public static void main(String args[]){
		
		SimpleLinkedList list = new SimpleLinkedList();
		
		list.head = new Node(1);
		Node second = new Node(2);
        Node third = new Node(3);
 
        list.head.next = second;
        second.next = third;
        
        list.printList();
        
        list.append(6);
        list.push(7);
        list.push(10);
        list.append(4);
        list.insertAfter(list.head.next, 8);
        
        list.deleteNode(4);
        list.deleteNodeWithPosition(3);
 
        System.out.println("\nCreated Linked list is: ");
        list.printList();
		
	}
	
}
