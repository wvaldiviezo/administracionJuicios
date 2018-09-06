package banecuador.fin.ec.controlador.menu;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "navegar")
@SessionScoped
//@ViewScoped
//@RequestScoped
public class Navegar implements Serializable {

    private static final long serialVersionUID = 1L;
    private String mensaje;

    public Navegar() {
        mensaje = "Acción Correcta";
    }

    /*Método para direccionar a la Página principal*/
    public void direccionarInicio() {
        try {
            System.err.println("mensaje" + mensaje);
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Mensaje:", mensaje);
            FacesContext.getCurrentInstance().addMessage(null, message);
            FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);

            System.out.println("LOGRO REDIRECCIONAR A UN NUEVO FORMULARIO");
//            FacesContext.getCurrentInstance().getExternalContext().redirect("../Inicio/paginaInicial.xhtml");

            FacesContext.getCurrentInstance().getExternalContext().redirect("./../principal/bienvenida.banecuador");

        } catch (Exception e) {
            System.out.println("FALLO LA REDIRECCION A UN NUEVO FORMULARIO");
            e.printStackTrace();
        }
    }

    /*Método para direccionar a la Página principal*/
    public void direccionarConsultaRJ() {
        try {
            System.err.println("mensaje" + mensaje);
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Mensaje:", mensaje);
            FacesContext.getCurrentInstance().addMessage(null, message);
            FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);

            System.out.println("LOGRO REDIRECCIONAR A UN NUEVO FORMULARIO");
//            FacesContext.getCurrentInstance().getExternalContext().redirect("../Inicio/paginaInicial.xhtml");

            FacesContext.getCurrentInstance().getExternalContext().redirect("./../principal/consultaJuicios.banecuador");

        } catch (Exception e) {
            System.out.println("FALLO LA REDIRECCION A LA CONSULTA DE JUICIOS");
            e.printStackTrace();
        }
    }

    public void direccionarNuevo() {
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("./../principal/registrarJuicios.banecuador");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void direccionarNuevaDiligencia() {
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("./../principal/registroDiligencia.banecuador");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
