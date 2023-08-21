package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/ParametrosServlet")
public class ServletParametros extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
        String usuario=req.getParameter("usuario");
        String clave=req.getParameter("clave");
        System.out.println("Usuario = " + usuario);
        System.out.println("clave = " + clave);
        PrintWriter out=res.getWriter();
        out.print("<html><head><title>Por Post</title></head><body><h1>Por Post</h1>");
        out.print("El usuario es "+usuario+".<br>La clave es "+clave+".</body></html>");
    }
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
        String usuario=req.getParameter("usuario");
        String clave=req.getParameter("clave");
        System.out.println("Usuario = " + usuario);
        System.out.println("clave = " + clave);
        PrintWriter out=res.getWriter();
        out.print("<html><head><title>Por Get</title></head><body><h1>Por Get</h1>");
        out.print("El usuario es "+usuario+".<br>La clave es "+clave+".</body></html>");
    }
}