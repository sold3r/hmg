import javax.swing.*;
import java.util.*;

public class hmg
{
	public static void main(String[] args) 
	{
		Vector<String> noms=new Vector<String>();                                                     
		JFrame frame = new JFrame("Ventana Hola Mundo");
		noms.add("Ricardo");
		noms.add("EfraimM");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// SE CREA LA ETIQUETA, INICIALMENTE INDEPENDIENTE DE LA VENTANA
		int num = (int)((Math.random())*noms.size());
		JLabel label= new JLabel("Hola " + noms.get(num));
		// SE AÑADE LA ETIQUETA A LA VENTANA
		frame.getContentPane().add(label);
		// ESTABLECE EL TAMAÑO DE LA VENTANA POR DEFECTO AL VALOR MÍNIMO DE SUS COMPONENTES
		frame.pack();
		// CENTRAMOS LA VENTANA CON EL VALOR NULL
		frame.setLocationRelativeTo(null);
		// ADEMÁS, HAY QUE HACERLO VISIBLE
		frame.setVisible(true);
	}
}
