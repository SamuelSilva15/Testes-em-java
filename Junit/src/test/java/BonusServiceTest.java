import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BonusServiceTest {

    @Test
    void bonusDeveriaSerZeroParaFuncionarComSalarioMuitoAlto(){
        BonusService service = new BonusService();
        assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(new Funcionario("Samuel", LocalDate.now(), new BigDecimal(12000))));
    }

    @Test
    void bonusDeveriaSer10PorCento() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Samuel", LocalDate.now(), new BigDecimal("2500")));

        assertEquals(new BigDecimal("250"), bonus);
    }
}