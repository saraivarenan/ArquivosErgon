package Executor;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import deletes.CargosExcluir;
import deletes.DeletarRegimejurid;
import deletes.DeletarTipoEventCarg;
import deletes.DeleteCatESub;
import deletes.DeleteEntesPrevi;
import deletes.DeleteGrpTipEvent;
import deletes.DeletePessoa;
import deletes.DeletePlanoPrevFundo;
import deletes.DeleteTabGeralNat;
import deletes.DeleteTipoBenefPrev;
import deletes.EventoDeCargIngressEst;
import deletes.FormasProvDeletar;
import deletes.GrupotipoEvent;
import deletes.IngressEstatutario;
import deletes.JornadaDeletar;
import deletes.PerfilEventoUsu;
import deletes.SindicatoDeletar;
import deletes.TabVencimentoDeletar;
import deletes.TipoDeVinculoDeletar;
import deletes.VinculosFuncIngressEst;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	EventoDeCargIngressEst.class,
	VinculosFuncIngressEst.class,
	IngressEstatutario.class,
	PerfilEventoUsu.class,
	CargosExcluir.class,
	DeletarTipoEventCarg.class,
	TabVencimentoDeletar.class,
	GrupotipoEvent.class,
	SindicatoDeletar.class,
	JornadaDeletar.class,
	DeleteCatESub.class,
	FormasProvDeletar.class, 
	TipoDeVinculoDeletar.class,
	DeletarRegimejurid.class,
	DeleteGrpTipEvent.class,
	DeleteTabGeralNat.class,
	DeleteCatESub.class,
	DeletePlanoPrevFundo.class,
	DeleteTipoBenefPrev.class,
	DeleteEntesPrevi.class,
	DeletePessoa.class,
	
	
	

})
public class SuiteDeletar {
}