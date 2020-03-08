package com.example.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity(name = "phone")
@Table(name = "phones")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Phone implements Serializable {

    private static final long serialVersionUID = 5924361831551833717L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "phone_name")
    private String name;

    @Column(name = "screen")
    private double screen;

    @Column(name = "camera")
    private int camera;

    @Column(name = "ram")
    private int ram;

    @Column(name = "memory")
    private int memory;

    @Column(name = "sim")
    private int sim;

    @Column(name = "price")
    private BigDecimal price;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "producers_id")
    private Producer producer;
}
