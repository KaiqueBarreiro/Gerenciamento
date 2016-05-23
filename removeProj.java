import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class removeProj extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextField textField_1;
	private JButton btnOk;
	private JLabel lblDigiteOId;
	private JList<String> list;
	private JLabel lblProjeto;
	private JPanel panel;
	private JButton btnSearch;
	private DefaultListModel<String> model;
	private String ID;
	private JLabel lblIdProjetos;
	private JButton btnCancelar;
	
	public removeProj() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kaique\\Pictures\\logo.jpg"));
		setTitle("Remove Projeto");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblProjeto = new JLabel("Clique em Seacrh Para Listar o(s) Projeto(s): ");
		lblProjeto.setBounds(10, 11, 270, 20);
		panel.add(lblProjeto);
		
		model = new DefaultListModel<String>();
		list = new JList<String>();
		list.setBounds(10, 61, 234, 106);
		panel.add(list);
		list.setModel(model);
		
		scrollPane = new JScrollPane(list);
		scrollPane.setBounds(10, 61, 234, 106);
		panel.add(scrollPane);
		
		
		lblDigiteOId = new JLabel("Digite o ID Que Deseja Remover:");
		lblDigiteOId.setBounds(10, 178, 234, 27);
		panel.add(lblDigiteOId);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 216, 156, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		btnOk = new JButton("Ok");
		btnOk.setBounds(238, 227, 89, 23);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ID = textField_1.getText();
				Controller.getInstance().removeProjeto(ID);
			}
		});
		panel.add(btnOk);
		
		btnSearch = new JButton("Search");
		btnSearch.setBounds(284, 10, 89, 23);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				verificaProjeto();
			}
		});
		panel.add(btnSearch);
		
		lblIdProjetos = new JLabel(" ID      Projetos");
		lblIdProjetos.setBounds(10, 34, 234, 27);
		panel.add(lblIdProjetos);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller.getInstance().changeScreen(Constants.JANELA_CANCELAR);
			}
		});
		btnCancelar.setBounds(335, 227, 89, 23);
		panel.add(btnCancelar);
	}
	public void verificaProjeto(){
		for(int i = 0; i < Controller.getInstance().getListaProj().size(); i++){
			for(Projeto proj : Controller.getInstance().getListaProj()){
				model.addElement(i+"     |     "+proj.getProjeto());
				i++;
			}
		}
	}
	public void limpaTela(){
		//textField.setText("");
		textField_1.setText("");
		model.clear();
	}
}
