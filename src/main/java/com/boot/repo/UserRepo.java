package com.boot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boot.entity.Userdata;

@Repository
public interface UserRepo extends JpaRepository<Userdata, Integer>{

}
