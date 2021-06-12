/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author Karim Ozael
 */
public class album {

    private String nombre;
    private String publicacion;
    private String genero;
    private String formato_publi;
    private String alias_prod;
    private ArrayList <canciones> cancion =new ArrayList();

    public album(String nombre, String publicacion, String genero, String formato_publi, String alias_prod) {
        this.nombre = nombre;
        this.publicacion = publicacion;
        this.genero = genero;
        this.formato_publi = formato_publi;
        this.alias_prod = alias_prod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFormato_publi() {
        return formato_publi;
    }

    public void setFormato_publi(String formato_publi) {
        this.formato_publi = formato_publi;
    }

    public String getAlias_prod() {
        return alias_prod;
    }

    public void setAlias_prod(String alias_prod) {
        this.alias_prod = alias_prod;
    }

    public ArrayList<canciones> getCancion() {
        return cancion;
    }

    public void setCancion(ArrayList<canciones> cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return "album{" + "nombre=" + nombre + ", publicacion=" + publicacion + ", genero=" + genero + ", formato_publi=" + formato_publi + ", alias_prod=" + alias_prod + ", cancion=" + cancion + '}';
    }
    
}
