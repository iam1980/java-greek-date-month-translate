import java.text.ParseException;

public class GreekDatesHelper {

  public static String getGreekDay(String day) throws ParseException{
		if (day.equalsIgnoreCase("Monday")) return "Δευτέρα";
		if (day.equalsIgnoreCase("Tuesday")) return "Τρίτη";
		if (day.equalsIgnoreCase("Wednesday")) return "Τετάρτη";
		if (day.equalsIgnoreCase("Thursday")) return "Πέμπτη";
		if (day.equalsIgnoreCase("Friday")) return "Παρασκευή";
		if (day.equalsIgnoreCase("Saturday")) return "Σάββατο";
		if (day.equalsIgnoreCase("Sunday")) return "Κυριακή";
		throw new ParseException("Could not tranlsate input date:" + day,0);
	}
	
	public static String getGreekMonth(String month,boolean geniki) throws ParseException{
		if (month.equalsIgnoreCase("January")) return geniki ? "Ιανουαρίου" : "Ιανουάριος";
		if (month.equalsIgnoreCase("February")) return geniki ? "Φεβρουαρίου" : "Φεβρουάριος";
		if (month.equalsIgnoreCase("March")) return geniki ? "Μαρτίου" : "Μάρτιος";
		if (month.equalsIgnoreCase("April")) return geniki ? "Απριλίου" : "Απρίλιος";
		if (month.equalsIgnoreCase("May")) return geniki ? "Μαϊου" : "Μάιος";
		if (month.equalsIgnoreCase("June")) return geniki ? "Ιουνίου" : "Ιούνιος";
		if (month.equalsIgnoreCase("July")) return geniki ? "Ιουλίου" : "Ιούλιος";
		if (month.equalsIgnoreCase("August")) return geniki ? "Αυγούστου" : "Αύγουστος";
		if (month.equalsIgnoreCase("September")) return geniki ? "Σεπτεμβρίου" : "Σεπτέμβριος";
		if (month.equalsIgnoreCase("October")) return geniki ? "Οκτωβρίου" : "Οκτώβριος";
		if (month.equalsIgnoreCase("November")) return geniki ? "Νοεμβρίου" : "Νοέμβριος";
		if (month.equalsIgnoreCase("December")) return geniki ? "Δεκεμβρίου" : "Δεκέμβριος";		
		throw new ParseException("Could not tranlsate input month:" + month,0);
	}	
}
