import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class editDepartamento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblSelecioneUmDepartamento;
	private JLabel lblDepartamento;
	private JComboBox<String> comboBox;
	private JLabel lblNovoDepartamento;
	private JComboBox<String> comboBox_1;
	private JLabel lblNovoDepartamento_1;
	private JButton btnOk;
	private JLabel lblCampoObrigatrio;
	private JLabel lblCampoObrigatrio_1;
	private JLabel lblCampoObrigatrio_2;
	private String departamento;
	private String Novodepartamento;
	private JButton btnCancelar;
	
	public editDepartamento() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kaique\\Pictures\\logo.jpg"));
		setTitle("Editar Departamento");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblSelecioneUmDepartamento = new JLabel("Selecione um Departamento para Alterar:");
		lblSelecioneUmDepartamento.setBounds(10, 11, 292, 23);
		contentPane.add(lblSelecioneUmDepartamento);
		
		lblDepartamento = new JLabel("Departamento:");
		lblDepartamento.setBounds(10, 45, 92, 18);
		contentPane.add(lblDepartamento);
		
		comboBox = new JComboBox<String>();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				departamento = comboBox.getSelectedItem()+"";
			}
		});
		comboBox.setBounds(138, 44, 164, 20);
		contentPane.add(comboBox);
		comboBox.addItem(null);
		
		lblNovoDepartamento = new JLabel("Novo Departamento:");
		lblNovoDepartamento.setBounds(10, 118, 107, 14);
		contentPane.add(lblNovoDepartamento);
		
		comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(138, 115, 164, 20);
		contentPane.add(comboBox_1);
		comboBox_1.addItem(null);
		
		lblNovoDepartamento_1 = new JLabel("Novo Departamento: ");
		lblNovoDepartamento_1.setBounds(10, 157, 107, 23);
		contentPane.add(lblNovoDepartamento_1);
		
		textField = new JTextField();
		textField.setBounds(138, 158, 164, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(departamento==null){
					lblCampoObrigatrio.setVisible(true);
					JOptionPane.showMessageDialog(null, "Escolha um Departamento para Alterar!");
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
						for(int i = 0; i < Controller.getInstance().getListaDep().size(); i++){
							if(Controller.getInstance().getListaDep().get(i).getDepartamento().equals(departamento)){
								if(textField.getText().length() == 0){
									Novodepartamento = comboBox_1.getSelectedItem()+"";
									Controller.getInstance().getListaDep().get(i).setDepartamento(Novodepartamento);
									JOptionPane.showMessageDialog(null, "Alteração Realizada com Sucesso!");
								}
								else{
									Novodepartamento = textField.getText();
									Controller.getInstance().getListaDep().get(i).setDepartamento(Novodepartamento);
									JOptionPane.showMessageDialog(null, "Alteração Realizada com Sucesso!");
								
								}
							}
						}
					}
				}
			}
		});
		btnOk.setBounds(240, 227, 89, 23);
		contentPane.add(btnOk);
		
		lblCampoObrigatrio = new JLabel("Campo Obrigat\u00F3rio!");
		lblCampoObrigatrio.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio.setBounds(312, 47, 112, 14);
		contentPane.add(lblCampoObrigatrio);
		lblCampoObrigatrio.setVisible(false);
		
		lblCampoObrigatrio_1 = new JLabel("Campo Obrigat\u00F3rio!");
		lblCampoObrigatrio_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio_1.setBounds(312, 118, 112, 14);
		contentPane.add(lblCampoObrigatrio_1);
		lblCampoObrigatrio_1.setVisible(false);
		
		lblCampoObrigatrio_2 = new JLabel("Campo Obrigat\u00F3rio!");
		lblCampoObrigatrio_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio_2.setBounds(312, 161, 112, 14);
		contentPane.add(lblCampoObrigatrio_2);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller.getInstance().changeScreen(Constants.JANELA_CANCELAR);
			}
		});
		btnCancelar.setBounds(339, 227, 89, 23);
		contentPane.add(btnCancelar);
		lblCampoObrigatrio_2.setVisible(false);
	}
	public void boxDepartamento(){
		for(String d : Controller.getInstance().getDepto()){
				comboBox.addItem(d);
		}
	}
	public void boxNovoDepartamento(){
		for(String d : Controller.getInstance().getDepto()){
				comboBox_1.addItem(d);
		}
	}
	public void limpaTela() {
		textField.setText("");
	}
	
}
