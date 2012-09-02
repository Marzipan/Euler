package mj559.euler.util;

public class Timer {
	
	private long startTime = -1;
	private long prevTime = -1;
	private boolean running = false;
	
	// Starts the timer
	public void start(){
		if (!running){
			running = true;
			startTime = System.currentTimeMillis();
		}
	}
	
	// Stops the timer and returns the total elapsed time.
	public long stop(){
		if (running){
			long stopTime = System.currentTimeMillis();
			prevTime = stopTime - startTime;
			return prevTime;
		}
		return -1;
	}
	
	// Returns the elapsed time without stopping the timer.
	public long getCurrentTime(){
		
		if (!running){
			return -1;
		}
		
		long stopTime = System.currentTimeMillis();
		prevTime = stopTime - startTime;
		return prevTime;
	}
	
	// Returns the previous reading
	public long getPrevTime(){
		return prevTime;
	}
}
