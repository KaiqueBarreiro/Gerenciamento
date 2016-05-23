import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListaChefe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private DefaultListModel<String> model;
	private JList<String> list;
	private JScrollPane scrollPane;
	private JButton btnOk;
	
	public ListaChefe() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kaique\\Pictures\\logo.jpg"));
		setTitle("Listagem Chefes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		model = new DefaultListModel<String>();
		list = new JList<String>();
		list.setLocation(10, 23);
		contentPane.add(list);
		list.setModel(model);
		
		scrollPane = new JScrollPane(list);
		scrollPane.setBounds(10, 11, 414, 128);
		contentPane.add(scrollPane);
		getContentPane().add(scrollPane);
		
		btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller.getInstance().changeScreen(Constants.JANELA_OK);
			}
		});
		btnOk.setBounds(335, 227, 89, 23);
		contentPane.add(btnOk);
	}
	public void populaChefe(List<Chefe> listaChefe) {
		for(Chefe c : listaChefe){
			model.addElement("Chefe:   " + c.getChefe());
		}
	}
	public void limpaTela(){
		model.clear();
	}
}
