package com.byone421.responsibility.jdk;

public class Second implements Filter{
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        System.out.println("Second--before");
        filterChain.doFilter(request,response);
        System.out.println("Second--after");
    }
}
