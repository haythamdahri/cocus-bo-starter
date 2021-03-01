package com.cocus.microservices.bo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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

    @Column(name = "description", length = 850, unique = true)
    private String description;

    @ManyToMany(mappedBy = "labels")
    private List<ReportBO> reports;

}
