
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String sA =req.getParameter("A");
        double a = Double.parseDouble(sA);
        String sB =req.getParameter("B");
        double b = Double.parseDouble(sB);
        String sC =req.getParameter("C");
        double c = Double.parseDouble(sC);

        double D = b * b - 4 * a * c;
        StringBuffer str=new StringBuffer();
        if ( D < 0 ) {
            str.append("пара комплексно-сопряженных корней: ");
            double real = - b / ( 2 * a );
            double image = Math.sqrt( -D ) / ( 2 * a );
            str.append("x1 = " + real + " + " + image + ";");
            str.append("x2 = " + real + " - " + image);
        } else {
            if ( D == 0 ) {
                str.append("два одинаковых вещественных корня: x1=x2= ");
                double solution = -b / ( 2 * a );
                str.append(solution);
            } else {
                str.append("два различных вещественных корня: ");
                double solution1 = -b / ( 2 * a ) - Math.sqrt( D ) / ( 2 * a );
                double solution2 = -b / ( 2 * a ) + Math.sqrt( D ) / ( 2 * a );
                str.append("x1 = " + solution1 + ";");
                str.append("x2 = " + solution2);
            }
        }
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h4>"+str+"</h4>");
    }
}
