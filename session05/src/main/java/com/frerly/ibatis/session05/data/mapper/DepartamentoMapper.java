/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frerly.ibatis.session05.data.mapper;

import com.frerly.ibatis.session05.model.dto.DepartamentoDTO;
import java.util.List;
import org.apache.ibatis.annotations.Select;

/**
 *
 * @author deve03
 */
public interface DepartamentoMapper {
    
    
    @Select("SELECT  * FROM departamentos")
    List<DepartamentoDTO> queryDepartamentos();
    
}
