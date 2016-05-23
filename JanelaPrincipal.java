import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;

public class JanelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar = new JMenuBar();
	private JMenu mnEdit;
	private JMenuItem mntmProjeto;
	private JMenuItem mntmEngenheiros_1;
	private JMenu mnAdd;
	private JMenuItem mntmExit_1;
	private JMenu mnNew;
	private JMenuItem mntmProjeto_1;
	private JMenuItem mntmEngenheiro;
	private JPanel panel;
	private JMenuItem mntmNovoChefe;
	private JMenuItem mntmNovoDepartamento;
	private JMenuItem mntmChefe;
	private JMenuItem mntmDepartamento_1;
	private JMenuItem mntmChefe_1;
	private JMenu mnListagem;
	private JMenuItem mntmEngenheiros;
	private JMenuItem mntmProjetos;
	private JMenuItem mntmDepartamento;
	private JMenuItem mntmNovaCidade;
	private JMenu mnRemove;
	private JMenuItem mntmDepartamento_2;
	private JMenuItem mntmProjeto_2;
	private JLabel lblByAdanKaique;
	
	public JanelaPrincipal() {
		setFont(new Font("Arial", Font.PLAIN, 16));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kaique\\Pictures\\logo.jpg"));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sistema De Gerenciamento De Engenharia - PROG 3");
		setBounds(200, 100, 500, 500);

		setJMenuBar(menuBar);

		mnAdd = new JMenu("File");
		menuBar.add(mnAdd);

		mntmExit_1 = new JMenuItem("Exit");
		mntmExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		mnNew = new JMenu("New");
		mnAdd.add(mnNew);
		
		mntmProjeto_1 = new JMenuItem("Novo Departamento");
		mntmProjeto_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.getInstance().changeScreen(Constants.JANELA_ADD_DEPARTAMENTO);
			}
		});
		mnNew.add(mntmProjeto_1);
		
		mntmNovoDepartamento = new JMenuItem("Novo Projeto");
		mntmNovoDepartamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Controller.getInstance().changeScreen(Constants.JANELA_ADD_PROJETO);
			}
		});
		mnNew.add(mntmNovoDepartamento);
		
		mntmNovoChefe = new JMenuItem("Novo Chefe");
		mntmNovoChefe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.getInstance().changeScreen(Constants.JANELA_ADD_CHEFE);
			}
		});
		mnNew.add(mntmNovoChefe);

		mntmEngenheiro = new JMenuItem("Novo Engenheiro");
		mntmEngenheiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.getInstance().changeScreen(Constants.JANELA_ADD_ENGENHEIRO);
			}
		});
		mnNew.add(mntmEngenheiro);
		
		mntmNovaCidade = new JMenuItem("Nova Cidade");
		mntmNovaCidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller.getInstance().changeScreen(Constants.JANELA_ADD_CIDADE);
			}
		});
		mnNew.add(mntmNovaCidade);
		mnAdd.add(mntmExit_1);

		mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		mntmDepartamento_1 = new JMenuItem("Departamento");
		mntmDepartamento_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.getInstance().changeScreen(Constants.JANELA_EDIT_DEPARTAMENTO);
			}
		});
		mnEdit.add(mntmDepartamento_1);

		mntmProjeto = new JMenuItem("Projeto");
		mntmProjeto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.getInstance().changeScreen(Constants.JANELA_EDIT_PROJETO);
			}
		});
		mnEdit.add(mntmProjeto);
		
		mntmChefe = new JMenuItem("Chefe");
		mntmChefe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.getInstance().changeScreen(Constants.JANELA_EDIT_CHEFE);
			}
		});
		mnEdit.add(mntmChefe);

		mntmEngenheiros_1 = new JMenuItem("Engenheiros");
		mntmEngenheiros_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.getInstance().changeScreen(Constants.JANELA_EDIT_ENGENHEIRO);
			}
		});
		mnEdit.add(mntmEngenheiros_1);
		
		mnRemove = new JMenu("Remove");
		menuBar.add(mnRemove);
		
		mntmDepartamento_2 = new JMenuItem("Departamento");
		mntmDepartamento_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller.getInstance().changeScreen(Constants.JANELA_REMOVE_DEPARTAMENTO);
			}
		});
		mnRemove.add(mntmDepartamento_2);
		
		mntmProjeto_2 = new JMenuItem("Projeto");
		mntmProjeto_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller.getInstance().changeScreen(Constants.JANELA_REMOVE_PROJETO);
			}
		});
		mnRemove.add(mntmProjeto_2);
		
		JMenuItem mntmChefe_2 = new JMenuItem("Chefe");
		mntmChefe_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller.getInstance().changeScreen(Constants.JANELA_REMOVE_CHEFE);
			}
		});
		mnRemove.add(mntmChefe_2);
		
		JMenuItem mntmEngenheiro_1 = new JMenuItem("Engenheiro");
		mntmEngenheiro_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.getInstance().changeScreen(Constants.JANELA_REMOVE_ENGENHEIRO);
			}
		});
		mnRemove.add(mntmEngenheiro_1);

		mnListagem = new JMenu("List");
		menuBar.add(mnListagem);

		mntmEngenheiros = new JMenuItem("Engenheiros");
		mntmEngenheiros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.getInstance().changeScreen(Constants.JANELA_LISTAGEM_ENGENHEIRO);
			}
		});

		mntmProjetos = new JMenuItem("Projetos");
		mntmProjetos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller.getInstance().changeScreen(Constants.JANELA_LISTAGEM_PROJETO);
			}
		});
		
		mntmDepartamento = new JMenuItem("Departamento");
		mntmDepartamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller.getInstance().changeScreen(Constants.JANELA_LISTAGEM_DEPARTAMENTO);
			}
		});
		mnListagem.add(mntmDepartamento);
		mnListagem.add(mntmProjetos);
		
		mntmChefe_1 = new JMenuItem("Chefe");
		mntmChefe_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller.getInstance().changeScreen(Constants.JANELA_LISTAGEM_CHEFE);
			}
		});
		mnListagem.add(mntmChefe_1);
		mnListagem.add(mntmEngenheiros);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panel = new JPanel();
		panel.setBorder(null);
		panel.setForeground(Color.BLACK);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblByAdanKaique = new JLabel("by: Adan Kaique Ferraz Barreiro - UP - 05/2016 - Curitiba/PR");
		lblByAdanKaique.setBounds(72, 405, 352, 14);
		panel.add(lblByAdanKaique);

	}
}
