package com.ibtec.vsctestsv.business.concretes;

import com.ibtec.vsctestsv.business.abstracts.ExerciseTypeService;
import com.ibtec.vsctestsv.core.utilities.results.DataResult;
import com.ibtec.vsctestsv.core.utilities.results.Result;
import com.ibtec.vsctestsv.core.utilities.results.SuccessDataResult;
import com.ibtec.vsctestsv.core.utilities.results.SuccessResult;
import com.ibtec.vsctestsv.dataAccess.abstracts.ExerciseTypeDao;
import com.ibtec.vsctestsv.entities.concretes.ExerciseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseTypeManager implements ExerciseTypeService {

    private ExerciseTypeDao exerciseTypeDao;

    @Autowired
    public ExerciseTypeManager(ExerciseTypeDao exerciseTypeDao){
        super();
        this.exerciseTypeDao = exerciseTypeDao;
    }

    @Override
    public DataResult<List<ExerciseType>> getAll() {
        return new SuccessDataResult<List<ExerciseType>>(this.exerciseTypeDao.findAll(),"Data Listelendi");
    }

    @Override
    public DataResult<List<ExerciseType>> getAllSorted() {
        return null;
    }

    @Override
    public DataResult<List<ExerciseType>> getAll(int pageNo, int pageSize) {
        return null;
    }

    @Override
    public Result add(ExerciseType exerciseType) {
        this.exerciseTypeDao.save(exerciseType);
        return new SuccessResult("Data Eklendi");
    }
}
