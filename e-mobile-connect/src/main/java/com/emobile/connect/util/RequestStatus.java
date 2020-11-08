package com.emobile.connect.util;

public enum RequestStatus {

    IN_PROGRESS("In Progress"), APPROVED("Approved"), REJECTED("Rejected"), REFER_BACK("Refer Back"), CONNECTION_ENABLED("Connection Enabled");
    private String value;

     RequestStatus(String value){
        this.value =value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
