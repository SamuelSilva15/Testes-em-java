import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.ReajusteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    ReajusteService service;
    Funcionario funcionario;

    @BeforeEach
    public void inicializador(){
        this.service = new ReajusteService();
        this.funcionario = new Funcionario("Samuel", LocalDate.now(), new BigDecimal(1000));
    }
    @Test
    public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar(){
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal(1030.00), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeQuinzePorcentoQuandoDesempenhoForADesejar(){
        service.concederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal(1150.00), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeVintePorcentoQuandoDesempenhoForADesejar(){
        service.concederReajuste(funcionario, Desempenho.EXCELENTE);
        assertEquals(new BigDecimal(1200.00), funcionario.getSalario());
    }
}
