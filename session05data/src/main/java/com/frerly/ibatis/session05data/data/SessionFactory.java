/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frerly.ibatis.session05data.data;

import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author deve03
 */
public class SessionFactory {

    protected static final SqlSessionFactory FACTORY;

    static {
        try {
            Reader reader = Resources.getResourceAsReader(
                    "mybatis-config.xml"
            );
            FACTORY = new SqlSessionFactoryBuilder().build(reader);

        } catch (Exception e) {
            throw new RuntimeException("Error " + e, e);
        }

    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return FACTORY;
    }

}

