import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addCidade extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblCampoObrigatrio;
	private JLabel lblCidade;
	private JButton btnCancelar;
	private JButton btnOk;
	private String cidade;
	private Cidade cid;
	
	public addCidade() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kaique\\Pictures\\logo.jpg"));
		setTitle("Nova Cidade");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(10, 11, 89, 22);
		contentPane.add(lblCidade);
		
		textField = new JTextField();
		textField.setBounds(71, 12, 211, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		lblCampoObrigatrio = new JLabel("Campo Obrigat\u00F3rio");
		lblCampoObrigatrio.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio.setBounds(292, 15, 132, 14);
		contentPane.add(lblCampoObrigatrio);
		lblCampoObrigatrio.setVisible(false);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller.getInstance().changeScreen(Constants.JANELA_CANCELAR);
			}
		});
		btnCancelar.setBounds(335, 227, 89, 23);
		contentPane.add(btnCancelar);
		
		btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().length() > 0){
					lblCampoObrigatrio.setVisible(false);
				}
				else{
					lblCampoObrigatrio.setVisible(true);
				}
				if((textField.getText().length() > 0)){
					cidade = textField.getText();
					cid = new Cidade(cidade);
					Controller.getInstance().insereCidade(cid);
					JOptionPane.showMessageDialog(null,"Cidade Cadastrado com Sucesso! ");
				}
				else{
					JOptionPane.showMessageDialog(null,"Insira uma Cidade! ");
				}
			}
		});
		btnOk.setBounds(236, 227, 89, 23);
		contentPane.add(btnOk);
	}
	public void limpaTela(){
		textField.setText("");
	}
}
