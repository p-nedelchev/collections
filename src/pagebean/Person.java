package pagebean;

/**
 * @author Vasil Mitov (v.mitov.clouway@gmail.com)
 */
public class Person {
  private String name;
  private Integer age;

  public Person(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}
