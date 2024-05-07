package json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerializer {
    public static String serialize(Person person){
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(person);
            return json;
        }
        catch(JsonProcessingException e) {
            System.err.println(e.getMessage());
            throw new RuntimeException();
        }
    }


    public static Person deserialize(String json){
        try{
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(json, Person.class);
        }
        catch(JsonProcessingException e){
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }


    }
}
