/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import com.frerly.ibatis.session05.data.SessionFactory;
import com.frerly.ibatis.session05.data.mapper.DepartamentoMapper;
import com.frerly.ibatis.session05.model.dto.DepartamentoDTO;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author deve03
 */
public class Prueba {
    
    public static void main(String[] args){
        SqlSession session = SessionFactory.getSqlSessionFactory().openSession();
        
        try {
            DepartamentoMapper mapper=
                    session.getMapper(DepartamentoMapper.class);
            
            List<DepartamentoDTO> list = mapper.queryDepartamentos();
           
            for(DepartamentoDTO dep : list)
            {
                System.out.println(dep.getDepartamento());
            }
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
