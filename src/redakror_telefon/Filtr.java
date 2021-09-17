package redakror_telefon;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Filtr {
	public String cifry(String s) {
		 switch (s) {
         case  "\n":
        	 break;
         case  "+":
             break;
         case "0":
             break;
         case "1":
        	 break;
         case "2":
        	 break;
         case "3":
             break;
         case "4":
             break;
         case "5":
             break;
         case "6":
             break;
         case "7":
             break;
         case "8":
             break;
         case "9":
             break;
         
         default:
        	 s = "";
             break;
         }
		 return s;
	}
	
	public String tel067(String s) {
		String sn = "";
		Pattern pattern = Pattern.compile("067.+");
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
		    sn = s.substring(matcher.start(), matcher.end());
		}
	    
		return sn;	
	}
	
	public String tel068(String s) {
		String sn = "";
		Pattern pattern = Pattern.compile("068.+");
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
		    sn = s.substring(matcher.start(), matcher.end());
		}
	    
		return sn;	
	}
	
	public String tel096(String s) {
		String sn = "";
		Pattern pattern = Pattern.compile("096.+");
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
		    sn = s.substring(matcher.start(), matcher.end());
		}
	    return sn;	
	}
	
	public String tel097(String s) {
		String sn = "";
		Pattern pattern = Pattern.compile("097.+");
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
		    sn = s.substring(matcher.start(), matcher.end());
		}
	    return sn;	
	}
	
	public String tel098(String s) {
		String sn = "";
		Pattern pattern = Pattern.compile("098.+");
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
		    sn = s.substring(matcher.start(), matcher.end());
		}
	    return sn;	
	}
	
	public String tel063(String s) {
		String sn = "";
		Pattern pattern = Pattern.compile("063.+");
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
		    sn = s.substring(matcher.start(), matcher.end());
		}
	    return sn;	
	}
	
	public String tel073(String s) {
		String sn = "";
		Pattern pattern = Pattern.compile("073.+");
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
		    sn = s.substring(matcher.start(), matcher.end());
		}
	    return sn;	
	}
	
	public String tel093(String s) {
		String sn = "";
		Pattern pattern = Pattern.compile("093.+");
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
		    sn = s.substring(matcher.start(), matcher.end());
		}
	    return sn;	
	}
	
	public String tel050(String s) {
		String sn = "";
		Pattern pattern = Pattern.compile("050.+");
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
		    sn = s.substring(matcher.start(), matcher.end());
		}
	    return sn;	
	}
	
	public String tel066(String s) {
		String sn = "";
		Pattern pattern = Pattern.compile("066.+");
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
		    sn = s.substring(matcher.start(), matcher.end());
		}
	    return sn;	
	}
	
	public String tel095(String s) {
		String sn = "";
		Pattern pattern = Pattern.compile("095.+");
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
		    sn = s.substring(matcher.start(), matcher.end());
		}
	    return sn;	
	}
	
	public String tel099(String s) {
		String sn = "";
		Pattern pattern = Pattern.compile("099.+");
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
		    sn = s.substring(matcher.start(), matcher.end());
		}
	    return sn;	
	}
}
