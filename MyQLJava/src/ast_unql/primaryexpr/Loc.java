package ast_unql.primaryexpr;

import ast_unql.IExpressionVisitor;

public class Loc extends Ident {
	
	private Ident left, right;

	public Loc(Ident result, Ident right) {
		super(result.getName() + "." + right.getName());
		setLeft(result);
		setRight(right);
		
	}

	@Override
	public <T> T accept(IExpressionVisitor<T> v) {
		return v.visit(this);
	}
	
	@Override
	public String getName() {
		return getLeft().getName() + "." + getRight().getName();
	}

	public Ident getLeft() {
		return left;
	}

	public void setLeft(Ident left) {
		this.left = left;
	}

	public Ident getRight() {
		return right;
	}

	public void setRight(Ident right) {
		this.right = right;
	}

}
