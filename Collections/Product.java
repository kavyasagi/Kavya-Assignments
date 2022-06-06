package Collections;

public class Product {

		private int num;

		public Product(int num) {
			super();
			this.num = num;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append(num);
			return builder.toString();
		}
}
