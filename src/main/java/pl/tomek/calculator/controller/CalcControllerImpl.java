package pl.tomek.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.tomek.calculator.database.Database;

import java.util.ArrayList;
import java.util.List;

@Component
class CalcControllerImpl implements CalcController {

    private final Database database;

    @Autowired
    CalcControllerImpl(Database database) {
        this.database = database;
    }

    @Override
    public Long addition(CalcBusiness calcBusiness) {
        List<Long> numbers = new ArrayList<>();
        numbers.addAll(calcBusiness.getNumbers());
        Long result = 0L;
        for (Long number : numbers) {
            result += number;
        }

        return result;
    }


}
