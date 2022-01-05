package com.ibtec.vsctestsv.business.concretes;

import com.ibtec.vsctestsv.business.abstracts.MuscleService;
import com.ibtec.vsctestsv.core.utilities.results.DataResult;
import com.ibtec.vsctestsv.core.utilities.results.Result;
import com.ibtec.vsctestsv.core.utilities.results.SuccessDataResult;
import com.ibtec.vsctestsv.core.utilities.results.SuccessResult;
import com.ibtec.vsctestsv.dataAccess.abstracts.MuscleDao;
import com.ibtec.vsctestsv.entities.concretes.Muscle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MuscleManager implements MuscleService {

    private MuscleDao muscleDao;

    @Autowired
    public MuscleManager(MuscleDao muscleDao){
        super();
        this.muscleDao = muscleDao;
    }


    @Override
    public DataResult<List<Muscle>> getAll() {
        return new SuccessDataResult<List<Muscle>>
                (this.muscleDao.findAll(),"Data Listelendi");
    }

    @Override
    public DataResult<List<Muscle>> getAllSorted() {
        return null;
    }

    @Override
    public DataResult<List<Muscle>> getAll(int pageNo, int pageSize) {
        return null;
    }

    @Override
    public Result add(Muscle muscle) {
        this.muscleDao.save(muscle);
        return new SuccessResult("Tür Eklendi");
    }
}
