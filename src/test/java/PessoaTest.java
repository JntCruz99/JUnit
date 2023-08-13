import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTest {

    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa joao = new Pessoa("João", LocalDateTime.of(2000, 4, 2, 15, 0));
        Assertions.assertEquals(23, joao.getIdade());
    }

    @Test
    void deveSerMaiorDeIdade(){
        Pessoa joao = new Pessoa("João", LocalDateTime.of(2000, 4, 2, 15, 0));
        Assertions.assertTrue(joao.ehMaiorDeIdade());
    }


    @Test
    void validarSeObejetoEstaNulo(){
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);
    }

}
