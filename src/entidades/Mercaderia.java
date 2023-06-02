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
public class Mercaderia extends Tienda implements Registrador, Consultador, 
        Verificador{
    
    private String TipoProducto;
    private String precio;
    private String Provedor;

    public String getTipoProducto() {
        return TipoProducto;
    }

    public void setTipoProducto(String TipoProducto) {
        this.TipoProducto = TipoProducto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getProvedor() {
        return Provedor;
    }

    public void setProvedor(String Provedor) {
        this.Provedor = Provedor;
    }
    
    @Override
   public String getNombre(){
       return TipoProducto + " PRECIO : " + precio +" PROVEDOR "+Provedor;
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
