package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImpl;


@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(name = "count", required = false) Integer count, ModelMap model) {
        CarServiceImpl carService = new CarServiceImpl();
        if (count == null) {
            model.addAttribute("cars", carService.getCars());
        } else {
            model.addAttribute("cars", carService.getCars(count));
        }
        return "cars";
    }

}
