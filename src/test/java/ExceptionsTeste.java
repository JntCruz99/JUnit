import org.example.Conta;
import org.example.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeExcecaoNaTransferencia() {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferenciaEntreContas.transfere(conta1, conta2, -1));
    }

    @Test
    void validarCenarioDeExcecaoNaTransferencia2() {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertDoesNotThrow(() ->
                transferenciaEntreContas.transfere(conta1, conta2, 1));
    }

}
