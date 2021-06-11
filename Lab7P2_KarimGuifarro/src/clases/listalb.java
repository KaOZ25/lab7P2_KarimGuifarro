
package clases;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class listalb {
    private ArrayList<album> listalbu = new ArrayList();
    private File archivo = null;

    public listalb(String path) {
         archivo = new File(path);
    }

    public ArrayList<album> getListalbu() {
        return listalbu;
    }

    public void setListalbu(ArrayList<album> listalbu) {
        this.listalbu = listalbu;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
     public void setAlbum(album a){
        listalbu.add(a);
    }
      public void cargarArchivo() {
        try {            
            listalbu = new ArrayList();
            album temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (album) objeto.readObject()) != null) {
                        listalbu.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
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
            for (album t : listalbu) {
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
