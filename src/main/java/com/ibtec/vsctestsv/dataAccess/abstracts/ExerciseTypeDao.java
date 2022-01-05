package com.ibtec.vsctestsv.dataAccess.abstracts;

import com.ibtec.vsctestsv.entities.concretes.ExerciseType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseTypeDao extends JpaRepository<ExerciseType, Integer> {

}
