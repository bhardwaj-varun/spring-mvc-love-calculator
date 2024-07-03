package org.varun.lc.properyEditors;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String convertedString = text.toUpperCase();
        setValue(convertedString);
    }

}
