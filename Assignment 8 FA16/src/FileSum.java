import java.io.*;
import java.util.Scanner;

public class FileSum  {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter numbers and enter -1 to end");
		
		File f = new File("Numbers.txt");
		
		PrintWriter p = new PrintWriter(f);
		
		int number = 0;
		
		while(number != -1) {
			number = input.nextInt();
			p.print(number + " ");
		}
		
		p.close();
		input.close();
		
		Scanner reader = new Scanner(f);
		
		int sum = 0;
		
		while(reader.hasNext()) {
			
			sum += Integer.parseInt(reader.next());
		}
		
		System.out.println("sum is " + sum);
		
		reader.close();
		

	}

}
