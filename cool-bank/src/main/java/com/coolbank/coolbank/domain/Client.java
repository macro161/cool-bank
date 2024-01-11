package com.coolbank.coolbank.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;

@Entity
@Table(name = "CLIENT")
@Setter
@Getter
public class Client {

    @Id
    @GeneratedValue(generator = "Incremental")
    @GenericGenerator(
            name = "Incremental",
            strategy = "org.hibernate.id.IncrementGenerator"
    )
    @Column(name = "ID", nullable = false, unique = true, length = 20)
    Long id;

    @Column(name = "NAME", nullable = false)
    String name;

    @Column(name = "SURNAME", nullable = false)
    String surname;

    @Column(name = "MONEY")
    BigDecimal money;

}
