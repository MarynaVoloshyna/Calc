package com.example.calc;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/calc")

public class Controller {

    private final CalcService service;
    public Controller(CalcService service) {
        this.service = service;
    }
   @GetMapping
   public ResponseEntity<Map <String, Integer>> calculate(@RequestParam String type,
                                                          @RequestParam Integer x, @RequestParam Integer y)
                                                            throws Exception {
    Integer result = 0;
        if (type.equals("sum")) {
            result = service.sum(x, y);
        } else if (type.equals("mult")) {
            result = service.multiply(x, y);
        } else {
            return ResponseEntity.badRequest().body(null);
        }
        Map<String, Integer> resultMap = new HashMap<>();
        resultMap.put("result", result);
        return ResponseEntity.ok(resultMap);

    }
}
