package com.ibtec.vsctestsv.api.controllers;

import com.ibtec.vsctestsv.business.abstracts.ExerciseTypeService;
import com.ibtec.vsctestsv.core.utilities.results.DataResult;
import com.ibtec.vsctestsv.core.utilities.results.Result;
import com.ibtec.vsctestsv.entities.concretes.ExerciseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exerciseType")
@CrossOrigin
public class ExerciseTypeController {

    private ExerciseTypeService exerciseTypeService;

    @Autowired
    public ExerciseTypeController(ExerciseTypeService exerciseTypeService){
        super();
        this.exerciseTypeService = exerciseTypeService;
    }

    @GetMapping("/getall")
    public DataResult<List<ExerciseType>> getAll() {
        return this.exerciseTypeService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody ExerciseType exerciseType) {
        return this.exerciseTypeService.add(exerciseType);
    }
}
