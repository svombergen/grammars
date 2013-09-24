package ast_unql.primaryexpr;

import ast_unql.IExpressionVisitor;

public class Int extends PrimaryExpr {

	private final int value;

	public Int(int n) {
		value = n;
	}
	
	@Override
	public String toString(){
		return "" + value;
	}
	
	@Override
	public <T> T accept(IExpressionVisitor<T> visitor) {
		return visitor.visit(this);
	}

	public int getValue() {
		return value;
	}
	
}
