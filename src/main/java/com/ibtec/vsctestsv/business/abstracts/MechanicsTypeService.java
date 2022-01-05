package com.ibtec.vsctestsv.business.abstracts;

import com.ibtec.vsctestsv.core.utilities.results.DataResult;
import com.ibtec.vsctestsv.core.utilities.results.Result;
import com.ibtec.vsctestsv.entities.concretes.MechanicsType;

import java.util.List;

public interface MechanicsTypeService {
    DataResult<List<MechanicsType>> getAll();
    DataResult<List<MechanicsType>> getAllSorted();
    DataResult<List<MechanicsType>> getAll(int pageNo, int pageSize);
    Result add(MechanicsType mechanicsType);
}
