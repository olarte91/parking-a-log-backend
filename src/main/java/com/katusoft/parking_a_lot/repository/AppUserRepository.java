package com.katusoft.parking_a_lot.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.katusoft.parking_a_lot.model.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long>{

}
