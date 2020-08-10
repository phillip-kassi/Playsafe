package com.phillip.hlapa.playsafeAssessment.business;

import com.phillip.hlapa.playsafeAssessment.constants.Constans;

public class Business {

	//convert Kelvin to Celsius
	public double kelvinToCelsius(double kelvin) {
		return  kelvin - Constans.KELVIN_CONSTANT;
	}
	
	//convert Celsius to Kelvin
	public double celsiusToKelvin(double celsius) {
		return  celsius + Constans.KELVIN_CONSTANT;
	}
	
	//Convert Miles to Kilometres
	public double milesToKilometres(double miles) {
		return miles * Constans.MILES_TO_KILOMETRES_CONSTANT;
	}
	
	//Convert Kilometres to Miles
	public double kilometresToMiles(double kilometers) {
		return kilometers * Constans.KILOMETRES_TO_MILES_CONSTANT;
	}
}
