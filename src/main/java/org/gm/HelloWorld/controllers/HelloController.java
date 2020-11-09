package org.gm.HelloWorld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
@ResponseBody	
@RequestMapping("hellowor1")
public String helloFaction() {
	return"hello,one";
}
}
