package pl.tomek.calculator.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pl.tomek.calculator.controller.CalcBusiness;
import pl.tomek.calculator.controller.CalcController;

import java.util.ArrayList;
import java.util.List;

@RestController
class CalcApiImpl implements CalcApi{

    private final CalcController calcController;

    @Autowired
    public CalcApiImpl(CalcController calcController) {
        this.calcController = calcController;
    }

    @Override
    public CalcOutputDTO getParameters(CalcInputDTO parameters) {
        List<Long> numbers = new ArrayList<>();
        numbers.addAll(parameters.getNumbers());

        String operatorString = parameters.getOperator();
        Operator operator = Operator.fromValue(operatorString);

        CalcBusiness calcBusiness = new CalcBusiness(parameters.getOperator(),parameters.getNumbers());
        Long result = calcController.addition(calcBusiness);

        CalcOutputDTO output = new CalcOutputDTO(1L, operator, numbers, result);
        return output;
    }

}
