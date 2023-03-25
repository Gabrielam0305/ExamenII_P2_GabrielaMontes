/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii_p2_gabrielamontes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Gabriela Montes
 */
public class AdminDeporte {
    private ArrayList<Deporte> DeporteS = new ArrayList();
    private File archivo = null;
    
    public AdminDeporte( String path) {
        archivo = new File(path);
    }

    public ArrayList<Deporte> getDeporteS() {
        return DeporteS;
    }

    public void setDeporteS(ArrayList<Deporte> DeporteS) {
        this.DeporteS = DeporteS;
    }

    

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    
    
    public void setClase(Deporte p) {
        this.DeporteS.add(p); 
}
     public void cargarArchivo() {
        try {            
            DeporteS = new ArrayList();
            Deporte temp;
            if (archivo.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Deporte) objeto.readObject()) != null) {
                        DeporteS.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Deporte t : DeporteS) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}

