

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {

        String as =req.getParameter("A");
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        MyClass myClass = gson.fromJson(req.getParameter("coeff"), MyClass.class);
        double a = myClass.A;
        double b = myClass.B;
        double c = myClass.C;

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
        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter(); // здесь надо отправить json!!!
        out.println();
    }
}
