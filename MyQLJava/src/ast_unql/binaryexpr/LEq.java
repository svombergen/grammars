package ast_unql.binaryexpr;

import ast_unql.Expr;
import ast_unql.IExpressionVisitor;

public class LEq extends BinaryExpr {
	
	public LEq(Expr result, Expr rhs) {
		super(result, rhs);
	}
	
	@Override
	public <T> T accept(IExpressionVisitor<T> visitor) {
		return visitor.visit(this);
	}

}
