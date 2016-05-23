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

public class removeChefe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JLabel lblIdChefe;
	private JLabel lblChefe;
	private JButton btnSeacrh;
	private JList<String> list;
	private JLabel lblDigiteOId;
	private JButton btnOk;
	private DefaultListModel<String>model;
	private String ID;
	private	JButton btnCancelar;
	private JScrollPane scrollPane;
	
	public removeChefe() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kaique\\Pictures\\logo.jpg"));
		setTitle("Remove Chefe");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblChefe = new JLabel("Clique em Search para Listar o(s) Chefe(s): ");
		lblChefe.setBounds(10, 11, 250, 23);
		contentPane.add(lblChefe);
		
		
		btnSeacrh = new JButton("Seacrh");
		btnSeacrh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificaChefe();
			}
		});
		btnSeacrh.setBounds(270, 11, 89, 23);
		contentPane.add(btnSeacrh);
		
		model = new DefaultListModel<String>();
		list = new JList<String>();
		list.setBounds(10, 60, 229, 100);
		contentPane.add(list);
		list.setModel(model);
		
		scrollPane = new JScrollPane(list);
		scrollPane.setBounds(10, 60, 229, 100);
		contentPane.add(scrollPane);
		getContentPane().add(scrollPane);
		
		lblDigiteOId = new JLabel("Digite o ID que deseja Remover:");
		lblDigiteOId.setBounds(10, 171, 229, 23);
		contentPane.add(lblDigiteOId);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 201, 154, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ID = textField_1.getText();
				Controller.getInstance().removeChefe(ID);
			}
		});
		btnOk.setBounds(236, 215, 89, 23);
		contentPane.add(btnOk);
		
		lblIdChefe = new JLabel(" ID      Chefe");
		lblIdChefe.setBounds(10, 45, 239, 14);
		contentPane.add(lblIdChefe);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller.getInstance().changeScreen(Constants.JANELA_CANCELAR);
			}
		});
		btnCancelar.setBounds(335, 215, 89, 23);
		contentPane.add(btnCancelar);
	}
	public void verificaChefe(){
		for(int i = 0; i < Controller.getInstance().getListaChefe().size(); i++){
			for(Chefe chef : Controller.getInstance().getListaChefe()){
				model.addElement(i+"     |     "+chef.getChefe());
				i++;
			}
		}
	}
	public void limpaTela(){
		textField_1.setText("");
		model.clear();
	}
}
