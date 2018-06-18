package test;

import org.junit.*;
import interview.question.*;
import java.util.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class TestStream {


    private ListStream<String> list;
    private ListStream<Integer> listNum;

    @Before
    public void setup() {
        list = new ListStream<String>();
        listNum = new ListStream<Integer>();
    }

    @Test
    public void shouldFindLastElementFromAListOfAlphabets() throws Exception {
        list.setList(Arrays.asList("a", "b", "c", "d") );
        assertThat(list.last(), is(equalTo("d")));
    }

    @Test
    public void shouldFindSecondLastElementFromAList() throws Exception {
        listNum.setList(Arrays.asList(1, 2, 11, 4, 5, 8, 10, 6));
        assertThat(listNum.secondLast(), is(equalTo(10)));
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldThrowExceptionWhenListEmpty() throws Exception {
        listNum.setList(Collections.emptyList());
        listNum.secondLast();
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldThrowExceptionWhenListHasSingleElement() throws Exception {
        listNum.setList(Arrays.asList(1));
        listNum.secondLast();
    }



}
