package com.cocus.microservices.bo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Haytham DAHRI
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerBO extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 9051967441614775767L;

    @Column(name = "first_name", length = 255)
    private String firstName;

    @Column(name = "last_name", length = 255)
    private String lastName;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<CaseBO> customerCases;

    public void addCase(CaseBO customerCase) {
        if( customerCases == null ) {
            this.customerCases = new HashSet<>();
        }
        this.customerCases.add(customerCase);
    }

}
