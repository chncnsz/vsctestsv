package com.ibtec.vsctestsv.business.concretes;

import com.ibtec.vsctestsv.business.abstracts.EquipmentService;
import com.ibtec.vsctestsv.core.utilities.results.DataResult;
import com.ibtec.vsctestsv.core.utilities.results.Result;
import com.ibtec.vsctestsv.core.utilities.results.SuccessDataResult;
import com.ibtec.vsctestsv.core.utilities.results.SuccessResult;
import com.ibtec.vsctestsv.dataAccess.abstracts.EquipmentDao;
import com.ibtec.vsctestsv.entities.concretes.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentManager implements EquipmentService {

    private EquipmentDao equipmentDao;

    @Autowired
    public EquipmentManager(EquipmentDao equipmentDao){
        super();
        this.equipmentDao = equipmentDao;
    }

    @Override
    public DataResult<List<Equipment>> getAll() {
        return new SuccessDataResult<List<Equipment>>(this.equipmentDao.findAll(),"Data Listelendi");
    }

    @Override
    public DataResult<List<Equipment>> getAllSorted() {
        return null;
    }

    @Override
    public DataResult<List<Equipment>> getAll(int pageNo, int pageSize) {
        return null;
    }

    @Override
    public Result add(Equipment equipment) {
        this.equipmentDao.save(equipment);
        return new SuccessResult("Data Eklendi");
    }
}
