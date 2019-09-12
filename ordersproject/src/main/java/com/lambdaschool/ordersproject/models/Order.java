package com.lambdaschool.ordersproject.models;

import javax.persistence.*;

@Entity
@Table(name="orders")

public class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ordnum;

    @Column(unique = true, nullable = false)
    private double ordamount;
    private double advanceamount;
    private String orddescription;

    @ManyToOne
    @JoinColumn(name = "custcode")
    private long custcode;

    // constructors

    public Order(double ordamount, double advanceamount, String orddescription, long custcode) {
        this.ordamount = ordamount;
        this.advanceamount = advanceamount;
        this.orddescription = orddescription;
        this.custcode = custcode;
    }

    public Order() {
    }

    // getters/setters

    public long getOrdnum() {
        return ordnum;
    }

    public void setOrdnum(long ordnum) {
        this.ordnum = ordnum;
    }

    public double getOrdamount() {
        return ordamount;
    }

    public void setOrdamount(double ordamount) {
        this.ordamount = ordamount;
    }

    public double getAdvanceamount() {
        return advanceamount;
    }

    public void setAdvanceamount(double advanceamount) {
        this.advanceamount = advanceamount;
    }

    public String getOrddescription() {
        return orddescription;
    }

    public void setOrddescription(String orddescription) {
        this.orddescription = orddescription;
    }

    public long getCustcode() {
        return custcode;
    }

    public void setCustcode(long custcode) {
        this.custcode = custcode;
    }
}
