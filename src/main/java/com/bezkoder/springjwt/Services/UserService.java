package com.bezkoder.springjwt.Services;


import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.models.Vehicule;
import com.bezkoder.springjwt.payload.request.VehiculeRequest;
import com.bezkoder.springjwt.repository.ChauffeurRepository;
import com.bezkoder.springjwt.repository.UserRepository;
import com.bezkoder.springjwt.repository.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService implements IUserService {
    
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findall() {
        return userRepository.findAll();
    }

    @Override
    public User findbyId(Long id) {
        return (User) userRepository.findById(id).get();
    }
    @Override
    public void delete(Long id) {
        User user = userRepository.findById(id).get();

        userRepository.delete(user);
    }


}
