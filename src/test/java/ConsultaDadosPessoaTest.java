import org.example.BancoDeDados;
import org.example.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultaDadosPessoaTest {

    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexão();
    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("João", LocalDateTime.of(2000,1,1,13,1,1)));
    }

    @AfterEach
    void removeDadosDoTeste() {
        BancoDeDados.removeDados(new Pessoa("João", LocalDateTime.of(2000,1,1,13,1,1)));
    }

    @Test
    void validarDadosReotrno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexão();
    }

}
