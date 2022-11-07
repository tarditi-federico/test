package eserciziostringhe;

import java.util.Scanner;

public class EsercizioStringhe {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String[] nome = new String[10]; 
        
        
        /*
        for(int i=0; i<nome.length; i++) {
            System.out.print("\nInserisci la parola numero " + i);
            nome[i] = in.nextLine();
        }
        
        String maxS = nome[0];
        int posMax = 0;
        for(int i=1; i<nome.length; i++) {
            int k = maxS.compareTo(nome[i]);
            if(k>0){
                maxS = nome[i];
                posMax = i;
            }
        }    
        System.out.println("Stringa più lunga: " + maxS);
        System.out.println("Posizione stringa più lunga: " + posMax + "\n\n\n");

        */
        
        //-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.
        
        
        String Str1, Str2;
        System.out.print("Inserisci la prima stringa: ");
        Str1 = in.nextLine();
        System.out.print("\nInserisci la stringa da cercare: ");
        Str2 = in.nextLine();
        
        int[] posiz = new int[Str1.length() + 10];
        
        int t = -1;
        int u = 0;
        int m = 0;
        
        while(u > -1) {         
            u = Str1.indexOf(Str2, t+1);
            if(u > -1) {
                posiz[m] = u;
                m++;
            }
            t = u;
        }
        if(m > 0) {
            for(int i=0; i<m; i++) {
                System.out.println("Sotto stringhe in posizione:\t" + posiz[i]);
            }
           
        } else {
            System.out.println(Str2 + " non presente in " + Str1);
        }
        
        
        /*
        int u = 0;
        while(u != -1) {
            if(t>=0) {
                System.out.println("Sottostringa "+Str2+ " trovata alla posizione "+t);
                u=Str1.indexOf(Str2,t+1);
                if(u>=0) {
                    System.out.println("Sottostringa "+Str2+ " trovata anche alla posizione "+u);
                }
            }
            System.out.println("\n");
        }
        */
    }
}

