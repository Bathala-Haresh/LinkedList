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