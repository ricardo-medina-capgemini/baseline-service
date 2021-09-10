package com.tis.mx.application.dto;

public class InvestmentYieldDto {
	private Integer investmentYear = 0;
	private double initialInvestment = 0;
	private double yearlyInput = 0;
	private double investmentYield = 0.21d; 
	private double finalBalance = 0;
	
	public Integer getInvestmentYear() {
		return investmentYear;
	}
	public void setInvestmentYear(Integer investmentYear) {
		this.investmentYear = investmentYear;
	}
	public double getInitialInvestment() {
		return initialInvestment;
	}
	public void setInitialInvestment(double initialInvestment) {
		this.initialInvestment = initialInvestment;
	}
	public double getYearlyInput() {
		return yearlyInput;
	}
	public void setYearlyInput(double yearlyInput) {
		this.yearlyInput = yearlyInput;
	}
	public double getInvestmentYield() {
		return investmentYield;
	}
	public void setInvestmentYield(double investmentYield) {
		this.investmentYield = investmentYield;
	}
	public double getFinalBalance() {
		return finalBalance;
	}
	public void setFinalBalance(double finalBalance) {
		this.finalBalance = finalBalance;
	}
	
	
}
