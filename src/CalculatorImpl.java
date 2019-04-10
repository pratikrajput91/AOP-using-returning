package com.capgemini.spring.math.impl;
import com.capgemini.spring.math.*;
import org.springframework.stereotype.Component;


@Component
public class CalculatorImpl implements Calculator {
	 public int add(int num1, int num2){
	 	return (num1+num2);
	}
	//public void divide(double num1, double num2){
		//System.out.println(num1/num2);
	//}	
}