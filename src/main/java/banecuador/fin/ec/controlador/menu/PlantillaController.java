package banecuador.fin.ec.controlador.menu;

import banecuador.fin.ec.modelo.entidad.Usuario;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

@ManagedBean(name="plantillaController")
@ViewScoped
public class PlantillaController implements Serializable{
    public void verificarSesion(){
        try {
            
            System.out.println("entro en comprobacion plantilla controller");
            //Inicialización de la variable
            FacesContext context = FacesContext.getCurrentInstance();
            //Acceso a la variable que se almacena en sesión.
            Usuario us = (Usuario) context.getExternalContext().getSessionMap().get("usuario"); //usuario -> es el nombre del alias del put en el indexController
            //Empleado us = (Empleado) context.getExternalContext().getSessionMap().get("usuario");
//verificación si la Sesión esta Activa o No
            if (us == null) { //Si el usuario NO se encuentra iniciado sesión, se hace una redirección
                context.getExternalContext().redirect("./../permisos.xhtml");
            }            
            
        } catch (Exception e) {
            //log para guardar el registro de un error
        }
    }
    
}
