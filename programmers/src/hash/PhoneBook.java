package hash;

import java.util.*;

public class PhoneBook {
	public static void main(String[] args) {
		System.out.println(solution(new String[] { "12", "123" }));
	}

	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		int length;
		for (String s : phone_book) {
			length = s.length();
			for (String r : phone_book)
				if (r.length() > length && r.substring(0, length).equals(s))
					return false;
		}
		return answer;

	}
}
