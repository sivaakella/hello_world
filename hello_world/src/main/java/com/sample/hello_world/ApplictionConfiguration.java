package com.sample.hello_world;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApplictionConfiguration {
@RequestMapping("/hello")
public String hello()
{
	return "Hello World updated!!!";
}
}