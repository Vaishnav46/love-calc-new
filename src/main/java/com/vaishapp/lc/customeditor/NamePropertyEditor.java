package com.vaishapp.lc.customeditor;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		String result = text.toUpperCase();
		setValue(result);
	}
}
