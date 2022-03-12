package optional;

import java.util.Optional;

public class Example1 {

	public static void main(String[] args) {
		String[] str = new String[10];
		str[5] = "This is Sara";
		Optional<String> value = Optional.of(str[5]);  
		System.out.println(value.filter(s->s.equals("This is Sara")));
		System.out.println(value.filter(s->s.equals("Sara")));
		System.out.println(value.get());
		System.out.println(value.hashCode());

	}

}
