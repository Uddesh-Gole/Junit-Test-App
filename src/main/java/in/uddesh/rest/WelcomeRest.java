package in.uddesh.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.uddesh.service.WelcomeService;

@RestController
public class WelcomeRest {
	
	@Autowired
	private WelcomeService  ser;
	
	@GetMapping("/welcome")
	public String getwelcome() {
		
	  String getmsg = ser.getmsg();
	  
	  return getmsg;
		
	}

}
