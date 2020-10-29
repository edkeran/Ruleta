package com.ruleta.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController(value = "/Rest/EndPont")
public class EndpointsRuleta {
	@GetMapping("/createRoulette")
	public void createRoulette() {
		
	}
	@GetMapping("/startRoulette")
	public void startRoulette() {
		
	}
	@GetMapping("/addBetRoulette")
	public void addBetRoulette() {
		
	}
	@GetMapping("/closeRoulette")
	public void closeRoulette() {
		
	}
	@GetMapping("/listAllRoulettes")
	public void listAllRoulettes() {
		
	}
}
