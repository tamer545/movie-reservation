import com.m133.project.projecttimokai.Movie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MovieTests {
    Movie movie = new Movie();

    @Test
    void contextLoads() {
    }

    @Test
    void getEmail() {
        movie.setEmail("timo.angst@gmail.com");
        Assertions.assertEquals(movie.getEmail(), "timo.angst@gmail.com");
    }

    @Test
    void getTelNr() {
        movie.setTelNummer("038-384-8239");
        Assertions.assertEquals(movie.getTelNummer(), "038-384-8239");
    }

    @Test
    void getReleaseYear() {
        movie.setReleaseYear(2001);
        Assertions.assertEquals(movie.getReleaseYear(), 2001);
    }

    @Test
    void getName() {
        movie.setVorname("Timo");
        movie.setName("Angst");
        Assertions.assertEquals(movie.getVorname() + " " + movie.getName(), "Timo Angst");
    }

}
