
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ProcesaServlet", urlPatterns = {"/ProcesaServlet"})
public class ProcesaServlet extends HttpServlet {

  

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // Recibo datos del formulario
        String nombre = request.getParameter("nombre");
        String telefono = request.getParameter("telefono");
        String correo = request.getParameter("correo");
         
        // Instanciar  un  objeto a partir de la clase Persona
         Persona per = new Persona();
         //Encapsular los datos recibidos en el obejto per
         per.setNombre(nombre);
         per.setTelefono(telefono);
         per.setCorreo(correo);
         
         // Colocar a per como atributo de request
         request.setAttribute("persona", per);
         
         //Derivamos el control a uotput.jsp incluye al objeto request
         request.getRequestDispatcher("output.jsp").forward(request, response);
    }
}
