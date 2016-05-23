import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class AddDepartamento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private Engenheiro Eng;
    private Projeto Proj;
    private Chefe chefia;
    private String dep;
    private String chefe;
    private String eng;
    private String cargo;
    private String cidade;
    private String projeto;    
    private JComboBox<String> comboBox;
    private JComboBox<String> comboBox_1;
    private JComboBox<String> comboBox_2;
    private JComboBox<String> comboBox_3;
    private JComboBox<String> comboBox_4;
	private JLabel lblCampoObrigatrio;
	private JLabel lblCampoObrigatrio_1;
	private JLabel lblCampoObrigatrio_2;
	private JLabel lblCampoObrigatrio_3;
	private JLabel lblCampoObigatrio;
	private JLabel lblAsInformaesCom;
	private JPanel panel;
	private JLabel lblDepartamento;
    private JLabel lblChefia;
    private JLabel lblProjeto;
    private JLabel lblCidade;
	private JLabel lblEngenheiro;
	private JButton btnCancelar;
	private JButton btnOk;
    private Cidade cid;
    
	public AddDepartamento() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kaique\\Pictures\\logo.jpg"));
		setTitle("Novos Projetos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(250, 150,550, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 524, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		lblDepartamento = new JLabel("*Departamento:");
		lblDepartamento.setBounds(44, 11, 92, 25);
		panel.add(lblDepartamento);
		
		comboBox = new JComboBox<String>();
		comboBox.addItem(null);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dep = comboBox.getSelectedItem()+"";
			}
		});
		comboBox.setBounds(146, 13, 244, 20);
		panel.add(comboBox);
		
		lblChefia = new JLabel("*Chefia:");
		lblChefia.setBounds(44, 42, 92, 25);
		panel.add(lblChefia);
		
		comboBox_1 = new JComboBox<String>();
		comboBox_1.addItem(null);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chefe = comboBox_1.getSelectedItem()+"";
			}
		});
		chefia = new Chefe(chefe);
		comboBox_1.setBounds(146, 44, 244, 20);
		panel.add(comboBox_1);
		
		lblProjeto = new JLabel("*Projeto:");
		lblProjeto.setBounds(44, 73, 92, 25);
		panel.add(lblProjeto);
		
		comboBox_2 = new JComboBox<String>();
		comboBox_2.addItem(null);
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				projeto = comboBox_2.getSelectedItem()+"";
			}
		});
		Proj = new Projeto(projeto);
		comboBox_2.setBounds(146, 75, 244, 20);
		panel.add(comboBox_2);
		
		lblCidade = new JLabel("*Cidade:");
		lblCidade.setBounds(44, 105, 92, 25);
		panel.add(lblCidade);
		
		comboBox_3 = new JComboBox<String>();
		comboBox_3.addItem(null);
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cidade = comboBox_3.getSelectedItem()+"";
			}
		});
		cid = new Cidade(cidade);
		comboBox_3.setBounds(146, 107, 244, 20);
		panel.add(comboBox_3);
		
		lblEngenheiro = new JLabel("*Engenheiro:");
		lblEngenheiro.setBounds(44, 136, 92, 25);
		panel.add(lblEngenheiro);
		
		comboBox_4 = new JComboBox<String>();
		comboBox_4.addItem(null);
		comboBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eng = comboBox_4.getSelectedItem()+"";
			}
		});
		comboBox_4.setBounds(146, 138, 244, 20);
		panel.add(comboBox_4);
		Eng = new Engenheiro(cargo,eng);
		
		lblCampoObrigatrio = new JLabel("Campo Obrigat\u00F3rio");
		lblCampoObrigatrio.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio.setBounds(400, 16, 92, 14);
		panel.add(lblCampoObrigatrio);
		lblCampoObrigatrio.setVisible(false);
		
		lblCampoObrigatrio_1 = new JLabel("Campo Obrigat\u00F3rio");
		lblCampoObrigatrio_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio_1.setBounds(400, 42, 92, 20);
		panel.add(lblCampoObrigatrio_1);
		lblCampoObrigatrio_1.setVisible(false);
		
		lblCampoObrigatrio_2 = new JLabel("Campo Obrigat\u00F3rio");
		lblCampoObrigatrio_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio_2.setBounds(400, 73, 92, 19);
		panel.add(lblCampoObrigatrio_2);
		lblCampoObrigatrio_2.setVisible(false);
		
		lblCampoObrigatrio_3 = new JLabel("Campo Obrigat\u00F3rio");
		lblCampoObrigatrio_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObrigatrio_3.setBounds(400, 105, 92, 19);
		panel.add(lblCampoObrigatrio_3);
		lblCampoObrigatrio_3.setVisible(false);
		
		lblCampoObigatrio = new JLabel("Campo Obrigat\u00F3rio");
		lblCampoObigatrio.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCampoObigatrio.setBounds(400, 138, 92, 20);
		panel.add(lblCampoObigatrio);
		lblCampoObigatrio.setVisible(false);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller.getInstance().changeScreen(Constants.JANELA_CANCELAR);
			}
		});
		btnCancelar.setBounds(378, 227, 89, 23);
		panel.add(btnCancelar);
		
		btnOk = new JButton("Ok");
		btnOk.setBounds(268, 227, 89, 23);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chefe != null){
					lblCampoObrigatrio.setVisible(false);
		        }
				else{
		        	lblCampoObrigatrio.setVisible(true);
		        }
		        if(dep != null) {
		        	lblCampoObrigatrio_1.setVisible(false);
		        } else {
		        	lblCampoObrigatrio_1.setVisible(true);
		        }
		        if (projeto != null) {
		        	lblCampoObrigatrio_2.setVisible(false);
		        } else {
		        	lblCampoObrigatrio_2.setVisible(true);
		        }
		        if (cidade != null) {
					lblCampoObrigatrio_3.setVisible(false);
		        } else {
		        	lblCampoObrigatrio_3.setVisible(true);
		        }
		        if (eng != null) {
		        	lblCampoObigatrio.setVisible(false);
		        } else {
		        	lblCampoObigatrio.setVisible(true);
		        }
		        if ((dep != null)
		        	&&(chefe != null)
		        		&& (projeto != null)
		        			&& (cidade != null)
		        				&& (eng != null)){
		        	Controller.getInstance().insereDepartamento(dep, chefia, cid, Proj, Eng);
					JOptionPane.showMessageDialog(null,"Projeto Cadastrado com Sucesso! ");
				} else {
		            JOptionPane.showMessageDialog(null, "Preencha o(s) Campo(s) Obrigatório! ");
				}
			}
		});
		panel.add(btnOk);
		
		lblAsInformaesCom = new JLabel("As informa\u00E7\u00F5es com (*) s\u00E3o obrigat\u00F3rias!");
		lblAsInformaesCom.setBounds(10, 231, 205, 14);
		lblAsInformaesCom.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel.add(lblAsInformaesCom);
	}
	public void boxChefe(List<Chefe> listaChefe){
		for(Chefe c : listaChefe){
			comboBox_1.addItem(c.getChefe());
		}
	}
	public void boxDepartamento(){
		for(String d : Controller.getInstance().getDepto()){
				comboBox.addItem(d);
		}
	}
	public void boxProjeto(List<Projeto> listaProj){
		for(Projeto p : listaProj){
			comboBox_2.addItem(p.getProjeto());
		}
	}
	public void boxCidade(List<Cidade> listaCid){
		for(Cidade c : listaCid){
			comboBox_3.addItem(c.getCidade());
		}
		
	}
	
	public void boxEng(List<Engenheiro> listaEng){
		for(Engenheiro e : listaEng){
			comboBox_4.addItem(e.getEng()+ " - " + e.getTipo());
		}
	}
	public void limpaTela() {
	}
}
