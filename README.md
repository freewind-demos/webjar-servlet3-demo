how to run
============

`gradle appRun`

Then you can visit:

2. Bootstrap things: `http://localhost:8080/webjar-swagger-ui-demo/webjars/bootstrap/2.2.1/css/bootstrap.min.css`   
3. Transitive jquery: `http://localhost:8080/webjar-swagger-ui-demo/webjars/jquery/1.8.2/jquery.js`

# webjar with servlet 3

`webjar` is supported directly in servlet 3, any files inside `META-INF/resources` of any jars in application classpath are exposed as static resources under path `/webjars`.

But the normal gradle `jetty` is used old jetty 6, which doesn't support servlet 3, we need to use an extra [webjars-servlet-2.x](https://github.com/webjars/webjars-servlet-2.x) plugin and do some configuration in `web.xml`, which is not convenient.

And in this example, we use `gretty` plugin and jetty 9 instead, and we don't need the `web.xml` anymore.

# Reference

1. Java project skeleton: 
http://www.jeroenreijn.com/2012/11/hippo-cms-servlet-3-and-webjars.html
