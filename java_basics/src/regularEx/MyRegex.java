package regularEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {

	public static void main(String[] args) {
		String search_target = "이상한 전화번호 0030589-5-95826"
				+"Luke Skywarker 02-123-4567 luke@daum.net"
				+"다스베이더 070-9999-9999 darth_vader@gmail.com"
				+"princess leia 010 2454 3457 leia@gmail.com";
		
		String regex = "0\\d{1,2}[ -]?\\d{3,4}[ -]?\\d{3,4}";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(search_target);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}

	}

}
