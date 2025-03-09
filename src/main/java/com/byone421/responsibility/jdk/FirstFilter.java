package com.byone421.responsibility.jdk;

public class FirstFilter implements Filter {


    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        System.out.println("FirstFilter--before");
        filterChain.doFilter(request,response);
        System.out.println("FirstFilter--after");
    }
}
