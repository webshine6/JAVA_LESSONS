package singleton;

public class InnerClass {

	private static InnerClass instance;

	private InnerClass() {
	}

	public static class SingletonHelper {
		public static final InnerClass INSTANCE = new InnerClass();
	}

	public static InnerClass getInstance() {
		return SingletonHelper.INSTANCE;
	}

}
