package parametros;

public class FromasProvimentoEspeciesEventoCargos_Parametros {
	
	static String inputSigla;
	static String inputDescSigla;
	static String srcTransacao;
	static String TipoRelacionamento;
	static String drpTipoVinculo;
	static String drpCategoria;
	static String drpSubcategoria;
	static String drpSistema;
	static String drpRegimeJuridico;
	
	public static String getTipoRelacionamento() {
		return "EVOLUCAO - Evolução";
	}
	public static String getInputSigla() {
		return "A2-Script";
	}
	public static String getSrcTransacao() {
		return "ERGadm00182";
	}
	public static String getInputDescSigla() {
		return "A2- Desc";
	}
	public static String getDrpTipoVinculo() {
		String tipoVinc = CadastroTipodeVinculo_Parametros.getInputSigla()+" - "+CadastroTipodeVinculo_Parametros.getInputNome();
		return tipoVinc;
	}
	public static String getDrpRegimeJuridico() {
		String regimeJurid = RegimeJuridico_Parametros.getInputSigla()+" - "+RegimeJuridico_Parametros.getInputNome();
		return regimeJurid;
	}
	public static String getDrpCategoria() {
		String categoria = CadastroCategoriaSub_Paramentros.getTxtCatSigla()+" - "+CadastroCategoriaSub_Paramentros.getTxtCatNome();
		return categoria;
	}
	public static String getDrpSubcategoria() {
		String subcategoria = CadastroCategoriaSub_Paramentros.getTxtSubCatSigla()+" - "+CadastroCategoriaSub_Paramentros.getTxtSubCatNome();
		return subcategoria;
	}
	public static String getDrpSistema() {
		return "Ergon";
	}
	
	
	
	
	

}
