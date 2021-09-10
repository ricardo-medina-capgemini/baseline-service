package com.tis.mx.application.dto;

public class InitialInvestmentDto {

	double initialInvestment = 5000;
	double yearlyInput = 3000;
	Integer yearlyInputIncrement = 0;
	float investmentYield = 0.21f;
	Integer investmentYears = 5;
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
	public Integer getYearlyInputIncrement() {
		return yearlyInputIncrement;
	}
	public void setYearlyInputIncrement(Integer yearlyInputIncrement) {
		this.yearlyInputIncrement = yearlyInputIncrement;
	}
	public float getInvestmentYield() {
		return investmentYield;
	}
	public void setInvestmentYield(float investmentYield) {
		this.investmentYield = investmentYield;
	}
	public Integer getInvestmentYears() {
		return investmentYears;
	}
	public void setInvestmentYears(Integer investmentYears) {
		this.investmentYears = investmentYears;
	}
	
	
}
