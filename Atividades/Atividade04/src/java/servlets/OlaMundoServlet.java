package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "OlaMundoServlet", urlPatterns = {"/OlaMundoServlet"})
public class OlaMundoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<h1>Olá Mundo!</h1>");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet OlaMundoServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet OlaMundoServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");

            String nome = request.getParameter("nome");
            if (nome != null && nome.isEmpty() == false) {
                out.println("<h1>Olá " + nome + "!</h1>");
            } else {
                out.println("<h1>Olá Mundo!</h1>");
            }
            out.println("<a href=" + response.encodeURL(request.getContextPath() + "/index.html") + ">Voltar</a>");

        }

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.sendRedirect(req.getContextPath()+"/index.html");

    }


 
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
}
