/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frerly.ibatis.session05.model.dto;

import java.io.Serializable;

/**
 *
 * @author deve03
 */
public class DepartamentoDTO implements Serializable{
    
    
    
    private Integer iddepartamento;
    private String departamento;
    
    public DepartamentoDTO(){
    }

    /**
     * @return the iddepartamento
     */
    public Integer getIddepartamento() {
        return iddepartamento;
    }

    /**
     * @param iddepartamento the iddepartamento to set
     */
    public void setIddepartamento(Integer iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
    
}
