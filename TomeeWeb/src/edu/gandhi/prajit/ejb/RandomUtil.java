package edu.gandhi.prajit.ejb;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomUtil {
	private String lexicon="ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";
	private Random rand;
	private Set<String> identifiers;

	public RandomUtil() {
		this.rand = new java.util.Random();
		this.identifiers = new HashSet<String>();
	}

	public String randomIdentifier() {
		StringBuilder builder = new StringBuilder();
		while (builder.toString().length() == 0) {
			int length = this.rand.nextInt(5) + 5;
			for (int i = 0; i < length; i++) {
				builder.append(this.lexicon.charAt(this.rand.nextInt(this.lexicon.length())));
			}
			if (this.identifiers.contains(builder.toString())) {
				builder = new StringBuilder();
			}
		}
		return builder.toString();
	}
}