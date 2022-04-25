package com.company;

public class BlueRayDisk {
    public String title;
    public String director;
    public int year_of_release;
    public double cost;

    public BlueRayDisk(String title, String director, int year_of_release, double cost){
        this.title = title;
        this.director = director;
        this.year_of_release = year_of_release;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "$"+cost+" "+year_of_release+" "+title+","+director;

    }
}
