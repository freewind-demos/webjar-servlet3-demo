how to run
============

`gradle jettyRun`

Then you can visit:

2. Bootstrap things: `http://localhost:8080/webjar-swagger-ui-demo/webjars/bootstrap/2.2.1/css/bootstrap.min.css`   
3. Transitive jquery: `http://localhost:8080/webjar-swagger-ui-demo/webjars/jquery/1.8.2/jquery.js`

# webjar with servlet 2

`webjar` is supported directly in servlet 3, but not in servlet 2. 

If you are using a servlet server which is not support with servlet 3, you have to use the `org.webjars:webjars-servlet-2.x:1.3` to make it work, as `web.xml` in this example does.

# Reference

1. Java project skeleton: 
http://www.jeroenreijn.com/2012/11/hippo-cms-servlet-3-and-webjars.html
2. https://github.com/webjars/webjars-servlet-2.x
