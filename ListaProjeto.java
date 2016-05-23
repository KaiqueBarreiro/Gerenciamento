import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class ListaProjeto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnOk;
	private DefaultListModel<String> model;
	private JList<String> list;
	private JScrollPane scrollPane;
	public ListaProjeto() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kaique\\Pictures\\logo.jpg"));
		setTitle("Projetos Cadastrados no Sistema");
	
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(250, 150, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		model = new DefaultListModel<String>();
		contentPane.setLayout(null);
		list = new JList<String>();
		contentPane.add(list);
		list.setModel(model);

		scrollPane = new JScrollPane(list);
		scrollPane.setBounds(10, 11, 464, 194);
		contentPane.add(scrollPane);
		getContentPane().add(scrollPane);
		
		
		btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.getInstance().changeScreen(Constants.JANELA_OK);
			}
		});
		btnOk.setBounds(385, 261, 89, 23);
		contentPane.add(btnOk);
	}
	public void populaProjeto(List<Projeto> listaProj){
			for(Projeto proj : listaProj){
				model.addElement("Projeto: " + proj.getProjeto() + "\n");
			}
	}
	public void limpaTela(){
		model.clear();
	}
}
