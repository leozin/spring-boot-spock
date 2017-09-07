package foo.test

import foo.Application
import foo.SpecialClass
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(classes = Application.class)
class FooSpec extends Specification {

    @Autowired
    private SpecialClass specialClass;

    def "should be able to get spring context autowired feature working in the tests"() {
        when:
            String response = specialClass.sayHello()

        then:
            "hello" == response
    }

}