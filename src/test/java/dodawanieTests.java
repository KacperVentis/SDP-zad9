import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.junit.jupiter.api.Assertions;

public class dodawanieTests {

    @Mock
    dodawanie Mockdodawanie = new dodawanie();

    @Test
    @DisplayName("Test dodawania 2 liczb")
    void dodajTest() {
        Assertions.assertEquals(10, Mockdodawanie.dodaj(5,5));
    }
}
