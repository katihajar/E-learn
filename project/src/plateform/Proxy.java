package plateform;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;

import javax.swing.*;

public class Proxy implements Plateform{
	@FXML
	private AnchorPane in;
	@FXML
	private AnchorPane up;
	@FXML
	private PasswordField password;

	@FXML
	private TextField username;

	@FXML
	private Button loginButtonStudent;

	@FXML
	private Button loginButtonAdmin;

	@FXML
	private Button signUp;

	@FXML
	private Label wrongLogIn;

	@FXML
	private TextField FirstName;

	@FXML
	private TextField LastName;

	@FXML
	private TextField UsernameSignup;

	@FXML
	private PasswordField PasswordSignup;

	@FXML
	private TextField Email;
	@FXML
	private Button logout;
	@FXML
	private Button CourseNew;

	@FXML
	private Button NewExam;

	@FXML
	private AnchorPane CoursePanel;

	@FXML
	private AnchorPane ExamPanel;


	Connection conn=null;
	ResultSet rs =null;
	PreparedStatement pst =null;


public InternetImpl imp = new InternetImpl();
	@FXML
	void SignUpStudent(ActionEvent event) {
	in.setVisible(false);
	up.setVisible(true);
	}
	@FXML
	void SignupAction(ActionEvent event) throws IOException{
		RegistreStudent();
	}
	@FXML
	void Retour(ActionEvent event) throws IOException{
		in.setVisible(true);
		up.setVisible(false);
	}
	@FXML
	void StudentLogin(ActionEvent event) throws IOException {
		CheckStudentLogin();
	}
	@FXML
	void adminLogin(ActionEvent event) throws IOException {
		CheckadminLogin();
	}
	public void userLogOut(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("sample.fxml");
	}
	public void CheckadminLogin() throws IOException {
	conn =Mysqlconnect.connectdb();
	String sql="SELECT * FROM `admin` WHERE `Username`=? AND `Password`=?";
		if (username.getText().toString().isEmpty() || password.getText().toString().isEmpty()){
			JOptionPane.showMessageDialog(null, "insert username and password");
		}else {
			try {
				pst = conn.prepareStatement(sql);
				pst.setString(1, username.getText().toString());
				pst.setString(2, password.getText().toString());
				rs = pst.executeQuery();
				if (rs.next()) {
					System.out.println("ana hna");
					imp.CheckadminLogin();
				} else {
					JOptionPane.showMessageDialog(null, "invalid Username and password ");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e);
			}
		}
	}
	 public void CheckStudentLogin() throws IOException {
		 conn =Mysqlconnect.connectdb();
		 String sql="SELECT * FROM `student` WHERE `Username`=? AND `Password`=?";
		 if (username.getText().toString().isEmpty() || password.getText().toString().isEmpty()){
			 JOptionPane.showMessageDialog(null, "insert username and password");
		 }else {
			 try {
				 pst = conn.prepareStatement(sql);
				 pst.setString(1, username.getText().toString());
				 pst.setString(2, password.getText().toString());
				 rs = pst.executeQuery();
				 if (rs.next()) {
					 imp.CheckStudentLogin();
				 } else {
					 JOptionPane.showMessageDialog(null, "invalid Username and password ");
				 }
			 } catch (Exception e) {
				 JOptionPane.showMessageDialog(null, e);
			 }
		 }
	}

	public void RegistreStudent() throws IOException {
		conn = Mysqlconnect.connectdb();
		String sql = "INSERT INTO `student` (`FirstName`, `LastName`, `Username`, `Password`, `Email`) VALUES (?, ?, ?, ?, ?)";
		if(UsernameSignup.getText().toString().isEmpty() || PasswordSignup.getText().toString().isEmpty() || FirstName.getText().toString().isEmpty() || LastName.getText().toString().isEmpty() || Email.getText().toString().isEmpty()  ){
			JOptionPane.showMessageDialog(null, "insert data");
		}else {
			try {
				String test = "SELECT * FROM `student` WHERE `Username`=? AND `Password`=?";
				try {
					pst = conn.prepareStatement(test);
					pst.setString(1, UsernameSignup.getText().toString());
					pst.setString(2, PasswordSignup.getText().toString());
					rs = pst.executeQuery();
					if (rs.next()) {
						JOptionPane.showMessageDialog(null, "user exist");
					} else {
						pst = conn.prepareStatement(sql);
						pst.setString(1, FirstName.getText().toString());
						pst.setString(2, LastName.getText().toString());
						pst.setString(3, UsernameSignup.getText().toString());
						pst.setString(4, PasswordSignup.getText().toString());
						pst.setString(5, Email.getText().toString());
						pst.execute();
						imp.RegistreStudent();
						up.setVisible(false);
						in.setVisible(true);

					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}


			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e);
			}
		}
	}
	@FXML
	void FormCours(ActionEvent event) {
		CoursePanel.setVisible(true);
		ExamPanel.setVisible(false);
	}

	@FXML
	void FormExam(ActionEvent event) {
		CoursePanel.setVisible(false);
		ExamPanel.setVisible(true);
	}
}
