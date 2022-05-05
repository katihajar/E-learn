package plateform;



import javax.swing.*;
import java.io.IOException;

public class InternetImpl implements Plateform {

	@Override
	public void CheckadminLogin() throws IOException {
		Main m = new Main();
		JOptionPane.showMessageDialog(null, "Username and password correct");
		m.changeScene("afterLogin.fxml");
	}

	@Override
	public void CheckStudentLogin() throws IOException {
		Main m = new Main();
		m.changeScene("afterLogin.fxml");
	}

	@Override
	public void RegistreStudent() throws IOException {
		JOptionPane.showMessageDialog(null, "Registration validate");
	}
}
