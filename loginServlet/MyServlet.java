import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        try{
            out.println("<h2>Welcome to my first Servlet App </h2>");
            
        } finally{
            out.close();
        }
    }
}