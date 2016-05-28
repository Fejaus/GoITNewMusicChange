package com.goit.gojavaonline2;

import java.util.List;

public class MusicStore {
    public static void main(String[]args){
        System.out.println("Sell instruments");
        }
    List<MusicalInstrments> musicalInstrments;

    public void setMusicalInstrments(List<MusicalInstrments> musicalInstrments) {
        this.musicalInstrments = musicalInstrments;
    }

    public List<MusicalInstrments> getMusicalInstrments() {
        return musicalInstrments;
    }

}
