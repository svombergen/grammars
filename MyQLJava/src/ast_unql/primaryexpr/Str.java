package ast_unql.primaryexpr;

import ast_unql.IExpressionVisitor;

public class Str extends PrimaryExpr {
	protected final String value;

	public Str(String s) {
		value = s;
	}
	
	@Override
	public <T> T accept(IExpressionVisitor<T> visitor) {
		return visitor.visit(this);
	}
	
	@Override
	public String toString(){
		return value;
	}
	
	public String getValue() {
		return value;
	}
	
	@Override
	public boolean equals(Object o) {
		if ( o instanceof Str) {
			Str s = (Str)o;
			return s.getValue().equals(this.getValue());
		}
		return false;
	}
}
