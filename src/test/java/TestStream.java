package test;

import org.junit.*;
import interview.question.*;
import java.util.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class TestStream {


    private ListStream<String> list;

    @Before
    public void setup() {
        list = new ListStream<String>();

    }

    @Test
    public void shouldFindLastElementFromAListOfAlphabets() throws Exception {
        list.setList(Arrays.asList("a", "b", "c", "d") );
        assertThat(list.last(), is(equalTo("d")));
    }
}
