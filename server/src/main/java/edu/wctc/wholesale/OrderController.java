package edu.wctc.wholesale;

import edu.wctc.wholesale.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService ord){
        this.orderService = ord;
    }

    @RequestMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("orderList", orderService.getOrders());

        return "index";
    }
}
