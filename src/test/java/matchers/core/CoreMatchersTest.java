package matchers.core;

import com.google.common.collect.Lists;
import domain.Person;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;

public class CoreMatchersTest {

    @Test
    public void learningContainsString() {
        String text = "If you are familiar with hamcrest and JUnit the time will come when you have\n" +
                "the need to create your own matchers.";
        assertThat(text, containsString("hamcrest"));
    }

    @Test
    public void learningEqualTo() {
        String hamcrest = "hamcrest";
        assertThat(hamcrest, equalTo("hamcrest"));
    }

    @Test
    public void learningIsNotNull() {
        Person person = new Person("john", "doe");
        assertThat(person, is(notNullValue()));
    }

    @Test
    public void learningIsNull() {
        Person person = null;
        assertThat(person, is(nullValue()));
    }

    @Test
    public void learningEveryItem () {
        List<Integer> ages = Lists.newArrayList(21, 25, 30, 18);
        assertThat(ages, everyItem(greaterThanOrEqualTo(18)));
    }

    @Test
    public void learningIsEmpty() {
        String empty = "";
        assertThat(empty, isEmptyOrNullString());
    }

    @Test
    public void learningEqualIgnoreCase() {
        String ignoreCase = "AAAaaa";
        assertThat(ignoreCase, equalToIgnoringCase("AAAaaa"));
    }

    @Test
    public void learningEqualIgnoringWhiteSpace() {
        String ignoreWhiteSpace = "AA                          ";
        assertThat(ignoreWhiteSpace, equalToIgnoringWhiteSpace("AA"));
    }

    @Test
    public void learningStartsWith() {
        String learningHamcrest = "learning hamcrest";
        assertThat(learningHamcrest, startsWith("learning"));
    }

    @Test
    public void learningEndsWith() {
        String learningHamcrest = "learning hamcrest";
        assertThat(learningHamcrest, endsWith("hamcrest"));

    }
}
