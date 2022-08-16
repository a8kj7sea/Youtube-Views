import java.awt.*;
import java.io.*;
import java.net.*;


public class Manually { //Start

	/*
	 * Simple Run without timer task
	 */
	
	
	public static String Sound = "https://soundcloud.com/hacked34354tf/test477"; //Sound link	
	
	public static void main(String[] args) throws IOException, URISyntaxException {
		Start();
		Thread(123);
		Start();
		Thread(123);
		Start();
		Thread(123);
		Start();
		Thread(123);
	}
	
	
	public static void Start() throws IOException, URISyntaxException {
		Desktop d = Desktop.getDesktop();
		d.browse(new URI(Sound));
	}
	
	public static void Thread(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (Exception e) {
			
		}
	}


	
} //End
