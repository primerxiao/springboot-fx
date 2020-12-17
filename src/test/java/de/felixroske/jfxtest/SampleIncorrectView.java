package de.felixroske.jfxtest;

import com.primer.jfxsupport.AbstractFxmlView;
import com.primer.jfxsupport.FXMLView;

@FXMLView(value = "/i_do_not_exist.fxml", bundle = "testview", css = "style.css")
public class SampleIncorrectView extends AbstractFxmlView {

}
