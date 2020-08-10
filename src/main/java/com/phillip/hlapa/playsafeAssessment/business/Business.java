package com.phillip.hlapa.playsafeAssessment.business;

import com.phillip.hlapa.playsafeAssessment.constants.Constans;

public class Business {

	//conversions/ktoc
	public double kelvinToCelsius(double kelvin) {
		return  kelvin - Constans.KELVINE_CONSTANT;
	}
	public double celsiusToKelvin(double celsius) {
		return  celsius + Constans.KELVINE_CONSTANT;
	}
}
