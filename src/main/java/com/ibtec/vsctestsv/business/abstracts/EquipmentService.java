package com.ibtec.vsctestsv.business.abstracts;

import com.ibtec.vsctestsv.core.utilities.results.DataResult;
import com.ibtec.vsctestsv.core.utilities.results.Result;
import com.ibtec.vsctestsv.entities.concretes.Equipment;

import java.util.List;

public interface EquipmentService {
    DataResult<List<Equipment>> getAll();
    DataResult<List<Equipment>> getAllSorted();
    DataResult<List<Equipment>> getAll(int pageNo, int pageSize);
    Result add(Equipment equipment);
}
