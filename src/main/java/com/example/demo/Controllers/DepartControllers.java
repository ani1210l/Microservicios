package com.example.demo.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Depart;
import com.example.demo.Services.ServicesDepart;

@RestController
@RequestMapping("/api/Departamentos")


public class DepartControllers {

	private final ServicesDepart servicesDepart;


    public DepartControllers(ServicesDepart servicesDepart) {
    	this.servicesDepart=servicesDepart;
    }

    @PostMapping("/Guardar")
    public Depart crearDepartment(@RequestBody Depart department) {
        return servicesDepart.createDepartment(department);
    }

    @GetMapping("/{id}")
    public Depart getById(@PathVariable Integer id) {

        return servicesDepart.getDepartment(id);
    }

    @GetMapping("/listado")
    public List<Depart> findAll() {
        return servicesDepart.findAll();
    }

   

}
