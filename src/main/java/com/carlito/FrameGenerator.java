package com.carlito;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Carlos Zubiran on 6/28/2016.
 */
public class FrameGenerator {

    private static FrameGenerator frameGenerator = new FrameGenerator();


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10 ; i++) {
            sb.append("Frame # " + i + " [");
            for (Integer integer: frameGenerator.createFrame()) {
                sb.append(integer + ",");
            }
            sb.append("]");
            System.out.println(sb);
            sb = new StringBuilder();
        }
    }

    public List<Integer> createFrame() {
        Random randomScoreGenerator = new Random();

        List<Integer> frame = new ArrayList<>();
            frame.add(randomScoreGenerator.nextInt(11));
            if (frame.get(0) < 10) {
                frame.add(randomScoreGenerator.nextInt(10 - frame.get(0) + 1));
            } else if (frame.get(0) == 10) {
                frame.add(0);
            }
        return frame;
        }


    }




