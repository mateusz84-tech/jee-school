package pl.coderslab.controller;

import pl.coderslab.dao.SolutionDao;
import pl.coderslab.model.Solution;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeServlet", urlPatterns = {"/"})
public class HomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        //Solution solution = new Solution();
        int numberSolution = Integer.parseInt((getServletContext().getInitParameter("number-solution")));
        System.out.println(numberSolution);

        SolutionDao solutionDao = new SolutionDao();
        List<Solution> recent = solutionDao.findRecent(numberSolution);

        request.setAttribute("solution",recent);
        getServletContext().getRequestDispatcher("/home.jsp")
                .forward(request,response);

    }
}
