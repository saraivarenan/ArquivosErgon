package parametros;

public class CadastroTipodeVinculo_Parametros {
	
	static String inputSigla;
	static String inputNome;
	static String inputIdade;
	static String inputCategoria;
	static String inputSubCat;
	static String inputRegimeJuridico;
	static String inputRegimePrevidenciario;
	static String inputPlanoprevidenciario;
	
	
	public static String getInputSigla() {
		return "A2-Script";
	}
	public static String getInputNome() {
		return "A1-TipovincNome";
	}
	public static String getInputIdade() {
		return "15";
	}
	public static String getInputCategoria() {
	String categoria = CadastroCategoriaSub_Paramentros.getTxtCatSigla()+" - "+CadastroCategoriaSub_Paramentros.getTxtCatNome();
		return categoria;
	}
	
	public static String getInputSubCat() {
		String SubCat = CadastroCategoriaSub_Paramentros.getTxtSubCatSigla()+" - "+CadastroCategoriaSub_Paramentros.getTxtSubCatNome();
		return SubCat;
		
	}
	public static String getInputRegimeJuridico() {
		String regimeJurid = RegimeJuridico_Parametros.getInputSigla()+ " - "+ RegimeJuridico_Parametros.getInputNome();
		return regimeJurid;
	}
	public static String getInputRegimePrevidenciario() {
		String regimePrev = CadastroEntesPrev_parametros.getTxtSigla()+" - "+ CadastroEntesPrev_parametros.getTxtNome();
		return regimePrev;
	}
	public static String getInputPlanoprevidenciario() {
		String planoPrev = CadastroEntesPrev_parametros.getTxtPlanSigla()+" - ";
		return planoPrev;
	}

	
	

}
