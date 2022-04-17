package Class;

import Data.Data;

public class Test {
public static void main(String[] args) {
	Test t = new Test();
	Categories ctg = new Categories();
	Product prt = new Product();
	ctg.ingputData(ctg);
	ctg.dislapyData(ctg);
	Data.lstCtg.add(ctg);
	prt.ingputData(prt);
	prt.dislapyData(prt);
}
}
