package com.privalia.principal2;

import com.privalia.business2.Calculator;
import com.privalia.business2.ICalculator;



public class Main {

	public static void main(String[] args) {
		ICalculator iCalculator = new Calculator();
		StringBuilder stringBuilder = new StringBuilder ("El resultado de la suma es ");
		System.out.println(stringBuilder.append(iCalculator.sum(3,3)));

	}

}
