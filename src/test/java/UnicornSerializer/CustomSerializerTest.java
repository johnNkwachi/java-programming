package UnicornSerializer;

import Classes.Cat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomSerializerTest {
    private Cat cat;
    private String testJsonString;

    @BeforeEach
    void setUp() {
       cat= new Cat();
        cat.setName("Ologbo");
        cat.setAge(10);
        cat.setColour("black");
        testJsonString = "{\"name\":\"Ologbo\",\"age\":10,\"colour\":\"black\"}";
    }
    @Test
    void testWriteCatToJson(){
       // String expectedJsonResponse="{\"name\":\"Ologbo\",\"age\":10,\"colour\":\"black\"}";
        String catAsJson = CustomSerializer.catToJson(cat);
        assertEquals(testJsonString, catAsJson);

}
   @Test
    void testReadFromJsonToCat(){
        Cat catDeserialized = CustomSerializer.jsonToCat(testJsonString);
        assertNotNull(catDeserialized);
        assertEquals(cat, catDeserialized);
        assertEquals("Ologbo",catDeserialized.getName());
   }
}