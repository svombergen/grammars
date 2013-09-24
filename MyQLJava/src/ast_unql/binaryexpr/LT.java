package ast_unql.binaryexpr;

import ast_unql.Expr;
import ast_unql.IExpressionVisitor;

public class LT extends BinaryExpr {

	public LT(Expr result, Expr rhs) {
		super(result, rhs);
	}
	
	@Override
	public <T> T accept(IExpressionVisitor<T> visitor) {
		return visitor.visit(this);
	}
	
}
