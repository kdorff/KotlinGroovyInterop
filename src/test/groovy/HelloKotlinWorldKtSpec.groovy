
import spock.lang.Specification

/**
 * Created by kevi9037 on 2/17/16.
 */
class HelloKotlinWorldKtSpec extends Specification {
    def "test add"() {
        expect:
        HelloKotlinWorldKt.add(x, y) == answer

        where:
        x  | y || answer
        2  | 2 || 4
        5  | 1 || 6
    }
}
