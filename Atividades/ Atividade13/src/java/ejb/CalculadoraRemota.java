
package ejb;

import javax.ejb.EJBException;

 
public interface CalculadoraRemota {
       public  int somar(int a, int b) throws EJBException;
       public  int subtrair(int a, int b) throws EJBException;
       public  int multiplicar(int a, int b) throws EJBException;
       public  int dividir(int a, int b) throws EJBException;
    
}
