package parser.antlr;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import parser.test.IParse;
import parser.test.ParseError;

import ast_unql.transaction.Transaction;

public class ANTLRParser implements IParse {

//	@Override
//	public Expr parse(String src) throws ParseError {
//		ANTLRStringStream stream = new ANTLRStringStream(src);
//		CommonTokenStream tokens = new CommonTokenStream();
//		tokens.setTokenSource(new QLLexer(stream));
//		QLParser parser = new QLParser(tokens);
//		try {
//			return parser.orExpr();
//		} catch (RecognitionException e) {
//			throw new ParseError(e.getMessage());
//		}
//	}
	
	public Transaction parseTransaction(String formString) throws ParseError {
		ANTLRStringStream stream = new ANTLRStringStream(formString);
		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(new unqlLexer(stream));
		unqlParser parser = new unqlParser(tokens);
		try {
			return parser.transaction();
		} catch (RecognitionException e) {
			throw new ParseError(e.getMessage());
		}
	}

}
