package com.hospitalmanagement.backend.Hospital.Management.System.BackEnd.Models;

public class Bill {

    private int docFee;
    private int bedFee;
    private int totalFee;

    public Bill(int docFee, int bedFee, int totalFee) {
        this.docFee = docFee;
        this.bedFee = bedFee;
        this.totalFee = totalFee;
    }

    public int getDocFee() {
        return docFee;
    }

    public void setDocFee(int docFee) {
        this.docFee = docFee;
    }

    public int getBedFee() {
        return bedFee;
    }

    public void setBedFee(int bedFee) {
        this.bedFee = bedFee;
    }

    public int getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }
}
