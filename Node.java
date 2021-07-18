package com.demo;
import java.util.Scanner;

class Node
{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
	}
	//method to add elements in linkedlist
	public static Node add(Node List)
	{
		int num;
		Node temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to insert:");
		num=sc.nextInt();
		//if list is null then adding new node in the list
		if(List==null)
		{
			List=new Node(num);
		}
		//if list is not null then storing the new node in temp and shifting its temp element to first position in list
		else if(List!=null)
		{
			temp=new Node(num);
			temp.next=List;
			List=temp;
		}
		Node.display(List);
		return List;
	}
	//method to append data in the list
	public static Node append(Node List)
	{
		int num;
		Node temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to Append:");
		num=sc.nextInt();
		temp=List;
		//if list is null then adding new node in the list
		if(List==null)
		{
			List=new Node(num);
		}
		else if(List!=null)
		{
			while(true)
			{
				//iterating with all the elements
				if(temp.next!=null)
				{
					temp=temp.next;
				}
				//if next element is null then adding element at last 
				else if(temp.next==null)
				{
					temp.next=new Node(num);
					break;
				}
				else
				{
					break;
				}
			}
		}
		Node.display(List);
		return List;
	}
	//method to insert element between 2 numbers
	public static Node insertBetween(Node List)
	{
		System.out.println("Enter the First number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Node temp=List;
		while(true)
		{
			//checking if given number is in the list
			if(temp.data==num)
			{
				//adding the list to temp1
				Node temp1=temp;
				int count=0;
				System.out.println("Enter the Second number:");
				num=sc.nextInt();
				while(true)
				{
					//checking if second number also exists or not
					if(temp.data==num)
					{
						//iterating all the list between these 2 numbers
						for(int i=1;i<=count/2;i++)
						{
							temp1=temp1.next;
						}
						System.out.println("Enter the Number you want to insert:");
						num=sc.nextInt();
						//adding the element to temp2 list
						Node temp2=new Node(num);

						temp2.next=temp1.next;
						//adding the new element in between 2 elements
						temp1.next=temp2;
						break;
					}
					else if(temp.next==null)
					{
						break;
					}
					else
					{
						temp=temp.next;
						count++;
					}
				}
			}
			else if(temp.next==null)
			{
				break;
			}
			else
			{
				temp=temp.next;
			}
		}
		Node.display(List);
		return List;
	}
	//method to delete last element
	public static Node deleteLast(Node List)
	{
		Node temp;
		temp=List;
		while(true)
		{
			if(temp.next.next!=null)
			{
				temp=temp.next;
			}
			else if(temp.next.next==null)
			{
				temp.next=null;
				break;
			}
			else
			{
				break;
			}
		}
		Node.display(List);
		return List;
	}
	//method to delete first element
	public static Node deleteFirst(Node List)
	{
		Node temp;
		//storing the second element in temp
		temp=List.next;
		//shifting the second element to first element
		List=temp;
		Node.display(List);
		return List;
	}
        //finding element exists or not
	public static boolean search(Node List)
	{
		System.out.println("Enter the Element you want to find");
		Scanner sc=new Scanner(System.in);
		int search=sc.nextInt();
		Node temp;
		temp=List;
		while(true)
		{
			if(temp.data==search)
			{
				System.out.println("The Value is Found");
				return true;
			}
			else if(temp.next==null)
			{
				System.out.println("Not found");
				return false;
			}
			else
			{
				temp=temp.next;
			}
		}
	}
        //method to insert element after
	public static Node insertAfter(Node List)
	{
		System.out.println("Enter the number After you want to insert:");
		Node temp;
		Scanner sc=new Scanner(System.in);
		int after=sc.nextInt();
		temp=List;
		while(true)
		{
			//checking if number exists in the list or not
			if(temp.data==after)
			{
				System.out.println("Enter the number you want to insert");
				after=sc.nextInt();
				//creating a temp2 node and adding new element in that
				Node temp2=new Node(after);
				temp2.next=temp.next;
				//adding new element after the particular element
				temp.next=temp2;
				break;
			}
			else if(temp.next==null)
			{
				break;
			}
			else
			{
				temp=temp.next;
			}
		}
		Node.display(List);
		return List;
	}