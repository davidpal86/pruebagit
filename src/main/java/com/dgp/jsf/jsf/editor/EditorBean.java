package com.dgp.jsf.jsf.editor;


import jakarta.faces.bean.ManagedBean;

@ManagedBean(name = "editor")
public class EditorBean {

    private String value = "This editor is provided by PrimeFaces";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
