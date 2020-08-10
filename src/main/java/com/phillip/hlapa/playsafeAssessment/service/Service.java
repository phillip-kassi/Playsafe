package com.phillip.hlapa.playsafeAssessment.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.phillip.hlapa.playsafeAssessment.business.Business;
import com.phillip.hlapa.playsafeAssessment.constants.Constans;

@RestController
public class Service {

	private Business business = null;
	
	public Service() {
		//initialize business object
		business = new Business();
	}
	
	//REST Services
	//http://localhost:8088/conversions/ktoc?kelvin=6
	@GetMapping("/conversions/ktoc")
	public String toCelsius(@RequestParam String kelvin) {
		String result =  business.kelvinToCelsius(Double.parseDouble(kelvin.trim())) + "";
		return toHtml(result, Constans.KELVIN_TO_CELSIUS_ENDPOINT);
	}
	//http://localhost:8088/conversions/ctok?celsius=6
	@GetMapping("/conversions/ctok") 
	public String toKelvin(@RequestParam String celsius) {
		String result = business.celsiusToKelvin(Double.parseDouble(celsius.trim())) + "";
		return toHtml(result, Constans.CELSIUS_TO_KELVIN_ENDPOINT);
	}
	//http://localhost:8088/conversions/mtok?miles=6
	@GetMapping("/conversions/mtok") 
	public String toKilometres(@RequestParam String miles) {
		String result = business.milesToKilometres(Double.parseDouble(miles.trim())) + "";
		return toHtml(result, Constans.MILES_TO_KILOMETRES_ENDPOINT);
	}
	//http://localhost:8088/conversions/ktom?kilometres=6
	@GetMapping("/conversions/ktom") 
	public String toMiles(@RequestParam String kilometres) {
		String result = business.kilometresToMiles(Double.parseDouble(kilometres.trim())) + "";
		return toHtml(result, Constans.KILOMETRES_TO_MILES_ENDPOINT);
	}
	
	//Helper method
	private String toHtml(String result, String endpoint) {
		StringBuffer sb = new StringBuffer();
		sb.append("<h3>");
		switch (endpoint) {
		case Constans.KELVIN_TO_CELSIUS_ENDPOINT:
			sb.append("Kelvin to Celsius: " + result);
			break;
		case Constans.CELSIUS_TO_KELVIN_ENDPOINT:
			sb.append("Celsius to Kelvin: " + result);
			break;
		case Constans.MILES_TO_KILOMETRES_ENDPOINT:
			sb.append("Miles to Kilometres: " + result);
			break;
		case Constans.KILOMETRES_TO_MILES_ENDPOINT:
			sb.append("Kilometres to Miles: " + result);
			break;
		default:
			break;
		}
		sb.append("</h3>");
		return sb.toString();
	}
}
