package com.flashcard_shreedev.flashcard_backend.config;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class SpaFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        
        String path = request.getRequestURI().substring(request.getContextPath().length());
        
        // Skip API and static file requests
        if (path.startsWith("/api/") || 
            path.startsWith("/assets/") ||
            path.matches(".*\\.(js|css|png|jpg|gif|ico|svg|woff|woff2|ttf|eot)$")) {
            
            filterChain.doFilter(request, response);
            return;
        }
        
        // For all other requests, forward to index.html so Vue Router can handle them
        request.getRequestDispatcher("/index.html").forward(request, response);
    }
}
