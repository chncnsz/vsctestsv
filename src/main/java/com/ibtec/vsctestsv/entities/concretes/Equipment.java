package com.ibtec.vsctestsv.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "equipments")
@AllArgsConstructor
@NoArgsConstructor
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "equipments_id_generator")
    @SequenceGenerator(name = "equipments_id_generator", sequenceName = "equipments_id_seq", allocationSize = 1, initialValue = 1)
    @Column(name = "id")
    private int id;

    @Column(name = "name" , length = 100)
    private String equipmentName;
}
