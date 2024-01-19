package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {
    @FXML
	private MenuItem menuItemVendedor;
    @FXML
	private MenuItem menuItemDespartamento;
    @FXML
	private MenuItem menuItemSobre;
	
    @FXML
    public void onMenuItemVendedorAction () {
    	
    	System.out.println("Ação Menu Item Vendedor");
    }
    
    @FXML
    public void onMenuItemDepartamentoAction () {
    	
    	System.out.println("Ação Menu Item Departamento");
    }
    
    @FXML
    public void onMenuItemSobreAction () {
    	
    	System.out.println("Ação Menu Item Sobre");
    }
    
    
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}

}
