
package Control;
/**
 *
 * 
 */
public class Usuario {
    private String Usuario;
    private String Contra; //Contraseña

    public Usuario(String Usuario, String Contra) {
        this.Usuario = Usuario;
        this.Contra = Contra;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContra() {
        return Contra;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }
}
