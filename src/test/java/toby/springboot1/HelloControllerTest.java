package toby.springboot1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloControllerTest {

    @Test
    void helloController() {
        // HelloService는 람다로 대체(테스트 대역), ApplicationContext는 출력용이라 null 전달
        HelloController helloController = new HelloController(name -> name, null);

        String ret = helloController.hello("Test");

        assertThat(ret).isEqualTo("Test");
    }

    @Test
    void failsHelloController() {
        HelloController helloController = new HelloController(name -> name, null);

        Assertions.assertThatThrownBy(() -> helloController.hello(null)).isInstanceOf(IllegalArgumentException.class);
        Assertions.assertThatThrownBy(() -> helloController.hello("")).isInstanceOf(IllegalArgumentException.class);

    }
}
