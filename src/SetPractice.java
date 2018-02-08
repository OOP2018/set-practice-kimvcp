import java.util.*;

/**
 * Practice using a Set.
 */
public class SetPractice {
	/**
	 * Add zero or more items to the set, and print what is being added.
	 * 
	 * 
	 * 
	 * 
	 * @parameter set is the Set to add items to
	 * @parameter values zero or more Strings to add to set
	 */
	public static void addAll(Set<String> set, String... values) {
		for (String arg : values) {
			System.out.print(" add " + arg);
			set.add(arg);
		}
		System.out.println();
	}

	/**
	 * Print all the elements in a set, using an Iterator.
	 */
	public static void print(Set<String> set) {
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String string = iter.next();
			System.out.println(string);
		}
	}

	/**
	 * Explore behavior of a Set.
	 */
	public static void setExplorer( Set<String> set) {
		// 1. Create a HashSet and add strings: dog, ant, bird, elephant, cat
		addAll(set, "dog", "cat", "ant");

		// 2. Print elements in the set using an Iterator over the Set.
		// You're going to need to do this again, so write a method print(Set set) to do
		// it.
		print(set);

		// 3. are the elements printed in same order than you added them?
		// What does this tell you about Sets?
		System.out.println("Are the elements printed in same order than you added them?");

		// 4. Remove all the elements from the set, using a method that
		// defined in Set (and Collection). What is the method to use?
		System.out.println("Clear all the elements!");
		set.clear();

		// 5. Add same elements as exercise 1, but in a different order,
		// such as: "cat", "elephant", "bird", "ant", "dog"
		addAll(set, "cat", "dog", "ant");

		// 6. Print the elements in the set. Is the order same as before?
		print(set);

		// 7. Add duplicate elements to the set. Add another "cat" and "dog".
		// To ensure that these are *distinct* objects use 'set.add(new String("cat"))'
		// and new String("dog").
		System.out.println("Add duplicate items to the set ");
		set.add(new String("cat"));
		set.add(new String("dog"));

		// 8. Print the elements in set. Are there any duplicates?
		// What property of Set does this demonstrate?
		System.out.println("Now Set contains: ");
		print(set);

		// 9. Repeat the exercises using a TreeSet instead of HashSet.
		// What is different when you use TreeSet?
		
		// Hint: Use Polymorphism. Make the Set object be a *parameter* to the
		// method so you can easily use a different set just by changing the parameter!

		// 10. Repeat again using TreeSet with a Comparator.
	}

	public static void main(String[] args) {
		setExplorer(new HashSet<String>());
		setExplorer(new TreeSet<String>());
	}
}
