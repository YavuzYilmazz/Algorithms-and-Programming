package Lotto_Game;

import java.util.Random;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random Rand = new Random();
		int Player1WalletCounter =0;
		int Player2WalletCounter =0;
		int Player1Counter=0;
		int Player2Counter=0;
		int Player1Wallet =0;
		int Player2Wallet =0;
		Queue Bag1 = new Queue(1000);
		Queue Bag2 = new Queue(1000);
		Queue Player1_Number = new Queue(1000);
		Queue Player2_Number = new Queue(1000);
		Queue RandomNumber = new Queue(1000);
		Queue OtherNumber = new Queue(1000);
		for (int i = 1; i <= 17; i++) {
			Bag1.enqueue(i);                                //Bag1 filling part
		}
		for (int i = 0; i < 7; i++) {
			int number =Rand.nextInt(17)+1;
			int control;
			boolean flag=false;
			for (int j = 0; j <Player1_Number.size(); j++) {
				control=(int) Player1_Number.peek();
				if(control==number)                          //Player1 Number random filling part
				{
					flag=true;
					i--;
				}
				Player1_Number.enqueue(Player1_Number.dequeue());
			}
			if(flag==false)
			{
				Player1_Number.enqueue(number);
			}	
		}
		for (int i = 0; i < 7; i++) {
			int number =Rand.nextInt(17)+1;
			int control;
			boolean flag=false;
			for (int j = 0; j <Player2_Number.size() ; j++) 
			{
				control=(int) Player2_Number.peek();
				if(control==number)                           //Player2 Number random filling part
				{
					flag=true;
					i--;
				}	
				Player2_Number.enqueue(Player2_Number.dequeue());
			}
			if(flag==false)
			{
				Player2_Number.enqueue(number);
			}		
		}
		boolean flag1=false;
		boolean flag2=false;
		while(true)   //Game Loop
		{
			System.out.print("Player1: ");
			for (int i = 0; i < Player1_Number.size(); i++) 
			{
				System.out.print(Player1_Number.peek()+" ");
				Player1_Number.enqueue(Player1_Number.dequeue());
			}
			System.out.print("\t\t\t");
			System.out.print("Bag1: ");
			for (int i = 0; i < Bag1.size(); i++) {
				System.out.print(Bag1.peek()+" ");
				Bag1.enqueue(Bag1.dequeue());
			}
			System.out.println();
			System.out.print("Player2: ");
			for (int i = 0; i < Player2_Number.size(); i++) 
			{
				System.out.print(Player2_Number.peek()+" ");
				Player2_Number.enqueue(Player2_Number.dequeue());
			}
			System.out.print("\t\t\t");
			System.out.print("Bag2: ");
			for (int i = 0; i < Bag2.size(); i++) 
			{
				System.out.print(Bag2.peek()+" ");
				Bag2.enqueue(Bag2.dequeue());
			}
			System.out.println();
			System.out.println();
			int Random_Number=-1;
			boolean flag=false;
			for (int i = 0; i < 17; i++) 
			{
				Random_Number =Rand.nextInt(17)+1;
				int control;
				flag=false;
				for (int j = 0; j <RandomNumber.size(); j++) {
					control=(int) RandomNumber.peek();
					if(control==Random_Number)                          //Player1 Number random filling part
					{
						flag=true;
						i--;
					}
					RandomNumber.enqueue(RandomNumber.dequeue());
				}
				if(flag==false&&flag1==false)
				{
					System.out.println("Randomly selected number: "+Random_Number);
					RandomNumber.enqueue(Random_Number);
					flag1=true;
					break;
				}
				else if(flag==false&&flag1==true)
				{
					System.out.println("selected number: "+Random_Number);
					RandomNumber.enqueue(Random_Number);
					break;
				}
			}
			System.out.println();
			for (int i = 0; i < Bag1.size()+1; i++) {
				if(Random_Number==(int)Bag1.peek())
					Bag2.enqueue(Bag1.dequeue());       //throwing random number from bag1 to bag2
				else
					Bag1.enqueue(Bag1.dequeue());
			}
			for (int i = 0; i < Player1_Number.size(); i++) {
				if(Random_Number==(int)Player1_Number.peek())
				{
					OtherNumber.enqueue(Player1_Number.dequeue());         //check whether the random number is within the numbers of player1
					Player1Counter++;
				}
				else
					Player1_Number.enqueue(Player1_Number.dequeue());
					
			}
			
			for (int i = 0; i < Player2_Number.size(); i++) {
				if(Random_Number==(int)Player2_Number.peek())
				{
					OtherNumber.enqueue(Player2_Number.dequeue());          //check whether the random number is within the numbers of player 2
					Player2Counter++;
				}
				else
					Player2_Number.enqueue(Player2_Number.dequeue());
					
			}
			if(Player1Counter==4&&Player2Counter==4&&flag2==false)
			{
				flag2=true;
				Player1Counter=0;
				Player2Counter=0;
				Player1Wallet+=5;
				Player2Wallet+=5;
				System.out.println("Player1 gets $5 (Birinci Çinko)");
				System.out.println("Player2 gets $5 (Birinci Çinko)");
				System.out.println();
			}
			if(Player1Counter==4&&flag2==false)
			{
				flag2=true;
				Player1Counter=0;
				Player1Wallet+=10;
				System.out.println("Player1 gets $10 (Birinci Çinko)");
				System.out.println();
			}
			if(Player2Counter==4&&flag2==false)
			{
				flag2=true;
				Player2Counter=0;
				Player2Wallet+=10;
				System.out.println("Player2 gets $10 (Birinci Çinko)");
				System.out.println();
			}
			if(Player1_Number.size()==0 && Player2_Number.size()==0)
			{
				System.out.print("Player1: ");
				System.out.print("\t\t\t");
				System.out.print("Bag1: ");
				for (int i = 0; i < Bag1.size(); i++) {
					System.out.print(Bag1.peek()+" ");
					Bag1.enqueue(Bag1.dequeue());
				}
				System.out.println();
				System.out.print("Player2: ");
				System.out.print("\t\t\t");
				System.out.print("Bag2: ");
				for (int i = 0; i < Bag2.size(); i++) 
				{
					System.out.print(Bag2.peek()+" ");
					Bag2.enqueue(Bag2.dequeue());
				}
				Player1Wallet+=15;
				Player2Wallet+=15;
				System.out.println();
				System.out.println();
				System.out.println("Tie");
				System.out.println();
				System.out.println("Player1 gets $"+Player1Wallet);
				System.out.println("Player2 gets $"+Player2Wallet);
				break;
			}
			else if(Player1_Number.size()==0)
			{
				System.out.print("Player1: ");
				System.out.print("\t\t\t");
				System.out.print("Bag1: ");
				for (int i = 0; i < Bag1.size(); i++) {
					System.out.print(Bag1.peek()+" ");
					Bag1.enqueue(Bag1.dequeue());
				}
				System.out.println();
				System.out.print("Player2: ");
				for (int i = 0; i < Player2_Number.size(); i++) 
				{
					System.out.print(Player2_Number.peek()+" ");
					Player2_Number.enqueue(Player2_Number.dequeue());
				}
				System.out.print("\t\t\t");
				System.out.print("Bag2: ");
				for (int i = 0; i < Bag2.size(); i++) 
				{
					System.out.print(Bag2.peek()+" ");
					Bag2.enqueue(Bag2.dequeue());
				}
				System.out.println();
				System.out.println();
				Player1Wallet+=30;
				System.out.println();
				System.out.println();
				System.out.println("Player1 is the Winner!!!");
				System.out.println();
				System.out.println("Player1 gets $"+Player1Wallet);
				System.out.println("Player2 gets $"+Player2Wallet);
				break;
			}
			else if(Player2_Number.size()==0)
			{
				System.out.print("Player1: ");
				for (int i = 0; i < Player1_Number.size(); i++) 
				{
					System.out.print(Player1_Number.peek()+" ");
					Player1_Number.enqueue(Player1_Number.dequeue());
				}
				System.out.print("\t\t\t");
				System.out.print("Bag1: ");
				for (int i = 0; i < Bag1.size(); i++) {
					System.out.print(Bag1.peek()+" ");
					Bag1.enqueue(Bag1.dequeue());
				}
				System.out.println();
				System.out.print("Player2: ");
				System.out.print("\t\t\t");
				System.out.print("Bag2: ");
				for (int i = 0; i < Bag2.size(); i++) 
				{
					System.out.print(Bag2.peek()+" ");
					Bag2.enqueue(Bag2.dequeue());
				}
				System.out.println();
				System.out.println();
				Player2Wallet+=30;
				System.out.println();
				System.out.println();
				System.out.println("Player2 is the Winner!!!");
				System.out.println();
				System.out.println("Player1 gets $"+Player1Wallet);
				System.out.println("Player2 gets $"+Player2Wallet);
				break;
			}
		}
		
	}

}
