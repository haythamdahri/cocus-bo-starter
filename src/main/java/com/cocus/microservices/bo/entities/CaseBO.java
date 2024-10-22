package com.cocus.microservices.bo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * @author Haytham DAHRI
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "cases")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CaseBO extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = -6372446017104204679L;

    @Column(name = "content", columnDefinition = "TEXT")
    private String content;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "customer_id")
    private CustomerBO customer;

    @ManyToMany
    @JoinTable(name = "cases_labels", joinColumns = @JoinColumn(name = "case_id"),
            inverseJoinColumns = @JoinColumn(name = "label_id"))
    private Set<LabelBO> conditions;

    private boolean reviewed;

    private LocalDateTime lastReviewDate;

}
