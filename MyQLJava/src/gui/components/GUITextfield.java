package org.uva.sea.ql.gui.components;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class GUITextfield extends JTextField implements Observer {

	public GUITextfield(String s) {
		super(s);
	}

	@Override
	public void update(Observable o, Object arg) {
		this.setText(o.toString());
	}
	
}
