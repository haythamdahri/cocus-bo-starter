package com.cocus.microservices.bo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * @author Haytham DAHRI
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "reports")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReportBO extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = -2915015204749989229L;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerBO customer;

    @ManyToOne
    @JoinColumn(name = "case_id")
    private CaseBO customerCase;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "reports_labels", joinColumns = @JoinColumn(name = "report_id"),
            inverseJoinColumns = @JoinColumn(name = "label_id"))
    private Set<LabelBO> labels;

}
