package ast_unql.unaryexpr;

import ast_unql.Expr;

public abstract class UnaryExpr extends Expr {
	protected Expr expression;
	
	public UnaryExpr(Expr result) {
		expression = result;
	}
	
	public Expr getExpr() {
		return expression;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + expression;
	}
	
}
