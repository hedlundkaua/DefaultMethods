package service;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService {
    private double interestRate;

    public BrazilInterestService() {
    }

    public BrazilInterestService(double interes) {
        this.interestRate = interes;
    }
    @Override
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

}
