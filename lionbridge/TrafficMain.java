package com.lionbridge;

public class TrafficMain {
	
public static void main(String[] args) {
	TrafficLight trafficlight[] = TrafficLight.values();
	
	for(int i= 0;i<trafficlight.length;i++ ){
	System.out.println(trafficlight[i].name());
	System.out.println(trafficlight[i].durations);
	}
	
}
}
