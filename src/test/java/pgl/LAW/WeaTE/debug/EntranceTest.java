package pgl.LAW.WeaTE.debug;

public class EntranceTest {

    private static String resourcePath = "WeaTE/src/test/resources";

    public static void main(String[] args) {
        DatasetCreaterTest dataset = new DatasetCreaterTest(1, 1e6, 5e11,
                resourcePath, resourcePath);
    }
}
