// Generated from br/ufscar/dc/compiladores/alguma/lexico/AlgumaLexer.g4 by ANTLR 4.12.0
package br.ufscar.dc.compiladores.alguma.lexico;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgumaLexerParser}.
 */
public interface AlgumaLexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(AlgumaLexerParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(AlgumaLexerParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(AlgumaLexerParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(AlgumaLexerParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(AlgumaLexerParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(AlgumaLexerParser.FatorContext ctx);
}