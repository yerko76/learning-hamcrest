package matchers.bean;

import domain.Person;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.samePropertyValuesAs;
import static org.hamcrest.beans.HasProperty.hasProperty;
import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;
import static org.hamcrest.core.IsEqual.equalTo;



public class BeanMatchersTest {

    @Test
    public void learningHasProperty() {
        Person person = new Person("john", "doe");
        assertThat(person, hasProperty("name"));
    }

    @Test
    public void learningHasPropertyWithValue() throws Exception {
        Person person = new Person("john", "doe");
        assertThat(person, hasProperty("name", equalTo("john")));
    }

    @Test
    public void learningSamePropertyValues() throws Exception {
        Person person1 = new Person("john", "doe");
        Person person2 = new Person("john", "doe");

        assertThat(person1, samePropertyValuesAs(person2));
    }
}
