package br.ufscar.dc.compiladores.alguma.lexico;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import java.io.FileOutputStream;

public class Principal {
    public static void main(String args[]) throws IOException{
        
        CharStream cs= CharStreams.fromFileName(args[0]);       //Leitura do arquivo passado como entrada
        AlgumaLexer lex = new AlgumaLexer(cs); 
        FileOutputStream saida = new FileOutputStream(args[1]); //Escrita no arquivo de saida
        Token aux = null;   //token auxiliar para analise
       
        while((aux = lex.nextToken()).getType() != Token.EOF){  //Enquanto houver caracteres; não for fim do arquivo
            
            //Segunda parte do token
            String direita_token = "'" + aux.getText() + "'"; // Parte do token que abriga o tipo do lexema
            
            // Verificação de identificador válido e seu tipo
            switch (AlgumaLexer.VOCABULARY.getDisplayName(aux.getType())) {
                case "IDENT":
                    direita_token = AlgumaLexer.VOCABULARY.getDisplayName(aux.getType());       // Forma token <'aux.getText()','IDENT'>
                    break;
                case "CADEIA":
                    direita_token = AlgumaLexer.VOCABULARY.getDisplayName(aux.getType());       // Forma token <'aux.getText()','CADEIA'>
                    break;
                case "NUM_INT":
                    direita_token = AlgumaLexer.VOCABULARY.getDisplayName(aux.getType());       // Forma token <'aux.getText()','NUM_INT'>
                    break;
                case "NUM_REAL":
                    direita_token = AlgumaLexer.VOCABULARY.getDisplayName(aux.getType());       // Forma token <'aux.getText()','NUM_REAL'>
                    break;
            }
                   
        
            // ERROS LEXICOS
            switch (AlgumaLexer.VOCABULARY.getDisplayName(aux.getType())) {
                case "ERRO_SIMBOLO":
                    saida.write(("Linha " + aux.getLine() + ": " + aux.getText() + " - simbolo nao identificado\n").getBytes());    //imprime a linha de erro e o tipo de erro
                    saida.close();
                    return;
                case "COMENTARIO_ERRADO":
                    saida.write(("Linha " + aux.getLine() + ": comentario nao fechado\n").getBytes());    //imprime a linha de erro e o tipo de erro
                    saida.close();
                    return;
                case "ERRO_CADEIA":
                    saida.write(("Linha " + aux.getLine() + ": cadeia literal nao fechada\n").getBytes());    //imprime a linha de erro e o tipo de erro
                    saida.close();
                    return;
                default:
                    saida.write(("<'" + aux.getText() + "'," + direita_token+ ">\n").getBytes()); //forma token padrao das palavras chaves e simbolos <'aux.getText()','aux.getText()'>
            }
        }
        saida.close();
    }
}