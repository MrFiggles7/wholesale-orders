package edu.wctc.wholesale.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
public class OrderDTO {

    public OrderDTO(String customerName, Timestamp purchaseDate, String purchaseOrderNumber, String productName, String terms, Timestamp shippedDate, double productCost){
        this.customerName = customerName;
        this.purchaseDate = purchaseDate;
        this.purchaseOrderNumber = purchaseOrderNumber;
        this.productName = productName;
        this.terms = terms;
        this.shippedDate = shippedDate;
        this.productCost = productCost;

    }
    private String customerName;
    private Timestamp purchaseDate;
    private String purchaseOrderNumber;
    private String productName;
    private String terms;
    private Timestamp shippedDate;
    private double productCost;

}
