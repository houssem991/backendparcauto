package com.bezkoder.springjwt.Services;




import com.bezkoder.springjwt.models.Vehicule;
import com.bezkoder.springjwt.payload.request.VehiculeRequest;

import java.util.List;

public interface IVehiculeService {

    List<Vehicule> findall();
    Vehicule findbyId(Long id);
    void add(VehiculeRequest v);
    void update (Long id , VehiculeRequest v);
    void delete (Long id);
}
