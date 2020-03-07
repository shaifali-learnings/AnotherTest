package com.example.demo.Java8Demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StreamIOSamples {
	
	@RequestMapping("/getList")
	public List<String> getListFromSample(){
		List<String> list1 = Arrays.asList("One","two","three","four");
		List<String> filteredList =list1.stream().filter(t -> t.startsWith("t")).collect(Collectors.toList());
		return filteredList;
	}
	
	@RequestMapping("/getList2")
	public List<String> getListFromSample2(){
		List<String> list1 = Arrays.asList("One","two","three","tfour","Five");
		List<String> filteredList =list1.stream().filter(t -> t.startsWith("t")).collect(Collectors.toList());
		return filteredList;
	}

}
