import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {

    @Test
    @EnabledIfEnvironmentVariable(named = "USERS", matches = "Jonatas")
    void ValidarAlgoSomenteNoUsuarioJonatas() {
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void soValidaNoLinux() {
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void soValidaNoWindows() {
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @EnabledOnJre(JRE.JAVA_20)
    void soValidaNoJava17() {
        Assertions.assertEquals(10, 5+5);
    }
}
