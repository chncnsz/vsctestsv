package com.ibtec.vsctestsv.business.abstracts;

import com.ibtec.vsctestsv.core.utilities.results.DataResult;
import com.ibtec.vsctestsv.core.utilities.results.Result;
import com.ibtec.vsctestsv.entities.concretes.ExerciseType;

import java.util.List;

public interface ExerciseTypeService {
    DataResult<List<ExerciseType>> getAll();
    DataResult<List<ExerciseType>> getAllSorted();
    DataResult<List<ExerciseType>> getAll(int pageNo, int pageSize);
    Result add(ExerciseType exerciseType);
}
