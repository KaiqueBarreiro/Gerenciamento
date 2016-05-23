import java.awt.BorderLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class removeDep extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JLabel lblDepartamento;
	private JList<String> list;
	private DefaultListModel<String> model;
	private JButton btnSearch;
	private JTextField textField_1;
	private JLabel lblDigiteOId;
	private String ID;
	private JButton btnOk;
	private JButton btnCancelar;
	
	public removeDep() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kaique\\Pictures\\logo.jpg"));
		setTitle("Remove Departamento");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblDepartamento = new JLabel("Clique em Search para Lista Departamento(s):");
		lblDepartamento.setBounds(10, 11, 270, 20);
		panel.add(lblDepartamento);
		
		model = new DefaultListModel<String>();
		list = new JList<String>();
		list.setBounds(10, 42, 281, 108);
		panel.add(list);
		list.setModel(model);
		model.addElement("ID     |    Departamentos");
		
		scrollPane = new JScrollPane(list);
		scrollPane.setBounds(10, 42, 281, 108);
		panel.add(scrollPane);
		
		btnSearch = new JButton("Search");
		btnSearch.setBounds(301, 10, 89, 23);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				verificaDepartamento();
			}
		});
		panel.add(btnSearch);
		
		lblDigiteOId = new JLabel("Digite o ID do Departamento Que Deseja Remover:");
		lblDigiteOId.setBounds(10, 161, 380, 20);
		panel.add(lblDigiteOId);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 190, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ID = textField_1.getText();
				Controller.getInstance().removeDepartamento(ID);
			}
		});
		btnOk.setBounds(225, 217, 89, 23);
		panel.add(btnOk);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller.getInstance().changeScreen(Constants.JANELA_CANCELAR);
			}
		});
		btnCancelar.setBounds(325, 217, 89, 23);
		panel.add(btnCancelar);
	}
	public void verificaDepartamento() {
		for(int i = 0; i < Controller.getInstance().getDepto().size(); i++){
			for(String d : Controller.getInstance().getDepto()){
				model.addElement(i+" "+d);
				i++;
			}
		}
	}
	
	public void limpaTela(){
		textField_1.setText("");
		model.clear();
	}
}

