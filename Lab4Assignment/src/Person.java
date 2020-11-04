/*
 * Desc: Person class contains name and age
 * @author: Prathika
 * Date: 29/10/2020
 */

public class Person {
		private String name;
		private float age;
		
		//Getters and Setters
		public String getName()
		{
			return this.name;
		}
		public void setName(String name)
		{
			this.name = name;
		}
		public float getAge()
		{
			return this.age;
		}
		public void setAge(float age)
		{
			this.age = age;
		}
		
		public Person(String name, float age)
		{
			this.name = name;
			this.age = age;
		}

}

