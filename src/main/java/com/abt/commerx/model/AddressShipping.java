package com.abt.commerx.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "address_shipping")
//TODO: A améliorer car le même objet que AddressShipping
public class AddressShipping implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(columnDefinition = "country", nullable = false)
    private String country;

    @Column(columnDefinition = "city", nullable = false)
    private String city;

    @Column(columnDefinition = "postal_code", nullable = false)
    private String postalCode;

    @Column(columnDefinition = "street_name", nullable = false)
    private String streetName;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false)
    private Order order;
}
