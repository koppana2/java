package com.ex;
import java.util.Scanner;

public class EMI {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the loan amount: ");
			double loanAmount = scanner.nextDouble();

			System.out.print("Enter the loan period in months: ");
			int loanPeriod = scanner.nextInt();

			System.out.print("Enter the annual interest rate (in percentage): ");
			double interestRate = scanner.nextDouble();

			// Convert annual interest rate to monthly interest rate
			double monthlyInterestRate = interestRate / 12 / 100;

			// Calculate EMI
			double emi = calculateEMI(loanAmount, loanPeriod, monthlyInterestRate);

			System.out.println("The EMI is: " + emi);
		}
    }

    public static double calculateEMI(double loanAmount, int loanPeriod, double monthlyInterestRate) {
        // Calculate EMI using the formula: EMI = P * r * (1 + r)^n / ((1 + r)^n - 1)
        double power = Math.pow(1 + monthlyInterestRate, loanPeriod);
        double emi = loanAmount * monthlyInterestRate * power / (power - 1);
        return emi;
    }
}

