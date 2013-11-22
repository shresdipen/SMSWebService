package webservice

class TestController {

    def index() {
        Dom dom = new Dom()
        dom.a="asd"
        dom.save(failOnError: true)
        dom.a="asd123"
        println "id: "+dom.id
        Long id = dom.id
        dom.id=2000
        dom.get(2000)
        dom=Dom.findById(id)
        dom.delete()
        render "a"

//        Example For MongoDB
//        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost"));
//        DB blogDatabase = mongoClient.getDB("blog");
//        DBCollection sessionsCollection;
//        sessionsCollection = blogDatabase.getCollection("sessions");
//        BasicDBObject session = new BasicDBObject("username", username);
//        session.append("_id", sessionID);
//        sessionsCollection.insert(session);


    }
}
