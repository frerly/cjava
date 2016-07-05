/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frerly.acme.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author deve03
 */
@Entity
@Table(name = "saldo_mes", catalog = "acme", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SaldoMes.findAll", query = "SELECT s FROM SaldoMes s"),
    @NamedQuery(name = "SaldoMes.findById", query = "SELECT s FROM SaldoMes s WHERE s.id = :id"),
    @NamedQuery(name = "SaldoMes.findByAnio", query = "SELECT s FROM SaldoMes s WHERE s.anio = :anio"),
    @NamedQuery(name = "SaldoMes.findByMes", query = "SELECT s FROM SaldoMes s WHERE s.mes = :mes"),
    @NamedQuery(name = "SaldoMes.findBySaldoInicial", query = "SELECT s FROM SaldoMes s WHERE s.saldoInicial = :saldoInicial"),
    @NamedQuery(name = "SaldoMes.findBySaldoFinal", query = "SELECT s FROM SaldoMes s WHERE s.saldoFinal = :saldoFinal")})
public class SaldoMes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "anio")
    private Integer anio;
    @Column(name = "mes")
    private Integer mes;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "saldo_inicial", precision = 10, scale = 2)
    private BigDecimal saldoInicial;
    @Column(name = "saldo_final", precision = 10, scale = 2)
    private BigDecimal saldoFinal;
    @JoinColumn(name = "id_almacen", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Almacen idAlmacen;
    @JoinColumn(name = "id_producto", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Producto idProducto;
    @JoinColumn(name = "id_estado", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Estado idEstado;

    public SaldoMes() {
    }

    public SaldoMes(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public BigDecimal getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(BigDecimal saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public BigDecimal getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(BigDecimal saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    public Almacen getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(Almacen idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public Estado getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Estado idEstado) {
        this.idEstado = idEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SaldoMes)) {
            return false;
        }
        SaldoMes other = (SaldoMes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }


    
}
