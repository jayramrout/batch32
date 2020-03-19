package jrout.tutorial.web;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = {"/calculator"})
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

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

        PrintWriter writer = resp.getWriter();
        writer.println("The Result off "+ xValue +" " + oper + " "+yValue + " is "+ result);

    }
}
