/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import negocio.QuadradoMagico;
import visao.QuadradoWebView;

/**
 *
 * @author caiov
 */
@WebServlet(name = "ControleQuadradoMagico", urlPatterns = {"/ControleQuadradoMagico"})
public class ControleQuadradoMagico extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //int[][] matriz = getMatriz(request);
            HttpSession session = request.getSession();
            QuadradoMagico quadradoMagico = (QuadradoMagico) session.getAttribute("quadradoMagico");
            String acao = request.getParameter("acao");
            
            if((acao.equalsIgnoreCase("Novo")) || (quadradoMagico == null)){    
                quadradoMagico = new QuadradoMagico();
                session.setAttribute("quadradoMagico", quadradoMagico);
            }  
            QuadradoWebView quadradoWebView = new QuadradoWebView();
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControleQuadradoMagico</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControleQuadradoMagico at " + request.getContextPath() + "</h1>");
            out.println(quadradoWebView.getNewQuadrado(quadradoMagico.getQuadrado()));   
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    private int[][] getMatriz(HttpServletRequest request){
        int[][] matriz = new int[3][3];
        matriz[0][0] = Integer.parseInt(request.getParameter("a1"));
        matriz[0][1] = Integer.parseInt(request.getParameter("a2"));
        matriz[0][2] = Integer.parseInt(request.getParameter("a3"));
        matriz[1][0] = Integer.parseInt(request.getParameter("b1"));
        matriz[1][1] = Integer.parseInt(request.getParameter("b2"));
        matriz[1][2] = Integer.parseInt(request.getParameter("b3"));
        matriz[2][0] = Integer.parseInt(request.getParameter("c1"));
        matriz[2][1] = Integer.parseInt(request.getParameter("c2"));
        matriz[2][2] = Integer.parseInt(request.getParameter("c3"));
        
        return matriz;
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
