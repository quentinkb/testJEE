import com.qtn.beans.Genius;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Test extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        String message = "Bonjour, je m'appelle quentin";
        String param = request.getParameter("auteur");
        request.setAttribute("test",message);
        request.setAttribute("auteur",param);

        Genius premierBean = new Genius();
        premierBean.setName("Ethan");
        premierBean.setAge(18);
        premierBean.setGenius(true);

        request.setAttribute("genius",premierBean);
        this.getServletContext().getRequestDispatcher("/WEB-INF/test.jsp").forward( request, response);
    }
}
