package Thread;

import java.io.File;

public class Main {
    private static int newWidth = 300;

    public static void main(String[] args) {
        String srcFolder = "C:/Users/User/Pictures";
        String dstFolder = "C:/Users/User/Pictures/Screenshots";

        File srcDir = new File(srcFolder);

        File[] files = srcDir.listFiles();

        int middle = files.length / 2;
        File[] files1 = new File[middle];
        System.arraycopy(files, 0, files1, 0, files1.length);
        ImageResizer resizer1 = new ImageResizer(newWidth, files1, dstFolder);
        new Thread(resizer1).start();

        File[] files2 = new File[files.length - middle];
        System.arraycopy(files, middle, files2, 0 ,files2.length);
        ImageResizer resizer2 = new ImageResizer(newWidth,files2, dstFolder);
        new Thread(resizer2).start();
    }
}
