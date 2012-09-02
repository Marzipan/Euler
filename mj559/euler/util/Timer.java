package mj559.euler.util;

public class Timer {
	
	private static long startTime = -1;
	private static long prevTime = -1;
	private static boolean running = false;
	
	// Starts the timer
	public static void start(){
		if (!running){
			running = true;
			startTime = System.currentTimeMillis();
		}
	}
	
	// Stops the timer and returns the total elapsed time.
	public static long stop(){
		if (running){
			long stopTime = System.currentTimeMillis();
			prevTime = stopTime - startTime;
			return prevTime;
		}
		return -1;
	}
	
	// Returns the elapsed time without stopping the timer.
	public static long getCurrentTime(){
		
		if (!running){
			return -1;
		}
		
		long stopTime = System.currentTimeMillis();
		prevTime = stopTime - startTime;
		return prevTime;
	}
	
	// Returns the previous reading
	public static long getPrevTime(){
		return prevTime;
	}
}
