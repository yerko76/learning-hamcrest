package matchers.collections;


import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import domain.Person;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasValue;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.hamcrest.collection.IsMapContaining.hasEntry;
import static org.hamcrest.collection.IsMapContaining.hasKey;
import static org.hamcrest.core.IsCollectionContaining.hasItem;

public class CollectionMatchersTest {

    @Test
    public void learningHasItem() {
        List<String> cloths = Lists.newArrayList(
                "shirts", "shoes", "pants", "socks");
        assertThat(cloths,hasItem("shoes"));
    }

    @Test
    public void learningHasItems() {
        List<String> cloths = Lists.newArrayList(
                "shirts", "shoes", "pants", "socks");
        assertThat(cloths,hasItems("shoes", "socks"));
    }

    @Test
    public void learningEmpty() {
        List<String> cloths = Lists.newArrayList();
        assertThat(cloths, empty());
    }

    @Test
    public void learningNotEmpty() {
        List<String> cloths = Lists.newArrayList("pants");
        assertThat(cloths, not(empty()));
    }

    @Test
    public void learningHasEntry() {
        Person person1 = new Person("john", "doe");
        Person person2 = new Person("juan", "perez");
        Person person3 = new Person("lorem", "ipsum");

        Map<String, Person> persons = Maps.newHashMap();
        persons.put("john", person1);
        persons.put("juan", person2 );
        persons.put("lorem", person3);

        assertThat(persons, hasEntry("john", person1));
    }

    @Test
    public void learningHasKey () {
        Person person1 = new Person("john", "doe");
        Person person2 = new Person("juan", "perez");
        Person person3 = new Person("lorem", "ipsum");

        Map<String, Person> persons = Maps.newHashMap();
        persons.put("john", person1);
        persons.put("juan", person2 );
        persons.put("lorem", person3);

        assertThat(persons, hasKey("lorem"));
    }

    @Test
    public void learningHasValue() {
        Person person1 = new Person("john", "doe");
        Person person2 = new Person("juan", "perez");
        Person person3 = new Person("lorem", "ipsum");

        Map<String, Person> persons = Maps.newHashMap();
        persons.put("john", person1);
        persons.put("juan", person2 );
        persons.put("lorem", person3);

        assertThat(persons, hasValue(person2));
    }

}
