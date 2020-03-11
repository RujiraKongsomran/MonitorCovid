package com.rujirakongsomran.monitorcovid.Model;

public class CovidData {
    private String CountryOther;
    private String TotalCases;
    private String NewCases;
    private String TotalDeaths;
    private String NewDeaths;
    private String TotalRecovered;
    private String ActiveCases;
    private String SeriousCritical;
    private String TotStringEmptyCases1Mpop;

    public CovidData() {
    }

    public CovidData(String countryOther, String totalCases, String newCases, String totalDeaths, String newDeaths, String totalRecovered, String activeCases, String seriousCritical, String totStringEmptyCases1Mpop) {
        CountryOther = countryOther;
        TotalCases = totalCases;
        NewCases = newCases;
        TotalDeaths = totalDeaths;
        NewDeaths = newDeaths;
        TotalRecovered = totalRecovered;
        ActiveCases = activeCases;
        SeriousCritical = seriousCritical;
        TotStringEmptyCases1Mpop = totStringEmptyCases1Mpop;
    }

    public String getCountryOther() {
        return CountryOther;
    }

    public void setCountryOther(String countryOther) {
        CountryOther = countryOther;
    }

    public String getTotalCases() {
        return TotalCases;
    }

    public void setTotalCases(String totalCases) {
        TotalCases = totalCases;
    }

    public String getNewCases() {
        return NewCases;
    }

    public void setNewCases(String newCases) {
        NewCases = newCases;
    }

    public String getTotalDeaths() {
        return TotalDeaths;
    }

    public void setTotalDeaths(String totalDeaths) {
        TotalDeaths = totalDeaths;
    }

    public String getNewDeaths() {
        return NewDeaths;
    }

    public void setNewDeaths(String newDeaths) {
        NewDeaths = newDeaths;
    }

    public String getTotalRecovered() {
        return TotalRecovered;
    }

    public void setTotalRecovered(String totalRecovered) {
        TotalRecovered = totalRecovered;
    }

    public String getActiveCases() {
        return ActiveCases;
    }

    public void setActiveCases(String activeCases) {
        ActiveCases = activeCases;
    }

    public String getSeriousCritical() {
        return SeriousCritical;
    }

    public void setSeriousCritical(String seriousCritical) {
        SeriousCritical = seriousCritical;
    }

    public String getTotStringEmptyCases1Mpop() {
        return TotStringEmptyCases1Mpop;
    }

    public void setTotStringEmptyCases1Mpop(String totStringEmptyCases1Mpop) {
        TotStringEmptyCases1Mpop = totStringEmptyCases1Mpop;
    }
}
