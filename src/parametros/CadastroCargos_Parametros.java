package parametros;

public class CadastroCargos_Parametros {
	
	//Aba Historico de cargo
	static String inputInicio;
	static String drpTabelaVencimentos;
	static String drpReferenciaInicial;
	static String drpReferenciaFinal;
	static String drpSindicato;
	static String inputInsalubridade;
	static String inputPericulosidade;
	static String inputDiasPrazoPosse;
	static String inputProrrogacaoPosse;
	
	//Aba Detalhes

	static String inputCargo;
	static String inputDescCargo;
	static String drpControlevaga;
	static String drpCategoria;
	static String drpSubcategoria;
	static String drpCargoFunçao;
	static String drpTipocargo;
	static String drpEscolaridade;
	
	//Grid Jornada
	
	static String drpJornada; 
	
	//aba detalhes
	public static String getInputCargo() {
		return "99991";
	}
	public static String getInputDescCargo() {
		return "A2-Script";
	}
	public static String getDrpControlevaga() {
		return "Livre";
	}
	public static String getDrpCategoria() {
		String cat =CadastroCategoriaSub_Paramentros.getTxtCatSigla()+" - "+CadastroCategoriaSub_Paramentros.getTxtCatNome();
		return cat;
	}
	public static String getDrpSubcategoria() {
		String SubCat =CadastroCategoriaSub_Paramentros.getTxtSubCatSigla()+" - "+CadastroCategoriaSub_Paramentros.getTxtSubCatNome();
		return SubCat;
	}
	public static String getDrpCargoFunçao() {
		return "Cargo efetivo";
	}
	public static String getDrpTipocargo() {
		return "Auto_Tipos_cargo - Auto_Tipos_cargo";
	}
	public static String getDrpEscolaridade() {
		return "Doutorado-Doutorado";
	}
	
	//aba Historico
	
	public static String getInputInicio() {
		return "01012016";
	}
	public static String getDrpTabelaVencimentos() {
		String TabVenc = CadastroTabVencimento_Parametros.getInputTabela()+" - "+ CadastroTabVencimento_Parametros.getInputNome();
		return TabVenc;
	}
	public static String getDrpReferenciaInicial() {
		String ReferencIni = CadastroTabVencimento_Parametros.getInputNomeAba2();
		return ReferencIni;
	}
	public static String getDrpReferenciaFinal() {
		String ReferencIni = CadastroTabVencimento_Parametros.getInputNomeAba2();
		return ReferencIni;
	}
	public static String getDrpSindicato() {
		String sind = CadastroSindicato_Parametros.getTxtSigla() +" - "+CadastroSindicato_Parametros.getTxtNome();
		return sind;
	}
	public static String getInputInsalubridade() {
		return "10";
	}
	public static String getInputPericulosidade() {
		return "10";
	}
	public static String getInputDiasPrazoPosse() {
		return "10";
	}
	public static String getInputProrrogacaoPosse() {
		return "5";
	}
	public static String getDrpJornada() {
		String JornDrp = CadastroJornadaTrab_Parametros.getTxfeSigla() +" - "+CadastroJornadaTrab_Parametros.getTxfeNome();
		return JornDrp;
	}

	
	
	
}
