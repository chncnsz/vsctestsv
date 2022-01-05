package com.ibtec.vsctestsv.dataAccess.abstracts;

import com.ibtec.vsctestsv.entities.concretes.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseDao extends JpaRepository<Exercise, Integer> {
}
