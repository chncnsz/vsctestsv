package com.ibtec.vsctestsv.dataAccess.abstracts;

import com.ibtec.vsctestsv.entities.concretes.Muscle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MuscleDao extends JpaRepository<Muscle, Integer> {

}
