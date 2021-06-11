package clases;
public class canciones {
    private String nombre;
    private int duracion;
    private String nombre_compositor;
    private String nombre_distribuidor;
    private boolean exclusivo_spotify;
    private String nombre_productor;
    private String invitado;

    public canciones(String nombre, int duracion, String nombre_compositor, String nombre_distribuidor, boolean exclusivo_spotify, String nombre_productor, String invitado) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.nombre_compositor = nombre_compositor;
        this.nombre_distribuidor = nombre_distribuidor;
        this.exclusivo_spotify = exclusivo_spotify;
        this.nombre_productor = nombre_productor;
        this.invitado = invitado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombre_compositor() {
        return nombre_compositor;
    }

    public void setNombre_compositor(String nombre_compositor) {
        this.nombre_compositor = nombre_compositor;
    }

    public String getNombre_distribuidor() {
        return nombre_distribuidor;
    }

    public void setNombre_distribuidor(String nombre_distribuidor) {
        this.nombre_distribuidor = nombre_distribuidor;
    }

    public boolean isExclusivo_spotify() {
        return exclusivo_spotify;
    }

    public void setExclusivo_spotify(boolean exclusivo_spotify) {
        this.exclusivo_spotify = exclusivo_spotify;
    }

    public String getNombre_productor() {
        return nombre_productor;
    }

    public void setNombre_productor(String nombre_productor) {
        this.nombre_productor = nombre_productor;
    }

    public String getInvitado() {
        return invitado;
    }

    public void setInvitado(String invitado) {
        this.invitado = invitado;
    }

    @Override
    public String toString() {
        return "canciones{" + "nombre=" + nombre + ", duracion=" + duracion + ", nombre_compositor=" + nombre_compositor + ", nombre_distribuidor=" + nombre_distribuidor + ", exclusivo_spotify=" + exclusivo_spotify + ", nombre_productor=" + nombre_productor + ", invitado=" + invitado + '}';
    }
    
}
