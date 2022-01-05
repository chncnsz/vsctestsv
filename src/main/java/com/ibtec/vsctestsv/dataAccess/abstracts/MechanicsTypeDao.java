package com.ibtec.vsctestsv.dataAccess.abstracts;

import com.ibtec.vsctestsv.entities.concretes.MechanicsType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MechanicsTypeDao extends JpaRepository<MechanicsType, Integer> {
}
