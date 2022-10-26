package com.bezkoder.springjwt.Services;


import com.bezkoder.springjwt.models.Chauffeur;

import com.bezkoder.springjwt.payload.request.ChauffeurRequest;
import com.bezkoder.springjwt.payload.response.ChauffeurResponse;
import com.bezkoder.springjwt.repository.ChauffeurRepository;

import com.bezkoder.springjwt.repository.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ChauffeurService implements IChauffeurService {
    
    @Autowired
    ChauffeurRepository chauffeurRepository;
    @Autowired
    VehiculeRepository vehiculeRepository;

    @Override
    public List<ChauffeurResponse> findall() {
        List<Chauffeur> c =chauffeurRepository.findAll();
        List<ChauffeurResponse> cr=new ArrayList<>();
        c.forEach(val->{
         ChauffeurResponse crr= new ChauffeurResponse();
         crr.setId(val.getId());
         crr.setImmatv(val.getVehicule().getImmat());
         crr.setFirstname(val.getFirstname());
         crr.setLastname(val.getLastname());
         crr.setCin(val.getCin());
         crr.setDatenaissance(val.getDatenaissance());
         crr.setIdvehicule(val.getVehicule().getId());
         cr.add(crr);

        });
        return cr;
    }

    @Override
    public ChauffeurResponse findbyId(Long id) {
        Chauffeur val= chauffeurRepository.findById(id).get();
        ChauffeurResponse crr= new ChauffeurResponse();
        crr.setId(val.getId());
        crr.setImmatv(val.getVehicule().getImmat());
        crr.setFirstname(val.getFirstname());
        crr.setLastname(val.getLastname());
        crr.setCin(val.getCin());
        crr.setDatenaissance(val.getDatenaissance());
        crr.setIdvehicule(val.getVehicule().getId());
        return crr;
    }




    @Override
    public void add(ChauffeurRequest q) {
        Chauffeur Chauffeur = new Chauffeur();
        Chauffeur.setCin(q.getCin());
        Chauffeur.setDatenaissance(q.getDatenaissance());
        Chauffeur.setFirstname(q.getFirstname());
        Chauffeur.setLastname(q.getLastname());
        Chauffeur.setVehicule(vehiculeRepository.findById(q.getIdvehicule()).get());



        chauffeurRepository.save(Chauffeur);

    }

    @Override
    public void update(Long id, ChauffeurRequest q) {
        Chauffeur Chauffeur = chauffeurRepository.findById(id).get();
        Chauffeur.setCin(q.getCin());
        Chauffeur.setDatenaissance(q.getDatenaissance());
        Chauffeur.setFirstname(q.getFirstname());
        Chauffeur.setLastname(q.getLastname());
        Chauffeur.setVehicule(vehiculeRepository.findById(q.getIdvehicule()).get());
        chauffeurRepository.save(Chauffeur);
    }

    @Override
    public void delete(Long id) {
        Chauffeur Chauffeur = chauffeurRepository.findById(id).get();

        chauffeurRepository.delete(Chauffeur);
    }


}
