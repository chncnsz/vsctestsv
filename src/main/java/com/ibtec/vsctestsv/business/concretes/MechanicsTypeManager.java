package com.ibtec.vsctestsv.business.concretes;

import com.ibtec.vsctestsv.business.abstracts.MechanicsTypeService;
import com.ibtec.vsctestsv.core.utilities.results.DataResult;
import com.ibtec.vsctestsv.core.utilities.results.Result;
import com.ibtec.vsctestsv.core.utilities.results.SuccessDataResult;
import com.ibtec.vsctestsv.core.utilities.results.SuccessResult;
import com.ibtec.vsctestsv.dataAccess.abstracts.MechanicsTypeDao;
import com.ibtec.vsctestsv.entities.concretes.MechanicsType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MechanicsTypeManager implements MechanicsTypeService {

    private MechanicsTypeDao mechanicsTypeDao;

    @Autowired
    public MechanicsTypeManager(MechanicsTypeDao mechanicsTypeDao){
        this.mechanicsTypeDao = mechanicsTypeDao;
    }

    @Override
    public DataResult<List<MechanicsType>> getAll() {
        return new SuccessDataResult<List<MechanicsType>>(this.mechanicsTypeDao.findAll(),"Data Listelendi");
    }

    @Override
    public DataResult<List<MechanicsType>> getAllSorted() {
        return null;
    }

    @Override
    public DataResult<List<MechanicsType>> getAll(int pageNo, int pageSize) {
        return null;
    }

    @Override
    public Result add(MechanicsType mechanicsType) {
        this.mechanicsTypeDao.save(mechanicsType);
        return new SuccessResult("Data Eklendi");
    }
}
