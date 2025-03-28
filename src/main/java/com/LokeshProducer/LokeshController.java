package com.LokeshProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class LokeshController {
	@Autowired
	LokeshProducer lp;
	
	@GetMapping("/send/{word}")
	public String sendThis(@PathVariable String word) {
		lp.sendMessage(word);
		return word +"msg sent";
	}

}
