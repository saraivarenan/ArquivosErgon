package Executor;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import processos.CadastroCargos;
import processos.CadastroCategoriaSub;
import processos.CadastroDePessoa;
import processos.CadastroEntesPrevi;
import processos.CadastroJornadaTrab;
import processos.CadastroPlanoPrevFundo;
import processos.CadastroTabVencimento;
import processos.CadastroTipoBeneficioPrev;
import processos.CadastroTipoEventoCargo;
import processos.CadastroTipodeVinculo;
import processos.FormasProvimentoEspeciesEventoCargo;
import processos.GruposTiposEvento;
import processos.RegimeJuridico;
import processos.TabelaGeralCadastroNatureza;

	
	@RunWith(Suite.class)
	@Suite.SuiteClasses({
		CadastroCategoriaSub.class,
		CadastroDePessoa.class,
		CadastroEntesPrevi.class,
		CadastroPlanoPrevFundo.class,
		CadastroTipoBeneficioPrev.class,
		CadastroTipodeVinculo.class,
		CadastroTipoEventoCargo.class,
		GruposTiposEvento.class,
		TabelaGeralCadastroNatureza.class,
		RegimeJuridico.class,
		FormasProvimentoEspeciesEventoCargo.class,
		CadastroPlanoPrevFundo.class,
		CadastroCargos.class,
		CadastroJornadaTrab.class,
		CadastroTabVencimento.class
		
	})
	public class SuitTest {
}
