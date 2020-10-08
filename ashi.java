import java.util.*;
public class ashi {
	public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				String name;
				int ex;
				System.out.println("Please Enter your Name \n");
				name = s.nextLine();
				System.out.println("\nHello Mr."+name+" Welcome to Java \n\nHow many year's Experiences  in Java programming\n");
				ex = s.nextInt();
				if(ex>=2)
				{
					System.out.println("\nyou are batter Experienced person in Java programming\n\nSend me your details on email");
				}
				else if(ex==1)
				{
				System.out.println("\nyou are low Experienced person in Java programming \n\ncontect me ");
				}
				else
				{
					System.out.println("\nyou are Fraser  in Java programming \n\n sorry you not Qualify ");
				}
				System.out.println("\nE-mail:-ashishc04011@gmail.com");
	}
}