package plateform;



import javax.swing.*;
import java.io.IOException;

public class InternetImpl implements Plateform {

	@Override
	public void CheckadminLogin() throws IOException {
		System.out.println("dkhalna");
		Main m = new Main();
		JOptionPane.showMessageDialog(null, "Username and password correct");
		m.changeScene("adminPlatform.fxml");
	}

	@Override
	public void CheckStudentLogin() throws IOException {
		Main m = new Main();
		m.changeScene("studentPlateform.fxml");
	}

	@Override
	public void RegistreStudent() throws IOException {
		JOptionPane.showMessageDialog(null, "Registration validate");
	}
}
