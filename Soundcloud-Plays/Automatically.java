import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.*;


public class Automatically { //Start

	/*
	 * With Timer 
	 * 
	 */
	 
	public static String Sound = "https://soundcloud.com/hacked34354tf/test477"; //Sound link
	private static Timer timer = new Timer();
	
	public static void main(String[] args) throws IOException, URISyntaxException {
		
		timer.schedule( new TimerTask() {
			public void run() {
				RunWithTimer();
			}
		 }, 0, (123*4)*1000);
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
	
	public static void RunWithTimer() {
		try {
			Start();
			Thread(120);
			Runtime.getRuntime().exec("Taskkill   /f   /im msedge.exe");
			Thread(3);

			Start();
			Thread(120);
			Runtime.getRuntime().exec("Taskkill   /f   /im msedge.exe");
			Thread(3);

			Start();
			Thread(120);
			Runtime.getRuntime().exec("Taskkill   /f   /im msedge.exe");
			Thread(3);

			Start();
			Thread(120);
			Runtime.getRuntime().exec("Taskkill   /f   /im msedge.exe");
			Thread(3);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
	}
	
} //End
