package lambda;

import java.io.File;

class OldPhone implements Bluetooth {
	public void share(String f) {
		int data = shareFile(f);
	}

	@Override
	public int shareFile(String fileName) {
		return 48;
	}

}

public class MobilePhone {

	public void share(String file) {
		// --- approach 1
		Bluetooth bt1 = (String f) -> {
			int x = file.length() + 48;
			return x;
		};
		bt1.shareFile("abc");

		// --- approach 2 , remove datatype as only 1 argument or when all argument are
		// of same type
		Bluetooth bt2 = (f) -> {
			int x = file.length() + 48;
			return x;
		};
		bt2.shareFile("abc");

		// --- approach 3 , no need of { } , as we can write same code in 1 line code
		Bluetooth bt3 = (f) -> f.length() + 48;
		bt3.shareFile("abc");

		// --- approach 4 , no need to put f in brackets as only 1 argument
		Bluetooth bt4 = f -> f.length() + 48;
		bt4.shareFile("abc");

	}

}
