/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author wilson steven rodriguez
 */
@ManagedBean
@SessionScoped
public class controladorIndex {

    private String nombre;
    private String profesion;
    private String genero;
    private String ubicacion;
    private Integer diasTrabajados;
    private String idiomasDominados[];
    /**
     * Creates a new instance of controladorIndex
     */
    public controladorIndex() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    

    

    public Integer getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(Integer diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public String[] getIdiomasDominados() {
        return idiomasDominados;
    }

    public void setIdiomasDominados(String[] idiomasDominados) {
        this.idiomasDominados = idiomasDominados;
    }
}
