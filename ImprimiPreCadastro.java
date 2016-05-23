import java.util.List;

public class ImprimiPreCadastro {
	private String dep1,dep2,dep3, dep4, dep5, dep6, dep7, dep8, dep9, dep10;
	private String cid1, cid2, cid3, cid4, cid5, cid6, cid7, cid8, cid9, cid10;
	private Chefe chef1, chef2,chef3, chef4,chef5,chef6,chef7,chef8,chef9,chef10;
	private String chefe1, chefe2, chefe3, chefe4, chefe5, chefe6, chefe7, chefe8, chefe9, chefe10;
	private Cidade cidade1, cidade2, cidade3, cidade4, cidade5, cidade6, cidade7, cidade8, cidade9, cidade10;
	private Projeto projeto1, projeto2, projeto3, projeto4, projeto5, projeto6, projeto7, projeto8, projeto9, projeto10;
	private Engenheiro engenheiro1, engenheiro2,engenheiro3,engenheiro4,engenheiro5,engenheiro6,engenheiro7,engenheiro8,engenheiro9,engenheiro10;
	private Engenheiro engenheiro11, engenheiro12,engenheiro13,engenheiro14,engenheiro15,engenheiro16,engenheiro17,engenheiro18,engenheiro19,engenheiro20;
	private Departamento departamento1;
	
