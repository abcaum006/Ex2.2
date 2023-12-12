public class Main {

    public static void main(String[] args) {
        // Create a sorting service
        SortingService sortingService = new SortingService(new SelectionSort());

        // Sort an array of numbers
        int[] items = {1, 5, 3, 2, 4};
        sortingService.sort(items);
    }
}