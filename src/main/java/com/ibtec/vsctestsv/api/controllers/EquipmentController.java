package com.ibtec.vsctestsv.api.controllers;

import com.ibtec.vsctestsv.business.abstracts.EquipmentService;
import com.ibtec.vsctestsv.core.utilities.results.DataResult;
import com.ibtec.vsctestsv.core.utilities.results.Result;
import com.ibtec.vsctestsv.entities.concretes.Equipment;
import com.ibtec.vsctestsv.entities.concretes.Muscle;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipment")
@CrossOrigin
public class EquipmentController {

    private EquipmentService equipmentService;

    public EquipmentController(EquipmentService equipmentService){
        super();
        this.equipmentService = equipmentService;
    }

    @GetMapping("/getall")
    public DataResult<List<Equipment>> getAll() {
        return this.equipmentService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Equipment equipment) {
        return this.equipmentService.add(equipment);
    }
}
