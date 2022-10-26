package com.bezkoder.springjwt.repository;


import com.bezkoder.springjwt.models.Chauffeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ChauffeurRepository extends JpaRepository<Chauffeur, Long> {
}
