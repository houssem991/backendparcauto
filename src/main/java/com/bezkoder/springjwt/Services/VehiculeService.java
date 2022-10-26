package com.bezkoder.springjwt.Services;


import com.bezkoder.springjwt.models.Vehicule;
import com.bezkoder.springjwt.payload.request.VehiculeRequest;
import com.bezkoder.springjwt.repository.ChauffeurRepository;
import com.bezkoder.springjwt.repository.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class VehiculeService implements IVehiculeService {
    
    @Autowired
    VehiculeRepository VehiculeRepository;
    @Autowired
    ChauffeurRepository chauffeurRepository;

    @Override
    public List<Vehicule> findall() {
        return VehiculeRepository.findAll();
    }

    @Override
    public Vehicule findbyId(Long id) {
        return (Vehicule) VehiculeRepository.findById(id).get();
    }




    @Override
    public void add(VehiculeRequest v) {
        Vehicule Vehicule = new Vehicule();
        Vehicule.setImmat(v.getImmat());
        Vehicule.setDatedereparation(v.getDatedereparation());
        Vehicule.setNameassurance(v.getNameassurance());
        Vehicule.setEcheance(v.getEcheance());
        Vehicule.setTaxes(v.getTaxes());
        Vehicule.setEtatderep(v.getEtatderep());
        Vehicule.setVignette(v.getVignette());
        Vehicule.setMontantderep(v.getMontantderep());
        Vehicule.setNatderep(v.getNatderep());
        VehiculeRepository.save(Vehicule);

    }

    @Override
    public void update(Long id, VehiculeRequest v) {
        Vehicule Vehicule = VehiculeRepository.findById(id).get();
        Vehicule.setImmat(v.getImmat());
        Vehicule.setDatedereparation(v.getDatedereparation());
        Vehicule.setNameassurance(v.getNameassurance());
        Vehicule.setEcheance(v.getEcheance());
        Vehicule.setTaxes(v.getTaxes());
        Vehicule.setEtatderep(v.getEtatderep());
        Vehicule.setVignette(v.getVignette());
        Vehicule.setMontantderep(v.getMontantderep());
        Vehicule.setNatderep(v.getNatderep());
        VehiculeRepository.save(Vehicule);
    }

    @Override
    public void delete(Long id) {
        Vehicule Vehicule = VehiculeRepository.findById(id).get();

        VehiculeRepository.delete(Vehicule);
    }


}
