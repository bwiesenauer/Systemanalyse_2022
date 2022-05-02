package paket_GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class GUI_Cocktailbar extends JFrame
{

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtalc;
	private JTextField txtGlas;
	private JTextField txtZutaten;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					GUI_Cocktailbar frame = new GUI_Cocktailbar();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_Cocktailbar()
	{
		setTitle("Cocktailbar Verwaltungstool");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 558);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(5, 5, 566, 0);
		contentPane.add(label);
		
		JLabel lblCocktailbarVerwaltung = new JLabel("Cocktailbar Verwaltung");
		lblCocktailbarVerwaltung.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
		lblCocktailbarVerwaltung.setBounds(157, 11, 284, 26);
		contentPane.add(lblCocktailbarVerwaltung);
		
		txtName = new JTextField();
		txtName.setBounds(144, 89, 249, 26);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblCocktailname = new JLabel("Cocktailname");
		lblCocktailname.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblCocktailname.setBounds(35, 90, 99, 20);
		contentPane.add(lblCocktailname);
		
		JLabel lblAlkoholgehalt = new JLabel("Alkohol-Gehalt");
		lblAlkoholgehalt.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblAlkoholgehalt.setBounds(35, 133, 99, 20);
		contentPane.add(lblAlkoholgehalt);
		
		txtalc = new JTextField();
		txtalc.setColumns(10);
		txtalc.setBounds(144, 132, 249, 26);
		contentPane.add(txtalc);
		
		JLabel lblGlasTyp = new JLabel("Glas Typ");
		lblGlasTyp.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblGlasTyp.setBounds(35, 175, 99, 20);
		contentPane.add(lblGlasTyp);
		
		txtGlas = new JTextField();
		txtGlas.setColumns(10);
		txtGlas.setBounds(144, 174, 249, 26);
		contentPane.add(txtGlas);
		
		JLabel lblZutaten = new JLabel("Zutaten");
		lblZutaten.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblZutaten.setBounds(35, 220, 99, 20);
		contentPane.add(lblZutaten);
		
		txtZutaten = new JTextField();
		txtZutaten.setColumns(10);
		txtZutaten.setBounds(144, 219, 249, 26);
		contentPane.add(txtZutaten);
		
		JButton btnEnde = new JButton("Beenden");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		btnEnde.setFont(new Font("Calibri", Font.BOLD, 14));
		btnEnde.setBounds(434, 462, 132, 46);
		contentPane.add(btnEnde);
		
		JButton btnRezeptAnlegen = new JButton("Rezept anlegen");
		btnRezeptAnlegen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				// Anweisungen hier einfügen
			}
		});
		btnRezeptAnlegen.setFont(new Font("Calibri", Font.BOLD, 14));
		btnRezeptAnlegen.setBounds(35, 350, 174, 46);
		contentPane.add(btnRezeptAnlegen);
		
		JButton btnRezeptAnzeigen = new JButton("Rezept Anzeigen");
		btnRezeptAnzeigen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				// Anweisungen hier einfügen
			}
		});
		btnRezeptAnzeigen.setFont(new Font("Calibri", Font.BOLD, 14));
		btnRezeptAnzeigen.setBounds(35, 407, 174, 46);
		contentPane.add(btnRezeptAnzeigen);
		
		JButton btnRezeptLoeschen = new JButton("Rezept L\u00F6schen");
		btnRezeptLoeschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				// Anweisungen hier einfügen
			}
		});
		btnRezeptLoeschen.setForeground(Color.BLACK);
		btnRezeptLoeschen.setBackground(Color.RED);
		btnRezeptLoeschen.setFont(new Font("Calibri", Font.BOLD, 14));
		btnRezeptLoeschen.setBounds(219, 462, 155, 46);
		contentPane.add(btnRezeptLoeschen);
		
		JButton btnRezeptBearbeiten = new JButton("Rezept bearbeiten");
		btnRezeptBearbeiten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				// Hier Anweisungen eintragen
			}
		});
		btnRezeptBearbeiten.setFont(new Font("Calibri", Font.BOLD, 14));
		btnRezeptBearbeiten.setBounds(35, 462, 174, 46);
		contentPane.add(btnRezeptBearbeiten);
	}
}
