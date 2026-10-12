package com.adobe.aem.guides.aemhub.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;

@Component (service = Servlet.class,
    property = {
        Constants.SERVICE_DESCRIPTION + "=Path Based Servlet",
        "sling.servlet.methods=" + "GET",
        "sling.servlet.paths=" + "/bin/path-based-servlet",
        "sling.servlet.selectors=one",
        "sling.servlet.selectors=two",
        "sling.servlet.extensions=txt"
    }
)
public class PathBasedServlet extends SlingSafeMethodsServlet{
    
    private static final long serialVersionUID = 1L;

    @Override 
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException{
        String[] selectors = request.getRequestPathInfo().getSelectors();
        if (selectors != null && selectors.length>0){
            for (String selector: selectors){
            response.getWriter().println("We are using selectors : " + selector);
            }
        }
        else{
            response.getWriter().println("Hello World!!");
        }
    }
}
