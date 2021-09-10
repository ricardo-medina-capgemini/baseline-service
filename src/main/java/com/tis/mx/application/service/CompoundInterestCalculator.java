package com.tis.mx.application.service;

import java.util.ArrayList;

import com.tis.mx.application.dto.InitialInvestmentDto;
import com.tis.mx.application.dto.InvestmentYieldDto;

public interface CompoundInterestCalculator {
	
	public ArrayList<InvestmentYieldDto> createRevenueGrid(InitialInvestmentDto initialInvestment);

	public boolean validateInput(InitialInvestmentDto initialInvestment) ;
}
