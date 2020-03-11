package com.rujirakongsomran.monitorcovid.Model;

import java.util.List;

public class RootObject {
    private List<Covid> covid;

    public RootObject() {
    }

    public RootObject(List<Covid> covid) {
        this.covid = covid;
    }

    public List<Covid> getCovid() {
        return covid;
    }

    public void setCovid(List<Covid> covid) {
        this.covid = covid;
    }
}
