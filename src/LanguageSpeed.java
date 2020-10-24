import java.util.Scanner;

public class LanguageSpeed {
	
	public static void main(String[] args) {
		
		//Scanner
		Scanner userInput = new Scanner(System.in);
		
		//Array
		/* Order of languages is English, Spanish (Latin America), French (Canada),
		Japanese, Spanish (Spain), French (France), German, Italian, Russian.
		
		*/
		double [] [] times = {
		//Sheikah Slate 
		{0.1, 1.29, 3.28, 0, 0.14, 4.01, 3.28, 1.27, 0.27},	
		//You are the light	
		{0, 5.01, 3.28, 3.10, 5.21, 7, 10.01, 6.1, 7.25},
		//First beast (if you haven't talked to Impa)
		{7.01, 8.18, 8.13, 0, 12.13, 11.14, 9.03, 12.11, 6.08},
		//All beasts conquered
		{9.02, 7.06, 9.06, 0, 12.23, 9.29, 12.26, 14.21, 13.26},
		//North Lomei Labyrinth
		{7.03, 0.04, 0.03, 0.05, 0.04, 0, 0, 0, 7.05},
		//South Lomei Labyrinth
		{7.07, 0.07, 0.05, 0.07, 0.02, 0, 0.02, 7.07},
		//Lomei Labyrinth Island
		{7.04, 0.05, 0.03, 0.05, 0.05, 0, 0.04, 0.03, 7.07},
		//Typhlo Ruins
		{7.03, 0.04, 0.03, 0.04, 0.04, 0, 0.03, 0.01, 7.06},
		//Eventide start
		{13.24, 7.01, 6.29, 7.01, 7.01, 6.19, 6.14, 13.19, 0},
		//Eventide completed
		{6.28, 0.01, 7.01, 7.02, 0, 6.27, 0.03, 0.01, 7.06},
		//A gift from the monks
		{13.21, 0.02, 21.04, 21.08, 0, 20.17, 20.20, 13.14, 14.02},
		//Trial of the sword Notice
		{7.06, 0, 7.08, 7.05, 0.06, 7, 7.06, 7.07, 7.04},
		//Entering Thunder Blight
		{0, 6.27, 7, 7, 7.02, 7.01, 7.03, 7.01, 7.01},
		//Exiting Thunder Blight
		{2.26, 0, 0.05, 0, 0.05, 0.24, 1.12, 0.09, 0.14},
		//Entering Wind Blight
		{0, 7.01, 7, 6.29, 7.02, 7.03, 7.03, 7.01, 7.04},
		//Exiting Wind Blight
		{2.18, 0, 3.05, 0, 0.01, 3.21, 1.25, 0.14, 0.10},
		//Entering Water Blight
		{0, 6.28, 7, 6.29, 7.01, 7.01, 7.01, 7.02, 7},
		//Exiting Water Blight
		{4.11, 2.08, 1, 0.04, 0.02, 1.14, 0.14, 0, 1.28},
		//Entering Fire Blight
		{0, 6.29, 7.01, 6.28, 7, 7.02, 7.02, 6.29, 7.02},
		//Exiting Fire Blight
		{5.04, 0.05, 0.25, 0, 0.02, 1.05, 1.06, 0.16, 0.22},
			
		};
		
		//Which run category
		boolean anyPercent = false;
		boolean hundo = false;
		boolean hundoDLC = false;
		boolean allShrines = false;
		boolean allMainQuests = false;
		boolean allDungeons = false;
		
		//Which cutscenes
		boolean firstBeast;
		boolean northLomei;
		boolean southLomei;
		boolean lomeiIsland;
		boolean typhloRuins;
		boolean eventideStart;
		boolean eventideDone;
		boolean monkGift;
		
		System.out.println("Which category are you running? Possible categories include Any%, All Dungeons, All Main Quests, All Shrines, and 100%");
		String category = userInput.nextLine();
		
		//Any%
		if (category.equals("any%") 
			|| category.equals("Any%")
			|| category.equals("any percent")
			|| category.equals("Any Percent"))
			anyPercent = true;
		
		//AD
		else if (category.equals("all dungeons") 
			|| category.equals("ad")
			|| category.equals("AD")
			|| category.equals("All Dungeons"))
			allDungeons = true;
		
		//AMQ
		else if (category.equals("all main quests") 
			|| category.equals("AMQ")
			|| category.equals("amq") 
			|| category.equals("All main quests") 
			|| category.equals("All Main Quests"))
			allMainQuests = true;
		
		//All Shrines
		else if (category.equals("All Shrines")
			|| category.equals("AS")
			|| category.equals("all shrines")
			|| category.equals("as"))
			allShrines = true;
		
		//Hundo
		else if (category.equals("hundo")
			|| category.equals("100%")
			|| category.equals("100 percent")
			|| category.equals("Hundo")
			|| category.equals("one hundred percent")
			|| category.equals("hundred percent")
			|| category.equals("Hundred Percent")
			|| category.equals("One Hundred Percent")
			|| category.equals("One hundred percent")) {
			hundo = true;
			
			//Hundo + DLC?
			System.out.println("Are you running 100% with DLC?");
			String dlc = userInput.nextLine();
			
			if (dlc.contains("y")) {
				hundoDLC = true;
			}
		}
			
		
		else if (!hundo && !allShrines && !allMainQuests && !allDungeons && !anyPercent) {
			System.out.println("The category could not be identified. Please answer the following questions to determine the fastest languages for your run.");
		
		//Where run visits
			System.out.println("The run contains DLC: true or false?");
			boolean dlc = userInput.nextBoolean();
			
			System.out.println("There is a divine beast in the run before speaking to Impa: true or false?");
			firstBeast = userInput.nextBoolean();
			
			System.out.println("The run visits North Lomei Labyrinth: true or false?");
			northLomei = userInput.nextBoolean();
			
			System.out.println("The run visits South Lomei Labyrinth: true or false?");
			southLomei = userInput.nextBoolean();
			
			System.out.println("The run visits Lomei Labyrinth Island: true or false?");
			lomeiIsland = userInput.nextBoolean();
			
			System.out.println("The run visits Typhlo Ruins: true or false?");
			typhloRuins = userInput.nextBoolean();
			
			System.out.println("The run starts Eventide island: true or false?");
			eventideStart = userInput.nextBoolean();
			
			System.out.println("Eventide island is completed: true or false?");
			eventideDone = userInput.nextBoolean();
			
			System.out.println("The run completes all shrines in the game: true or false?");
			monkGift = userInput.nextBoolean();
			
			if (dlc) {
				System.out.println("The run starts Trial of the Sword: true or false?");
				boolean swordTrial = userInput.nextBoolean();
				
				System.out.println("The run does the Thunderblight Illusory fight: true or false?");
				boolean thunderBlight = userInput.nextBoolean();
				
				System.out.println("The run does the Windblight Illusory fight: true or false?");
				boolean windBlight = userInput.nextBoolean();
				
				System.out.println("The run does the Waterblight Illusory fight: true or false?");
				boolean waterBlight = userInput.nextBoolean();
				
				System.out.println("The run does the Fireblight Illusory fight: true or false?");
				boolean fireBlight = userInput.nextBoolean();
			}
		}
		
		if (anyPercent) {
			firstBeast = false;
			northLomei = false;
			southLomei = false;
			lomeiIsland = false;
			typhloRuins = false;
			eventideStart = false;
			eventideDone = false;
			monkGift = false;
		}
		
		else if (hundo) {
			
		}
	}
	
	
}
