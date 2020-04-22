
package managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
 @SessionScoped
public class EscopoMB {
    private int valor;
   
    
    public void recarregar(){
        this.valor = valor;
        return ;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

   
    public EscopoMB() {
    }
    
}
