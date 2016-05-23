import java.util.ArrayList;
import java.util.List;

public class Departamento{
	private String chefia;
	private String departamento;
	private String cidade;
	private List<Engenheiro>ListaEng = new ArrayList<Engenheiro>();
	private List<Projeto>ListaProjeto = new ArrayList<Projeto>();
	private List<Chefe>ListaChefe = new ArrayList<Chefe>();
	private List<Cidade>ListaCidade = new ArrayList<Cidade>();
	
	public Departamento(String departamento,Chefe chefia,Projeto proj, Cidade cidade, Engenheiro eng){
		setDepartamento(departamento);
		addChefe(chefia);
		addCidade(cidade);
		addEng(eng);
		addProjeto(proj);
	}
	public Departamento(){
		
	}
	public void setDepartamento(String departamento){
			this.departamento = departamento;
	}
	public void setChefia(String chefia){
		this.chefia = chefia;
	}
	public void setCidade(String cidade){
		this.cidade = cidade;
	}
	public String getChefia(){
		return chefia;
	}
	public String getDepartamento(){
		return departamento;
	}
	public String getCidade(){
		return cidade;
	}
	
	public void addEng(Engenheiro eng){
		if(!ListaEng.contains(eng));
			ListaEng.add(eng);
	}
	public void addCidade(Cidade cid){
		if(!ListaCidade.contains(cid));
			ListaCidade.add(cid);
	}
	public void addChefe(Chefe chefia){
		if(!ListaChefe.contains(chefia));
			ListaChefe.add(chefia);
	}
	public void addProjeto(Projeto proj){
		if(!ListaProjeto.contains(proj))
			ListaProjeto.add(proj);
	}
	public List<Projeto> getProjetos(){
		List<Projeto> temp = new ArrayList<Projeto>();
		for (Projeto projeto : ListaProjeto) {
			temp.add(projeto);
		}
		return temp;
	}
	public List<Cidade> getCidades(){
		List<Cidade> temp = new ArrayList<Cidade>();
		for (Cidade cidade : ListaCidade) {
			temp.add(cidade);
		}
		return temp;
	}
	public List<Chefe> getChefes(){
		List<Chefe> temp = new ArrayList<Chefe>();
		for (Chefe chefia : ListaChefe) {
			temp.add(chefia);
		}
		return temp;
	}
	public List<Engenheiro> getEngenheiro(){
		List<Engenheiro> temp = new ArrayList<Engenheiro>();
		for (Engenheiro engenheiro : ListaEng) {
			temp.add(engenheiro);
		}
		return temp;
	}
	public List<String> getEnge(){
		List<String> temp = new ArrayList<String>();
		for (Engenheiro engenheiro : ListaEng) {
			String e = engenheiro.getEng();
			temp.add(e);
		}
		return temp;
	}
	public List<String> getTipoEng(){
		List<String> temp = new ArrayList<String>();
		for (Engenheiro engenheiro : ListaEng) {
			String E = engenheiro.getTipo();
			temp.add(E);
		}
		return temp;
	}
	
}
