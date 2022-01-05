package com.ibtec.vsctestsv.api.controllers;

import com.ibtec.vsctestsv.business.abstracts.MuscleService;
import com.ibtec.vsctestsv.core.utilities.results.DataResult;
import com.ibtec.vsctestsv.core.utilities.results.Result;
import com.ibtec.vsctestsv.entities.concretes.Muscle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/muscles")
@CrossOrigin
public class MuscleController {

    private MuscleService muscleService;

    @Autowired
    public MuscleController(MuscleService muscleService){
        super();
        this.muscleService = muscleService;
    }

    @GetMapping("/getall")
    public DataResult<List<Muscle>> getAll() {
        return this.muscleService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Muscle muscle) {
        return this.muscleService.add(muscle);
    }


}
