package dataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    List list;

    @BeforeEach
    void setUp(){
        list = new ArrayList();
    }

    @Test
    public void newListIsEmptyTest(){
        List list = new ArrayList();
        assertTrue(list.isEmpty());
    }

    @Test
    public void addItemIsNOtEmptyTest(){
        list = new ArrayList();
        list.add("Bible");
        assertFalse(list.isEmpty());
        assertEquals(1, list.size());
    }

    @Test
    public void addItemGetBY_IndexSize(){
        list.add("Bible");
        String savedItem = list.get(0);
        assertEquals("Bible", savedItem);
    }
    @Test
    public void addXYGetXY(){
        list.add("Bible");
        list.add("Hymn");
        String savedItem = list.get(0);
        assertEquals("Hymn",list.get(1));
        assertEquals("Bible", savedItem);
    }
    @Test
    public void addXYRemoveYsizeIsOneTest() {
        list.add("Bible");
        list.add("Hymn");
        list.remove(1);
        assertEquals(1, list.size());
    }


}