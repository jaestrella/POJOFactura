/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import pojofactura.Cliente;
import pojofactura.Direccion;
import pojofactura.Factura;
import pojofactura.Producto;

/**
 *
 * @author matinal
 */
public class POJOMarshallingXML {
    public static void main(String [] args) throws JAXBException{
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        //formateador.format(ahora);

        Direccion direccion=new Direccion("calle", "wrestling", "jaen", 23001);
        Direccion direccion2=new Direccion("gachimuchi","shoulder","jaen",23001);
        Producto producto=new Producto(8, "melon", "melon piel de sapo 7kg", 12.50);
        Cliente cliente=new Cliente("adolfo", "dominguez", "ad@gmail.com", 654198465, "77370407V", 9, direccion);
        Factura factura=new Factura(cliente, direccion2, producto, Integer.SIZE, ahora);
        
         try {
            /*Cargamos la configuracion para que el "Marshaller" sepa como
            convertir el pojo a xml, para eso necesito la clase previamente
            estaba con anotacione jaxb*/
            JAXBContext jbc = JAXBContext.newInstance(factura.getClass());
            JAXBContext jbc2 = JAXBContext.newInstance(factura.getClass());
            JAXBContext jbc3 = JAXBContext.newInstance(factura.getClass());
            JAXBContext jbc4 = JAXBContext.newInstance(factura.getClass());
            /*creamos el marshaller que es el encargado de volcar el objeto a fichero xml, pero este solo
            sirve para la clase Direccion porque arriba hemos cargado el contexto direccion
            */
            Marshaller jbcm = jbc.createMarshaller();
            Marshaller jbcm2 = jbc2.createMarshaller();
            Marshaller jbcm3 = jbc3.createMarshaller();
            Marshaller jbcm4 = jbc4.createMarshaller();
            //Activar human-friendly
            jbcm.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jbcm2.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jbcm3.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jbcm4.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
            jbcm.marshal(direccion, new File("factura.xml"));
            jbcm2.marshal(cliente, new File("factura.xml"));
            jbcm3.marshal(producto, new File("factura.xml"));
            jbcm4.marshal(factura, new File("factura.xml"));
        } catch (JAXBException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        
        
    }
}
