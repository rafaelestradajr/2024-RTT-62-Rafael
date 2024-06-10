package org.example.database.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.query.Page;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "customer_id", nullable = true)
    private Customer customer;

    @ToString.Exclude
    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetails;


    @Column(name = "customer_id", insertable = false, updatable = false)
    private Integer customerId;

    @Column(name = "order_date", columnDefinition = "DATE")
    @Temporal(TemporalType.DATE)
    private Date orderDate;

    @Column(name = "required_date",columnDefinition = "DATE")
    @Temporal(TemporalType.DATE)
    private Date requiredDate;

    @Column(name = "status")
    private String status;

    @Column(name = "comments",columnDefinition = "Text")
    private String comment;

    @Column(name = "shipped_date", columnDefinition = "DATE")
    @Temporal(TemporalType.DATE)
    private Date shippedDate;



}