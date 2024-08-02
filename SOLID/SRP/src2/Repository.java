public class Repository<T> implements IRepository<T> {
    
    @Override
    public void save(T t) {
        System.out.println("Saving investment: " + t);
    }
}
