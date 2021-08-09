package com.example.WebFin.finance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class PreviousCloseInnerObject {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public String T;
    public double v;
    public double vw;
    public double o;
    public double c;
    public double h;
    public double l;
    public long t;
    public long n;
}
