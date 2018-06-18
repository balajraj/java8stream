package interview.question;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class ListStream<T> {

    private List<T>  list;
    public T last() {
        T ret = list.stream().reduce((first,second) -> second).orElse(null);
        return ret;
    }

    public T secondLast() throws NoSuchElementException {
        long count = list.stream().count();
        T second = null;
        if ( count >= 2 ) {
            second = list.stream().skip(count -2 ).findFirst().orElseThrow(() -> new NoSuchElementException());
        }
        else {
           throw new NoSuchElementException();
        }
        return second;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

}
