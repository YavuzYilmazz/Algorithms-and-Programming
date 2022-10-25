package soccermanagementsystem;
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
				String input = "D:\\input.txt";
				match[] matcharray= new match[420];
				int matchcounter = 0;
				team[] Teamarray= new team[21];
				referee[] refereearray=new referee[63];
				coach[] coacharray = new coach[21];
				int teamcounter=0;
				int coachcounter=0;
				int refereecounter=0;
		 try {
			    File file = new File(input);
	            Scanner sc = new Scanner(file,("UTF-8"));

	            
	            while(sc.hasNextLine())
	            {
	                String line = sc.nextLine();
	                String[] information = line.split(";");
	                String condition = information[0];
	                if(condition.equals("AddTeam"))
	                {
	                	 team Team = new team(information[1],information[2],information[3],information[4], 0);
	                	 Teamarray[teamcounter]=Team;
	                	 teamcounter++;
	                }
	                else if(condition.equals("AddCoach"))
	                {
	                	coach Coach = new coach(information[1],information[2],information[3],information[4],information[5],information[6],information[7],
	                			information[8],information[9],information[10],information[11],information[12],information[13],information[14],information[15],information[16]);
	                	coacharray[coachcounter]=Coach;
	                	coachcounter++;
	                }
	                else if(condition.equals("AddPlayer"))
	                {
	                	player Player = new player(information[1],information[2],information[3],information[4],information[5],information[6],information[7]
	                			,information[8],information[9],information[10],information[11],information[12],information[13],information[14],information[15],information[16],
	                			information[17],information[18],information[19],information[20],information[21],information[22]);
	                	team.addPlayer(Player);
	                }
	                else if(condition.equals("AddStadium"))
	                {
	                	stadium Stadium = new stadium(information[1],information[2],information[3],information[4],information[5], true);
	                	team.addStadium(Stadium);
	                }
	                else if(condition.equals("AddReferee"))
	                {
	                	referee Referee = new referee(information[1],information[2],information[3],information[4],information[5],information[6],information[7]
	                			,information[8],information[9]);
	                	refereearray[refereecounter]=Referee;
	                	 refereecounter++;
	                }
	                else if(condition.equals("AddCompany"))
	                {
	                	 company Company = new company(information[1],information[2],information[3],information[4],information[5],information[6],information[7]
		                			,information[8],information[9]);
	                	 team.addCompany(Company);
	                }
	                else if(condition.equals("AddMatch"))
	                {
	                	 match Match = new match(information[1],information[2],information[3],information[4],information[5],information[6],information[7],information[8]);
	                	 matcharray[matchcounter]=Match;
	                	 matchcounter++;
	                }
	                else if(condition.equals("DeletePlayer"))
	                {
	                	team.deletePlayer(information[1]);
	                }                
	         }
	            System.out.println("Teams");
	            for (int i = 0; i < teamcounter; i++)
            	{
	            	for (int j = 0; j < coachcounter; j++)
	            	{
	            		if(Teamarray[i].getName().equals(coacharray[j].getTeam()))
	            		{
	            			System.out.println(Teamarray[i].getName()+"---->"+coacharray[j].getName());
	            		}
	            	}
            	}
	            team.listPlayer();
	            team.listcompany();
	            for (int i = 0; i < matchcounter; i++)
	            {
	            	int awaygoals =Integer.valueOf(matcharray[i].getAwaynumberofgoals());
	            	int homegoals =Integer.valueOf(matcharray[i].getHomenumberofgoals()); 
	            	if(awaygoals > -1 && homegoals > -1)
	            	{
	            		if(awaygoals>homegoals)
	            		{
	            			for (int j = 0; j < teamcounter; j++)
	            			{
	            				if(matcharray[i].getAway_team().equals(Teamarray[j].getName()))
	            				{
	            					Teamarray[j].setPoint(3);
	            				}
	            			}
	            		}
	            		else if(awaygoals<homegoals)
	            		{
	            			for (int j = 0; j < teamcounter; j++)
	            			{
	            				if(matcharray[i].getHome_team().equals(Teamarray[j].getName()))
	            				{
	            					Teamarray[j].setPoint(3);
	            				}
	            			}
	            		}
	            		else
	            		{
	            			for (int j = 0; j < teamcounter; j++)
	            			{
	            				if(matcharray[i].getHome_team().equals(Teamarray[j].getName()))
	            				{
	            					Teamarray[j].setPoint(1);
	            				}
	            			}
	            			for (int j = 0; j < teamcounter; j++)
	            			{
	            				if(matcharray[i].getAway_team().equals(Teamarray[j].getName()))
	            				{
	            					Teamarray[j].setPoint(1);
	            				}
	            			}
	            		}
	            	}
	            	else
	            	{
	            		System.out.println("Wrong goal input");
	            	}
	            }
	            for (int i = 0; i < teamcounter; i++)
	            {
	                for (int j = 0; j<teamcounter; j++)
	                {
	                    team temp = Teamarray[i];
	                    if(Teamarray[j].getPoint()<Teamarray[i].getPoint())
	                    {
	                    	Teamarray[i]= Teamarray[j];
	                    	Teamarray[j]=temp;
	                    }
	                }
	            }
	            System.out.println();
	            System.out.println("Scores");
	            for (int i = 0; i < teamcounter; i++)
	            {
	            	System.out.println(Teamarray[i].getName()+"   " +Teamarray[i].getPoint());
	            }
	            System.out.println();
	            for (int i = 0; i < teamcounter; i++)
	            {
	            	if(Teamarray[0].getPoint()==Teamarray[i].getPoint())
	            	{
	            		
	            		System.out.println("Winner "+ Teamarray[i].getName()); //I hope Fenerbahce wins :d
	            	}
	            }
	            team.biggeststadium();
	            System.out.println();
	            System.out.println("Referees");
	            for (int i = 0; i < refereecounter; i++)
	            {
	            	refereearray[i].setSalary(refereearray[i].getSalary());
	            	System.out.println(refereearray[i].getName() + "---->" + refereearray[i].getSalary());
	            }
	            }
	         catch (FileNotFoundException e) {
	            e.printStackTrace();}
	}
}