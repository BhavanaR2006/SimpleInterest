package com.example;

public class App {

public double calculateSimpleInterest(double principal,
                                      double rate,
                                      double time) {
    return (principal * rate * time) / 100;
}

public static void main(String[] args) {
    App obj = new App();

    double principal = 10000;
    double rate = 5;
    double time = 2;

    double interest =
            obj.calculateSimpleInterest(principal, rate, time);

    System.out.println("Principal: " + principal);
    System.out.println("Rate: " + rate + "%");
    System.out.println("Time: " + time + " years");
    System.out.println("Simple Interest: " + interest);
}

}