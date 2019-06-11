package com.dockerkubernetes.sample.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/v1/api")
public class SampleController {
	
	
	
	@RequestMapping(value = "/sample", method = RequestMethod.GET)
 	private String sampleMethod() {
 		
 		return "Hello ! Crazy Kubernetes Sample is Working !...";
 	}
	
 

}
