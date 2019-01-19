package socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client1 {

	public static void main(String[] args) throws Exception {
		
		Socket s = new Socket("localhost",9118);
		String str = "Rashik Hassan";
		
		
		OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream()); 
		PrintWriter out = new PrintWriter(os);
		os.write(str);
		os.write("It's me");
		os.flush();
		os.write("Murgi");
		//System.out.println("Passed");

		//System.out.println("hdiedi");
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str1 = br.readLine();
		
		System.out.println("Server: "+ str1);
		
		os.close();
		
	
		
		
		
	}

}
