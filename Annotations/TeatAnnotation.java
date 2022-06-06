package Annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface TeatAnnotation {
	public @interface Testinfo {
		public String developer() default"Kavya";

		public String Developer();

		public String DeveloperID();

		public String Supervisior();

		public String Date();

		public String Time();

		public String Description();
		}
	}

