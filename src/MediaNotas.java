import javax.swing.JOptionPane;


public class MediaNotas {

	// public static void main(String args[]){

	// int nota1=4, nota2=6, media;

	// media = (nota1 + nota2) / 2;
	// System.out.println("A media é = " + media);

	public static void main(String args[]) {
		int nota1 = 0, nota2 = 0, media;
		
		nota1=Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota 1"));
		nota2=Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota 2"));
		

		media = (nota1 + nota2) / 2;

		JOptionPane.showMessageDialog(null, "Media é: "+ media);

		;

	}

}