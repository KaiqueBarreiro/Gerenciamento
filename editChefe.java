import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class editChefe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblSelecioneUmChefe;
	private JLabel lblChefe;
	private JComboBox<String> comboBox;
	private JLabel lblNovoChefe;
	private JComboBox<String> comboBox_1;
	private JLabel lblNovoChefe_1;
	private JButton btnOk;
	private JLabel lblCampoObrigatrio;
	private JLabel lblCampoObrigatrio_1;
	private JLabel lblCampoObrigatrio_2;
	private JTextField textField;
	private String chefe;
	private String Novochefe;
	private JButton btnCancelar;
	
	public editChefe() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kaique\\Pictures\\logo.jpg"));
		setTitle("Editar Chefe");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblSelecioneUmChefe = new JLabel("Selecione um Chefe para Alterar:");
		lblSelecioneUmChefe.setBounds(10, 11, 232, 29);
		contentPane.add(lblSelecioneUmChefe);
		
		lblChefe = new JLabel("Chefe: ");
		lblChefe.setBounds(10, 36, 46, 29);
		contentPane.add(lblChefe);
		
		comboBox = new JComboBox<String>();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chefe = comboBox.getSelectedItem()+"";
			}
		});
		comboBox.addItem(null);
		comboBox.setBounds(90, 40, 139, 20);
		contentPane.add(comboBox);
		
		lblNovoChefe = new JLabel("Novo Chefe: ");
		lblNovoChefe.setBounds(10, 97, 76, 24);
		contentPane.add(lblNovoChefe);
		
		comboBox_1 = new JComboBox<String>();
		comboBox_1.addItem(null);
		comboBox_1.setBounds(90, 99, 139, 20);
		contentPane.add(comboBox_1);
		
		lblNovoChefe_1 = new JLabel("Novo Chefe: ");
		lblNovoChefe_1.setBounds(10, 132, 76, 20);
		contentPane.add(lblNovoChefe_1);
		
		btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chefe==null){
					lblCampoObrigatrio.setVisible(true);
					JOptionPane.showMessageDialog(null, "Escolha um Chefe para Alterar!");
				}
				else{
					lblCampoObrigatrio.setVisible(false);
					if((textField.getText().length() == 0)&&( comboBox_1.getSelectedItem() == null)){
						lblCampoObrigatrio_1.setVisible(true);
						lblCampoObrigatrio_2.setVisible(true);
						JOptionPane.showMessageDialog(null, "Um dos Campos é Obrigatório!");
					}
					else if((textField.getText().length() > 0)&&( comboBox_1.getSelectedItem() != null)){
						JOptionPane.showMessageDialog(null, "Escolha ou Digite Apenas um dos Campos!");
					}
					else{
						lblCampoObrigatrio_1.setVisible(false);
						lblCampoObrigatrio_2.setVisible(false);
						for(int i = 0; i < Controller.getInstance().getListaChefe().size(); i++){
							if(Controller.getInstance().getListaChefe().get(i).getChefe().equals(chefe)){
								if(textField.getText().length() == 0){
									Novochefe = comboBox_1.getSelectedItem()+"";
									Controller.getInstance().getListaChefe().get(i).setChefe(Novochefe);
									JOptionPane.showMessageDialog(null, "Alteração Realizada com Sucesso!");
								}
								else{
									Novochefe = textField.getText();
									Controller.getInstance().getListaChefe().get(i).setChefe(Novochefe);
									JOptionPane.showMessageDialog(null, "Alteração Realizada com Sucesso!");
								}
							}
						}
					}
				}
			}
		});
		btnOk.setBounds(239, 227, 89, 23);
		contentPane.add(btnOk);
		
		lblCampoObrigatrio = new JLabel("Campo Obrigat\u00F3rio!");
		lblCampoObrigatrio.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio.setBounds(239, 43, 146, 14);
		contentPane.add(lblCampoObrigatrio);
		lblCampoObrigatrio.setVisible(false);
		
		lblCampoObrigatrio_1 = new JLabel("Campo Obrigat\u00F3rio!");
		lblCampoObrigatrio_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio_1.setBounds(239, 102, 146, 14);
		contentPane.add(lblCampoObrigatrio_1);
		lblCampoObrigatrio_1.setVisible(false);
		
		lblCampoObrigatrio_2 = new JLabel("Campo Obrigat\u00F3rio!");
		lblCampoObrigatrio_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio_2.setBounds(239, 135, 146, 14);
		contentPane.add(lblCampoObrigatrio_2);
		lblCampoObrigatrio_2.setVisible(false);
		
		textField = new JTextField();
		textField.setBounds(90, 132, 139, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller.getInstance().changeScreen(Constants.JANELA_CANCELAR);
			}
		});
		btnCancelar.setBounds(335, 227, 89, 23);
		contentPane.add(btnCancelar);
	}

	public void boxChefe(List<Chefe> listaChefe){
		for(Chefe c : listaChefe){
			comboBox.addItem(c.getChefe());
		}
	}
	public void boxNovoChefe(List<Chefe> listaChefe){
		for(Chefe c : listaChefe){
			comboBox_1.addItem(c.getChefe());
		}
	}

	public void limpaTela() {
		textField.setText("");
	}
}
