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
            String tempName;

            while ((t = lex.nextToken()).getType() != Token.EOF) {
            //    System.out.println("<" + Jander.VOCABULARY.getDisplayName(t.getType()) + "," + t.getText() + ">");
                tempName = Jander.VOCABULARY.getDisplayName(t.getType());
                if(tempName.equals("ERRO")){
                    pw.println("Linha "+ t.getLine()+": " + t.getText() + " - simbolo nao identificado" );
                    break;
                }
                else if(tempName.equals("COMENTARIO_NAO_FECHADO")){
                    pw.println("Linha "+ t.getLine()+": comentario nao fechado");
                    break;
                }
                else if(tempName.equals("CADEIA_NAO_FECHADA")){
                    pw.println("Linha "+ t.getLine()+": cadeia literal nao fechada");
                    break;
                }
                else if(
                    tempName.equals("PONTUACAO")  ||
                    tempName.equals("OP_REL" )    || 
                    tempName.equals("OP_ARIT" )   || 
                    tempName.equals("OP_LOGICO") 
                    )
                    {
                    System.out.println("<" + '\'' + t.getText() + '\'' + ',' + '\'' + t.getText() + '\'' + ">");
                    pw.println("<" + '\'' + t.getText() + '\'' + ',' + '\'' + t.getText() + '\'' + ">");
                }   
                else{
                    System.out.println("<" + '\'' + t.getText() + '\'' + ',' + tempName + ">");
                    pw.println("<" + '\'' + t.getText() + '\'' + ',' + tempName + ">");

                }
            }

            pw.close();
        } catch (IOException ex) {
        }
        
    }
}