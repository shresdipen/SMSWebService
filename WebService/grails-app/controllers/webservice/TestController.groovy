package webservice

import com.mongodb.util.JSON
import org.codehaus.groovy.grails.web.json.JSONObject
import org.elasticsearch.common.xcontent.XContentBuilder

class TestController {

    def index() {
//        Dom dom = new Dom()
//        dom.a="asd"
//        dom.save(failOnError: true)
//        dom.a="asd123"
//        println "id: "+dom.id
//        Long id = dom.id
//        dom.id=2000
//        dom.get(2000)
//        dom=Dom.findById(id)
//        dom.delete()


//        Example For MongoDB
//        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost"));
//        DB blogDatabase = mongoClient.getDB("blog");
//        DBCollection sessionsCollection;
//        sessionsCollection = blogDatabase.getCollection("sessions");
//        BasicDBObject session = new BasicDBObject("username", username);
//        session.append("_id", sessionID);
//        sessionsCollection.insert(session);
        String json = "{\"Status\":\"Safe\"}"
        JSONObject finalJson = new JSONObject(json)
        render finalJson
    }

    def create() {
        ESTestService.testES()
        render "Create Called"
    }
}
