class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}
        "/test"(controller: "test", action: "index")
		"/"(view:"/index")
		"500"(view:'/error')
	}
}
