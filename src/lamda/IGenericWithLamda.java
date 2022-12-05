package lamda;

// functional interface means interface with only one abstract method
@FunctionalInterface
public interface IGenericWithLamda {

    <T extends  Number> T addNumber(T t1, T t2);
}
