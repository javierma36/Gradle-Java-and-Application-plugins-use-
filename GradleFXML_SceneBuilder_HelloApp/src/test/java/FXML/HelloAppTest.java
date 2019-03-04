/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML;

import java.util.concurrent.TimeoutException;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.stage.Stage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testfx.api.FxAssert;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit.ApplicationTest;

/**
 *
 * @author mauriciobedoya
 */
public class HelloAppTest extends ApplicationTest{
    
    @Before
    public void setUp() throws Exception {
        ApplicationTest.launch(HelloApp.class);
    }
    
    @After
    public void clean() throws TimeoutException{
        FxToolkit.hideStage();
        release(new KeyCode[]{});
        release(new MouseButton[]{});
    }
    
    @Override
    public void start(Stage stage){
        stage.show();
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void clickMeButtonExists() {
         FxAssert.verifyThat("#clickMeBtn_Id", (Button button)->{
             return button.isVisible();
         });
     }
     
     @Test
     public void labelIsEmpty(){
         FxAssert.verifyThat("#label_id", (Label label)->{
             return label.getText().isEmpty();
         });
     }
     
     @Test
     public void clickMeButtonChangeLabel(){
         clickOn("#clickMeBtn_Id");
         sleep(1000);
         FxAssert.verifyThat("#label_id", (Label label)->{
             return label.getText().equals("Hello World");
         });
     }
}
