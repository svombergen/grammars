package parser.test;

import org.uva.sea.ql.ast.Expr;

public interface IParse {
	Expr parse(String src) throws ParseError;
}
