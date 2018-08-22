package com.gmail.alejandro.spring;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

/**
 * The main view contains a simple label element and a template element.
 */
@HtmlImport("styles/shared-styles.html")
@Route
public class MainView extends VerticalLayout {

    public MainView(@Autowired ExampleTemplate template) {
    	TextField txtDNI = new TextField();
    	txtDNI.setPattern("[0-9]*");
    	txtDNI.setPreventInvalidInput(true);
    	
    	// This is just a simple label created via Elements API
    	TextField txtNombre = new TextField();
    	
    	Button button = new Button("Click me",
                event -> template.setValue("Clicked!"));
        Button button2 = new Button("Click me too",
                event -> template.setValue("Desclicked!"));
        // This is a simple template example
        add(button, button2, template);
        setClassName("main-layout");
    }

}
