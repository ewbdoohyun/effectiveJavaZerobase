package example;

import example.chapter2.CleanObject;
import example.chapter2.Speaker;

import java.io.*;

public class MainApplication {
    public static void main(String[] args) {
        Speaker speaker1 = Speaker.INSTANCE.getInstance();
        speaker1.setMessage("안내 방송 중입니다.");
        Speaker speaker2 = Speaker.INSTANCE;
        System.out.println(speaker1.getMessage());
        int[] t = new int[3];
        t[2] = 3;
        System.out.println(speaker2.getMessage());

        try(CleanObject cleanObject = new CleanObject()) {

        }
    }

//    private void ensureCapacity(){
//        if(element.length == size)
//    }
//    static void copy(String src,String dst) throws IOException{
//        InputStream in = new FileInputStream(src);
//        try {
//            OutputStream out = new FileOutputStream(src);
//            try {
//                byte[] buf = new byte[100];
//                int n;
//                while((n= in.read(buf))>=0){
//                    out.write(buf,0,n);
//                }
//            }finally {
//                out.close();
//            }
//        }finally {
//            in.close();
//        }
//    }

    static void copy(String src, String dst) throws IOException {
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(src)) {
            byte[] buf = new byte[100];
            int n;
            while ((n = in.read(buf)) >= 0) {
                out.write(buf, 0, n);
            }
        }
    }
//        InputStream in = new FileInputStream(src);
//        try {
//            OutputStream out = new FileOutputStream(src);
//            try {
//                byte[] buf = new byte[100];
//                int n;
//                while((n= in.read(buf))>=0){
//                    out.write(buf,0,n);
//                }
//            }finally {
//                out.close();
//            }
//        }finally {
//            in.close();
//        }
    
}
