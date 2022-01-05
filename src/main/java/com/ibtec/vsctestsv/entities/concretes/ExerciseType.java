package com.ibtec.vsctestsv.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "exercise_types")
@AllArgsConstructor
@NoArgsConstructor
public class ExerciseType {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "exercise_types_id_generator")
    @SequenceGenerator(name = "exercise_types_id_generator", sequenceName = "exercises_types_id_seq", allocationSize = 1, initialValue = 1)
    @Column(name = "id")
    private int id;

    @Column(name = "name" , length = 100)
    private String exerciseTypeName;
}
