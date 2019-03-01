package com.optare.ernesto;


/**
 * This class with ask Breaking Bad Quotes service for some quotes and do stuff
 * with them.
 *
 */
public class BreakingBadQuotes {
    private int n;
    private String file1;
    private String file2;

    private BreakingBadQuotes(){

    }

    public static BreakingBadQuotes getInstance(){
        return new BreakingBadQuotes();
    }

    public BreakingBadQuotes setN(int n) {
        this.n = n;
        return this;
    }

    public BreakingBadQuotes setFile1(String file1) {
        this.file1 = file1;
        return this;
    }

    public BreakingBadQuotes setFile2(String file2) {
        this.file2 = file2;
        return this;
    }

    public static void main(String[] args){

    }
}