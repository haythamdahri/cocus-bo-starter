package com.cocus.microservices.bo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author Haytham DAHRI
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "labels")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LabelBO extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 6829932496569416640L;

    @Column(name = "description", length = 850)
    private String description;

}
