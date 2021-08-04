package com.company;

import java.util.ArrayList;
import java.util.Collections;


public class DealCards {
    //These are supposed to be the cards
   final String a = "# WW2";String b = "# MMA";String c = "# LALALAND"; String d = "# RT";String f = "# WTH";String g = "# FTP";
           String h="# NASA"; String i="# ASAP"; String j="# DOB"; String k="# IDK"; String l="# BFF"; String m="# MIA";

        public String ww2(){
       String a = "war world 2";
       return a;
   }
        public String mma(){
            String b = "mixed martial arts";
            return b;
        }
        public String lalaland(){
            String c = "la la land";
            return c;
        }
        public String rt(){
            String d = "radio tv";
            return d;
        }
        public String wth(){
            String f = "what the hell";
            return f;
        }
        public String ftp(){
            return "file transfer protocol";
        }
        public String nasa(){
        String h = "National Aeronautics and Space Administration";
        return h;
    }
        public String asap() {
            String i = "ass soon as possible";
            return i;
        }
        public String dob() {
            String j = "date of birth";
            return j;
        }
        public String idk() {
        String k = "i dont know";
        return k;
    }
        public String bff(){
            String l = "best friends forever";
            return l;
        }
        public String mia(){
        String m = "missing in action";
        return m;
    }

            //Cards are stored in this arrayList
            ArrayList<String> cards = new ArrayList<String>();

            // Here Cards are shuffle so user dont sam ecards everytime.
            ArrayList<String> cards(){
                cards.add(a);
                cards.add(b);
                cards.add(c);
                cards.add(d);
                cards.add(f);
                cards.add(g);
                cards.add(h);
                cards.add(i);
                cards.add(j);
                cards.add(k);
                cards.add(l);
                cards.add(m);
                Collections.shuffle(cards);
                return cards;
        }
}
