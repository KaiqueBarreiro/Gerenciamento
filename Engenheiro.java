
public class Engenheiro{
	private String eng;
	private String tipo;
		
	public Engenheiro(String tipo, String eng){
		setTipo(tipo);
		setEng(eng);
	}
	public Engenheiro(){
		
	}
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	public void setEng(String eng){
		this.eng = eng;
	}
	public String getTipo(){
		return tipo;
	}
	public String getEng(){
		return eng;
	}
}
