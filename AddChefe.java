import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class AddChefe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private String chefia;
	private Chefe chef;
	private JButton btnOk;
	private JPanel panel;
	private JLabel lblChefe;
	private JButton btnCancelar;
	private JLabel lblCampoObrigatrio;
	
	public AddChefe() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kaique\\Pictures\\logo.jpg"));
		setTitle("Novo Chefe");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblChefe = new JLabel("Chefe:");
		lblChefe.setBounds(10, 11, 79, 27);
		panel.add(lblChefe);
		
		textField = new JTextField();
		textField.setBounds(56, 14, 195, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller.getInstance().changeScreen(Constants.JANELA_CANCELAR);
			}
		});
		btnCancelar.setBounds(325, 217, 89, 23);
		panel.add(btnCancelar);	
		
		lblCampoObrigatrio = new JLabel("Campo Obrigat\u00F3rio");
		lblCampoObrigatrio.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio.setBounds(261, 17, 110, 14);
		panel.add(lblCampoObrigatrio);
		lblCampoObrigatrio.setVisible(false);
		
		btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() > 0) {
					lblCampoObrigatrio.setVisible(false);
		        } else {
		        	lblCampoObrigatrio.setVisible(true);
		        }
				if(textField.getText().length() > 0){
					chefia = textField.getText();
					chef = new Chefe(chefia);
					Controller.getInstance().insereChefe(chef);
					JOptionPane.showMessageDialog(null,"Chefe Cadastrado com Sucesso! ");
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
	}
}
