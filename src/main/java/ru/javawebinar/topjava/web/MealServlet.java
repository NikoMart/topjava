package ru.javawebinar.topjava.web;

import org.slf4j.Logger;
import ru.javawebinar.topjava.model.MealWithExceed;
import ru.javawebinar.topjava.util.MealsUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Created by nikomart on 18.07.17.
 */
public class MealServlet extends HttpServlet {
    private static final Logger log = getLogger(UserServlet.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.debug("forward to meals");
        List<MealWithExceed> mealsWithExceededExample = MealsUtil.getMealsWithExceededExample();
        log.debug(mealsWithExceededExample.toString());
        request.setAttribute("mealsList", mealsWithExceededExample);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/meals.jsp");
        dispatcher.forward(request,response);
    }
}
