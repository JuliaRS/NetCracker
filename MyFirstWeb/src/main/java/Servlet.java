

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
        String sA = req.getParameter("A"), sB = req.getParameter("B"), sC = req.getParameter("C");
        double a = Double.parseDouble(sA);
        double b = Double.parseDouble(sB);
        double c = Double.parseDouble(sC);

        double D = b * b - 4 * a * c;
        StringBuffer str=new StringBuffer();
        if ( D < 0 ) {
            double real = - b / ( 2 * a );
            double image = Math.sqrt( -D ) / ( 2 * a );
            str.append("x1 = " + real + " + " + image + "*i; ");
            str.append("x2 = " + real + " - " + image +"*i");
        } else {
            if ( D == 0 ) {
                str.append("x1 = x2 = ");
                double solution = -b / ( 2 * a );
                str.append(solution);
            } else {
                double solution1 = -b / ( 2 * a ) - Math.sqrt( D ) / ( 2 * a );
                double solution2 = -b / ( 2 * a ) + Math.sqrt( D ) / ( 2 * a );
                str.append("x1 = " + solution1 + "; ");
                str.append("x2 = " + solution2);
            }
        }
        OutputStream outputStream = new ByteArrayOutputStream();
        JsonWriter writer = new JsonWriter(new OutputStreamWriter(outputStream, "UTF-8"));
        writer.beginObject(); // создаем токен начала главного объекта
        writer.name("data"); // записываем поле message
        writer.value(str.toString());
        writer.endObject(); // закрываем главный объект
        writer.close();

        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();
        out.print(outputStream.toString());
        out.flush();
    }
}
