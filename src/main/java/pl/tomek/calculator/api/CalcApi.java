package pl.tomek.calculator.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface CalcApi {

    @PostMapping("/calculator")
    CalcOutputDTO getParameters(@RequestBody CalcInputDTO parameters);
}
