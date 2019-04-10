package com.capgemini.spring.math.aspect;
import com.capgemini.spring.math.*;
import org.springframework.stereotype.Component;
import org.aspectj.lang.*;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.*;




@Component
@Aspect
public class ValidationAspect {
	@AfterReturning(pointcut="execution(* com.capgemini.spring.math.impl.CalculatorImpl.add(..))",returning="retVal")
	public void printAdd(Object retVal)
	{
		System.out.println(Integer.parseInt(retVal.toString()));
	
	
	}
	//@Before("execution(* com.capgemini.spring.math.impl.CalculatorImpl.divide(..))")
	//public void printDivide() {
		//System.out.println("division aspect done");

	//}
}
	