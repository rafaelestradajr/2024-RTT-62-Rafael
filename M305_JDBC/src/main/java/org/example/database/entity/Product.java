package org.example.database.entity;
import jakarta.persistence.*;
import lombok.*;


import java.text.DecimalFormat;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "products")

public class Product {
    @Id // this is telling hibernate this column is the PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // this telling hibernate that the PK is auto increment

    @Column(name = "id")
    private Integer id;

    @Column(name = "product_code", columnDefinition = "VARCHAR")
    private String productCode;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "productline_id")
    private Integer productLineId;

    @Column(name = "product_scale", columnDefinition = "VARCHAR")
    private String productScale;

    @Column(name = "product_vendor")
    private String productVendor;

    @Column(name = "product_description", length  = 65535,columnDefinition = "Text")
    private String productDescription;

    @Column(name = "quantity_in_stock", columnDefinition = "SMALLINT")
    private  Integer quantityInStock;

    @Column(name = "buy_price", columnDefinition = "DECIMAL")
    private Double buyPrice;

    @Column(name = "msrp", columnDefinition = "DECIMAL")
    private  Double msrp;


}
