package org.example.database.entity;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "orderdetails")

public class OrderDetail {
    @Id // this is telling hibernate this column is the PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // this telling hibernate that the PK is auto increment
    @Column(name = "id")
    private Integer id;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "quantity_ordered")
    private Integer quantityOrdered;

    @Column(name = "price_each")
    private Double priceEach;

    @Column(name = "order_line_number")
    private Integer orderLineNumber;



}