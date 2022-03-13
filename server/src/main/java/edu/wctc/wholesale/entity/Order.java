package edu.wctc.wholesale.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@Entity
@Table(name="wholesale_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id")
    private int id;

    @Column(name="purchase_order_num")
    private String purchaseOrderNumber;

    private String terms;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name="purchase_date")
    private Timestamp purchaseDate;

    @Column(name="shipped_date")
    private Timestamp shippedDate;

}
