package com.ibtec.vsctestsv.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "muscles")
@AllArgsConstructor
@NoArgsConstructor
public class Muscle {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "muscles_id_generator")
    @SequenceGenerator(name = "muscles_id_generator", sequenceName = "muscles_id_seq", allocationSize = 1, initialValue = 1)
    @Column(name = "id")
    private int id;

    @Column(name = "name" , length = 100)
    private String muscleName;
}
