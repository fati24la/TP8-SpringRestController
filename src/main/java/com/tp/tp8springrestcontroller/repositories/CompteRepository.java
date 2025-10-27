package com.tp.tp8springrestcontroller.repositories;

import com.tp.tp8springrestcontroller.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
}
