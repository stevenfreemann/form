/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controlador;

import com.mycompany.modelo.modeloSueldo;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author Yonathan
 */
@ManagedBean
@RequestScoped
public class controladorSueldo {

    private String nombre;
    private String profesion;
    private String genero;
    private Double sueldoDia;
    private Integer diasTrabajados;
    private String idiomasDominados[];
    private Double sueldoTotal;
    modeloSueldo modelo;

    @ManagedProperty("#{controladorIndex}")
    private controladorIndex index;
    /**
     * Creates a new instance of controladorSueldo
     */
    public controladorSueldo() {
        modelo = new modeloSueldo();
    }

    public Double getSueldoTotal() {
        return sueldoTotal;
    }

    public void setSueldoTotal(Double sueldoTotal) {
        this.sueldoTotal = sueldoTotal;
    }

    public controladorIndex getIndex() {
        return index;
    }

    public void setIndex(controladorIndex index) {
        this.index = index;
    }

    public void obtenerSueldo() {
        this.sueldoTotal=modelo.obtenerSueldo(this.getIndex().getProfesion(), this.getIndex().getDiasTrabajados(), this.getIndex().getIdiomasDominados(), this.getIndex().getUbicacion());
    }
}
