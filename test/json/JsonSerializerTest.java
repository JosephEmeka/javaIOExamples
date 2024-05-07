package json;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static json.Gender.MALE;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JsonSerializerTest {

    @Test
    void testSerialization() throws JsonProcessingException {
        Person person = new Person();
        person.setName("Joe");
        LocalDate date = LocalDate.of(2024, 5, 6);
        person.setDateOfBirth(date);
        person.setGender(MALE);
        person.setPhoneNumber("08034657717");

        String json =JsonSerializer.serialize(person);
        System.out.println(json);
        String expected = "{\"name\":\"Joe\",\"phoneNumber\":\"08034657717\",\"gender\":\"MALE\",\"dob\":[2024,5,6]}";
        assertEquals(expected, json);
    }

    @Test
    void deserialize() {
        String myJson = "{\"name\":\"Toni\",\"phoneNumber\":\"08066666666\",\"gender\":\"MALE\",\"dob\":[2024,5,16]}";
        Person person = JsonSerializer.deserialize(myJson);
        System.out.println(person.toString());
        String name = person.getName();
        assertEquals("Toni", name);

    }
}