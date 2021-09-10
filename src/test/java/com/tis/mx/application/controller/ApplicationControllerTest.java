package com.tis.mx.application.controller;

import static org.junit.Assert.assertEquals;

import com.tis.mx.application.dto.InitialInvestmentDto;
import com.tis.mx.application.dto.InvestmentYieldDto;
import com.tis.mx.application.service.CompoundInterestCalculator;
import com.tis.mx.application.service.impl.CompoundInterestCalculatorImpl;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
s

public class ApplicationControllerTest {
	private ApplicationController controller;
	private InitialInvestmentDto initialInvestment;
	private CompoundInterestCalculator calculator;
	
	@Before
	public void createValuesBeforeToTest() {
		//Crear una calculadora
		this.calculator = new CompoundInterestCalculatorImpl();
		
		//Crear los valores iniciales de la inversion
		this.initialInvestment = new InitialInvestmentDto();
		
		this.initialInvestment.setInitialInvestment(Double.valueOf(5000.00));
		this.initialInvestment.setInvestmentYears(5);
		this.initialInvestment.setYearlyInput(Double.valueOf(3000.00));
		this.initialInvestment.setYearlyInputIncrement(Integer.valueOf(1));
		this.initialInvestment.setInvestmentYield(Float.valueOf(0.21f));
	}
	@Test
	public void shouldGenerateTableYield() {
		List<InvestmentYieldDto> tableYield = 
				controller.createTableYield(initialInvestment);
		
		assertEqual(5, tableYield.size());
	}
}
