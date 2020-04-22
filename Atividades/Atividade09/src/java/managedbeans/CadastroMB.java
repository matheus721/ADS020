
package managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class CadastroMB {
    public String salvar;

    public String getSalvar() {
        return  "lista";
    }

    public void setSalvar(String salvar) {
        this.salvar = salvar;
    }

 
    public CadastroMB() {
    }
    
}
