package com.bezkoder.springjwt.controllers;


import com.bezkoder.springjwt.Services.IChauffeurService;
import com.bezkoder.springjwt.models.Chauffeur;
import com.bezkoder.springjwt.payload.request.ChauffeurRequest;

import com.bezkoder.springjwt.payload.response.ChauffeurResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/chauffeur")
public class ChauffeurController {

	@Autowired
	IChauffeurService iChauffeurService;

	@GetMapping("/all")
	public List<ChauffeurResponse> all() {
		return iChauffeurService.findall();
	}

	@GetMapping("/find/{id}")
	public ChauffeurResponse find(@PathVariable("id") long id)
	{
		return  iChauffeurService.findbyId(id);

	}


	@PostMapping("/add")
	public String add(@Valid @RequestBody ChauffeurRequest p) {
		iChauffeurService.add(p);
		return "oki";
	}
	@PutMapping("/update/{id}")
	public String update(@PathVariable("id") long id ,@Valid @RequestBody ChauffeurRequest p) {
		iChauffeurService.update(id , p);
		return "chauffeur modifieé avec succes";
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") long id ) {
		iChauffeurService.delete(id);
		return "oki";
	}
}
