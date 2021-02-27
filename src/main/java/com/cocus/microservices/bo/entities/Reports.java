package com.cocus.microservices.bo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author Haytham DAHRI
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "reports")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reports extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = -2915015204749989229L;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerBO customer;

    @ManyToOne
    @JoinColumn(name = "case_id")
    private CaseBO customerCase;

    @ManyToOne
    @JoinColumn(name = "label_id")
    private LabelBO label;

}
