package com.example.app

import org.scalatra._
import scalate.ScalateSupport

class MyScalatraServlet extends ScalatraServlet with ScalateSupport {

  get("/") {
    contentType = "text/html"
    mustache("index", "layout" -> "")
  }

}
