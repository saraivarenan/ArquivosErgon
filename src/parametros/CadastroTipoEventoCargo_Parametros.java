package parametros;

public class CadastroTipoEventoCargo_Parametros {

	static String txtTipoevento;
	static String txtNomeevt;
	static String drpNatureza;
	static String drpNatureza_principal;
	static String txtPrioridade_exerc;
	static String txtPrioridadepagto;
	static String drpDescr_formaprov;
	static String drpDescrTipoCargo;
	static String drpGrupo;
	
	public static String getTxtTipoevento() {
		return "A2-Script";
	}
	public static String getTxtNomeevt() {
		return "Script Nome";
	}
	public static String getDrpNatureza() {
		String Nat =TabelaGeralCadastroNatureza_Parametros.getItem()+" - "+TabelaGeralCadastroNatureza_Parametros.getDescricao();
		return Nat;
	}
	public static String getDrpNatureza_principal() {
		return "PROVIMENTO - Provimento";
	}
	
	public static String getDrpGrupo() {
		String GrupoEvenc = CadastroGruposTiposEvento_Parametros.getInputGrupo()+" - "+CadastroGruposTiposEvento_Parametros.getInputDesc();
		return GrupoEvenc;
	}
	public static String getTxtPrioridade_exerc() {
		return "1";
	}
	public static String getTxtPrioridadepagto() {
		return "1";
	}
	public static String getDrpDescr_formaprov() {
		String formasProv =FromasProvimentoEspeciesEventoCargos_Parametros.getInputSigla() +" - "+ FromasProvimentoEspeciesEventoCargos_Parametros.getInputDescSigla();
		return formasProv;
	}
	public static String getDrpDescrTipoCargo() {
		//Página tabela Geral 
		return "Auto_Tipos_cargo";
	}
	
	
}
