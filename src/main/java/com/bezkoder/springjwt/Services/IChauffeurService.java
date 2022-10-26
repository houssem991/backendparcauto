package com.bezkoder.springjwt.Services;




import com.bezkoder.springjwt.models.Chauffeur;
import com.bezkoder.springjwt.payload.request.ChauffeurRequest;
import com.bezkoder.springjwt.payload.response.ChauffeurResponse;

import java.util.List;

public interface IChauffeurService {

    List<ChauffeurResponse> findall();
    ChauffeurResponse findbyId(Long id);
    void add(ChauffeurRequest q);
    void update (Long id , ChauffeurRequest q);
    void delete (Long id);
}
