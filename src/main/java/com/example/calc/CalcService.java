package com.example.calc;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

    private final CalcRepository calcRepository;

    public CalcService(CalcRepository calcRepository) {
        this.calcRepository = calcRepository;
    }

    public Integer sum(Integer x, Integer y) {
        int result = x + y;
        saveCalculation("sum", x, y, result);
        return result;
    }

    public Integer multiply(Integer x, Integer y) {
        int result = x * y;
        saveCalculation("mult", x, y, result);
        return result;
    }

    private void saveCalculation(String type, Integer x, Integer y, Integer result) {
        Calculation calc = new Calculation(type, x, y, result);
        calcRepository.save(calc);
    }

}

