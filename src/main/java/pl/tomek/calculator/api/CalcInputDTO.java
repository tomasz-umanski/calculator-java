package pl.tomek.calculator.api;

import java.util.List;

class CalcInputDTO {

    private String operator;
    private List<Long> numbers;

    public CalcInputDTO(String operator, List<Long> numbers) {
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
