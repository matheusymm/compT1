package com.dc.ufscar.compiladores.lexico;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import java.io.PrintWriter;
public class Principal {

    public static void main(String[] args) {
        try {
            CharStream cs = CharStreams.fromFileName(args[0]);
            String arquivoSaida = args[1];
            Jander lex = new Jander(cs);
            Token t = null;
            PrintWriter pw = new PrintWriter(arquivoSaida);
            while ((t = lex.nextToken()).getType() != Token.EOF) {
            //    System.out.println("<" + Jander.VOCABULARY.getDisplayName(t.getType()) + "," + t.getText() + ">");
                if(Jander.VOCABULARY.getDisplayName(t.getType()) == "PONTUACAO" || Jander.VOCABULARY.getDisplayName(t.getType()) == "OP_REL" || Jander.VOCABULARY.getDisplayName(t.getType()) == "OP_ARIT" || Jander.VOCABULARY.getDisplayName(t.getType()) == "OP_LOGICO"){
                    System.out.println("<" + '\'' + t.getText() + '\'' + ',' + '\'' + t.getText() + '\'' + ">");
                    pw.println("<" + '\'' + t.getText() + '\'' + ',' + '\'' + t.getText() + '\'' + ">");
                }   
                else{
                    System.out.println("<" + '\'' + t.getText() + '\'' + ',' + Jander.VOCABULARY.getDisplayName(t.getType()) + ">");
                    pw.println("<" + '\'' + t.getText() + '\'' + ',' + Jander.VOCABULARY.getDisplayName(t.getType()) + ">");

                }
            }   
            pw.close();
        } catch (IOException ex) {
        }
        
    }
}