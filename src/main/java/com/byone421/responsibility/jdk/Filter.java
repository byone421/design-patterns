package com.byone421.responsibility.jdk;

public interface Filter {

    void doFilter(Request request,Response response,FilterChain filterChain);
}
