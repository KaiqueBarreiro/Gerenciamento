import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class editEngenheiro extends JFrame {

private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblSelecioneUmEngenheiro;
	private JLabel lblEngenheiro;
	private JComboBox<String> comboBox;
	private JLabel lblNovoEngenheiro;
	private JComboBox<String> comboBox_1;
	private JLabel lblNovoCargo;
	private JComboBox<String> comboBox_2;
	private JLabel lblNovoEngenheiro_1;
	private JLabel lblNovoCargo_1;
	private JLabel lblCampoObrigatrio;
	private JLabel lblCampoObrigatrio_1;
	private JLabel lblCampoObrigatrio_2;
	private JLabel lblCampoObrigatrio_3;
	private JLabel lblCampoObrigatrio_4;
	private JButton btnCancelar;
	private JButton btnOk;
	private String engenheiro;
	private String Novoengenheiro;
	private String Novocargo;
	private JLabel lblCampoObrigatrio_5;
	
	public editEngenheiro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kaique\\Pictures\\logo.jpg"));
		setTitle("Editar Engenheiro");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblSelecioneUmEngenheiro = new JLabel("Selecione um Engenheiro para Alterar: ");
		lblSelecioneUmEngenheiro.setBounds(10, 11, 199, 23);
		contentPane.add(lblSelecioneUmEngenheiro);
		
		lblEngenheiro = new JLabel("Engenheiro: ");
		lblEngenheiro.setBounds(10, 45, 93, 20);
		contentPane.add(lblEngenheiro);
		
		comboBox = new JComboBox<String>();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				engenheiro = comboBox.getSelectedItem()+"";
			}
		});
		comboBox.setBounds(130, 45, 250, 20);
		contentPane.add(comboBox);
		comboBox.addItem(null);
		
		lblNovoEngenheiro = new JLabel("Novo Engenheiro: ");
		lblNovoEngenheiro.setBounds(10, 117, 116, 14);
		contentPane.add(lblNovoEngenheiro);
		
		comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(136, 114, 152, 20);
		contentPane.add(comboBox_1);
		comboBox_1.addItem(null);
		
		lblNovoCargo = new JLabel("Novo Cargo: ");
		lblNovoCargo.setBounds(10, 142, 93, 14);
		contentPane.add(lblNovoCargo);
		
		comboBox_2 = new JComboBox<String>();
		comboBox_2.setBounds(136, 139, 152, 20);
		contentPane.add(comboBox_2);
		comboBox_2.addItem(null);
		
		lblNovoEngenheiro_1 = new JLabel("Novo Engenheiro:");
		lblNovoEngenheiro_1.setBounds(10, 167, 103, 14);
		contentPane.add(lblNovoEngenheiro_1);
		
		textField = new JTextField();
		textField.setBounds(136, 164, 152, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNovoCargo_1 = new JLabel("Novo Cargo: ");
		lblNovoCargo_1.setBounds(10, 192, 93, 14);
		contentPane.add(lblNovoCargo_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 189, 152, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblCampoObrigatrio = new JLabel("Campo Obrigat\u00F3rio! ");
		lblCampoObrigatrio.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio.setBounds(298, 48, 112, 14);
		contentPane.add(lblCampoObrigatrio);
		lblCampoObrigatrio.setVisible(false);
		
		lblCampoObrigatrio_1 = new JLabel("Campo Obrigat\u00F3rio!");
		lblCampoObrigatrio_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio_1.setBounds(298, 117, 126, 14);
		contentPane.add(lblCampoObrigatrio_1);
		lblCampoObrigatrio_1.setVisible(false);
		
		lblCampoObrigatrio_2 = new JLabel("Campo Obrigat\u00F3rio!");
		lblCampoObrigatrio_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio_2.setBounds(298, 142, 126, 14);
		contentPane.add(lblCampoObrigatrio_2);
		lblCampoObrigatrio_2.setVisible(false);
		
		lblCampoObrigatrio_3 = new JLabel("Campo Obrigat\u00F3rio! ");
		lblCampoObrigatrio_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio_3.setBounds(298, 167, 126, 14);
		contentPane.add(lblCampoObrigatrio_3);
		lblCampoObrigatrio_3.setVisible(false);
		
		lblCampoObrigatrio_4 = new JLabel("Campo Obrigat\u00F3rio!");
		lblCampoObrigatrio_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio_4.setBounds(298, 192, 126, 14);
		contentPane.add(lblCampoObrigatrio_4);
		lblCampoObrigatrio_4.setVisible(false);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.getInstance().changeScreen(Constants.JANELA_CANCELAR);
			}
		});
		btnCancelar.setBounds(335, 227, 89, 23);
		contentPane.add(btnCancelar);
		
		btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((engenheiro==null)){
					lblCampoObrigatrio_5.setVisible(true);
					JOptionPane.showMessageDialog(null, "Escolha um Engenheiro para Alterar!");
				}
				else{
					lblCampoObrigatrio_5.setVisible(false);
					if((textField.getText().length() == 0)
							&&(textField_1.getText().length()==0)
							&&( comboBox_1.getSelectedItem() == null)
							&&(comboBox_2.getSelectedItem()==null)){
						lblCampoObrigatrio_1.setVisible(true);
						lblCampoObrigatrio_2.setVisible(true);
						lblCampoObrigatrio_3.setVisible(true);
						lblCampoObrigatrio_4.setVisible(true);
						JOptionPane.showMessageDialog(null, "Dois dos Campos é Obrigatório!");
					}
					else if(((textField.getText().length() > 0)
							&&(textField_1.getText().length()>0))
							&&(( comboBox_1.getSelectedItem() != null)
							&&(comboBox_2.getSelectedItem()!=null))){
						JOptionPane.showMessageDialog(null, "Escolha/Digite Apenas um dos 2 Campos!");
					}
					else{
						lblCampoObrigatrio_1.setVisible(false);
						lblCampoObrigatrio_2.setVisible(false);
						lblCampoObrigatrio_3.setVisible(false);
						lblCampoObrigatrio_4.setVisible(false);
						for(int i = 0; i < Controller.getInstance().getListaEng().size(); i++){
							if((Controller.getInstance().getListaEng().get(i).getEng().equals(engenheiro))
									){
								if((textField.getText().length() == 0)&&(textField_1.getText().length() == 0)){
									Novoengenheiro = comboBox_1.getSelectedItem()+"";
									Novocargo = comboBox_2.getSelectedItem()+"";
									Controller.getInstance().getListaEng().get(i).setEng(Novoengenheiro);
									Controller.getInstance().getListaEng().get(i).setTipo(Novocargo);
									JOptionPane.showMessageDialog(null, "Alteração Realizada com Sucesso!");
								}
								else if((comboBox_1.getSelectedItem() == null)&&(comboBox_2.getSelectedItem() == null)){
									Novoengenheiro = textField.getText();
									Novocargo = textField_1.getText();
									Controller.getInstance().getListaEng().get(i).setEng(Novoengenheiro);
									Controller.getInstance().getListaEng().get(i).setTipo(Novocargo);
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
		
		lblCampoObrigatrio_5 = new JLabel("Campo Obrigat\u00F3rio! ");
		lblCampoObrigatrio_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio_5.setBounds(298, 76, 126, 14);
		contentPane.add(lblCampoObrigatrio_5);
		lblCampoObrigatrio_5.setVisible(false);
		
	}
	public void boxEng(List<Engenheiro> listaEng){
		for(Engenheiro e : listaEng){
			comboBox.addItem(e.getEng());
		}
	}
	
	public void boxNovoEng(List<Engenheiro> listaEng){
		for(Engenheiro e : listaEng){
			comboBox_1.addItem(e.getEng());
		}
	}
	public void boxNovoTipoEng(List<Engenheiro> listaEng){
		for(Engenheiro e : listaEng){
			comboBox_2.addItem(e.getTipo());
		}
	}
	public void limpaTela() {
		textField.setText("");
		textField_1.setText("");	
	}
}
