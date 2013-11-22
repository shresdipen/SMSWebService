package webservice

class TestDBController {

    def index() {
        Unique unique = new Unique()
        unique.unique1("1")
        unique.unique2("2")
        unique.save(failOnError: true)
    }
}
