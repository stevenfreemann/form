/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelo;

import com.mycompany.controlador.controladorSueldo;

/**
 *
 * @author Wilson Steven rodriguez
 * @author jhony rojas
 */
public class modeloSueldo {
    
    public Double obtenerSueldo(String profesion, Integer dias, String idiomas[],String ubicacion){
        String ingles = "ingles";
        String espanol = "español";
        String frances = "frances";
        String aleman = "aleman";
        Double total=0.0;
        if(profesion.equals("ingeniero")){
            total = 200.000*dias;
        }else if (profesion.equals("tecnologo")){
            total=150.000*dias;
        }else if(profesion.equals("tecnico")){
            total=100.000*dias;
        }else if(profesion.equals("auxiliar")){
            total=50.000*dias;
        }
        for (String idioma : idiomas) {
            if(espanol.contains(idioma)){
                total=total+100000;
            }
            if(ingles.contains(idioma)){
                total=total+200000;
            }
            if(frances.contains(idioma)){
                total=total+300000;
            }
            if(aleman.contains(idioma)){
                total=total+400000;
            }
        }
        if(ubicacion.equals("facatativa")){
            return total;
        }else{
            return total=total+80.000;
        }
        
    }
}
