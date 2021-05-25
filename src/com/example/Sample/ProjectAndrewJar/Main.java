package com.example.Sample.ProjectAndrewJar;

import com.example.Sample.ProjectAndrewJar.Model.Artist;
import com.example.Sample.ProjectAndrewJar.Model.Datasource;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if(!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }
        List<Artist> artists = datasource.queryArits();
        if(artists==null){
            System.out.println("no artist! ");
            return;
        }

        for(Artist artist: artists){
            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
        }
        datasource.close();
    }
}