	public ImprimiPreCadastro(List<Departamento>listaDep){
		/*
		 * Dando Valores paras as Variáveis
		 * */
		
		dep1 = "Construção"; dep2 = "TI"; dep3 = "Informação"; dep4 = "Redes"; dep5 = "Logistica";
		dep6 = "Saúde"; dep7 = "Educação"; dep8 = "Mecânica"; dep9 = "Eletrônica"; dep10 = "Embarcados";
		cid1 = "Curitiba"; cid2 = "São Paulo";cid3 = "Ponta Grossa";cid4 = "Maringá";cid5 = "Porto Alegre";
		cid6 = "Bahia"; cid7 = "Rio de Janeiro";cid8 = "Sorocaba";cid9 = "Ourinhos";cid10 = "Paranagua";
		chefe1 = "Kaique";chefe2 = "Ana";chefe3 = "Gustavo";chefe4 = "Jady";chefe5 = "Eduardo";
		chefe6 = "Mari";chefe7 = "Abel";chefe8 = "Felipe";chefe9 = "Cristhian";chefe10 = "Luiz";
		
		/*
		 * Classes recebendo suas informações
		 * */
		
		departamento1 = new Departamento();
		
		chef1 = new Chefe(chefe1);chef2 = new Chefe(chefe2);chef3 = new Chefe(chefe3);chef4 = new Chefe(chefe4);chef5 = new Chefe(chefe5);
		chef6 = new Chefe(chefe6);chef7 = new Chefe(chefe7);chef8 = new Chefe(chefe8);chef9 = new Chefe(chefe9);chef10 = new Chefe(chefe10);
		
		cidade1 = new Cidade(cid1);cidade2 = new Cidade(cid2);cidade3 = new Cidade(cid3);cidade4 = new Cidade(cid4);cidade5 = new Cidade(cid5);
		cidade6 = new Cidade(cid6);cidade7 = new Cidade(cid7);cidade8 = new Cidade(cid8);cidade9 = new Cidade(cid9);cidade10 = new Cidade(cid10);
		
		projeto1 = new Projeto("Prédio");projeto2 = new Projeto("Software");projeto3 = new Projeto("WEB");projeto4 = new Projeto("Modem");projeto5 = new Projeto("Organização");
		projeto6 = new Projeto("Hospital");projeto7 = new Projeto("Escola");projeto8 = new Projeto("Carro");projeto9 = new Projeto("CI");projeto10 = new Projeto("Drone");
		
		engenheiro1 = new Engenheiro("Engenheiro Civil", "João Gordo");engenheiro2 = new Engenheiro("Engenheiro Computação", "João Magro");engenheiro3 = new Engenheiro("Engenheiro Software", "João Batista");
		engenheiro4 = new Engenheiro("Engenheiro Redes", "Silva Siqueira");engenheiro5 = new Engenheiro("Engenheiro Logistica", "Wilson Matias");engenheiro6 = new Engenheiro("Engenheiro Biomédico", "Valdemiro Santos");
		engenheiro7 = new Engenheiro("Engenheiro Social", "Maria Joaquina");engenheiro8 = new Engenheiro("Engenheiro Mecânico", "Felipe Viola");engenheiro9 = new Engenheiro("Engenheiro Elétrica", "Jady Lopes");
		engenheiro10 = new Engenheiro("Engenheiro Eletrônica", "Joacir Castro");
		engenheiro11 = new Engenheiro("Engenheiro Civil", "Ana Morais");engenheiro12 = new Engenheiro("Engenheiro Computação", "Roberta Diniz");engenheiro13 = new Engenheiro("Engenheiro Software", "Jessyca Lepinks");
		engenheiro14 = new Engenheiro("Engenheiro Redes", "Bradd Pitt");engenheiro15 = new Engenheiro("Engenheiro Logistica", "Camila Bravanel");engenheiro16 = new Engenheiro("Engenheiro Biomédico", "Bruno Ferraz");
		engenheiro17 = new Engenheiro("Engenheiro Social", "Angelina Jolie");engenheiro18 = new Engenheiro("Engenheiro Mecânico", "Robert Langdon");engenheiro19 = new Engenheiro("Engenheiro Elétrica", "Martin Houck");
		engenheiro20 = new Engenheiro("Engenheiro Eletrônica", "Welmo Junior");
		
		/*
		 * Adicionando nas Listas
		 * */
		
		departamento1.addCidade(cidade1);departamento1.addCidade(cidade2);departamento1.addCidade(cidade3);departamento1.addCidade(cidade4);departamento1.addCidade(cidade5);
		departamento1.addCidade(cidade6);departamento1.addCidade(cidade7);departamento1.addCidade(cidade8);departamento1.addCidade(cidade9);departamento1.addCidade(cidade10);
		
		departamento1.addChefe(chef1);departamento1.addChefe(chef2);departamento1.addChefe(chef3);departamento1.addChefe(chef4);departamento1.addChefe(chef5);
		departamento1.addChefe(chef6);departamento1.addChefe(chef7);departamento1.addChefe(chef8);departamento1.addChefe(chef9);departamento1.addChefe(chef10);
		
		departamento1.addProjeto(projeto1);departamento1.addProjeto(projeto2);departamento1.addProjeto(projeto3);departamento1.addProjeto(projeto4);departamento1.addProjeto(projeto5);
		departamento1.addProjeto(projeto6);departamento1.addProjeto(projeto7);departamento1.addProjeto(projeto8);departamento1.addProjeto(projeto9);departamento1.addProjeto(projeto10);
		
		departamento1.addEng(engenheiro1);departamento1.addEng(engenheiro2);departamento1.addEng(engenheiro3);departamento1.addEng(engenheiro4);departamento1.addEng(engenheiro5);
		departamento1.addEng(engenheiro6);departamento1.addEng(engenheiro7);departamento1.addEng(engenheiro8);departamento1.addEng(engenheiro9);departamento1.addEng(engenheiro10);
		departamento1.addEng(engenheiro11);departamento1.addEng(engenheiro12);departamento1.addEng(engenheiro13);departamento1.addEng(engenheiro14);departamento1.addEng(engenheiro15);
		departamento1.addEng(engenheiro16);departamento1.addEng(engenheiro17);departamento1.addEng(engenheiro18);departamento1.addEng(engenheiro19);departamento1.addEng(engenheiro20);
		
		/*
		 * Inserindo
		 * */
		
		Controller.getInstance().insereChefe(chef1);Controller.getInstance().insereChefe(chef2);Controller.getInstance().insereChefe(chef3);Controller.getInstance().insereChefe(chef4);Controller.getInstance().insereChefe(chef5);
		Controller.getInstance().insereChefe(chef6);Controller.getInstance().insereChefe(chef7);Controller.getInstance().insereChefe(chef8);Controller.getInstance().insereChefe(chef9);Controller.getInstance().insereChefe(chef10);
		
		Controller.getInstance().insereCidade(cidade1);Controller.getInstance().insereCidade(cidade2);Controller.getInstance().insereCidade(cidade3);Controller.getInstance().insereCidade(cidade4);Controller.getInstance().insereCidade(cidade5);
		Controller.getInstance().insereCidade(cidade6);Controller.getInstance().insereCidade(cidade7);Controller.getInstance().insereCidade(cidade8);Controller.getInstance().insereCidade(cidade9);Controller.getInstance().insereCidade(cidade10);
		
		Controller.getInstance().insereEngenheiro(engenheiro1);Controller.getInstance().insereEngenheiro(engenheiro2);Controller.getInstance().insereEngenheiro(engenheiro3);Controller.getInstance().insereEngenheiro(engenheiro4);Controller.getInstance().insereEngenheiro(engenheiro5);
		Controller.getInstance().insereEngenheiro(engenheiro6);Controller.getInstance().insereEngenheiro(engenheiro7);Controller.getInstance().insereEngenheiro(engenheiro8);Controller.getInstance().insereEngenheiro(engenheiro9);Controller.getInstance().insereEngenheiro(engenheiro10);
		Controller.getInstance().insereEngenheiro(engenheiro11);Controller.getInstance().insereEngenheiro(engenheiro12);Controller.getInstance().insereEngenheiro(engenheiro13);Controller.getInstance().insereEngenheiro(engenheiro14);Controller.getInstance().insereEngenheiro(engenheiro15);
		Controller.getInstance().insereEngenheiro(engenheiro16);Controller.getInstance().insereEngenheiro(engenheiro17);Controller.getInstance().insereEngenheiro(engenheiro18);Controller.getInstance().insereEngenheiro(engenheiro19);Controller.getInstance().insereEngenheiro(engenheiro20);
		
		Controller.getInstance().insereProjeto(chef1, projeto1);Controller.getInstance().insereProjeto(chef2, projeto2);Controller.getInstance().insereProjeto(chef3, projeto3);Controller.getInstance().insereProjeto(chef4, projeto4);Controller.getInstance().insereProjeto(chef5, projeto5);
		Controller.getInstance().insereProjeto(chef6, projeto6);Controller.getInstance().insereProjeto(chef7, projeto7);Controller.getInstance().insereProjeto(chef8, projeto8);Controller.getInstance().insereProjeto(chef9, projeto9);Controller.getInstance().insereProjeto(chef10, projeto10);
		
		Controller.getInstance().insereDepartamento(dep1, chef1, cidade1, projeto1, engenheiro1);Controller.getInstance().insereDepartamento(dep1, chef1, cidade1, projeto1, engenheiro11);
		Controller.getInstance().insereDepartamento(dep2, chef2, cidade2, projeto2, engenheiro2);Controller.getInstance().insereDepartamento(dep2, chef2, cidade2, projeto2, engenheiro12);
		Controller.getInstance().insereDepartamento(dep3, chef3, cidade3, projeto3, engenheiro3);Controller.getInstance().insereDepartamento(dep3, chef3, cidade3, projeto3, engenheiro13);
		Controller.getInstance().insereDepartamento(dep4, chef4, cidade4, projeto4, engenheiro4);Controller.getInstance().insereDepartamento(dep4, chef4, cidade4, projeto4, engenheiro14);
		Controller.getInstance().insereDepartamento(dep5, chef5, cidade5, projeto5, engenheiro5);Controller.getInstance().insereDepartamento(dep5, chef5, cidade5, projeto5, engenheiro15);
		Controller.getInstance().insereDepartamento(dep6, chef6, cidade6, projeto6, engenheiro6);Controller.getInstance().insereDepartamento(dep6, chef6, cidade6, projeto6, engenheiro16);
		Controller.getInstance().insereDepartamento(dep7, chef7, cidade7, projeto7, engenheiro7);Controller.getInstance().insereDepartamento(dep7, chef7, cidade7, projeto7, engenheiro17);
		Controller.getInstance().insereDepartamento(dep8, chef8, cidade8, projeto8, engenheiro8);Controller.getInstance().insereDepartamento(dep8, chef8, cidade8, projeto8, engenheiro18);
		Controller.getInstance().insereDepartamento(dep9, chef9, cidade9, projeto9, engenheiro9);Controller.getInstance().insereDepartamento(dep9, chef9, cidade9, projeto9, engenheiro19);
		Controller.getInstance().insereDepartamento(dep10, chef10, cidade10, projeto10, engenheiro10);Controller.getInstance().insereDepartamento(dep10, chef10, cidade10, projeto10, engenheiro20);		
	}
}
