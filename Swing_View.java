
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;



public class Swing_View extends JFrame {

    private static final long serialVersionUID = 1L; // ?
    
    private JTextField textfield_flaeche;
    private JTextField textfield_hoehe;
    private JButton button;
    private JLabel schriftzug_flaeche, schriftzug_hoehe;

    
    
    
    
	public Swing_View(Swing_Logic stl) {
    super("Malerkosten");
    getContentPane().setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    initialise();
    

}


private void initialise() {
    
    
    // Fenster intitialisieren
    schriftzug_flaeche = new JLabel("Wie groß ist der Raum [m²]?");
    schriftzug_hoehe = new JLabel("Wie hoch ist die Decke [m]?");
    textfield_flaeche = new JTextField();
    textfield_hoehe = new JTextField();
    button = new JButton("Eingaben bestätigen");

    
    
    // Positionen festlegen
    schriftzug_flaeche.setBounds(5,10,400,25);
    textfield_flaeche.setBounds(5,30,100,25);
    schriftzug_hoehe.setBounds(5,70,400,25);
    textfield_hoehe.setBounds(5,90,100,25);
    button.setBounds(5,140,200,25);
    
    
    // Elemente zum Fenster hinzufuegen
    getContentPane().add(schriftzug_flaeche);
    getContentPane().add(schriftzug_hoehe);
    getContentPane().add(textfield_flaeche);
    getContentPane().add(textfield_hoehe);
    getContentPane().add(button);
    
    // berechnet Layout mit geringstem Speicher automatisch
    pack();
    
}
}









