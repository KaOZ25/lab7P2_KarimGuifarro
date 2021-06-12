
package clases;

import java.util.ArrayList;


public class artistas {
private String nombre;
private String genero;
private String disquera;
private String alias;
ArrayList <album> albumes = new ArrayList();

    public artistas() {
    }

    public artistas(String nombre, String genero, String disquera, String alias) {
        this.nombre = nombre;
        this.genero = genero;
        this.disquera = disquera;
        this.alias = alias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDisquera() {
        return disquera;
    }

    public void setDisquera(String disquera) {
        this.disquera = disquera;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public ArrayList<album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<album> albumes) {
        this.albumes = albumes;
    }

    @Override
    public String toString() {
        return "artistas{" + "nombre=" + nombre + ", genero=" + genero + ", diquera=" + disquera + ", alias=" + alias + "," + '}';
    }
    

}
