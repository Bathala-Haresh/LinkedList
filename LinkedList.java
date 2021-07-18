public class Linkedlist
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Node List=null;
		Node temp;
		while(true)
		{
			System.out.println("1.Add\t2.Append\t3.Insert Between\t4.Exit");
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
                        case 4:System.exit(0);
			break;
			default:System.out.println("You Entered Wrong Value");
			break;
			}
		}
	}

}