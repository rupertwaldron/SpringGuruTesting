package guru.springframework.sfgdi.sfg;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("base-test")
@SpringJUnitConfig(classes={BaseConfig.class, LaurelConfig.class})
class HearingInterpreterTest {

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIHeard() {
        String word = hearingInterpreter.whatIHeard();
        assertEquals("Laurel", word);
    }
}