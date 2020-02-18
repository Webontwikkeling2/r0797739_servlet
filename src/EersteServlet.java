import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/DynamischePagina")
public class EersteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>DynamischePagina servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>DynamischePagina Titel</h1>");
        out.println("<p id='dynamisch'>"+Math.round(Math.random())+"</p>");
        out.println("<a id='home' href='index.html'>Link naar index</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
