package com.neotech.Lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {
		ArrayList<Insurance> insurance = new ArrayList<>();
		insurance.add(new Cars("Honda", "Sate Farm"));
		insurance.add(new Pet("cat", "Progressive"));
		insurance.add(new Health("Cigna"));

		System.out.println("1st way normal for loop");
		System.out.println();
		for (int i = 0; i < insurance.size(); i++) {
			Insurance in = insurance.get(i);
			in.getQuote();
			in.cancelInsurance();
		}
		System.out.println();
		System.out.println("2nd way enhance for loop");
		System.out.println();
		for (Insurance in : insurance) {
			in.getQuote();
			in.cancelInsurance();
		}
		System.out.println();
		System.out.println("3d way using Iterator");
		System.out.println();
		//be carful to avoid multiple calls of it.next so we to use Insurane ins=in.next()
		Iterator<Insurance> in = insurance.iterator();
		while (in.hasNext()) {
			Insurance ins = in.next();
			ins.getQuote();
			ins.cancelInsurance();
		}
	}

}
