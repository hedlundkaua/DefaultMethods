package service;

import java.security.InvalidParameterException;

public interface InterestService {
    double getInterestRate();

    default double payment(double amount, int months){
        double payment = 0.0;
        if (months < 1) {
            throw new InvalidParameterException("Mounts must be greater than zero");
        }
        //Math.pow potenciação(apos a virgula se faz a potenciação)
        return amount * Math.pow(1.0 + getInterestRate() / 100.00, months);
    }
}
