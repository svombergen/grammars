package ast_unql.unaryexpr;

import ast_unql.Expr;
import ast_unql.IExpressionVisitor;

public class Neg extends UnaryExpr {

	public Neg(Expr result) {
		super(result);
	}
	
	@Override
	public <T> T accept(IExpressionVisitor<T> visitor) {
		return visitor.visit(this);
	}

}
