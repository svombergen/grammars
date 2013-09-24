package ast_unql;

import java.util.ArrayList;

import ast_unql.statement.IStatement;


public class SelectClause {
	
	ArrayList<IStatement> list;

	public SelectClause(ArrayList<IStatement> list) {
		setList(list);
	}

	public ArrayList<IStatement> getList() {
		return list;
	}

	public void setList(ArrayList<IStatement> list) {
		this.list = list;
	}
	
	public void appendList(SelectClause list) {
		this.list.addAll(list.getList());
	}

}
