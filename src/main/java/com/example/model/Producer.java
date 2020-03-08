package com.example.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity(name = "producer")
@Table(name = "producers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "phones")
public class Producer implements Serializable {

    private static final long serialVersionUID = 5924361831551833712L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "producer_name")
    private String name;

    @OneToMany(mappedBy = "producer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Phone> phones;
}
