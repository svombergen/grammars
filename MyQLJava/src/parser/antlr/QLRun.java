package parser.antlr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class QLRun {

	public static void main(String[] args) throws Exception {
		ANTLRParser parser = new ANTLRParser();
		
//		Form form1 = parser.parseForm(readFile("toParse.txt"));
//		
//		if (form1.accept(correctVisitor)) {
//			FormRenderer formRenderer1 = new FormRenderer();
//			form1.accept(formRenderer1);
//			System.out.println("form: " + form1);
//		}
		
	}
	
	public static String readFile(String file) {
		InputStream in = QLRun.class.getResourceAsStream(file);
        StringBuilder contents = new StringBuilder();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new InputStreamReader(in));
            String text = null;

            while ((text = reader.readLine()) != null) {
                contents.append(text)
                        .append(System.getProperty(
                                "line.separator"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return contents.toString();
	}

}
