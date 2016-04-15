package parametros;

public class CadastroPlanoPrevFundo_Parametros {
	static String drpBenSigla;
	static String txtRenIni;
	static String txtRenRent;
	static String srcReg;
	
	public static String getSrcReg() {
		String EntesPrevs = CadastroEntesPrev_parametros.getTxtSigla();
		
		return EntesPrevs;
	}
	public static String getDrpBenSigla() {
		String TipoBenefPrev = CadastroTipoBeneficioPrev_Parametros.getTxtSigla()+" - "+CadastroTipoBeneficioPrev_Parametros.getTxtNome();
		return TipoBenefPrev;
	}
	//Aba Rentabilidade
	
	public static String getTxtRenIni() {
		return "01012016";
	}
	public static String getTxtRenRent() {
		return "10";
	}
	}
