package com.tis.mx.application.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.tis.mx.application.dto.InitialInvestmentDto;
import com.tis.mx.application.dto.InvestmentYieldDto;
import com.tis.mx.application.service.CompoundInterestCalculator;

public class CompoundInterestCalculatorImpl implements CompoundInterestCalculator {
	
	public ArrayList<InvestmentYieldDto> createRevenueGrid(InitialInvestmentDto initialInvestment) {
		return null;
	}

	public boolean validateInput(InitialInvestmentDto initialInvestment) {
		
		this.setDefaults(initialInvestment);
		boolean cumple = true;
		
		cumple = cumple && (initialInvestment.getInitialInvestment() >= 1000);
		cumple = cumple && (initialInvestment.getYearlyInput() >= 0.0);
		cumple = cumple && (initialInvestment.getYearlyInputIncrement() >= 0.0);
		cumple = cumple && (initialInvestment.getInvestmentYears() > 0.0);
		cumple = cumple && (initialInvestment.getInvestmentYield() > 0.0);
		
		return cumple;
	}
		
	private void setDefaults(InitialInvestmentDto initialInvestment) {
		
		Double yearlyInput = initialInvestment.getYearlyInput();
		yearlyInput = yearlyInput == null ? 0.0: yearlyInput;
		initialInvestment.setYearlyInput(yearlyInput);
		
		Integer yearlyInputIncrement = initialInvestment.getYearlyInputIncrement();
		yearlyInputIncrement = yearlyInputIncrement == null ? 0 : yearlyInputIncrement;
		initialInvestment.setYearlyInputIncrement(yearlyInputIncrement);
	}

}
