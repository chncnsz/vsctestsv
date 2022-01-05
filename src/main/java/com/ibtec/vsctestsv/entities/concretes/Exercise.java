package com.ibtec.vsctestsv.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "exercises")
@AllArgsConstructor
@NoArgsConstructor
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "exercises_id_generator")
    @SequenceGenerator(name = "exercises_id_generator", sequenceName = "exercises_id_seq", allocationSize = 1, initialValue = 1)
    @Column(name = "id")
    private int id;

    @Column(name = "name" , length = 100)
    private String  exerciseName;

    @Column(name = "equipmentId")
    private int equipment_id;

    @Column(name = "level" , length = 50)
    private String level;

    @Column(name = "muscle_id")
    private int muscleId;

    @Column(name = "average")
    private double average;

    @Column(name = "exercise_image_id")
    private int exerciseImageId;

    @Column(name = "video_url" , length = 100)
    private String videoUrl;

    @Column(name = "exercise_type_id")
    private int exerciseTypeId;

    @Column(name = "mechanics_type_id")
    private int mechanicsTypeId;



}
