package ast_unql.primaryexpr;

import ast_unql.IExpressionVisitor;

import com.sun.org.apache.bcel.internal.generic.Type;

public class Ident extends Str {

	public Ident(String n) {
		this(n, null);
	}
	
	public Ident(String n, Type t) {
		super(n);
	}

	public String getName() {
		return toString();
	}
	
	@Override
	public <T> T accept(IExpressionVisitor<T> visitor) {
		return visitor.visit(this);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Ident) {
			return value.equals(((Ident) obj).value);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

}
