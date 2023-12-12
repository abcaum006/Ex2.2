public class SortingService {

    private Algorithm algorithm;

    public SortingService(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void sort(int[] items) {
        algorithm.sort(items);
    }
}