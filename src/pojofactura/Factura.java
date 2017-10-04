/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojofactura;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author matinal
 */
@XmlRootElement
@XmlAccessorType (XmlAccessType.FIELD)
public class Factura {
    private Cliente cliente;
    private Direccion direccion;
    private Producto producto;
    private Integer id;
    private Date fecha;

    public Factura(Cliente cliente, Direccion direccion, Producto producto, Integer id, Date fecha) {
        this.cliente = cliente;
        this.direccion = direccion;
        this.producto = producto;
        this.id = id;
        this.fecha = fecha;
    }

    public Factura() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    
   
    
}
