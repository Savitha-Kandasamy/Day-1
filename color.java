package com.example.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class color {
	@RestController
	public class ColorController {
		
		@RequestMapping(value="/MyFav/{color}",method=RequestMethod.GET)
		public String getMyFav(@PathVariable String color)
		{
			return "My favorite color is "+color;
		}
	}
}
