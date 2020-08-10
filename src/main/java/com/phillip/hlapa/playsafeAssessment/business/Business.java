package com.phillip.hlapa.playsafeAssessment.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.phillip.hlapa.playsafeAssessment.constants.Constans;

public class Business {

	private Logger logger = LoggerFactory.getLogger(Business.class);

	public Business() {
		logger.info("initializing Business method to perform operations");
	}

	//convert Kelvin to Celsius
	public double kelvinToCelsius(double kelvin) {
		logger.info("execution of method: KelvineToCelsius in Business");
		return  kelvin - Constans.KELVIN_CONSTANT;
	}
	
	//convert Celsius to Kelvin
	public double celsiusToKelvin(double celsius) {
		logger.info("execution of method: CelsiusToKelvin in Business");
		return  celsius + Constans.KELVIN_CONSTANT;
	}
	
	//Convert Miles to Kilometres
	public double milesToKilometres(double miles) {
		logger.info("execution of method: MilesToKilometres in Business");
		return miles * Constans.MILES_TO_KILOMETRES_CONSTANT;
	}
	
	//Convert Kilometres to Miles
	public double kilometresToMiles(double kilometers) {
		logger.info("execution of method: KilometresToMiles in Business");
		return kilometers * Constans.KILOMETRES_TO_MILES_CONSTANT;
	}
}
