package parametros;

public class IngressoEstatutario_Parametros {
	static String srcBuscaPessoa;
	static String srcTipoEvento;
	static String dtnDataNomeaçao;
	static String dtnDataPosse;
	static String dtnDataExercício;
	static String drpRegimeJuridico;
	static String drpTipoVinculo;
	static String drpEspecieEvento;
	static String srcCargo;
	static String drpReferencia;
	static String srcSetor;
	static String drpJornada;
	
	
	
	public static String getSrcBuscaPessoa() {
		String pessoSrc = CadastroDePessoa_Parametros.getTxtNome();
		return pessoSrc;
	}
	public static String getSrcTipoEvento() {
		String srcTipoevent = CadastroTipoEventoCargo_Parametros.getTxtTipoevento();
		return srcTipoevent;
	}
	public static String getDtnDataNomeaçao() {
		return "18/04/2016";
	}
	public static String getDtnDataPosse() {
		return "18/04/2016";
	}
	public static String getDtnDataExercício() {
		return "18/04/2016";
	}
	public static String getDrpRegimeJuridico() {
		String drpRegime = RegimeJuridico_Parametros.getInputSigla()+" - "+ RegimeJuridico_Parametros.getInputNome();
		return drpRegime;
	}
	public static String getDrpTipoVinculo() {
		String drpTipVinc = CadastroTipodeVinculo_Parametros.getInputSigla()+" - "+CadastroTipodeVinculo_Parametros.getInputNome();
		return drpTipVinc;
	}
	public static String getDrpEspecieEvento() {
		String EspeciEvent = FromasProvimentoEspeciesEventoCargos_Parametros.getInputSigla()+" - "+FromasProvimentoEspeciesEventoCargos_Parametros.getInputDescSigla();
		return EspeciEvent;
	}
	public static String getSrcCargo() {
		String srcCarg = CadastroCargos_Parametros.getInputCargo();
		return srcCarg;
	}
	public static String getDrpReferencia() {
		String refCargIng = CadastroTabVencimento_Parametros.getInputNomeAba2();
		return refCargIng;
	}
	public static String getSrcSetor() {
		return "000000000000000";
	}
	public static String getDrpJornada() {
		String drpJrn = CadastroJornadaTrab_Parametros.getTxfeSigla()+"-"+ CadastroJornadaTrab_Parametros.getTxfeNome();
		return drpJrn;
	}
	
	


}
