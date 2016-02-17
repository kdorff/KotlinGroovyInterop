class HelloGroovyWorld {
    static void main(String[] args) {
        def x = new HelloGroovyWorld()
        x.sayHi()
        HelloKotlinWorldKt.main(['eh', 'bee', 'see'] as String[])
    }

    def sayHi() {
        println "Yo soy Groovy."
    }

    int subtract(int x, int y) {
        x - y
    }
}