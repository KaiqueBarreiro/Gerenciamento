import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class AddProjeto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String ChefeSelec;
	private Projeto Proj;
	private Chefe chefia;
	private JTextField textField;
	private String proj;
	private JComboBox<String> comboBox;
	private JPanel panel;
	private JLabel lblChefe;
	private JLabel lblProjeto;
	private JLabel lblCampoObrigatrio;
	private JLabel lblCampoObrigatrio_1;
	private JButton btnCancelar;
	private JButton btnOk;
	public AddProjeto() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kaique\\Pictures\\logo.jpg"));
		setTitle("Novo Projeto");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblChefe = new JLabel("Chefe:*");
		lblChefe.setBounds(10, 11, 66, 22);
		panel.add(lblChefe);
		
		comboBox = new JComboBox<String>();
		comboBox.addItem(null);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefeSelec = comboBox.getSelectedItem()+"";
			}
		});
		chefia = new Chefe(ChefeSelec);
		comboBox.setBounds(86, 12, 173, 20);
		panel.add(comboBox);
				
		lblProjeto = new JLabel("Projeto:*");
		lblProjeto.setBounds(10, 44, 66, 22);
		panel.add(lblProjeto);

		textField = new JTextField();
		textField.setBounds(86, 45, 173, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		lblCampoObrigatrio = new JLabel("Campo Obrigat\u00F3rio");
		lblCampoObrigatrio.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio.setBounds(269, 15, 90, 14);
		panel.add(lblCampoObrigatrio);
		lblCampoObrigatrio.setVisible(false);
		
		lblCampoObrigatrio_1 = new JLabel("Campo Obrigat\u00F3rio");
		lblCampoObrigatrio_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio_1.setBounds(269, 48, 90, 14);
		panel.add(lblCampoObrigatrio_1);
		lblCampoObrigatrio_1.setVisible(false);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller.getInstance().changeScreen(Constants.JANELA_CANCELAR);
			}
		});
		btnCancelar.setBounds(325, 217, 89, 23);
		panel.add(btnCancelar);
		
		btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				proj = textField.getText();
				if(proj.length() > 0){
					lblCampoObrigatrio_1.setVisible(false);
				}
				else{
					lblCampoObrigatrio_1.setVisible(true);
				}
				if(ChefeSelec != null){
					lblCampoObrigatrio.setVisible(false);
				}
				else{
					lblCampoObrigatrio.setVisible(true);
				}
				if((proj.length() > 0)
						&&(ChefeSelec != null)){
					Proj = new Projeto(proj);
					Controller.getInstance().insereProjeto(chefia, Proj);
					JOptionPane.showMessageDialog(null,"Projeto Cadastrado com Sucesso!");
				}
				else{
					JOptionPane.showMessageDialog(null,"Preencha o(s) Campo(s) Obrigatório! ");
				}
			}
		});
		btnOk.setBounds(226, 217, 89, 23);
		panel.add(btnOk);
	}
	public void boxChefes(List<Departamento> listaDep){
		for(Departamento d : listaDep){
			for(Chefe c : d.getChefes()){
				comboBox.addItem(c.getChefe());
			}
		}
	}
	public void limpaTela(){
		textField.setText("");
	}
}
