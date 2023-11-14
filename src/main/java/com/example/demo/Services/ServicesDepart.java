package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Depart;
import com.example.demo.Repository.IDepartmentsReposi;

@Service

public class ServicesDepart {
	
	private final IDepartmentsReposi iDepartmentsReposi;

	public ServicesDepart (IDepartmentsReposi iDepartmentsReposi) {
		this.iDepartmentsReposi=iDepartmentsReposi;
	}
	
    

    public Depart createDepartment(Depart department) {
        return iDepartmentsReposi.save(department);

    }

    public Depart getDepartment(Integer id) {
        return iDepartmentsReposi.findById(id).get();
    }

    public List<Depart> findAll() {
        return iDepartmentsReposi.findAll();
    }

  
	

}
