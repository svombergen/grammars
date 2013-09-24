package ast_unql.statement;

import java.util.ArrayList;

import ast_unql.transaction.Transaction;

public class StatementList extends Transaction {

	private ArrayList<IStatement> list;
	
	public StatementList(ArrayList<IStatement> list) {
		this.list = list;
	}

}
