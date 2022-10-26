package com.bezkoder.springjwt.controllers;


import com.bezkoder.springjwt.Services.IVehiculeService;

import com.bezkoder.springjwt.models.Vehicule;

import com.bezkoder.springjwt.payload.request.VehiculeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/vehicule")
public class VehicueleController {

	@Autowired
	IVehiculeService iVehiculeService;

	@GetMapping("/all")
	public List<Vehicule> all() {
		return iVehiculeService.findall();
	}

	@GetMapping("/find/{id}")
	public Vehicule find(@PathVariable("id") long id)
	{
		Vehicule v=iVehiculeService.findbyId(id);

		return v;
	}


	@PostMapping("/add")
	public String add(@Valid @RequestBody VehiculeRequest v) {
		iVehiculeService.add(v);
		return "oki";
	}
	@PutMapping("/update/{id}")
	public String update(@PathVariable("id") long id ,@Valid @RequestBody VehiculeRequest p) {
		iVehiculeService.update(id , p);
		return "vehicule modifieé avec succes";
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") long id ) {
		iVehiculeService.delete(id);
		return "oki";
	}
}
