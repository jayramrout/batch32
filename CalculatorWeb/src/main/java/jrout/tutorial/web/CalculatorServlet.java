package jrout.tutorial.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "CalculatorServlet", urlPatterns = {"/calculator"})
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String operation = req.getParameter("operation");// add , sub , mult
        String xValue = req.getParameter("xValue");// add , sub , mult
        String yValue = req.getParameter("yValue");// add , sub , mult

        System.out.println("operation ="+ operation);
        System.out.println("xValue ="+ xValue);
        System.out.println("yValue ="+ yValue);
        // log4j

        int x = Integer.parseInt(xValue);
        int y = Integer.parseInt(yValue);
        int result = 0;
        String oper = "";
        if(operation.equals("add")){
            oper = "+";
            result = x + y;
        }else if(operation.equals("mult")) {
            oper = "*";
            result = x * y;
        }else if(operation.equals("sub")){
            oper = "-";
            result = x - y;
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("finalResult.jsp");
        req.setAttribute("Operation",oper);
        req.setAttribute("Result",result);

        requestDispatcher.forward(req,resp);

        /*PrintWriter writer = resp.getWriter();
        String outputHTML = "<html>\n" +
                "<body>\n" +
                "\n" +
                "<h1>Operation was : "+oper+"</h1>\n" +
                "<p>Final Result is "+result+"</p>\n" +
                "<a href=\"calc.html\">Go Back</a>"+
                "\n" +
                "</body>\n" +
                "</html>";

        writer.println(outputHTML);*/
    }

    /*protected void serviceX(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }*/
}
