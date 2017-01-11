package rmuti.test;

import org.fluttercode.datafactory.impl.DataFactory;

public class StudentOperation {

	DataFactory df = new DataFactory();
	private String FirstName[] = new String[10];
	private String LastName[] = new String[10];
	private String city[] = new String[10];
	private int point[] = new int[10];

	public StudentOperation() {
		for (int i = 0; i < 10; i++) {
			FirstName[i] = df.getFirstName();
			LastName[i] = df.getLastName();
			city[i] = df.getCity();
			point[i] = df.getNumberUpTo(100);
		}

	}

	public void getFirstName() {
		for (int i = 0; i < 10; i++) {
			System.out.println(FirstName[i]);
		}
	}

	public void getTotalPoint() {
		int totalPoint = 0;
		for (int i = 0; i < 10; i++) {
			totalPoint = totalPoint + point[i];
		}
		System.out.println("Totalpoint = " + totalPoint);
	}

}
