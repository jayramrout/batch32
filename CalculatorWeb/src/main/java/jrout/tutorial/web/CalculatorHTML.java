package jrout.tutorial.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorHTML", urlPatterns = {"/calchtml"})
public class CalculatorHTML extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<header></header>\n" +
                "<body>\n" +
                "\n" +
                "<h2>Calculator App</h2>\n" +
                "\n" +
                "<form action=\"calculator\" method=\"get\">\n" +
                "    <label for=\"oper1\">Operation</label><br>\n" +
                "    <input type=\"text\" id=\"oper1\" name=\"operation\" value=\"add\"><br>\n" +
                "    <label for=\"xvalue\">xValue</label><br>\n" +
                "    <input type=\"text\" id=\"xvalue\" name=\"xValue\" value=\"0\"><br><br>\n" +
                "    <label for=\"yvalue\">yValue</label><br>\n" +
                "    <input type=\"text\" id=\"yvalue\" name=\"yValue\" value=\"0\"><br><br>\n" +
                "\n" +
                "    <input type=\"submit\" value=\"Submit\">\n" +
                "</form>\n" +
                "\n" +
                "</body>\n" +
                "</html>\n" +
                "\n";


        PrintWriter writer = resp.getWriter();
        writer.println(html);


    }


}
