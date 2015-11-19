package p1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOByte {
	public static void main(String[] args ) throws IOException{
		Scanner in = null;
		//BufferedWriter out = null;
		
		try{
			in = new Scanner(new BufferedReader(new FileReader("/home/sonal/Desktop/Result.txt")));
		//	out = new BufferedWriter(new FileWriter("/home/sonal/Desktop/D1"));
			int c= 0;
			
			//while ((c= in.read())!=-1){
			while(in.hasNext()){
				System.out.println(in.next());
			//	out.write(c);
			     }
		   }  
		finally{
			if(in != null ){
				in.close();
			  }
		//	if(out != null){
		//		out.close();
			  }
			
		    }
	     }
	
	


