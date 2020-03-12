package controle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.AlunoBO;
import modelo.NegocioException;
import modelo.entidades.Aluno;

@WebServlet(name = "IncluirAlunoServlet", urlPatterns = {"/aluno/incluir"})
public class IncluirAlunoServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Cadastro de Alunos</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Incluir Aluno</h1>");
        out.println(" <form action=\"/Atividade05/aluno/incluir\" method=\"post\">");
        out.println("<div>");
        out.println("<label>Matrícula:</label>");
        out.println("<input type=\"text\" name=\"matricula\" size=\"15\">");
        out.println("</div>");
        out.println("<div>");
        out.println("<label>Nome:</label>");
        out.println("<input type=\"text\" name=\"nome\" size=\"30\">");
        out.println("<div>");
        out.println("<input type=\"submit\" value=\"Salvar\"/>");
        out.println("<a href=\"/aluno/listar\">Desistir</a>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Aluno aluno = new Aluno();

        aluno.setMatricula(Integer.parseInt(req.getParameter("matricula")));
        aluno.setNome(req.getParameter("nome"));
        
         AlunoBO bo = new AlunoBO();

        try {
             bo.incluir(aluno);
        } catch (NegocioException e) {
            throw new ServletException("", e);
        }
        resp.sendRedirect(req.getContextPath()+"/aluno");
    }

}
