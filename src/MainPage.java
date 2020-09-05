import static org.junit.Assert.assertNotNull;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.junit.jupiter.api.Test;

import javax.swing.ButtonGroup;

public class Main_Page extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JFrame frame;
	static JTextField drinkquan;
	static JTextField friesquan;
	static JTextField swquan;
	static JTextField dessertquan;
	static JTextField total;
	static JTextField tax;
	static JTextField donate;
	static JTextField amount;
	private JRadioButton rdbtnTea, rdbtnCoffee, rdbtnJuice, rdbtnColddrink, rdbtnSimple, rdbtnPeriperi, rdbtnMasalaCheese, rdbtnMexicanLoaded, rdbtnAlooTikki, rdbtnBombayMasala, rdbtnTangyPaneer, rdbtnVegloaded,rdbtnChococheeseCake, rdbtnRedvelvetCake, rdbtnBlueberryMuffin, rdbtnApplepie;
	private JComboBox<String> drinkssize, dessertsize, swsize, friessize;
	private JButton  btnAddToOrder;
	static JButton btnMakeBill;
	private JButton btnClear;
	private JButton btnSave;
	int amount_of;
	ArrayList<Beverage> list_of_bvr = new ArrayList<Beverage>();
	static ButtonGroup Drinksgroup;
	static ButtonGroup Dessertgroup;
	static ButtonGroup SWgroup;
	static ButtonGroup Friesgroup;
	String SaveReport;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Page window = new Main_Page();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 710, 444);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Radio Buttons
		rdbtnTea = new JRadioButton("Tea");
		rdbtnTea.setBounds(7, 66, 72, 23);
		frame.getContentPane().add(rdbtnTea);
		
		rdbtnCoffee = new JRadioButton("Coffee");
		rdbtnCoffee.setBounds(7, 92, 72, 23);
		frame.getContentPane().add(rdbtnCoffee);
		
		rdbtnJuice = new JRadioButton("Juice");
		rdbtnJuice.setBounds(7, 118, 72, 23);
		frame.getContentPane().add(rdbtnJuice);
		
		rdbtnColddrink = new JRadioButton("Cold-Drink");
		rdbtnColddrink.setBounds(7, 144, 87, 23);
		frame.getContentPane().add(rdbtnColddrink);	
		
		Drinksgroup = new ButtonGroup(); 
		Drinksgroup.add(rdbtnTea);
		Drinksgroup.add(rdbtnCoffee);
		Drinksgroup.add(rdbtnJuice);
		Drinksgroup.add(rdbtnColddrink);
		
		//////////////////////////////////////////////
		
		rdbtnSimple = new JRadioButton("Simple");
		rdbtnSimple.setBounds(96, 66, 109, 23);
		frame.getContentPane().add(rdbtnSimple);
		
		rdbtnPeriperi = new JRadioButton("Peri-Peri");
		rdbtnPeriperi.setBounds(96, 92, 109, 23);
		frame.getContentPane().add(rdbtnPeriperi);
		
		rdbtnMasalaCheese = new JRadioButton("Masala Cheese");
		rdbtnMasalaCheese.setBounds(96, 118, 109, 23);
		frame.getContentPane().add(rdbtnMasalaCheese);
		
		rdbtnMexicanLoaded = new JRadioButton("Mexican Loaded");
		rdbtnMexicanLoaded.setBounds(96, 144, 109, 23);
		frame.getContentPane().add(rdbtnMexicanLoaded);
		
		Friesgroup = new ButtonGroup(); 
		Friesgroup.add(rdbtnSimple);
		Friesgroup.add(rdbtnPeriperi);
		Friesgroup.add(rdbtnMasalaCheese);
		Friesgroup.add(rdbtnMexicanLoaded);
		
		//////////////////////////////////////////////////
		
		rdbtnAlooTikki = new JRadioButton("Aloo Tikki");
		rdbtnAlooTikki.setBounds(202, 66, 109, 23);
		frame.getContentPane().add(rdbtnAlooTikki);
		
		rdbtnBombayMasala = new JRadioButton("Bombay Masala");
		rdbtnBombayMasala.setBounds(202, 92, 109, 23);
		frame.getContentPane().add(rdbtnBombayMasala);
		
		rdbtnTangyPaneer = new JRadioButton("Tangy Paneer");
		rdbtnTangyPaneer.setBounds(202, 118, 109, 23);
		frame.getContentPane().add(rdbtnTangyPaneer);
		
		rdbtnVegloaded = new JRadioButton("Veg-Loaded");
		rdbtnVegloaded.setBounds(202, 144, 109, 23);
		frame.getContentPane().add(rdbtnVegloaded);
		
		SWgroup = new ButtonGroup(); 
		SWgroup.add(rdbtnAlooTikki);
		SWgroup.add(rdbtnBombayMasala);
		SWgroup.add(rdbtnTangyPaneer);
		SWgroup.add(rdbtnVegloaded);
		
		//////////////////////////////////////////////////////
		
		rdbtnChococheeseCake = new JRadioButton("Choco-Cheese Cake");
		rdbtnChococheeseCake.setBounds(308, 66, 139, 23);
		frame.getContentPane().add(rdbtnChococheeseCake);
		
		rdbtnRedvelvetCake = new JRadioButton("Red-Velvet Cake");
		rdbtnRedvelvetCake.setBounds(308, 92, 109, 23);
		frame.getContentPane().add(rdbtnRedvelvetCake);
		
		rdbtnBlueberryMuffin = new JRadioButton("Blue-Berry Muffin");
		rdbtnBlueberryMuffin.setBounds(308, 118, 109, 23);
		frame.getContentPane().add(rdbtnBlueberryMuffin);
		
		rdbtnApplepie = new JRadioButton("Apple-Pie");
		rdbtnApplepie.setBounds(308, 144, 109, 23);
		frame.getContentPane().add(rdbtnApplepie);
		
		Dessertgroup = new ButtonGroup(); 
		Dessertgroup.add(rdbtnChococheeseCake);
		Dessertgroup.add(rdbtnRedvelvetCake);
		Dessertgroup.add(rdbtnBlueberryMuffin);
		Dessertgroup.add(rdbtnApplepie);
		
		
		
		JLabel lblOrderSystem = new JLabel("Order System");
		lblOrderSystem.setBounds(170, 11, 72, 14);
		frame.getContentPane().add(lblOrderSystem);
		
		JLabel lblDrinks = new JLabel("Drinks");
		lblDrinks.setBounds(21, 41, 46, 14);
		frame.getContentPane().add(lblDrinks);
		
		JLabel lblFries = new JLabel("Fries");
		lblFries.setBounds(110, 41, 46, 14);
		frame.getContentPane().add(lblFries);
		
		JLabel lblSandwiches = new JLabel("Sandwiches");
		lblSandwiches.setBounds(216, 41, 72, 14);
		frame.getContentPane().add(lblSandwiches);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 61, 512, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblDeserts = new JLabel("Deserts");
		lblDeserts.setBounds(320, 42, 46, 14);
		frame.getContentPane().add(lblDeserts);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(6, 298, 512, 2);
		frame.getContentPane().add(separator_1);
		
		btnAddToOrder = new JButton("ADD TO ORDER");
		btnAddToOrder.setBounds(96, 311, 109, 23);
		frame.getContentPane().add(btnAddToOrder);
		
		btnMakeBill = new JButton("MAKE BILL");
		btnMakeBill.setEnabled(false);
		btnMakeBill.setBounds(216, 311, 109, 23);
		frame.getContentPane().add(btnMakeBill);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(21, 187, 46, 14);
		frame.getContentPane().add(lblQuantity);
		
		String[] sizes = {"Small","Medium","Large"};
		drinkssize = new JComboBox<String>(sizes);
		drinkssize.setSelectedIndex(0);
		drinkssize.setBounds(10, 250, 75, 20);
		frame.getContentPane().add(drinkssize);		

		
		drinkquan = new JTextField();
		drinkquan.setBounds(10, 205, 75, 20);
		frame.getContentPane().add(drinkquan);
		drinkquan.setColumns(10);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(21, 232, 46, 14);
		frame.getContentPane().add(lblSize);
		
		JLabel label = new JLabel("Quantity");
		label.setBounds(113, 187, 46, 14);
		frame.getContentPane().add(label);
		
		friesquan = new JTextField();
		friesquan.setColumns(10);
		friesquan.setBounds(102, 205, 75, 20);
		frame.getContentPane().add(friesquan);
		
		JLabel label_1 = new JLabel("Size");
		label_1.setBounds(113, 232, 46, 14);
		frame.getContentPane().add(label_1);
		
		friessize = new JComboBox<String>(sizes);
		friessize.setSelectedIndex(0);
		friessize.setBounds(102, 250, 75, 20);
		frame.getContentPane().add(friessize);
		
		JLabel label_2 = new JLabel("Quantity");
		label_2.setBounds(227, 187, 46, 14);
		frame.getContentPane().add(label_2);
		
		swquan = new JTextField();
		swquan.setColumns(10);
		swquan.setBounds(216, 205, 75, 20);
		frame.getContentPane().add(swquan);
		
		JLabel label_3 = new JLabel("Size");
		label_3.setBounds(227, 232, 46, 14);
		frame.getContentPane().add(label_3);
		
		swsize = new JComboBox<String>(sizes);
		swsize.setSelectedIndex(0);
		swsize.setBounds(216, 250, 75, 20);
		frame.getContentPane().add(swsize);
		
		
		JLabel label_4 = new JLabel("Quantity");
		label_4.setBounds(331, 187, 46, 14);
		frame.getContentPane().add(label_4);
		
		dessertquan = new JTextField();
		dessertquan.setColumns(10);
		dessertquan.setBounds(320, 205, 75, 20);
		frame.getContentPane().add(dessertquan);
		
		JLabel label_5 = new JLabel("Size");
		label_5.setBounds(331, 232, 46, 14);
		frame.getContentPane().add(label_5);
		
		dessertsize = new JComboBox<String>(sizes);
		dessertsize.setSelectedIndex(0);
		dessertsize.setBounds(320, 250, 75, 20);
		frame.getContentPane().add(dessertsize);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(518, 41, 2, 311);
		frame.getContentPane().add(separator_2);
		
		JLabel lblBill = new JLabel("Bill");
		lblBill.setBounds(575, 41, 46, 14);
		frame.getContentPane().add(lblBill);
		
		JLabel lblTotal = new JLabel("TOTAL");
		lblTotal.setBounds(543, 70, 46, 14);
		frame.getContentPane().add(lblTotal);
		
		JLabel lblTax = new JLabel("TAX(3%)");
		lblTax.setBounds(543, 96, 46, 14);
		frame.getContentPane().add(lblTax);
		
		JLabel lblDonate = new JLabel("DONATE");
		lblDonate.setBounds(543, 122, 46, 14);
		frame.getContentPane().add(lblDonate);
		
		total = new JTextField();
		total.setBounds(598, 67, 86, 20);
		frame.getContentPane().add(total);
		total.setColumns(10);
		
		tax = new JTextField();
		tax.setColumns(10);
		tax.setBounds(598, 93, 86, 20);
		frame.getContentPane().add(tax);
		
		donate = new JTextField();
		donate.setColumns(10);
		donate.setBounds(599, 119, 86, 20);
		frame.getContentPane().add(donate);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(522, 165, 168, 2);
		frame.getContentPane().add(separator_3);
		
		JLabel lblAmount = new JLabel("AMOUNT");
		lblAmount.setBounds(543, 186, 46, 14);
		frame.getContentPane().add(lblAmount);
		
		amount = new JTextField();
		amount.setColumns(10);
		amount.setBounds(598, 181, 86, 20);
		frame.getContentPane().add(amount);
		
		btnClear = new JButton("CLEAR");
		btnClear.setEnabled(false);
		btnClear.setBounds(557, 228, 89, 23);
		frame.getContentPane().add(btnClear);
		
		btnSave = new JButton("SAVE");
		btnSave.setEnabled(false);
		btnSave.setBounds(557, 277, 89, 23);
		frame.getContentPane().add(btnSave);
		
		JLabel lblReport = new JLabel("");
		lblReport.setBounds(7, 338, 382, 56);
		frame.getContentPane().add(lblReport);
	
		btnAddToOrder.addActionListener(this);
		btnMakeBill.addActionListener(this);
		btnClear.addActionListener(this);
		btnSave.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//JOptionPane.showMessageDialog(null, "HELLOOOOOOOO");
		
		if(e.getSource().equals(btnAddToOrder)) {
			//JOptionPane.showMessageDialog(null, "ADDed To order");
			//for drinks
			if( rdbtnTea.isSelected() || rdbtnCoffee.isSelected() || rdbtnJuice.isSelected() || rdbtnColddrink.isSelected() && !(drinkquan.getText().equals("0"))) {
				try {
					String sizf = (String) drinkssize.getSelectedItem();

					amount_of  = Integer.parseInt(drinkquan.getText().trim());
					Beverage bvg;
					if(rdbtnTea.isSelected())  
					{ 
						bvg = new Tea(sizf,amount_of,this); 
					}
					else if(rdbtnCoffee.isSelected())  
					{ 
						bvg = new Coffee(sizf,amount_of,this); 
					}
					else if(rdbtnColddrink.isSelected())    
					{ 
						bvg = new Colddrink(sizf,amount_of,this); 
					}
					else 
					{ 
						bvg = new Juice(sizf,amount_of,this); 
					}
					drinkquan.setText(null);
					//JOptionPane.showMessageDialog(null, "check  1");
					list_of_bvr.add(bvg);
					//JOptionPane.showMessageDialog(null, "check 2");
					JOptionPane.showMessageDialog(null, bvg.toString());

					//JOptionPane.showMessageDialog(null, "check 3");
					btnMakeBill.setEnabled(true);
					
					Drinksgroup.clearSelection();
				}
				catch(NumberFormatException e1) {//if written data in TextField can't be converted to an integer[String,char,double etc...]
					JOptionPane.showMessageDialog(this, "Enter an integer as the amount");
				}
			}	
			
			if( rdbtnSimple.isSelected() || rdbtnPeriperi.isSelected() || rdbtnMasalaCheese.isSelected() || rdbtnMexicanLoaded.isSelected() && !(friesquan.getText().equals("0"))) {
				try {
					String sizf = (String) friessize.getSelectedItem();
					//JOptionPane.showMessageDialog(null, "Hellooooo jiiiiii");
					amount_of  = Integer.parseInt(friesquan.getText().trim());
					Beverage bvg;
					if(rdbtnSimple.isSelected())  
					{ 
						bvg = new Simple(sizf,amount_of,this); 
					}
					else if(rdbtnPeriperi.isSelected())  
					{ 
						bvg = new PeriPeri(sizf,amount_of,this); 
					}
					else if(rdbtnMasalaCheese.isSelected())    
					{ 
						bvg = new MasalaCheese(sizf,amount_of,this); 
					}
					else 
					{ 
						bvg = new MexicanLoaded(sizf,amount_of,this); 
					}
					friesquan.setText(null);
					//JOptionPane.showMessageDialog(null, "check  1");
					list_of_bvr.add(bvg);
					//JOptionPane.showMessageDialog(null, "check 2");
					JOptionPane.showMessageDialog(null, bvg.toString());

					//JOptionPane.showMessageDialog(null, "check 3");
					btnMakeBill.setEnabled(true);
					
					Friesgroup.clearSelection();
					
				}
				catch(NumberFormatException e1) {//if written data in TextField can't be converted to an integer[String,char,double etc...]
					JOptionPane.showMessageDialog(this, "Enter an integer as the Quantity");
				}
			}	
			
			if( rdbtnAlooTikki.isSelected() || rdbtnBombayMasala.isSelected() || rdbtnTangyPaneer.isSelected() || rdbtnVegloaded.isSelected() && !(swquan.getText().equals("0"))) {
				try {
					String sizf = (String) swsize.getSelectedItem();
					amount_of  = Integer.parseInt(swquan.getText().trim());
					Beverage bvg;
					if(rdbtnAlooTikki.isSelected())  
					{ 
						bvg = new AlooTikki(sizf,amount_of,this); 
					}
					else if(rdbtnBombayMasala.isSelected())  
					{ 
						bvg = new BombayMasala(sizf,amount_of,this); 
					}
					else if(rdbtnTangyPaneer.isSelected())    
					{ 
						bvg = new TangyPaneer(sizf,amount_of,this); 
					}
					else 
					{ 
						bvg = new VegLoaded(sizf,amount_of,this); 
					}
					swquan.setText(null);
					//JOptionPane.showMessageDialog(null, "check  1");
					list_of_bvr.add(bvg);
					//JOptionPane.showMessageDialog(null, "check 2");
					JOptionPane.showMessageDialog(null, bvg.toString());

					//JOptionPane.showMessageDialog(null, "check 3");
					btnMakeBill.setEnabled(true);
					
					SWgroup.clearSelection();
				}
				catch(NumberFormatException e1) {//if written data in TextField can't be converted to an integer[String,char,double etc...]
					JOptionPane.showMessageDialog(this, "Enter an integer as the quantity");
				}
			}	
			
			if( rdbtnChococheeseCake.isSelected() || rdbtnRedvelvetCake.isSelected() || rdbtnBlueberryMuffin.isSelected() || rdbtnApplepie.isSelected() && !(dessertquan.getText().equals("0"))) {
				try {
					String sizf = (String) dessertsize.getSelectedItem();
					amount_of  = Integer.parseInt(dessertquan.getText().trim());
					Beverage bvg;
					if(rdbtnChococheeseCake.isSelected())  
					{ 
						bvg = new CC_cake(sizf,amount_of,this); 
					}
					else if(rdbtnRedvelvetCake.isSelected())  
					{ 
						bvg = new RV_cake(sizf,amount_of,this); 
					}
					else if(rdbtnBlueberryMuffin.isSelected())    
					{ 
						bvg = new BB_muffin(sizf,amount_of,this); 
					}
					else 
					{ 
						bvg = new ApplePie(sizf,amount_of,this); 
					}
					dessertquan.setText(null);
					//JOptionPane.showMessageDialog(null, "check  1");
					list_of_bvr.add(bvg);
					//JOptionPane.showMessageDialog(null, "check 2");
					JOptionPane.showMessageDialog(null, bvg.toString());

					//JOptionPane.showMessageDialog(null, "check 3");
					btnMakeBill.setEnabled(true);
					
					Dessertgroup.clearSelection();
					
				}
				catch(NumberFormatException e1) {//if written data in TextField can't be converted to an integer[String,char,double etc...]
					JOptionPane.showMessageDialog(this, "Enter an integer as the quantity");
				}
			}	
			
		}
			
		
		if(e.getSource().equals(btnMakeBill)) {
			String report = "";
			double pay=0.0;
			for(int i=0;i<list_of_bvr.size();i++) {
				Beverage bvgi = list_of_bvr.get(i);
				report += bvgi.toString();
				double totalprice_of_bvg = bvgi.getAmount() * bvgi.getPrice()*15;
				pay += totalprice_of_bvg;
				report = report + " - "+totalprice_of_bvg+" Rs. \n";
			}
			
			DecimalFormat df2 = new DecimalFormat("#.##");
			
			total.setText(df2.format(pay));
			tax.setText(df2.format(pay*0.3));
			amount.setText(df2.format(pay*1.3 + 10));
			donate.setText("10");
			double qq = pay*1.3 + 10;
			JOptionPane.showMessageDialog(this, report);
			JOptionPane.showMessageDialog(this,	 "You should pay "+qq+" Rs.");
			btnMakeBill.setEnabled(false);
			btnClear.setEnabled(true);
			btnSave.setEnabled(true);
			list_of_bvr.clear();
			SaveReport = report;
		}	
		
		if(e.getSource().equals(btnClear)) {
			JOptionPane.showMessageDialog(null, "Cleared");
			total.setText(null);
			amount.setText(null);
			donate.setText(null);
			tax.setText(null);
			SaveReport = "";
		}
		
		if(e.getSource().equals(btnSave)) {
			JOptionPane.showMessageDialog(null, "Saved");
			try {
				FileWriter writer = new FileWriter("MyFile.txt", true);
				BufferedWriter bufferedWriter = new BufferedWriter(writer);
				 
	            bufferedWriter.write(SaveReport);
	            bufferedWriter.newLine();
	            bufferedWriter.close();
	            
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
}

