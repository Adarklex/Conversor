package model;

import javax.swing.*;

public class Repetidor {

    public boolean intentaRepetir(){
        int respuesta;
        respuesta = JOptionPane.showConfirmDialog(null, "Deseas convertir algo mas?");
        if(respuesta !=0){
                JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro servicio");
                return false;
        }
        return true;
    }
}
