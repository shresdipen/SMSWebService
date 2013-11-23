package smsfrontend

import groovyx.net.http.HTTPBuilder
import org.codehaus.groovy.grails.web.json.JSONObject

import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*

class TestController{

    def index() {
        def http = new HTTPBuilder("http://localhost:8090")
        Map<String, String> jsonMap
        http.request( GET, JSON ) {
            uri.path = '/WebService/test'
            uri.query = [ v:'1.0', q: 'Calvin and Hobbes' ]

            headers.'User-Agent' = 'Mozilla/5.0 Ubuntu/8.10 Firefox/3.0.4'

            // response handler for a success response code:
            println "response: "+response
            response.success = { resp, json ->
                jsonMap = json
            }

            // handler for any failure status code:
            response.failure = { resp ->
                println "Unexpected error: ${resp.statusLine.statusCode} : ${resp.statusLine.reasonPhrase}"
            }
        }
        println "Map: "+jsonMap
        JSONObject jsonObject=new JSONObject(jsonMap)
        render jsonObject
    }
}