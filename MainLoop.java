import java.util.Scanner;
public class MainLoop {
	
	public static void mainloop() {
		
		Scanner scan = new Scanner(System.in);
		int userInput;
		
		
		BotDesign.botDesign();
		userInput = scan.nextInt();		
		
		
		switch (userInput) {
		case 1:
			System.out.println("twice");
			break;
		case 2:
			System.out.println("you chose body");
			break;
		default:
			System.out.println("Invalid choice. Choose 1 or 2.");		
		}
	}
}
