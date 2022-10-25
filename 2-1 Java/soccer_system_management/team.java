package soccermanagementsystem;

public class team {
	private String name;
	private String year;
	private String cups;
	private String colors;
	private static player[] player;
	private static stadium[] stadium;
	private static company[] company;
    private static int playercounter;
    private static int stadiumcounter;
    private static int companycounter;
    private int point;
	
	public team(String name, String year, String cups, String colors,int point) {
		this.name = name;
		this.year = year;
		this.cups = cups;
		this.colors = colors;
		this.point = point;
		company = new company[21];
		stadium = new stadium[21];
		player = new player[630];
		playercounter=0;
		stadiumcounter=0;
		companycounter=0;
		
	}

	
	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point += point;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCups() {
		return cups;
	}

	public void setCups(String cups) {
		this.cups = cups;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}
	
	
	
	//methods
	public static void addPlayer(player P) {
		player[playercounter]=P;
		playercounter++;
	}



	public static void addStadium(stadium S) {
		stadium[stadiumcounter]= S;
		stadiumcounter++;
	}



	public static void addCompany(company C) {
		company[companycounter]= C;
		companycounter++;
	}


	public static void deletePlayer(String license_num) {  

        for (int i = 0; i < playercounter; i++)
        {
        	if(player[i].getLicensenumber().equals(license_num))
        	{
        		player[i]=null;
        		playercounter--;
        	}
         }
	}



	public static void listPlayer() {
		System.out.println();
		System.out.println("Players");
		for (int i = 0; i < playercounter; i++)
		{
			System.out.println(player[i].getName_surname()+ "---->" +player[i].getTeam());
		}
	}

	public static void listcompany() {
		System.out.println();
		System.out.println("Companies");
		for (int i = 0; i < companycounter; i++) 
		{
			System.out.println(company[i].getName());
		}
	}



	public static void biggeststadium() {
		int[] stadiumarray= new int[stadiumcounter+1];
		int biggest=0;
		for (int i = 0; i < stadiumcounter; i++)
		{
			stadiumarray[i]=Integer.valueOf(stadium[i].getCapacity());
		}
		for (int i = 0; i < stadiumcounter; i++)
		{
			if(stadiumarray[i]>biggest)
			{
				biggest = stadiumarray[i];
			}
			
		}
		String biggeststadiumcapacity = String.valueOf(biggest);
		for (int i = 0; i < stadiumcounter; i++)
		{
			if(stadium[i].getCapacity().equals(biggeststadiumcapacity))
			{
				if(stadium[i].isAvailable()==true)
				{
					System.out.println();
					System.out.println("The Biggest Stadium:");
					System.out.println(stadium[i].getName()+"   "+"- available");
				}
				else
				{
					System.out.println();
					System.out.println("The Biggest Stadium:");
					System.out.println(stadium[i].getName()+"   "+"- not available");
				}
			}
		}
	}
}
