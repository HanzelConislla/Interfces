/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


/**
 *
 * @author Hanzel Conislla
 */
public class Celular
        extends dispositivo
        implements Camara, Navegador, Reproductor{
    
    private String marca;
    private String modelo;
    
    @Override
    public String getNombre() {
     return marca + " | " + modelo;
    
    }

    public void mostrarMensaje()
    {
       
    }
    
    @Override
    public void tomarFoto() {
        
        
    }

    @Override
    public void navegar() {
    }

    @Override
    public void abrirLink() {
        
    }

    @Override
    public void reproducir() {
        
    }

    @Override
    public void adelantar() {
        
    }

    @Override
    public void retroceder() {
        
    }

    @Override
    public void grabarVideo() {
        
    }

    @Override
    public void getApertura() {
        
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
