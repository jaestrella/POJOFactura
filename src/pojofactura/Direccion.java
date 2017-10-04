/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojofactura;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author matinal
 */
@XmlRootElement
@XmlAccessorType (XmlAccessType.FIELD)
public class Direccion {
    private String tipoVia;
    private String nombreVia;
    private String localidad;
    private int cp;
   

    public Direccion(String tipoVia, String nombreVia, String localidad, int cp) {
        this.tipoVia = tipoVia;
        this.nombreVia = nombreVia;
        this.localidad = localidad;
        this.cp = cp;
       
    }

    public Direccion() {
    }

    public String getTipoVia() {
        return tipoVia;
    }

    public void setTipoVia(String tipoVia) {
        this.tipoVia = tipoVia;
    }

    public String getNombreVia() {
        return nombreVia;
    }

    public void setNombreVia(String nombreVia) {
        this.nombreVia = nombreVia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }
    
    

   

    
    
    
    
}

