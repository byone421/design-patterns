package com.byone421.responsibility.jdk;

public class Client {
    public static void main(String[] args) {
        Request request = null;
        Response response = null;
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new FirstFilter()).addFilter(new Second());

        filterChain.doFilter(request,response);
    }
}
