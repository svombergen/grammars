package ast_unql.statement;

import java.util.ArrayList;

import ast_unql.ISelectElement;
import ast_unql.SelectClause;
import ast_unql.primaryexpr.Ident;

public class Select implements IStatement {
	
	SelectClause sExpr;
	Ident from;
	ArrayList<ISelectElement> list;


	public Select(SelectClause s, Ident n,
			ArrayList<ISelectElement> list) {
		setsExpr(s);
		setFrom(n);
		setList(list);
	}


	public SelectClause getsExpr() {
		return sExpr;
	}


	public void setsExpr(SelectClause sExpr) {
		this.sExpr = sExpr;
	}


	public Ident getFrom() {
		return from;
	}


	public void setFrom(Ident id) {
		this.from = id;
	}


	public ArrayList<ISelectElement> getList() {
		return list;
	}


	public void setList(ArrayList<ISelectElement> list) {
		this.list = list;
	}

}
