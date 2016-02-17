
import spock.lang.Specification

/**
 * Created by kevi9037 on 2/17/16.
 */
class HelloGroovyWorldSpec extends Specification {

    def "test subtract"() {
        setup:
        def helloG = new HelloGroovyWorld()

        expect:
        helloG.subtract(x, y) == answer

        where:
        x  | y || answer
        2  | 2 || 0
        5  | 1 || 4
    }
}
