import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int userinput;
		String endgame = "";
		
		BotDesign.botDesign();
		
		while(!endgame.equals("yes")) {
			
			int rounds;
			for(rounds = 1; rounds<=5; rounds++) {
			
				userinput = scan.nextInt();
			
				int botheadHP = 50;
				int botbodyHP = 100;
				int userheadHP = 60;
				int userbodyHP = 120;
				
				int dmgbothead = rand.nextInt(51);
				int dmgbotbody = rand.nextInt(101);
				int dmguserhead = rand.nextInt(61);
				int dmguserbody = rand.nextInt(121);
				
				System.out.println("Round " + rounds + ":");
						
				switch (userinput) {
				case 1:
					System.out.println("you chose head");
					DamageInfo.damageinfo("BOT", botheadHP, dmgbothead);
					DamageInfo.damageinfo("YOU", userheadHP, dmguserhead);
					break;
				case 2:
					System.out.println("you chose body");
					DamageInfo.damageinfo("BOT", botbodyHP, dmgbotbody);
					DamageInfo.damageinfo("YOU", userbodyHP, dmguserbody);
					break;
				default:
					System.out.println("Invalid choice. Choose 1 or 2.");
					MainLoop.mainloop();
				}
			
			endgame = scan.nextLine();
			
			
			
			
			
				
			
			
		    }
			System.out.println();
			System.out.println("END GAME");
			break;
		}
	}
}
