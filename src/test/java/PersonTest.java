import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class PersonTest {

    @Test
    public void testEqualsAndHashCode() {
        EqualsVerifier.simple().forClass(Person.class).verify();
    }
}