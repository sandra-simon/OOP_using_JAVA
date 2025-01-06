/*Write a java program for the following:
a)create a doubly linked list of elements
b)delete a given element from the above list
c)display the contents of the list after deletion*/

import java.util.Scanner;

class DoublyLinkedList
{
	Node head = null;

	class Node
	{
		int data;
		Node next;
		Node prev;

		public Node(int data)
		{
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	public void insert(int data)
	{
		Node temp = new Node(data);
		if(head == null)
		{
			head = temp;
		}
		else
		{
			Node ptr = head;
			while(ptr.next != null)
			{
				ptr = ptr.next;
			}
			ptr.next = temp;
			temp.prev = ptr;
		}
		System.out.print("Data enterd is: "+data);
	}
	public void delete(int data)
	{
		if(head == null)
		{
			System.out.print("List is empty");
			return;
		}
		Node ptr=head;
		while (ptr != null)
		{
			if (ptr.data == data)
			{
				if (ptr.prev != null)
				{
					ptr.prev.next = ptr.next;
				}
				else
				{
					head = ptr.next;
				}
                		if (ptr.next != null)
				{
					ptr.next.prev = ptr.prev;
                		}
                		System.out.println("Data deleted: " + data);
                		return;
            		}
            		ptr = ptr.next;
        	}
        	System.out.println("Data not found in the list");
	}

	public void display()
	{
		Node temp = head;
		if(head == null)
		{
			System.out.print("List is empty");
		}
		else
		{
			while(temp != null)
			{
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
			System.out.println();
		}	
	}
}

public class linkedlist
{
	public static void main(String args[])
	{
		DoublyLinkedList dll = new DoublyLinkedList();
		int opt = 0;
		Scanner sc = new Scanner(System.in);

		while(opt != 4)
		{
			System.out.print("1. Insert at end");
			System.out.print("\n2. Delete an element");
			System.out.print("\n3. Display linked list");
			System.out.print("\n4. Exit");
			System.out.print("\nEnter your choice : ");
			opt = sc.nextInt();

			switch(opt)
			{
				case 1: {
					System.out.print("Enter the element : ");
					int data = sc.nextInt();
					dll.insert(data);
					break;
					}

				case 2: {
					System.out.print("Enter the element to delete: ");
					dll.delete();
					break;
					}

				case 3: {
					dll.display();
					break;
					}

				case 4: {
					System.out.println("Exiting...");
					break;
					}

				default:{
					System.out.print("Invalid choice");
					break;
					}
			}
		}
		sc.close();
	}
}