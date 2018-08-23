/*
 * Purpose of this program is to try and amend ONE file
 * Author:Clarissa Mercado
 * Date: 08-22-18
 */
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileExample2 {
	
	public static void main(String args[]){
	
	
		//has story
		File so = new File("C:\\Users\\Clarissa\\Desktop\\pigs2.txt");	
		
		String line = "";
		String s = "";
		
	try {
		BufferedReader breads = new BufferedReader(new FileReader(so));
			while(line != null) {
				
				line = breads.readLine();
				s+= line;	
			}
			s+="adding stuff";
			s+="Java java java";
			System.out.println(s);
		BufferedWriter write = new BufferedWriter(new FileWriter(so)); // has to be after the the while  prevent completely overriding original doc
			breads.close(); //close the reader or it will not save
			write.write(s);
			write.close();
	}
	catch(IOException e) {
		System.out.println("Not able to perform.");
	}
		
	}
		
	

}

