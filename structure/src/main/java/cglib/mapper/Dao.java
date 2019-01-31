package cglib.mapper;

public class Dao {
    public void select() {
        System.out.println("select 1 from dual");
    }

    public void insert() {
        System.out.println("insert into ...");
    }

    public final void delete() {
        System.out.println("delete from ...");
    }
}
