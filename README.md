##Sbt+Scalatra example for [npmaven](http://npmaven.org)

Built from [scalatra-sbt-prototype](https://github.com/scalatra/scalatra-sbt-prototype).

__It requires npmaven to package stuff into `META-INF/resources` so that servlet 3.0 containers pick resources up out of the box__

1. Launch [SBT](http://code.google.com/p/simple-build-tool).

        ./sbt

2. Run Jetty

        container:start

3. Go to http://localhost:8080/