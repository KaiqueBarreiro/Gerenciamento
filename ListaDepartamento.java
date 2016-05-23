import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class ListaDepartamento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnOk;
	private DefaultListModel<String> model;
	private JList<String> list;
	private JScrollPane scrollPane;
	
	public ListaDepartamento() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kaique\\Pictures\\logo.jpg"));
		setTitle("Departamentos Cadastrados no Sistema");

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(250, 150, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		model = new DefaultListModel<String>();
		contentPane.setLayout(null);
		list = new JList<String>();
		contentPane.add(list);
		list.setModel(model);

		scrollPane = new JScrollPane(list);
		scrollPane.setBounds(10, 11, 464, 226);
		contentPane.add(scrollPane);
		getContentPane().add(scrollPane);
		
		btnOk = new JButton("Ok");
		btnOk.setBounds(385, 326, 89, 23);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.getInstance().changeScreen(Constants.JANELA_OK);
			}
		});
		contentPane.add(btnOk);

	}
	public void limpaTela(){
		model.clear();
	}
	public void populaDepartamentos(){
		for(String d : Controller.getInstance().getDepto()){
			model.addElement("Departameto: " + d +"\n");
		}
	}
}