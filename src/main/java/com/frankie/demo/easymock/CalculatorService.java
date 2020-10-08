package com.frankie.demo.easymock;

/**
 * @author: Yao Frankie
 * @date: 2020/10/8 11:17
 */
public interface CalculatorService {

    double add(double input1, double input2);

    double subtract(double input1, double input2);

    double multiply(double input1, double input2);

    double divide(double input1, double input2);

    void serviceUsed();
}
