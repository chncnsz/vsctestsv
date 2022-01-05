package com.ibtec.vsctestsv.api.controllers;

import com.ibtec.vsctestsv.business.abstracts.MechanicsTypeService;
import com.ibtec.vsctestsv.core.utilities.results.DataResult;
import com.ibtec.vsctestsv.core.utilities.results.Result;
import com.ibtec.vsctestsv.entities.concretes.ExerciseType;
import com.ibtec.vsctestsv.entities.concretes.MechanicsType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mechanicsType")
@CrossOrigin
public class MechanicsTypeController {

    private MechanicsTypeService mechanicsTypeService;

    @Autowired
    public MechanicsTypeController(MechanicsTypeService mechanicsTypeService){
        super();
        this.mechanicsTypeService = mechanicsTypeService;
    }

    @GetMapping("/getall")
    public DataResult<List<MechanicsType>> getAll() {
        return this.mechanicsTypeService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody MechanicsType mechanicsType) {
        return this.mechanicsTypeService.add(mechanicsType);
    }
}
