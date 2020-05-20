package com.example.copp.Model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

    public class ApiModel {

        @SerializedName("updated")
        @Expose
        private Integer updated;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("countryInfo")
        @Expose
        private basicmodel basic;
        @SerializedName("cases")
        @Expose
        private Integer cases;
        @SerializedName("todayCases")
        @Expose
        private Integer todayCases;
        @SerializedName("deaths")
        @Expose
        private Integer deaths;
        @SerializedName("todayDeaths")
        @Expose
        private Integer todayDeaths;
        @SerializedName("recovered")
        @Expose
        private Integer recovered;
        @SerializedName("active")
        @Expose
        private Integer active;
        @SerializedName("critical")
        @Expose
        private Integer critical;
        @SerializedName("casesPerOneMillion")
        @Expose
        private Integer casesPerOneMillion;
        @SerializedName("deathsPerOneMillion")
        @Expose
        private Double deathsPerOneMillion;
        @SerializedName("tests")
        @Expose
        private Integer tests;
        @SerializedName("testsPerOneMillion")
        @Expose
        private Integer testsPerOneMillion;
        @SerializedName("population")
        @Expose
        private Integer population;
        @SerializedName("continent")
        @Expose
        private String continent;
        @SerializedName("activePerOneMillion")
        @Expose
        private Double activePerOneMillion;
        @SerializedName("recoveredPerOneMillion")
        @Expose
        private Double recoveredPerOneMillion;
        @SerializedName("criticalPerOneMillion")
        @Expose
        private Integer criticalPerOneMillion;

        public Integer getUpdated() {
            return updated;
        }

        public void setUpdated(Integer updated) {
            this.updated = updated;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public basicmodel getCountryInfo() {
            return basic;
        }

        public void setCountryInfo(basicmodel basic) {
            this.basic = basic;
        }

        public Integer getCases() {
            return cases;
        }

        public void setCases(Integer cases) {
            this.cases = cases;
        }

        public Integer getTodayCases() {
            return todayCases;
        }

        public void setTodayCases(Integer todayCases) {
            this.todayCases = todayCases;
        }

        public Integer getDeaths() {
            return deaths;
        }

        public void setDeaths(Integer deaths) {
            this.deaths = deaths;
        }

        public Integer getTodayDeaths() {
            return todayDeaths;
        }

        public void setTodayDeaths(Integer todayDeaths) {
            this.todayDeaths = todayDeaths;
        }

        public Integer getRecovered() {
            return recovered;
        }

        public void setRecovered(Integer recovered) {
            this.recovered = recovered;
        }

        public Integer getActive() {
            return active;
        }

        public void setActive(Integer active) {
            this.active = active;
        }

        public Integer getCritical() {
            return critical;
        }

        public void setCritical(Integer critical) {
            this.critical = critical;
        }

        public Integer getCasesPerOneMillion() {
            return casesPerOneMillion;
        }

        public void setCasesPerOneMillion(Integer casesPerOneMillion) {
            this.casesPerOneMillion = casesPerOneMillion;
        }

        public Double getDeathsPerOneMillion() {
            return deathsPerOneMillion;
        }

        public void setDeathsPerOneMillion(Double deathsPerOneMillion) {
            this.deathsPerOneMillion = deathsPerOneMillion;
        }

        public Integer getTests() {
            return tests;
        }

        public void setTests(Integer tests) {
            this.tests = tests;
        }

        public Integer getTestsPerOneMillion() {
            return testsPerOneMillion;
        }

        public void setTestsPerOneMillion(Integer testsPerOneMillion) {
            this.testsPerOneMillion = testsPerOneMillion;
        }

        public Integer getPopulation() {
            return population;
        }

        public void setPopulation(Integer population) {
            this.population = population;
        }

        public String getContinent() {
            return continent;
        }

        public void setContinent(String continent) {
            this.continent = continent;
        }

        public Double getActivePerOneMillion() {
            return activePerOneMillion;
        }

        public void setActivePerOneMillion(Double activePerOneMillion) {
            this.activePerOneMillion = activePerOneMillion;
        }

        public Double getRecoveredPerOneMillion() {
            return recoveredPerOneMillion;
        }

        public void setRecoveredPerOneMillion(Double recoveredPerOneMillion) {
            this.recoveredPerOneMillion = recoveredPerOneMillion;
        }

        public Integer getCriticalPerOneMillion() {
            return criticalPerOneMillion;
        }

        public void setCriticalPerOneMillion(Integer criticalPerOneMillion) {
            this.criticalPerOneMillion = criticalPerOneMillion;
        }

    }