package banecuador.fin.ec.controlador.menu;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
@RequestScoped
@SessionScoped
public class SessionBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private Navegar navegar;
    private String usuario;

    private final HttpServletRequest httpServletRequest;
    private final FacesContext faceContext;
    private FacesMessage facesMessage;

    public SessionBean() {
        this.faceContext = FacesContext.getCurrentInstance();
        this.httpServletRequest = ((HttpServletRequest) this.faceContext.getExternalContext().getRequest());
        if (this.httpServletRequest.getSession().getAttribute("sessionUsuario") != null) {
            this.usuario = this.httpServletRequest.getSession().getAttribute("sessionUsuario").toString();
        }
    }

    /*Método para Cerrar la sesión de usuario */
    public String cerrarSession() {
        this.httpServletRequest.getSession().removeAttribute("sessionUsuario");
        System.out.println("by");
        this.facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sesión cerrada correctamente", null);
        this.faceContext.addMessage(null, this.facesMessage);
        navegar.direccionarInicio();
        return "bye";
    }
}
