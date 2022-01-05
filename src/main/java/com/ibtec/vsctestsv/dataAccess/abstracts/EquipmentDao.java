package com.ibtec.vsctestsv.dataAccess.abstracts;

import com.ibtec.vsctestsv.entities.concretes.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentDao extends JpaRepository<Equipment, Integer> {
}
