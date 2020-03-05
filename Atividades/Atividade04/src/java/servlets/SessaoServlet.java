package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SessaoServlet", urlPatterns = {"/SessaoServlet"})
public class SessaoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            HttpSession session = request.getSession();
            out.println("SESSION_ID=" + session.getId());
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SessaoServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SessaoServlet at " + request.getContextPath() + "</h1>");
            out.println("Nome salvo na sessão: " + session.getAttribute("nome"));
            out.println("</body>");
            out.println("</html>");

            String nome = request.getParameter("nome");
            if (nome != null && nome.isEmpty() == false) {
                session.setAttribute("nome", nome);
            }

        }
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        processRequest(req, resp);

    }
}
