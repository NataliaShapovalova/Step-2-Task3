package natasha.task3;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void fuzzySearch() {
        assertTrue(Main.fuzzySearch("car", "ca6$$#_rtwheel"));
        assertTrue(Main.fuzzySearch("cwhl", "cartwheel"));
        assertTrue(Main.fuzzySearch("cwhee", "cartwheel"));
        assertTrue(Main.fuzzySearch("cartwheel", "cartwheel"));
        assertFalse(Main.fuzzySearch("cwheeel", "cartwheel"));
        assertFalse(Main.fuzzySearch("lw", "cartwheel"));
    }
}