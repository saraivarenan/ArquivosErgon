package parametros;

public class PerfilEventoUsuario_Parametros {

	static String cmpSigla ;
	static String cmpDesc;
	static String drpTipoEvento;
	static String drpPadrao;
	
	public static String getCmpSigla() {
		return "A2-Script";
	}
	public static String getCmpDesc() {
		return "A2-Script Desc";
	}
	public static String getDrpTipoEvento() {
		String TpEvent =CadastroTipoEventoCargo_Parametros.getTxtTipoevento()+" - "+ CadastroTipoEventoCargo_Parametros.getTxtNomeevt();
		return TpEvent;
	}
	public static String getDrpPadrao() {
		return "Ergon NG - Padrão de acesso para as páginas do Ergon NG";
	}
	
	
	
}
