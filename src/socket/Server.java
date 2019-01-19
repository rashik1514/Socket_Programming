package socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Server started");
		ServerSocket ss = new ServerSocket(9118);
		Socket s = ss.accept();
		
		System.out.println("Client connected");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = br.readLine();
		
		System.out.println("Client: "+ str);
		
		String nickname = str.substring(0, 5);
		System.out.println("Yo mama");
		OutputStreamWriter os1 = new OutputStreamWriter(s.getOutputStream());
		PrintWriter p = new PrintWriter(os1);
		
		os1.write(nickname);
		os1.flush();
		os1.close();
	}

}