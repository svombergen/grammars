package parser.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import parser.antlr.ANTLRParser;

@RunWith(Parameterized.class)
public class TestExpressions {

	private IParse parser;

	@Parameters
	public static List<Object[]> theParsers() {
	  return Arrays.asList(
			  new Object[] {new ANTLRParser()},
			  new Object[] {new ANTLRParser()}
			 );
	}

	
	public TestExpressions(IParse parser) {
		this.parser = parser;
	}

	@Test
	public void testExprResults() throws ParseError {
//		assertEquals(parseResult("5 * 4"), new IntValue(20));
//		assertEquals(parseResult("0 / 3"), new IntValue(0));
//		assertEquals(parseResult("150 + 330"), new IntValue(480));
//		assertEquals(parseResult("19 - 50000"), new IntValue(-49981));
//		
//		assertEquals(parseResult("true"), new BoolValue(true));
//		assertEquals(parseResult("false"), new BoolValue(false));
//		assertEquals(parseResult("true || false"), new BoolValue(true));
//		assertEquals(parseResult("true && false"), new BoolValue(false));
//		assertEquals(parseResult("2 != 2"), new BoolValue(false));
//		assertEquals(parseResult("true && (1 > 0)"), new BoolValue(true));
//		assertEquals(parseResult("(2 == 3) || (3 < 5)"), new BoolValue(true));
//		assertEquals(parseResult("(330 >= 200) && (6 <= 6)"), new BoolValue(true));
//		assertEquals(parseResult("�asd� == �asd�"), new BoolValue(true));
//		assertEquals(parseResult("�asd� != �gfgd�"), new BoolValue(true));
//		assertEquals(parseResult("�asd� == �gfgd�"), new BoolValue(false));
	}
	
	@Test
	public void testAdds() throws ParseError {
//		assertEquals(parser.parse("a + b").getClass(), Add.class);
//		assertEquals(parser.parse("a + b + c").getClass(), Add.class);
//		assertEquals(parser.parse("(a + b + c)").getClass(), Add.class);
//		assertEquals(parser.parse("a + (b + c)").getClass(), Add.class);
//		assertEquals(parser.parse("(a + b) + c").getClass(), Add.class);
//		assertEquals(parser.parse("(a + b)").getClass(), Add.class);
//		assertEquals(parser.parse("a + b * c").getClass(), Add.class);
//		assertEquals(parser.parse("a * b + c").getClass(), Add.class);
	}

	@Test
	public void testMuls() throws ParseError {
//		assertEquals(parser.parse("a * b").getClass(), Mul.class);
//		assertEquals(parser.parse("a * b * c").getClass(), Mul.class);
//		assertEquals(parser.parse("a * (b * c)").getClass(), Mul.class);
//		assertEquals(parser.parse("(a * b) * c").getClass(), Mul.class);
//		assertEquals(parser.parse("(a * b)").getClass(), Mul.class);
//		assertEquals(parser.parse("(a + b) * c").getClass(), Mul.class);
//		assertEquals(parser.parse("a * (b + c)").getClass(), Mul.class);
	}
	
	@Test
	public void testRels() throws ParseError {
//		assertEquals(parser.parse("a < b").getClass(), LT.class);
//		assertEquals(parser.parse("a < b + c").getClass(), LT.class);
//		assertEquals(parser.parse("a < (b * c)").getClass(), LT.class);
//		assertEquals(parser.parse("(a * b) < c").getClass(), LT.class);
//		assertEquals(parser.parse("(a <= b)").getClass(), LEq.class);
//		assertEquals(parser.parse("a + b > c").getClass(), GT.class);
//		assertEquals(parser.parse("a > b + c").getClass(), GT.class);
	}
	
	@Test
	public void testBools() throws ParseError {
//		assertEquals(parser.parse("!b").getClass(), Not.class);
//		assertEquals(parser.parse("a && b").getClass(), And.class);
//		assertEquals(parser.parse("a > b && b > c").getClass(), And.class);
//		assertEquals(parser.parse("(a > b) && (b > c)").getClass(), And.class);
	}


	@Test
	public void testIds() throws ParseError {
//		assertEquals(parser.parse("a").getClass(), Ident.class);
//		assertEquals(parser.parse("abc").getClass(), Ident.class);
//		assertEquals(parser.parse("ABC").getClass(), Ident.class);
//		assertEquals(parser.parse("ABCDEF").getClass(), Ident.class);
//		assertEquals(parser.parse("abc2323").getClass(), Ident.class);
//		assertEquals(parser.parse("a2bc232").getClass(), Ident.class);
//		assertEquals(parser.parse("a2bc232aa").getClass(), Ident.class);
	}

	@Test
	public void testNums() throws ParseError {
//		assertEquals(parser.parse("0").getClass(), Int.class);
//		assertEquals(parser.parse("1223").getClass(), Int.class);
//		assertEquals(parser.parse("234234234").getClass(), Int.class);
	}
	
}
