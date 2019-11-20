package io.turntabl.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @RequestMapping("/add")
    public Number addOperation(
            @RequestParam(value = "value1", defaultValue = "0") String value,
            @RequestParam(value = "value2", defaultValue = "0") String value2
    ) {
        Integer num1 = Integer.parseInt(value);
        Integer nun2 = Integer.parseInt(value2);

        return new Number(num1 + num1);
    }

    @RequestMapping("/subtract")
    public Number subtractOperation(
            @RequestParam(value = "value1", defaultValue = "0") String value1,
            @RequestParam(value = "value2", defaultValue = "0") String value2
    ) {
        Integer num1 = Integer.parseInt(value1);
        Integer num2 = Integer.parseInt(value2);

        return new Number(num1 - num2);
    }
}
