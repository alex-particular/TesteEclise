
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class TesteDate {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.getDefault());
		LocalDate data = LocalDate.parse("01/07/2021", dtf);

		System.out.println(data.getDayOfMonth());
		System.out.println(data.getMonthValue());
		System.out.println(data.getYear());
		
		Date datas = null;
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		try {
			 datas = formato.parse("23/11/2015");
		} catch (ParseException e) {} 

		Date datass = new Date(2015, 11,22);
		System.out.println(datass.getDay());
		System.out.println(datass.getMonth());
		System.out.println(datass.getYear());
		
	}

}
