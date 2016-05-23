import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class editProjeto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblProjeto;
	private JComboBox<String> comboBox;
	private JLabel lblNovoProjeto;
	private JComboBox<String> comboBox_1;
	private JLabel lblNovoProjeto_1;
	private JButton btnOk;
	private JLabel lblSelecioneUmProjeto;
	private String projeto;
	private String Novoprojeto;
	private JLabel lblCampoObrigatrio;
	private JLabel lblCampoObrigatrio_1;
	private JLabel lblCampoObrigatrio_2;
	private JButton btnCancelar;
	
	public editProjeto() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kaique\\Pictures\\logo.jpg"));
		setTitle("Editar Projeto");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblProjeto = new JLabel("Projeto:");
		lblProjeto.setBounds(10, 63, 84, 22);
		contentPane.add(lblProjeto);
		
		comboBox = new JComboBox<String>();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				projeto = comboBox.getSelectedItem()+"";
			}
		});
		comboBox.addItem(null);
		comboBox.setBounds(92, 64, 147, 20);
		contentPane.add(comboBox);
		
		lblNovoProjeto = new JLabel("Novo Projeto: ");
		lblNovoProjeto.setBounds(10, 114, 84, 22);
		contentPane.add(lblNovoProjeto);
		
		comboBox_1 = new JComboBox<String>();
		comboBox_1.addItem(null);
		comboBox_1.setBounds(92, 115, 147, 20);
		contentPane.add(comboBox_1);
		
		lblNovoProjeto_1 = new JLabel("Novo Projeto: ");
		lblNovoProjeto_1.setBounds(10, 168, 84, 22);
		contentPane.add(lblNovoProjeto_1);
		
		textField = new JTextField();
		textField.setBounds(92, 169, 147, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(projeto==null){
					lblCampoObrigatrio.setVisible(true);
					JOptionPane.showMessageDialog(null, "Escolha um Projeto para Alterar!");
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
						for(int i = 0; i < Controller.getInstance().getListaProj().size(); i++){
							if(Controller.getInstance().getListaProj().get(i).getProjeto().equals(projeto)){
								if(textField.getText().length() == 0){
									Novoprojeto = comboBox_1.getSelectedItem()+"";
									Controller.getInstance().getListaProj().get(i).setProjeto(Novoprojeto);
									JOptionPane.showMessageDialog(null, "Alteração Realizada com Sucesso!");
								}
								else{
									Novoprojeto = textField.getText();
									Controller.getInstance().getListaProj().get(i).setProjeto(Novoprojeto);
									JOptionPane.showMessageDialog(null, "Alteração Realizada com Sucesso!");
								
								}
							}
						}
					}
				}
			}
		});
		btnOk.setBounds(236, 227, 89, 23);
		contentPane.add(btnOk);
		
		lblSelecioneUmProjeto = new JLabel("Selecione um Projeto para Alterar:");
		lblSelecioneUmProjeto.setBounds(10, 30, 200, 22);
		contentPane.add(lblSelecioneUmProjeto);
		
		lblCampoObrigatrio = new JLabel("Campo Obrigat\u00F3rio!");
		lblCampoObrigatrio.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio.setBounds(249, 67, 175, 14);
		contentPane.add(lblCampoObrigatrio);
		lblCampoObrigatrio.setVisible(false);
		
		lblCampoObrigatrio_1 = new JLabel("Campo Obrigat\u00F3rio!");
		lblCampoObrigatrio_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio_1.setBounds(249, 118, 175, 14);
		contentPane.add(lblCampoObrigatrio_1);
		lblCampoObrigatrio_1.setVisible(false);
		
		lblCampoObrigatrio_2 = new JLabel("Campo Obrigat\u00F3rio!");
		lblCampoObrigatrio_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio_2.setBounds(249, 172, 127, 14);
		contentPane.add(lblCampoObrigatrio_2);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller.getInstance().changeScreen(Constants.JANELA_CANCELAR);
			}
		});
		btnCancelar.setBounds(335, 227, 89, 23);
		contentPane.add(btnCancelar);
		lblCampoObrigatrio_2.setVisible(false);
	}
	public void boxProjeto(List<Projeto> listaProj){
		for(Projeto p : listaProj){
			comboBox_1.addItem(p.getProjeto());
		}
	}
	public void boxNovoProjeto(List<Projeto> listaProj){
		for(Projeto p : listaProj){
			comboBox.addItem(p.getProjeto());
		}
	}
	public void limpaTela() {
		textField.setText("");		
	}
}
