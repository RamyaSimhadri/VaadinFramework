package com.example.myapplication;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Label;

public class HelloWorld extends UI {

	/*
	 * Init is invoked on application load (when a user accesses the application
	 * for the first time).
	 */

	@Override
	protected void init(VaadinRequest request) {
		VerticalLayout view = new VerticalLayout();
		view.addComponent(new Label("Hello Vaadin!"));
		/*
		 * This application creates a new main layout to the UI and adds the
		 * text "Hello Vaadin!" into it.
		 */
		setContent(view);
	}
}
