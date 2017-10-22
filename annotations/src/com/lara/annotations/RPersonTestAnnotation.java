package com.lara.annotations;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(value = RetentionPolicy.RUNTIME)
abstract @interface Person
{
	public abstract String personFirstName();
	public abstract String personLastName();
	public abstract String personEmailId();
	public abstract String personAddress() default "Bangalore";
	public abstract int personAge() default 23;
}
@Person(personFirstName = "ABC",
		personLastName = "xyz",
		personEmailId = "abcdxyz@laratechnology.com",
		personAddress = "Bangalore",
		personAge = 23)

public class RPersonTestAnnotation
{
}
