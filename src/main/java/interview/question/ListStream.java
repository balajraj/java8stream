package interview.question;

import java.util.List;

public class ListStream<T> {

    private List<T>  list;
    public T last() {
        T ret = list.stream().reduce((first,second) -> second).orElse(null);
        return ret;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

}
