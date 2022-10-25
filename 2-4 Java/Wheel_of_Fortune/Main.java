import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		SLL1 Animals =new SLL1();
		SLL2 Letters =new SLL2();
		SLL3 HighScoreTable =new SLL3();
		SLL4 SelectedAnimal =new SLL4();
		SLL5 Board =new SLL5();
		
		String input1 = "Animals.txt";
		String input2 = "D:\\HighScoreTable.txt";
		
		Random Rand = new Random();
		File f = new File(input1);
		File f2 = new File(input2);
		Scanner sc = new Scanner(f);
		Scanner scan =new Scanner(f2);
		int Score=0;
		int Step=1;
		while(sc.hasNextLine())
		 {
			 String line = sc.nextLine();
			 String line1 =line.toUpperCase(Locale.ENGLISH);
			 Animals.add(line1);
		 }
		
		for (int i = 65; i <= 90; i++) {
			char letter = (char)i;
			Letters.add(letter);
		}
		
		while(scan.hasNextLine())
		 {
			 String name = scan.nextLine();
			 String score =scan.nextLine();
			 int score1 = Integer.valueOf(score);
			 HighScoreTable.add(name, score1);
		 }
		int random_number=Rand.nextInt(SLL1.size())+1;
		String random_animal=Animals.search(random_number);
		System.out.println("Randomly generated number: "+random_number);
		System.out.println();
		System.out.println();
		
		for(int i=0;i<random_animal.length();i++)
        {
			SelectedAnimal.add(random_animal.charAt(i));
        }
		
		for (int i = 0; i < random_animal.length(); i++) {
			Board.add("_");
		}
		
		while(true) //Game loop
		{
			System.out.print("Word: ");
			Board.print();
			System.out.print("\t\t\tStep: "+Step);
			System.out.print("\t\t\tScore: "+Score+"\t\t");
			Letters.print();
			System.out.println();
			int random_wheel=Rand.nextInt(10);
			int Wheel = 0;
			
			if(random_wheel==0)
			{
				Wheel=10;
			}
			else if(random_wheel==1)
			{
				Wheel=20;
			}
			else if(random_wheel==2)
			{
				Wheel=30;
			}
			else if(random_wheel==3)
			{
				Wheel=40;
			}
			else if(random_wheel==4)
			{
				Wheel=100;
			}
			else if(random_wheel==5)
			{
				Wheel=200;
			}
			else if(random_wheel==6)
			{
				Wheel=300;
			}
			else if(random_wheel==7)
			{
				Wheel=400;
			}
			else
			{
				Wheel=0;
			}
			if(Wheel!=0)
			{
				System.out.println("Wheel: "+Wheel);
				char Guess;
				while(true)
				{
					int random_letter=Rand.nextInt(26)+65;
					Guess=(char)random_letter;
					if(Letters.search(Guess))
					{
						Letters.delete(Guess);
						System.out.println("Guess: "+Guess);
						break;
					}
				}
				System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
				if(SelectedAnimal.search(Guess))
				{
					String user_Guess=Character.toString(Guess);
					for (int i = 1; i <= random_animal.length(); i++) {
						if(SelectedAnimal.Guess(user_Guess, i))
						{
							Board.complement(user_Guess,i);
							Score=Score+Wheel;
						}
					}
					
				}
				if(Board.search("_")==false)
				{
					System.out.print("Word: ");
					Board.print();
					System.out.print("\t\t\tStep: "+Step);
					System.out.print("\t\t\tScore: "+Score+"\t\t");
					Letters.print();
					System.out.println();
					System.out.println();
					System.out.println("You Get "+Score+" TL");
					System.out.println();
					System.out.println();
					HighScoreTable.add("You", Score);
					HighScoreTable.deleteLast();
					HighScoreTable.print();
					HighScoreTable.printio();
					break;
				}
				else
				{
					Step++;
				}
			}
			else
			{
				System.out.println("Wheel: Bankrupt");
				System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
				Score=0;
				Step++;
			}
			
		}
	}
}
