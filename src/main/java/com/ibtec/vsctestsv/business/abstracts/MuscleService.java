package com.ibtec.vsctestsv.business.abstracts;

import com.ibtec.vsctestsv.core.utilities.results.DataResult;
import com.ibtec.vsctestsv.core.utilities.results.Result;
import com.ibtec.vsctestsv.entities.concretes.Muscle;

import java.util.List;

public interface MuscleService {
    DataResult<List<Muscle>> getAll();
    DataResult<List<Muscle>> getAllSorted();
    DataResult<List<Muscle>> getAll(int pageNo, int pageSize);
    Result add(Muscle muscle);
}
