package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Depart;

public interface IDepartmentsReposi extends JpaRepository<Depart, Integer> {

}
