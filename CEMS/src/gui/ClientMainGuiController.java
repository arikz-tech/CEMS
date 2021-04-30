package gui;

import java.io.IOException;
//
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import client.Client;
import client.ClientController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import models.Test;
import server.DatabaseController;

public class ClientMainGuiController {

	private Client client;
	private static BorderPane mainPane;
	private static ClientController clientController;

	@FXML
	private Button btnSearch;

	private List<Test> testList;

	public void start(Stage stage, ClientController clientController) {
		this.clientController = clientController;
		try {
			mainPane = (BorderPane) FXMLLoader.load(getClass().getResource("ClientMainGui.fxml"));
			Scene scene = new Scene(mainPane, 600, 400);
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	void onSearchClick(ActionEvent event) {
		clientController.sendClientUIRequest(DatabaseController.LOAD_TEST_LIST);
		List<Test> tests = new ArrayList<>();
		tests.addAll(Client.getTests());
		TableGuiController tableGuiController = new TableGuiController(tests);
		tableGuiController.DisplayTable(mainPane);
	}

}