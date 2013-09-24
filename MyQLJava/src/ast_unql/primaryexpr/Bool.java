package ast_unql.primaryexpr;

import ast_unql.IExpressionVisitor;

public class Bool extends PrimaryExpr {

	private final boolean value;

	public Bool(boolean b) {
		value = b;
	}
	
	@Override
	public String toString(){
		return "" + value;
	}
	
	@Override
	public <T> T accept(IExpressionVisitor<T> visitor) {
		return visitor.visit(this);
	}
	
	public boolean getValue() {
		return value;
	}

}
