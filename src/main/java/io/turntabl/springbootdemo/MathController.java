package io.turntabl.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    @Autowired
    private Math math;

    @RequestMapping("/add")
    public Number addOperation(
            @RequestParam(value = "value1") String value1,
            @RequestParam(value = "value2") String value2
    ) {
        Integer num1 = Integer.parseInt(value1);
        Integer nun2 = Integer.parseInt(value2);

//        return new Number(num1 + nun2);
        Number number = new Number(3);
        return 
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
