
package clases;

import java.util.ArrayList;


public class artistas {
private String nombre;
private String genero;
private String diquera;
private String alias;
ArrayList <album> albumes = new ArrayList();

    public artistas(String nombre, String genero, String diquera, String alias, ArrayList albumes) {
        this.nombre = nombre;
        this.genero = genero;
        this.diquera = diquera;
        this.alias = alias;
        this.albumes = albumes;
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

    public String getDiquera() {
        return diquera;
    }

    public void setDiquera(String diquera) {
        this.diquera = diquera;
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
        return "artistas{" + "nombre=" + nombre + ", genero=" + genero + ", diquera=" + diquera + ", alias=" + alias + ", albumes=" + albumes + '}';
    }
    

}
