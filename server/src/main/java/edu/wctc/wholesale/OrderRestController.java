package edu.wctc.wholesale;

import edu.wctc.wholesale.entity.Order;
import edu.wctc.wholesale.entity.OrderDTO;
import edu.wctc.wholesale.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = {"http://localhost:63342", "http://localhost:63343"})
@RequestMapping("/api/orders")
public class OrderRestController {

    private OrderService service;

    @Autowired
    public OrderRestController(OrderService ord){
        this.service = ord;
    }


    @GetMapping
    public List<OrderDTO> getAllOrders(){
        List<Order> list = service.getOrders();
        List<OrderDTO> dtoList = new ArrayList<>();
        list.forEach((item)->{
            dtoList.add(new OrderDTO(
                    item.getCustomer().getName(),
                    item.getPurchaseDate(),
                    item.getPurchaseOrderNumber(),
                    item.getProduct().getName(),
                    item.getTerms(),
                    item.getShippedDate(),
                    item.getProduct().getCost()
            ));
        });
        return dtoList;
    }

}
