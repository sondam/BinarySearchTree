package p1;
import java.io.Console;
import java.io.IOException;
import java.util.Arrays;


public class Password {
	
	public static void main(String[] args) throws IOException{
		Console c = System.console();
		
		if(c==null){
			System.err.println("No console");
			System.exit(1);
		}
		String login= c.readLine("Enter your login");
		char[] oldPassword= c.readPassword("Enter your old password");
	  if (verify(login, oldPassword)){
		boolean noMatch;
		do{
			char[] newPassword1=c.readPassword("Enter your new pasword"); 
			char[] newPassword2=c.readPassword("Enter new pasword again");
			noMatch = ! Arrays.equals(newPassword1,newPassword2);
			if (noMatch){
				c.format("Password don't match , Try again %n");}
			else{
				change(login, newPassword1);
				c.format("Password for %s changed. %n", login);
			}
		}
		while(noMatch);
		System.out.println("Hello"); 
		 
	 }	
	}
	
	 static void change(String login, char[] newPassword1) {
		
		
	}

	static boolean verify(String login, char[] oldPassword){
		return true;
		}

}