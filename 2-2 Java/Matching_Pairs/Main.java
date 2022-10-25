//package Matching_Pairs;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Object input = "D:\\fruits.txt";
		Random Rand = new Random();
		int Point =0;
		int Step = 1;
		int counter =0; //The variable I use to arrange the numbers and loops that occur randomly when a fruit is matched
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		File f = new File((String) input);
        scan = new Scanner(f);
		int user_preference_size =5; //change this part if you want to change the stack size       (min 2--max 10) 
		if(user_preference_size>10||user_preference_size<2)
		{
			System.out.println("Sorry i said you (min 2--max 10)");
		}
		else
		{
			Stack Fruit2=new Stack(user_preference_size);   //Main Stacks
			Stack Fruit1=new Stack(user_preference_size);
			Stack TempFruit2=new Stack(user_preference_size); //the stack that we transferred while checking the fruits in the game
			Stack TempFruit1=new Stack(user_preference_size);
			Stack OtherFruit2=new Stack(user_preference_size); //stack of random selected fruit
			Stack OtherFruit1=new Stack(user_preference_size);
			System.out.println();
			System.out.println("THE GAME �S ON :)");
			System.out.println();
			int x=0;
			System.out.print("Fruit Stack: ");
			 while(scan.hasNextLine())
			 {
				 Object line = scan.nextLine();
	             Fruit2.push(line);
	             TempFruit1.push(line);
	             System.out.print(line+" ");
	             x++;
	             if(x==user_preference_size)
	             {
	            	 break;
	             }
			 }
			 System.out.println();
			 int z=0;
			 while(true) 
			 {
				 Fruit1.push(TempFruit1.pop());
				 z++;
				 if(z==user_preference_size)
	             {
	            	 break;
	             }
			 }
			 while(true) //game loop
			 {
				 System.out.println();
				 System.out.print("Stack 1: ");
				 for (int i = 0; i <user_preference_size-counter; i++) 
				 {
					 System.out.print(Fruit1.peek()+" ");
					 TempFruit1.push(Fruit1.pop());
				 }
				 for (int i = 0; i < counter; i++) 
				 {
					 System.out.print("\t");
				 } 
				 System.out.print("\t\t\t");
				 System.out.print("Score= "+Point);
				 System.out.println();
				 System.out.print("Stack 2: ");
				 for (int i = 0; i <user_preference_size-counter; i++) 
				 {
					System.out.print(Fruit2.peek()+" ");
					TempFruit2.push(Fruit2.pop());
				 }
				 for (int i = 0; i <user_preference_size-counter; i++) 
				 {
					Fruit1.push(TempFruit2.pop());
					Fruit2.push(TempFruit1.pop());
				 }
				 System.out.println();
				 int number1=Rand.nextInt(user_preference_size-counter)+1;
				 int number2=Rand.nextInt(user_preference_size-counter)+1;
				 System.out.println();
				 System.out.print("Randomly generated numbers: "+number1+"  "+number2);
				 System.out.print("\t\t\t\t\t  Step="+Step);
				 Step++;
				 System.out.println();
				 System.out.println();
				 for (int i = 0; i <user_preference_size-counter; i++) 
				 {
					 if(user_preference_size-counter-number1==i)
					 {
						 OtherFruit1.push(Fruit1.peek());
					 }
					 TempFruit1.push(Fruit1.pop());
					 
					 if(user_preference_size-counter-number2==i)
					 {
						 OtherFruit2.push(Fruit2.peek());
					 }
					 TempFruit2.push(Fruit2.pop()); 
				 }
				 if(OtherFruit1.peek().equals(OtherFruit2.peek()))
				 {
					 Point=Point+20;
					 for (int i = 0; i < user_preference_size-counter; i++) 
					 {
						 if(TempFruit1.peek()==OtherFruit1.peek())
						 {
							 TempFruit1.pop();
						 }
						 else
						 {
							 Fruit1.push(TempFruit1.pop());
						 }
					 }
					 for (int i = 0; i < user_preference_size-counter; i++) 
					 {
						 if(TempFruit2.peek()==OtherFruit2.peek())
						 {
							 TempFruit2.pop();
						 }
						 else
						 {
							 Fruit2.push(TempFruit2.pop());
						 }
					 }
					 counter++;
				 }
				 else
				 {
					 Point--;
					 for (int i = 0; i < user_preference_size-counter; i++) 
					 {
						 Fruit1.push(TempFruit1.pop());
						 Fruit2.push(TempFruit2.pop());
					 }
					 OtherFruit1.pop();
					 OtherFruit2.pop();
					 
				 }
				 if(counter==user_preference_size)
				 {
					 System.out.println();
					 System.out.println("The game is over.");
					 break;
				 }
				 
			 }
			 Object highscoretable = "D:\\highscoretable.txt";
			 File f1 = new File((String) highscoretable);
			 PrintWriter outputStream = null;
			 scan2 = new Scanner(f1);
			 Stack HighScoreTable=new Stack(23);
			 Stack TempHighScoreTable=new Stack(23);
			 while(scan2.hasNextLine())
			 {
				 Object line1 = scan2.nextLine();
				 HighScoreTable.push(line1);
				 
			 }
			 boolean flag=false;
			 boolean flag1=false;
		     for (int i = 0; i < 20; i++) 
		     {
		    	if(i%2==0)
		    	{
		    		int intValue = Integer.valueOf((String)HighScoreTable.peek());
		    		if(intValue>=Point&&flag1==false)
		    		{
		    			TempHighScoreTable.push(Point);
			    		TempHighScoreTable.push("You");
			    		flag=true;
			    		flag1=true;
		    		}
		    		
		    	}
		    	if(flag==true&&(i==18||i==19))
		    	{
		    		break;
		    	}
		    	 TempHighScoreTable.push(HighScoreTable.pop());
			 }
		     for (int i = 0; i < 2; i++) {
		    	 TempHighScoreTable.push(HighScoreTable.pop());
			 }
		     File f2 = new File((String) "D:\\highscoretable.txt");
		     f2.delete();
		     File f3 = new File((String) "D:\\highscoretable.txt");
		     f3.createNewFile();
		     outputStream = new PrintWriter(new FileWriter("D:\\highscoretable.txt"));
		     for (int i = 0; i < 20; i++) 
		     {
		    	 if(i%2==0)
		    	 {
		    		 System.out.print(TempHighScoreTable.peek()+"  ");
		    		 outputStream.println(TempHighScoreTable.peek());
			    	 HighScoreTable.push(TempHighScoreTable.pop());
		    	 }
		    	 else
		    	 {
		    		 System.out.println(TempHighScoreTable.peek());
		    		 outputStream.println(TempHighScoreTable.peek());
			    	 HighScoreTable.push(TempHighScoreTable.pop());
		    	 }
		    	 
			 }
		     outputStream.close();
		}
	
	}
}