import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class ListaEngenheiro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnOk;
	private JList<String> list;
	private DefaultListModel<String> model;
	private JScrollPane scrollPane;
	public ListaEngenheiro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kaique\\Pictures\\logo.jpg"));

		setTitle("Engenheiros Cadastrados no Sistema");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(250, 150, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		model = new DefaultListModel<String>();
		list = new JList<String>();
		contentPane.add(list);
		list.setModel(model);
		
		scrollPane = new JScrollPane(list);
		scrollPane.setBounds(10, 11, 454, 240);
		contentPane.add(scrollPane);
		getContentPane().add(scrollPane);
		
		btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.getInstance().changeScreen(Constants.JANELA_OK);
			}
		});
		btnOk.setBounds(375, 262, 89, 23);
		contentPane.add(btnOk);
	}
	
	public void populaEngenheiro(List<Engenheiro>listaEng){
			for(Engenheiro En : listaEng){
				model.addElement("Engenheiro:    " + En.getEng() + " - "+En.getTipo()+"\n");
			}
	}
	public void limpaTela(){
		model.clear();
	}
}
