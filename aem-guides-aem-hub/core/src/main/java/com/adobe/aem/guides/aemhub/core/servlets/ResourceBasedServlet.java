package com.adobe.aem.guides.aemhub.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.propertytypes.ServiceDescription;

import com.day.cq.commons.jcr.JcrConstants;

@Component(service = { Servlet.class })
@SlingServletResourceTypes(
   resourceTypes="aem-hub/resourceType",
        methods=HttpConstants.METHOD_GET,
        selectors = "detail", 
        extensions = {"txt", "json"}
    )
// This can be accessed using the link : http://localhost:4502/apps/aem-hub/components/helloworld.detail.txt
@ServiceDescription("Resource Based Servlet")
public class ResourceBasedServlet extends SlingSafeMethodsServlet {
    
      private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(final SlingHttpServletRequest req,
            final SlingHttpServletResponse resp) throws ServletException, IOException {
        final Resource resource = req.getResource();
        resp.setContentType("text/plain");
        resp.getWriter().write("Title = " + resource.getValueMap().get(JcrConstants.JCR_TITLE));
    }
}
