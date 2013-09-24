package ast_unql.unaryexpr;

import ast_unql.Expr;
import ast_unql.IExpressionVisitor;

public class Pos extends UnaryExpr {

	public Pos(Expr result) {
		super(result);
	}
	
	@Override
	public <T> T accept(IExpressionVisitor<T> visitor) {
		return visitor.visit(this);
	}

}
