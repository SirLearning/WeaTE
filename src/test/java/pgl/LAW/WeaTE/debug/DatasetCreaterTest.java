package pgl.LAW.WeaTE.debug;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class DatasetCreaterTest {

    Random r1 = null;
    long seqNum = 0;
    long binNumF = 0;
    long binNumR = 0;

    protected DatasetCreaterTest(int seed, double outSize, double memorySize,
                                 String filePathF, String filePathR) {
        // instance fields
        this.r1 = new Random(seed);
        this.seqNum = (long) outSize / 300;
        this.binNumF = countBinNum(memorySize, filePathF);
        this.binNumR = countBinNum(memorySize, filePathR);

        // random subsampling
    }

    /**
     *
     * @param memorySize
     * @param filePath
     * @return bin number based on memory size
     */
    private long countBinNum(double memorySize, String filePath) {
        File fq = new File(filePath);
        return (long) memorySize / ((long) fq.length() / this.seqNum);
    }

    private void subSample(String filePath, String outPath) {
        long timeStart = System.nanoTime();
        File fq = new File(filePath);
        long binSize = ((long) fq.length() / this.seqNum);
        try (
                BufferedReader br = new BufferedReader(new FileReader(filePath));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outPath))
        ) {
            HashMap<String, List<String>> IdSeq = new HashMap<>();
            int lineCount = 0;
            StringBuilder sb = new StringBuilder();
        } catch (IOException e) {
            System.err.println(e.toString());
        }


    }
}
