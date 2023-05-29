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
public class SmartTV
        extends dispositivo
        implements Navegador, Reproductor {

    private int TipoEntrada;

    private final int HDMI = 0;
    private final int VGA = 1;
    private final int DVI = 2;
    private final int DisplayPort = 3;
    private final int RCA = 4;
    private final int Signal = 5;
    private final int Svideo = 6;
    private final int Coaxial = 7;

    @Override
    public String getNombre() {
        String nombreEntrada = "";
        switch(TipoEntrada) {
            case HDMI:
                nombreEntrada = "HDMI";break;          
            case VGA:
                nombreEntrada = "VGA";break;
            case DVI:
                nombreEntrada = "DVI";break;
            case DisplayPort:
                nombreEntrada = "DisplayPort";break;
            case RCA:
                nombreEntrada = "RCA";break;
            case Signal:
                nombreEntrada = "Signal";break;
            case Svideo:
                nombreEntrada = "Svideo";break;
            case Coaxial:
                nombreEntrada = "Coaxial";break;        
        }      
        return "Modelo : " + nombreEntrada;
    }

    /**
     * @return the tipoEntrada
     */
    public int getTipoEntrada() {
        return TipoEntrada;
    }

    /**
     * @param tipoEntrada the tipoEntrada to set
     */
    public void setTipoEntrada(int tipoEntrada) {
        this.TipoEntrada = tipoEntrada;
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

}
