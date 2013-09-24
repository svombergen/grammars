package ast_unql.transaction;

import java.util.ArrayList;

import ast_unql.primaryexpr.Ident;
import ast_unql.statement.IStatement;

public class Transactions extends Transaction {
	
	private ArrayList<IStatement> list;
	private Ident name;

	public Transactions(ArrayList<IStatement> list, Ident name) {
		this.list = list;
		this.name = name;
	}

}
