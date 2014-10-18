package io.flynn.example

class HelloController {

    def index() {
        def port = System.getenv("PORT")
        def hostname = InetAddress.getLocalHost().getHostName()
        render "Hello from Flynn on port ${port} from container ${hostname}"
    }
}
