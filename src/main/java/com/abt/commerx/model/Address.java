package com.abt.commerx.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
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
@Embeddable
public class Address implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Column(columnDefinition = "country", nullable = false)
    private String country;

    @Column(columnDefinition = "city", nullable = false)
    private String city;

    @Column(columnDefinition = "postal_code", nullable = false)
    private String postalCode;

    @Column(columnDefinition = "street_name", nullable = false)
    private String streetName;
}
