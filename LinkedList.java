package com.demo;
import java.util.Scanner;
//main class
public class Linkedlist
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Node List=null;
		Node temp;
		while(true)
		{
			System.out.println("1.Add\t2.Append\t3.Insert Between\t4.Delete Last\t5.Delete First\t6.Insert After\t7.Delete Particular from Element\t8.Search\t9.Display\t10.Ordered List Ascending order\t11.Exit");
			int num;
			System.out.print("Your Choice:");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:List=List.add(List);
			break;
			case 2:List=List.append(List);
			break;
			case 3:List=List.insertBetween(List);
			break;
			case 4:List=List.deleteLast(List);
			break;
			case 5:List=List.deleteFirst(List);
			break;
			case 6:List=List.insertAfter(List);
			break;
			case 7:List=List.delete(List);
			break;
			case 8:List.search(List);
			break;
			case 9:
				if(List==null)
				{
					System.out.println("No Element Found");
				}
				else
				{
					Node.display(List);
				}
				break;
			case 10:List=List.orderedList(List);
			break;
			case 11:System.exit(0);
			break;
			default:System.out.println("You Entered Wrong Value");
			break;
			}
		}
	}

}