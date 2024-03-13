package controllers;

import org.springframework.web.bind.annotation.*;
import services.DetermineService;

/**
 * Контроллер для обработки запроса GET по расчету отпусных
 */
@RestController
@RequestMapping("api/")
public class CalcController {
    private final DetermineService _determineService;
    public CalcController(DetermineService determineService){
        _determineService = determineService;
    }
    @GetMapping("calculate")
    @ResponseBody
    private String calculate(
            @RequestParam(name = "avgSalary") String avgSalary,
            @RequestParam(name = "vacationDays") String vacDays
    ){
        return String.valueOf(
                _determineService.determine(
                        Double.parseDouble(avgSalary),
                        Integer.parseInt(vacDays)));

    }
}
