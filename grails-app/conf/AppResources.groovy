modules = {
	
	modernizr {
		resource url: "js/libs/modernizr-1.7.min.js", disposition: "head"
	}
	
	boilerplate {
		resource url: "css/style.css"
		resource url: "css/handheld.css", attrs: [media: "handheld"]
	}
	
	facebox {
		dependsOn "jquery"
		resource "js/plugins/facebox/facebox.js"
		resource "js/plugins/facebox/facebox.css"
	}
	
	"infinite-scroll" {
		dependsOn "jquery"
		resource "js/plugins/infinite-scroll.js"
	}

	visualize {
		dependsOn "jquery"
		resource "js/plugins/visualize/visualize.jQuery.js"
		resource "js/plugins/visualize/css/visualize.css"
		resource "js/plugins/visualize/css/visualize-light.css"
	}
	
	"star-rating" {
		dependsOn "jquery"
		resource "js/plugins/star-rating.js"
	}

    index {
        dependsOn "modernizr", "boilerplate"
        resource url: "css/index.less" ,attrs:[rel: "stylesheet/less", type: "css"], bundle: "bundle_index"
    }
	
	scroll {
		dependsOn "modernizr", "boilerplate", "infinite-scroll"
		resource "js/scroll.js"
		resource url: "css/scroll.less" ,attrs:[rel: "stylesheet/less", type: "css"], bundle: "bundle_scroll"
	}

	graphs {
		dependsOn "modernizr", "boilerplate", "visualize"
        resource "js/graphs.js"
		resource url: "css/graphs.less" ,attrs:[rel: "stylesheet/less", type: "css"], bundle: "bundle_twitter"
	}
	
	polls {
		dependsOn "modernizr", "boilerplate"
		resource url: "css/polls.less" ,attrs:[rel: "stylesheet/less", type: "css"], bundle: "bundle_polls"
	}

	forms {
		dependsOn "modernizr", "boilerplate", "star-rating"
		resource "js/forms.js"
		resource url: "css/forms.less" ,attrs:[rel: "stylesheet/less", type: "css"], bundle: "bundle_forms"
	}
	
	lightbox {
		dependsOn "facebox"
		resource "js/lightbox.js"
	}
	
	basket {
		dependsOn "modernizr", "boilerplate"
		resource url: "css/basket.less" ,attrs:[rel: "stylesheet/less", type: "css"], bundle: "bundle_lightbox"
	}
	
}