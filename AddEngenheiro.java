import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddEngenheiro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private String Eng;
	private String Cargo;
	private Engenheiro eng;
	private JPanel panel;
	private JLabel lblEngenheiro;
	private JLabel lblCargo;
	private JLabel lblCampoObrigatrio;
	private JLabel lblCampoObrigatrio_1;
	private JButton btnCancelar;
	private JButton btnOk;
	
	public AddEngenheiro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kaique\\Pictures\\logo.jpg"));
		setTitle("Novo Engenheiro");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblEngenheiro = new JLabel("Engenheiro:*");
		lblEngenheiro.setBounds(10, 11, 102, 14);
		panel.add(lblEngenheiro);
		
		textField = new JTextField();
		textField.setBounds(112, 8, 164, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		lblCargo = new JLabel("Cargo:*");
		lblCargo.setBounds(10, 36, 102, 20);
		panel.add(lblCargo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(112, 36, 164, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		
		lblCampoObrigatrio = new JLabel("Campo Obrigat\u00F3rio");
		lblCampoObrigatrio.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio.setBounds(286, 11, 128, 14);
		panel.add(lblCampoObrigatrio);
		lblCampoObrigatrio.setVisible(false);
		
		lblCampoObrigatrio_1 = new JLabel("Campo Obrigat\u00F3rio");
		lblCampoObrigatrio_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio_1.setBounds(286, 39, 128, 14);
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
				if(textField.getText().length() > 0){
					lblCampoObrigatrio.setVisible(false);
				}
				else{
					lblCampoObrigatrio.setVisible(true);
				}
				if(textField_1.getText().length() > 0){
					lblCampoObrigatrio_1.setVisible(false);
				}
				else{
					lblCampoObrigatrio_1.setVisible(true);
				}
				if((textField.getText().length() > 0)
						&&(textField_1.getText().length() > 0)){
					Cargo = textField.getText();
					Eng = textField_1.getText();
					eng = new Engenheiro(Cargo, Eng);
					Controller.getInstance().insereEngenheiro(eng);
					JOptionPane.showMessageDialog(null,"Engenheiro Cadastrado com Sucesso! ");
				}
				else{
					JOptionPane.showMessageDialog(null,"Preencha o(s) Campo(s) Obrigatório! ");
				}
			}
		});
		btnOk.setBounds(226, 217, 89, 23);
		panel.add(btnOk);

	}
	public void limpaTela(){
		textField.setText("");
		textField_1.setText("");
	}
}
