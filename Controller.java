import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Controller {
	
	private static Controller instance;
	private JanelaPrincipal janelaPrincipal;
	private AddDepartamento janelaAddDep;
	private ListaDepartamento janelaDepartamento;
	private ListaEngenheiro janelaEngenheiro;
	private ListaProjeto janelaProjeto;
	private ListaChefe janelaListaChefe;
	private AddProjeto janelaAddProj;
	private AddEngenheiro janelaAddEngenheiro;
	private List<Departamento>ListaDep;
	private List<Departamento>ListaEng;
	private List<Departamento>ListaProj;
	private List<Projeto>ListaProjeto;
	private List<Engenheiro>ListaEngenheiro;
	private List<Departamento>ListaChefe;
	private List<Departamento>ListaCid;
	private List<Cidade>ListaCidade;
	private AddChefe janelaAddChefe;
	private addCidade janelaAddCidade;
	private removeDep janelaRemoveDep;
	private removeProj janelaRemoveProj;
	private List<Chefe>ListaChefia;
	private removeChefe janelaRemoveChefe;
	private removeEng janelaRemoveEng;
	private editProjeto janelaEditProjeto;
	private editChefe janelaEditChefe;
	private editDepartamento janelaEditDepartamento;
	private editEngenheiro janelaEditEngenheiro;
	
	private Controller(){
	}
	
	public static Controller getInstance(){
		if(instance == null)
			instance = new Controller();
		
		return instance;
	}
	
	public void init() {
		/*
		 * Inicializa Telas
		 * */
		
		janelaPrincipal = new JanelaPrincipal();
		janelaPrincipal.setVisible(true);		
		janelaAddDep = new AddDepartamento();
		janelaAddDep.setVisible(false);
		janelaDepartamento = new ListaDepartamento();
		janelaDepartamento.setVisible(false);
		janelaEngenheiro = new ListaEngenheiro();
		janelaEngenheiro.setVisible(false);
		janelaProjeto = new ListaProjeto();
		janelaProjeto.setVisible(false);
		janelaAddProj = new AddProjeto();
		janelaAddProj.setVisible(false);
		janelaAddChefe = new AddChefe();
		janelaAddChefe.setVisible(false);
		janelaAddEngenheiro = new AddEngenheiro();
		janelaAddEngenheiro.setVisible(false);
		janelaListaChefe = new ListaChefe();
		janelaListaChefe.setVisible(false);
		janelaAddCidade = new addCidade();
		janelaAddCidade.setVisible(false);
		janelaRemoveDep = new removeDep();
		janelaRemoveDep.setVisible(false);
		janelaRemoveProj = new removeProj();
		janelaRemoveProj.setVisible(false);
		janelaRemoveChefe = new removeChefe();
		janelaRemoveChefe.setVisible(false);
		janelaRemoveEng = new removeEng();
		janelaRemoveEng.setVisible(false);
		janelaEditProjeto = new editProjeto();
		janelaEditProjeto.setVisible(false);
		janelaEditChefe = new editChefe();
		janelaEditChefe.setVisible(false);
		janelaEditDepartamento = new editDepartamento();
		janelaEditDepartamento.setVisible(false);
		janelaEditEngenheiro = new editEngenheiro();
		janelaEditEngenheiro.setVisible(false);
		
		/*
		 * Inicializa variáveis
		 * */
		
		ListaDep = new ArrayList<Departamento>();
		ListaEng = new ArrayList<Departamento>();
		ListaProj = new ArrayList<Departamento>();
		ListaChefe = new ArrayList<Departamento>();
		ListaProjeto = new ArrayList<Projeto>();
		ListaCid = new ArrayList<Departamento>();
		ListaEngenheiro = new ArrayList<Engenheiro>();
		ListaCidade = new ArrayList<Cidade>();
		ListaChefia = new ArrayList<Chefe>();
		
		/*
		 * Inicializa pré cadastro
		 * */
		new ImprimiPreCadastro(ListaDep);
	}
	public void changeScreen(int screen){
		switch (screen) {
		case Constants.JANELA_CANCELAR:
			janelaPrincipal.setVisible(true);		
			janelaAddDep.setVisible(false);
			janelaDepartamento.setVisible(false);
			janelaEngenheiro.setVisible(false);
			janelaProjeto.setVisible(false);
			janelaAddProj.setVisible(false);
			janelaAddChefe.setVisible(false);
			janelaAddEngenheiro.setVisible(false);
			janelaListaChefe.setVisible(false);
			janelaAddCidade.setVisible(false);
			janelaRemoveDep.setVisible(false);
			janelaRemoveProj.setVisible(false);
			janelaRemoveChefe.setVisible(false);
			janelaRemoveEng.setVisible(false);
			janelaEditProjeto.setVisible(false);
			janelaEditChefe.setVisible(false);
			janelaEditDepartamento.setVisible(false);
			janelaEditEngenheiro.setVisible(false);
			break;
		case Constants.JANELA_OK:
			janelaPrincipal.setVisible(true);		
			janelaAddDep.setVisible(false);
			janelaDepartamento.setVisible(false);
			janelaEngenheiro.setVisible(false);
			janelaProjeto.setVisible(false);
			janelaAddProj.setVisible(false);
			janelaAddChefe.setVisible(false);
			janelaAddEngenheiro.setVisible(false);
			janelaListaChefe.setVisible(false);
			janelaAddCidade.setVisible(false);
			janelaRemoveDep.setVisible(false);
			janelaRemoveProj.setVisible(false);
			janelaRemoveChefe.setVisible(false);
			janelaRemoveEng.setVisible(false);
			janelaEditProjeto.setVisible(false);
			janelaEditChefe.setVisible(false);
			janelaEditDepartamento.setVisible(false);
			janelaEditEngenheiro.setVisible(false);
			break;
		case Constants.JANELA_LISTAGEM_DEPARTAMENTO:
			janelaDepartamento.limpaTela();
			janelaDepartamento.populaDepartamentos();
			janelaPrincipal.setVisible(true);
			janelaDepartamento.setVisible(true);
			break;
		case Constants.JANELA_ADD_DEPARTAMENTO:
			janelaAddDep.limpaTela();
			janelaAddDep.boxEng(ListaEngenheiro);
			janelaAddDep.boxDepartamento();
			janelaAddDep.boxChefe(ListaChefia);
			janelaAddDep.boxProjeto(ListaProjeto);
			janelaAddDep.boxCidade(ListaCidade);
			janelaPrincipal.setVisible(true);
			janelaAddDep.setVisible(true);
			break;
		case Constants.JANELA_LISTAGEM_PROJETO:
			janelaProjeto.limpaTela();
			janelaProjeto.populaProjeto(ListaProjeto);
			janelaPrincipal.setVisible(true);
			janelaProjeto.setVisible(true);
			break;
		case Constants.JANELA_LISTAGEM_ENGENHEIRO:
			janelaEngenheiro.limpaTela();
			janelaEngenheiro.populaEngenheiro(ListaEngenheiro);
			janelaPrincipal.setVisible(true);
			janelaEngenheiro.setVisible(true);
			break;
		case Constants.JANELA_ADD_PROJETO:
			janelaAddProj.limpaTela();
			janelaAddProj.boxChefes(ListaDep);
			janelaPrincipal.setVisible(true);
			janelaAddProj.setVisible(true);
			break;
		case Constants.JANELA_ADD_CHEFE:
			janelaAddChefe.limpaTela();
			janelaPrincipal.setVisible(true);
			janelaAddChefe.setVisible(true);
			break;
		case Constants.JANELA_ADD_ENGENHEIRO:
			janelaAddEngenheiro.limpaTela();
			janelaPrincipal.setVisible(true);
			janelaAddEngenheiro.setVisible(true);
			break;
		case Constants.JANELA_LISTAGEM_CHEFE:
			janelaListaChefe.limpaTela();
			janelaListaChefe.populaChefe(ListaChefia);
			janelaPrincipal.setVisible(true);
			janelaListaChefe.setVisible(true);
			break;
		case Constants.JANELA_ADD_CIDADE:
			janelaAddCidade.limpaTela();
			janelaPrincipal.setVisible(true);
			janelaAddCidade.setVisible(true);
			break;
		case Constants.JANELA_REMOVE_DEPARTAMENTO:
			janelaRemoveDep.limpaTela();
			janelaPrincipal.setVisible(true);
			janelaRemoveDep.setVisible(true);
			break;
		case Constants.JANELA_REMOVE_PROJETO:
			janelaRemoveProj.limpaTela();
			janelaPrincipal.setVisible(true);
			janelaRemoveProj.setVisible(true);
			break;
		case Constants.JANELA_REMOVE_CHEFE:
			janelaRemoveChefe.limpaTela();
			janelaPrincipal.setVisible(true);
			janelaRemoveChefe.setVisible(true);
			break;
		case Constants.JANELA_REMOVE_ENGENHEIRO:
			janelaRemoveEng.limpaTela();
			janelaPrincipal.setVisible(true);
			janelaRemoveEng.setVisible(true);
			break;
		case Constants.JANELA_EDIT_PROJETO:
			janelaEditProjeto.limpaTela();
			janelaEditProjeto.boxProjeto(ListaProjeto);
			janelaEditProjeto.boxNovoProjeto(ListaProjeto);
			janelaPrincipal.setVisible(true);
			janelaEditProjeto.setVisible(true);
			break;
		case Constants.JANELA_EDIT_CHEFE:
			janelaEditChefe.limpaTela();
			janelaEditChefe.boxChefe(ListaChefia);
			janelaEditChefe.boxNovoChefe(ListaChefia);
			janelaPrincipal.setVisible(true);
			janelaEditChefe.setVisible(true);
			break;
		case Constants.JANELA_EDIT_DEPARTAMENTO:
			janelaEditDepartamento.limpaTela();
			janelaEditDepartamento.boxDepartamento();
			janelaEditDepartamento.boxNovoDepartamento();
			janelaPrincipal.setVisible(true);
			janelaEditDepartamento.setVisible(true);
			break;
		case Constants.JANELA_EDIT_ENGENHEIRO:
			janelaEditEngenheiro.limpaTela();
			janelaEditEngenheiro.boxEng(ListaEngenheiro);
			janelaEditEngenheiro.boxNovoEng(ListaEngenheiro);
			janelaEditEngenheiro.boxNovoTipoEng(ListaEngenheiro);
			janelaPrincipal.setVisible(true);
			janelaEditEngenheiro.setVisible(true);
			break;
		}
	}
	
	public void insereDepartamento(String departamento, Chefe chefia, Cidade cidade,Projeto proj, Engenheiro eng){
		Departamento dep = new Departamento();
		dep.setDepartamento(departamento);
		dep.addChefe(chefia);
		dep.addCidade(cidade);
		dep.addEng(eng);
		dep.addProjeto(proj);
		
		if(!ListaDep.contains(dep)){
			ListaDep.add(dep);
		}
	}
	
	public void insereChefe(Chefe chefia){
		Departamento dep = new Departamento();
		dep.addChefe(chefia);

		if(!ListaChefe.contains(dep)){
			ListaChefe.add(dep);
		}
		for(Departamento d: ListaChefe){
			for(Chefe c : d.getChefes()){
				if(!ListaChefia.contains(c)){
					ListaChefia.add(c);
				}
			}
		}
	}
	public void insereCidade(Cidade cidade){
		Departamento dep = new Departamento();
		dep.addCidade(cidade);

		if(!ListaCid.contains(dep)){
			ListaCid.add(dep);
		}
		for(Departamento d : ListaCid){
			for(Cidade c : d.getCidades()){
				if(!ListaCidade.contains(c)){
					ListaCidade.add(c);
				}
			}
		}
	}
	public void insereEngenheiro(Engenheiro eng){
		Departamento dep = new Departamento();
		dep.addEng(eng);
		
		if(!ListaEng.contains(dep)){
			ListaEng.add(dep);
		}
		for(Departamento d: ListaEng){
			for(Engenheiro e : d.getEngenheiro()){
				if(!ListaEngenheiro.contains(e)){
					ListaEngenheiro.add(e);
				}
			}
		}
	}
	public void insereProjeto(Chefe chefia, Projeto Proj){
		Departamento dep = new Departamento();
		dep.addProjeto(Proj);
		dep.addChefe(chefia);

		if(!ListaProj.contains(dep)){
			ListaProj.add(dep);
		}
		for(Departamento d : ListaProj){
			for(Projeto p : d.getProjetos()){
				if(!ListaProjeto.contains(p)){
					ListaProjeto.add(p);
				}
			}
		}
	}
	public List<String> getDepto(){
		List<String> temp = new ArrayList<String>();
		for(Departamento d : ListaDep){
			String D = d.getDepartamento();
			if(!temp.contains(D))
				temp.add(D);
		}
		return temp;
	}
	public List<Departamento> getListaDep(){
		List<Departamento> temp = new ArrayList<Departamento>();
		for (Departamento d : ListaDep) {
			temp.add(d);
		}
		return temp;
	}
	public List<Projeto> getListaProj(){
		List<Projeto> temp = new ArrayList<Projeto>();
			for(Projeto p: ListaProjeto){
				temp.add(p);
			}
		return temp;
	}
	public List<Chefe> getListaChefe(){
		List<Chefe> temp = new ArrayList<Chefe>();
			for(Chefe c: ListaChefia){
				temp.add(c);
			}
		return temp;
	}
	public List<Engenheiro> getListaEng(){
		List<Engenheiro> temp = new ArrayList<Engenheiro>();
			for(Engenheiro e: ListaEngenheiro){
				temp.add(e);
			}
		return temp;
	}
	
	public List<Departamento> removeDepartamento(String id){
		int Id;
		Id = Integer.parseInt(id);
		for(int i = 0; i < ListaDep.size(); i++){
			if(id.equals(i+"")){
				ListaDep.remove(Id);
				JOptionPane.showMessageDialog(null, "Exclúido");
				break;
			}
			else if(Id >= ListaDep.size()){
				JOptionPane.showMessageDialog(null, "ID inválido!");
				break;
			}
		}
		return ListaDep;
	}
	public List<Projeto> removeProjeto(String id){
		int Id;
		Id = Integer.parseInt(id);
		for(int i = 0; i < ListaProjeto.size(); i++){
			if(id.equals(i+"")){
				ListaProjeto.remove(Id);
				JOptionPane.showMessageDialog(null, "Exclúido");
				break;
			}
			else if(Id >= ListaProjeto.size()){
				JOptionPane.showMessageDialog(null, "ID inválido!");
				break;
			}
		}
		return ListaProjeto;
	}
	public List<Engenheiro> removeEngenheiro(String id){
		int Id;
		Id = Integer.parseInt(id);
		for(int i = 0; i < ListaEngenheiro.size(); i++){
			if(id.equals(i+"")){
				ListaEngenheiro.remove(Id);
				JOptionPane.showMessageDialog(null, "Exclúido");
				break;
			}
			else if(Id >= ListaEngenheiro.size()){
				JOptionPane.showMessageDialog(null, "ID inválido!");
				break;
			}
		}
		return ListaEngenheiro;
	}
	public List<Chefe> removeChefe(String id){
		int Id;
		Id = Integer.parseInt(id);
		for(int i = 0; i < ListaChefia.size(); i++){
			if(id.equals(i+"")){
				ListaChefia.remove(Id);
				JOptionPane.showMessageDialog(null, "Exclúido");
				break;
			}
			else if(Id >= ListaChefia.size()){
				JOptionPane.showMessageDialog(null, "ID inválido!");
				break;
			}
		}
		return ListaChefia;
	}

	
}

