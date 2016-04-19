package Executor;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import processos.CadastroCargos;
import processos.CadastroCategoriaSub;
import processos.CadastroDePessoa;
import processos.CadastroEntesPrevi;
import processos.CadastroJornadaTrab;
import processos.CadastroPlanoPrevFundo;
import processos.CadastroSindicato;
import processos.CadastroTabVencimento;
import processos.CadastroTipoBeneficioPrev;
import processos.CadastroTipoEventoCargo;
import processos.CadastroTipodeVinculo;
import processos.FormasProvimentoEspeciesEventoCargo;
import processos.GruposTiposEvento;
import processos.IngressoEstatutario;
import processos.PerfilEventoUsuario;
import processos.RegimeJuridico;
import processos.TabelaGeralCadastroNatureza;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	CadastroDePessoa.class,
	CadastroEntesPrevi.class,
	CadastroTipoBeneficioPrev.class,
	CadastroPlanoPrevFundo.class,
	CadastroCategoriaSub.class,
	TabelaGeralCadastroNatureza.class,
	GruposTiposEvento.class,
	RegimeJuridico.class,
	CadastroTipodeVinculo.class,
	FormasProvimentoEspeciesEventoCargo.class,
	CadastroJornadaTrab.class,
	CadastroSindicato.class,
	GruposTiposEvento.class,
	CadastroTabVencimento.class,
	CadastroTipoEventoCargo.class,
	CadastroCargos.class,
	PerfilEventoUsuario.class,
	IngressoEstatutario.class,

})
public class SuitTest {
}
