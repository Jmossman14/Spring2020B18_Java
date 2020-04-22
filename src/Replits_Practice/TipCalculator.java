package Replits_Practice;

import java.util.*;
public class TipCalculator{
        public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            System.out.println("Split or No split");
            String split=input.next();
            System.out.println("Number of people entered:");
            String NPE=input.next();
            System.out.println("Service Quality:");
            String Quality=input.next();
            System.out.println("Check amount:");
            double CheckAmount=input.nextDouble();
            int length=NPE.length();
            double TP=0;
            double TT=0;
            double TPP=0;
            double TipPP=0;
            if(Quality.equalsIgnoreCase("poor")){
                TP+=(1+0.05)*CheckAmount;
                TT+=0.05*CheckAmount;
                TPP+=TP/length;
                TipPP+=TT/length;
            } else if(Quality.equalsIgnoreCase("fair")){
                TP+=(1+0.1)*CheckAmount;
                TT+=0.1*CheckAmount;
                TPP+=TP/length;
                TipPP+=TT/length;
            }else if(Quality.equalsIgnoreCase("good")){
                TP+=(1+0.15)*CheckAmount;
                TT+=0.15*CheckAmount;
                TPP+=TP/length;
                TipPP+=TT/length;
            }else if(Quality.equalsIgnoreCase("great")){
                TP+=(1+0.2)*CheckAmount;
                TT+=0.2*CheckAmount;
                TPP+=TP/length;
                TipPP+=TT/length;
            }else if(Quality.equalsIgnoreCase("excellent")){
                TP+=(1+0.25)*CheckAmount;
                TT+=0.25*CheckAmount;
                TPP+=TP/length;
                TipPP+=TT/length;
            }
            System.out.println("Number of people entered: "+NPE);
            System.out.println("Total to pay: "+TP);
            System.out.println("Total Tip: "+TT);
            System.out.println("Total per person: "+TPP);
            System.out.println("Tip per person: "+TipPP);

        }}


