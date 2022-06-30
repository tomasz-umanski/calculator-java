package pl.tomek.calculator.controller;

import java.util.List;

public class CalcBusiness {

    private String operator;
    private List<Long> numbers;

    public CalcBusiness(String operator, List<Long> numbers) {
        this.operator = operator;
        this.numbers = numbers;
    }

    public String getOperator() {
        return operator;
    }

    public List<Long> getNumbers() {
        return numbers;
    }
}
