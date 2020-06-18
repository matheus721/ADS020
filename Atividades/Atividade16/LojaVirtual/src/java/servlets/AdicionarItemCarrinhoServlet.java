package servlets;

import ejb.CarrinhoCompraLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AdicionarItemCarrinhoServlet", urlPatterns = {"/carrinho/adicionar"})
public class AdicionarItemCarrinhoServlet extends HttpServlet {

    @EJB
    private CarrinhoCompraLocal carrinho;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            carrinho = (CarrinhoCompraLocal) request.getSession().getAttribute("ejb_stateful");

            if (carrinho == null) {
                try {
                    Context contexto = new InitialContext();
                    carrinho = (CarrinhoCompraLocal) contexto.lookup("java:global/Atividade16/CarrinhoCompraStateful!ejb.CarrinhoCompraLocal");
                } catch (NamingException e) {
                    throw new ServletException(e);
                }
                request.getSession().setAttribute("ejb_stateful", carrinho);
            }

        }
    }

}
