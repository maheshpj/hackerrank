import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class JavaMap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();

		in.nextLine();
		Map<String, String> phonebook = new TreeMap<String, String>();
		for (int i = 0; i < count; i++) {
			String name = in.nextLine();
			String phone = in.next();
			phonebook.put(name, phone);
			in.nextLine();
		}

		while (in.hasNext()) {
			String query = in.nextLine();
			getPhone(phonebook, query);
		}

		in.close();
	}

	public static void getPhone(Map<String, String> phonebook, String query) {
		if (phonebook.containsKey(query)) {
			String phone = phonebook.get(query);
			System.out.println(query + "=" + phone);
		} else {
			System.out.println("Not found");
		}
	}

}
