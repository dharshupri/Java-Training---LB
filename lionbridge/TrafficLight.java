package com.lionbridge;

public enum TrafficLight {
	RED(34.93),
	GREEN(59),
	YELLOW(23.74);
	
	double durations;
	TrafficLight(double durations){
		this.durations=durations;
	}
	
	
	

}
