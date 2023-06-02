/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author USER
 */
public class Producto extends Tienda implements Registrador, Consultador, 
        Verificador{
    
    private String nombree;
    private String precio;

    public String getNombree() {
        return nombree;
    }

    public void setNombree(String nombree) {
        this.nombree = nombree;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
   public String getNombre(){
       return "PRODUCTO : "+nombree + " PRECIO : " + precio;
   }
    
    @Override
    public void Registrador() {
       
    }

    @Override
    public void SolicitarPrecios() {
       
    }

    @Override
    public void BuscarPrecios() {
        
    }

    @Override
    public void BuscarNombreProd() {
       
    }

    @Override
    public void CalidadProd() {
      
    }

    @Override
    public void PreciosFirmes() {
        
    }
    
}
