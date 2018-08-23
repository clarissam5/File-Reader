/*
 * The purpose of this program is to extract the text from a file
 * Author:Clarissa Mercado
 * Date:08-22-18
 */
import java.io.File;
import java.io.IOException; 
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class FileExample {

	public static void main(String args[]) throws IOException {
	//Option 1
		File f = new File("C:\\Users\\Clarissa\\eclipse-workspace\\File Reader\\src\\pigs.txt");
		FileReader reader = new FileReader(f); //file reader reads character by character 
		int read; 
		int counter = 0;
		while((read = reader.read()) != -1) { //-1 will let it know when to stop reading
			
			if(read == 'h') {
				counter++;
			}
			//System.out.print((char) read);
		}
		System.out.println("The character 'h' has occurred: " + counter);
	//option 2
		//have to make another FileReader object to start from the beginning of the file again 
		FileReader readerBuff = new FileReader(f);
		//BufferedReader will read line by line and will take in the already created FileReader 
		BufferedReader buff = new BufferedReader(readerBuff);
		String line;
		counter = 0;
		while((line = buff.readLine()) !=null) { //null will let the loop know when there is no more content in the file to read 
			System.out.println(++counter + ":" + line);
		}
	// Option 3 : Reading a file using Scanner
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		sc.close();
		
		File d = new File("C:\\Users\\Clarissa\\Desktop\\gift_of_the_maggi.pdf");
		FileReader reads = new FileReader(d);
		BufferedReader buffreads = new BufferedReader(reads);
		String lines;
		while((lines = buffreads.readLine()) !=null) {
			System.out.println(lines);
		}
	}
	
}
