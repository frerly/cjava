/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frerly.acme.model;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author deve03
 */
@Entity
@Table(name = "factura_detalle", catalog = "acme", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FacturaDetalle.findAll", query = "SELECT f FROM FacturaDetalle f"),
    @NamedQuery(name = "FacturaDetalle.findById", query = "SELECT f FROM FacturaDetalle f WHERE f.id = :id"),
    @NamedQuery(name = "FacturaDetalle.findByCantidad", query = "SELECT f FROM FacturaDetalle f WHERE f.cantidad = :cantidad"),
    @NamedQuery(name = "FacturaDetalle.findByDescuento", query = "SELECT f FROM FacturaDetalle f WHERE f.descuento = :descuento"),
    @NamedQuery(name = "FacturaDetalle.findByItem", query = "SELECT f FROM FacturaDetalle f WHERE f.item = :item"),
    @NamedQuery(name = "FacturaDetalle.findByMonto", query = "SELECT f FROM FacturaDetalle f WHERE f.monto = :monto"),
    @NamedQuery(name = "FacturaDetalle.findByPrecio", query = "SELECT f FROM FacturaDetalle f WHERE f.precio = :precio")})
public class FacturaDetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD", nullable = false)
    private long cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DESCUENTO", nullable = false)
    private long descuento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ITEM", nullable = false)
    private int item;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MONTO", nullable = false)
    private long monto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRECIO", nullable = false)
    private long precio;
    @JoinColumn(name = "id_factura", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Factura idFactura;
    @JoinColumn(name = "id_producto", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Producto idProducto;

    public FacturaDetalle() {
    }

    public FacturaDetalle(Integer id) {
        this.id = id;
    }

    public FacturaDetalle(Integer id, long cantidad, long descuento, int item, long monto, long precio) {
        this.id = id;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.item = item;
        this.monto = monto;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public long getDescuento() {
        return descuento;
    }

    public void setDescuento(long descuento) {
        this.descuento = descuento;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public long getMonto() {
        return monto;
    }

    public void setMonto(long monto) {
        this.monto = monto;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public Factura getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Factura idFactura) {
        this.idFactura = idFactura;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
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
        if (!(object instanceof FacturaDetalle)) {
            return false;
        }
        FacturaDetalle other = (FacturaDetalle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

 
    
}
