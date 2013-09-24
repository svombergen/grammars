package parser.test;

import ast_unql.transaction.Transaction;

public interface IParse {
	Transaction parseTransaction(String src) throws ParseError;
}
