import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.Timer;
import java.util.TimerTask;


public class Main { //Start

	public static String Video = "https://www.youtube.com/watch?v=zbBpNaGum3c"; //Video link
	private static Timer timer = new Timer();
	
	public static void main(String[] args) throws IOException, URISyntaxException {
		
		timer.schedule( new TimerTask() {
			public void run() {
				RunWithTimer();
			}
		 }, 0, (35*5)*1000);
	}
	
	
	public static void Start() throws IOException, URISyntaxException {
		Desktop d = Desktop.getDesktop();
		d.browse(new URI(Video));
	}
	
	public static void Thread(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (Exception e) {
			
		}
	}	
	
	public static void RunWithTimer() {
		try {
			//1
			Start();
			Thread(32);
			Runtime.getRuntime().exec("Taskkill   /f   /im msedge.exe");
			Thread(3);
			//2
			Start();
			Thread(32);
			Runtime.getRuntime().exec("Taskkill   /f   /im msedge.exe");
			Thread(3);
			//3
			Start();
			Thread(32);
			Runtime.getRuntime().exec("Taskkill   /f   /im msedge.exe");
			Thread(3);
			//4
			Start();
			Thread(32);
			Runtime.getRuntime().exec("Taskkill   /f   /im msedge.exe");
			Thread(3);
			//5
			Start();
			Thread(32);
			Runtime.getRuntime().exec("Taskkill   /f   /im msedge.exe");
			Thread(3);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
	}
	
} //End
