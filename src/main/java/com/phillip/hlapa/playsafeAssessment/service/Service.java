package com.phillip.hlapa.playsafeAssessment.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.phillip.hlapa.playsafeAssessment.business.Business;
import com.phillip.hlapa.playsafeAssessment.constants.Constans;

@RestController
public class Service {

	private Business business = null;
	private static final Logger LOGGER = LoggerFactory.getLogger(Service.class);
	
	public Service() {
		business = new Business();
	}

	//REST Services
	//http://localhost:8088/conversions/ktoc?kelvin=6
	@GetMapping("/conversions/ktoc")
	public String toCelsius(@RequestParam String kelvin) {
		LOGGER.info("start of method: toCelsius. Convert kelvin to celsius. INPUT: " + kelvin);
		String result =  business.kelvinToCelsius(Double.parseDouble(kelvin.trim())) + "";
		LOGGER.info("end of method: toCelsius. Convert kelvin to celsius. OUTPUT: " + result);
		return toHtml(result, Constans.KELVIN_TO_CELSIUS_ENDPOINT);
		
	}
	//http://localhost:8088/conversions/ctok?celsius=6
	@GetMapping("/conversions/ctok") 
	public String toKelvin(@RequestParam String celsius) {
		LOGGER.info("start of method: toKelvin. Convert celsius to kelvin. INPUT: " + celsius);
		String result = business.celsiusToKelvin(Double.parseDouble(celsius.trim())) + "";
		LOGGER.info("end of method: toKelvin. Convert celsius to kelvin. OUTPUT: " + result);
		return toHtml(result, Constans.CELSIUS_TO_KELVIN_ENDPOINT);
	}
	//http://localhost:8088/conversions/mtok?miles=6
	@GetMapping("/conversions/mtok") 
	public String toKilometres(@RequestParam String miles) {
		LOGGER.info("start of method: toKilometres. Convert Miles to Kilometres. INPUT: " + miles);
		String result = business.milesToKilometres(Double.parseDouble(miles.trim())) + "";
		LOGGER.info("end of method: toKilometres. Convert Miles to Kilometres. OUTPUT: " + result);
		return toHtml(result, Constans.MILES_TO_KILOMETRES_ENDPOINT);
	}
	//http://localhost:8088/conversions/ktom?kilometres=6
	@GetMapping("/conversions/ktom") 
	public String toMiles(@RequestParam String kilometres) {
		LOGGER.info("start of method: toKilometres. Convert Miles to Kilometres. INPUT: " + kilometres);
		String result = business.kilometresToMiles(Double.parseDouble(kilometres.trim())) + "";
		LOGGER.info("end of method: toKilometres. Convert Miles to Kilometres. OUTPUT: " + result);
		return toHtml(result, Constans.KILOMETRES_TO_MILES_ENDPOINT);
	}

	//Helper method
	private String toHtml(String result, String endpoint) {
		LOGGER.info("start of method: toHTML...");
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
		LOGGER.warn("end of method: toHTML. ENDPOINT: /conversions/" +endpoint+ ". OUTPUT: " + sb.toString());
		return sb.toString();
	}
}
