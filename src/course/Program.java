package course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		byte x = 13;
		boolean completed = false;
		char gender = 'F';
		char letter = '\u0041';
		long number = 122555266L;
		double balance = 10.35784;
		String nome = "João Alfredo";
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 18:42:07");
		
		System.out.println(sdf2.format(x1));
		System.out.println(sdf2.format(x2));
		System.out.println(sdf2.format(x3));
		
		System.out.println(sdf2.format(y1));
		System.out.println(y2);
		System.out.println(completed);
		System.out.printf("%s %d",nome, x);
		System.out.printf("%.2f %n",balance);
		System.out.printf("%.4f %n",balance);
		

		
	}

}
