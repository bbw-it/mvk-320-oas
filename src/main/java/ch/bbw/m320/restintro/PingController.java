package ch.bbw.m320.restintro;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class PingController {

	@GetMapping(value = "/ping", produces = MediaType.TEXT_PLAIN_VALUE)
	public String ping() {
		return "pong";
	}
}
