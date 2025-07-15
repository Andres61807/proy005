package es.cic.curso25.proy005;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TelefonoControlerTest {

    @Autowired
    private TelefonoController telefonoController;

    @Test
    void testCraete(){
        long resultadoId=telefonoController.create(null);
        assertTrue(resultadoId>0);
    }
}
