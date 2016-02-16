package example;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloWorldSpec {

    @Test
    public void should_return_greeting_word() throws Exception {
        HelloWorld helloWorld = new HelloWorld();
        assertThat(helloWorld.greeting()).isEqualTo("Hello, world");
    }
}
