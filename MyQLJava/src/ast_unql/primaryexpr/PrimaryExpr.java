package ast_unql.primaryexpr;

import ast_unql.Expr;
import ast_unql.IExpressionVisitor;

public abstract class PrimaryExpr extends Expr {
	
	@Override
	public abstract <T> T accept(IExpressionVisitor<T> v);
	
}
