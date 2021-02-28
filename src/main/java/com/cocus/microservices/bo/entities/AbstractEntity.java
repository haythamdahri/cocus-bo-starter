package com.cocus.microservices.bo.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author Haytham DAHRI
 */
@Data
@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, updatable = false)
    private Long id;

    @Version
    private Timestamp timestamp;

}
