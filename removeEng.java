import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class removeEng extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextField textField_1;
	private JButton btnOk;
	private JLabel lblDigiteUmNome;
	private JButton btnSearch;
	private JLabel lblIdEngenheiros;
	private JList<String> list;
	private JLabel lblDigiteOId;
	private String ID;
	private DefaultListModel<String>model;
	private JButton btnCancelar;
	
	public removeEng() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kaique\\Pictures\\logo.jpg"));
		setTitle("Remove Engenheiros");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblDigiteUmNome = new JLabel("Clique em Search Para Listar Engenheiro(s):");
		lblDigiteUmNome.setBounds(10, 11, 200, 22);
		contentPane.add(lblDigiteUmNome);
		
		btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificaEng();
			}
		});
		btnSearch.setBounds(275, 11, 89, 23);
		contentPane.add(btnSearch);
		
		lblIdEngenheiros = new JLabel("ID     Engenheiros");
		lblIdEngenheiros.setBounds(10, 44, 139, 22);
		contentPane.add(lblIdEngenheiros);
		
		model = new DefaultListModel<String>();
		list = new JList<String>();
		list.setBounds(10, 66, 350, 110);
		contentPane.add(list);
		list.setModel(model);
		
		scrollPane = new JScrollPane(list);
		scrollPane.setBounds(10, 66, 350, 110);
		contentPane.add(scrollPane);
		getContentPane().add(scrollPane);
		
		lblDigiteOId = new JLabel("Digite o ID que deseja Remover:");
		lblDigiteOId.setBounds(10, 183, 255, 22);
		contentPane.add(lblDigiteOId);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 216, 161, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ID = textField_1.getText();
				Controller.getInstance().removeEngenheiro(ID);
			}
		});
		btnOk.setBounds(237, 227, 89, 23);
		contentPane.add(btnOk);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller.getInstance().changeScreen(Constants.JANELA_CANCELAR);
			}
		});
		btnCancelar.setBounds(335, 227, 89, 23);
		contentPane.add(btnCancelar);
	}
	public void verificaEng(){
		for(int i = 0; i < Controller.getInstance().getListaEng().size(); i++){
			for(Engenheiro e : Controller.getInstance().getListaEng()){
				model.addElement(i+"     |     "+e.getEng()+" - "+e.getTipo());
				i++;
			}
		}
	}
	public void limpaTela(){
		textField_1.setText("");
		model.clear();
	}
}
