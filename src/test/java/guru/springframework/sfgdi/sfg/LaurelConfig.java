package guru.springframework.sfgdi.sfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile({"base-test", "component-scan"})
@Configuration
public class LaurelConfig {

    @Bean
    LaurelWordProducer laurelWordProducer() {
        return new LaurelWordProducer();
    }
}
