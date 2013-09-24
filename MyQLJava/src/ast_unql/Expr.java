package ast_unql;

import ast_unql.statement.IStatement;

public abstract class Expr implements IStatement {

	public abstract <T> T accept(IExpressionVisitor<T> v);

}
