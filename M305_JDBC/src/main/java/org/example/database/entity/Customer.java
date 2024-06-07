package org.example.database.entity;
import jakarta.persistence.*;
import lombok.*;


import java.math.BigDecimal;
import java.text.DecimalFormat;
@ToString
@Setter
@Getter
@Entity
@Table(name = "customers")
@AllArgsConstructor
@NoArgsConstructor

public class Customer {

    @Id // this is telling hibernate this column is the PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // this telling hibernate that the PK is auto increment
    @Column(name = "id")
    private Integer id;

      @ToString.Exclude

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "sales_rep_employee_id", nullable = true)
    private Employee employee;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "contact_lastname")
    private String contactLastName;

    @Column(name = "contact_firstname")
    private String contactFirstName;

    @Column(name = "phone", columnDefinition = "VARCHAR")
    private String phone;

    @Column(name = "address_line1")
    private String addressLine1;

    @Column(name = "address_line2")
    private String  addressLine2;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "postal_code", columnDefinition = "VARCHAR")
    private String postalCode;

    @Column(name = "country")
    private String country;

    @Column(name = "sales_rep_employee_id", insertable = false,updatable = false)
    private Integer salesRepEmployeeId;

    @Column(name = "credit_limit", columnDefinition = "DECIMAL")
    private Double creditLimit;



}