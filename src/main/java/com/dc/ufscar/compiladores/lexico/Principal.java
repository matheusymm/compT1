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
                // System.out.println("<" + Jander.VOCABULARY.getDisplayName(t.getType()) + "," + t.getText() + ">");
                tempName = Jander.VOCABULARY.getDisplayName(t.getType());
                //mensagem de erro chamada caso exista um símbolo não identificado na entrada, especificando a linha
                if(tempName.equals("ERRO")){
                    pw.println("Linha "+ t.getLine()+": " + t.getText() + " - simbolo nao identificado" );
                    break;
                }
                 //mensagem de erro  chamada caso exista um comentário não tenha sido fechado em alguma linha, especificando esta
                else if(tempName.equals("COMENTARIO_NAO_FECHADO")){
                    pw.println("Linha "+ t.getLine()+": comentario nao fechado");
                    break;
                }
                 //mensagem de erro chamada caso exista uma cadeia não tenha sido fechada em alguma linha, especificando esta
                else if(tempName.equals("CADEIA_NAO_FECHADA")){
                    pw.println("Linha "+ t.getLine()+": cadeia literal nao fechada");
                    break;
                }
                // chamado caso o token analisado seja de pontuação ou algum operador, printando no formato <'token','token'>
                else if(
                    tempName.equals("PONTUACAO")  ||
                    tempName.equals("OP_REL" )    || 
                    tempName.equals("OP_ARIT" )   || 
                    tempName.equals("OP_LOGICO") 
                    )
                    {
                    // System.out.println("<" + '\'' + t.getText() + '\'' + ',' + '\'' + t.getText() + '\'' + ">");
                    pw.println("<" + '\'' + t.getText() + '\'' + ',' + '\'' + t.getText() + '\'' + ">");
                }   
                // chamado caso o token analisado seja um identificador ou uma cadeia, printando no formato <'token',CADEIA> ou <'token',IDENT> 
                else{
                    // System.out.println("<" + '\'' + t.getText() + '\'' + ',' + tempName + ">");
                    pw.println("<" + '\'' + t.getText() + '\'' + ',' + tempName + ">");

                }
            }

            pw.close();
        } catch (IOException ex) {
        }
        
    }
}