package com.bezkoder.springjwt.Services;




import com.bezkoder.springjwt.models.Chauffeur;
import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.payload.request.ChauffeurRequest;
import com.bezkoder.springjwt.payload.response.ChauffeurResponse;

import java.util.List;

public interface IUserService {

    List<User> findall();
    User findbyId(Long id);
    void delete (Long id);
}
