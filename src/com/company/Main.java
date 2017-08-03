package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here

        HashMap<Integer, Integer> einnahme = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> bankzahlung = new HashMap<>();

        String input = "F 1 68671 F 2 92572 F 3 44609 F 4 70727 F 5 27337 F 6 31910 F 7 20965 F 8 56006 F 9 18597 F 10 80124 F 11 22278 F 12 43122 F 13 88636 F 14 64939 F 15 45179 F 17 99346 F 16 73681 F 19 23871 F 18 61686 F 21 16956 F 20 46044 F 23 29468 F 22 74908 F 25 68553 F 24 34295 F 27 20730 F 26 12133 F 29 5346 F 28 28256 F 31 49854 F 30 33134 F 34 59489 F 35 42469 F 32 95462 F 33 70837 F 38 21360 F 39 2429 F 36 16138 F 37 97300 F 42 79994 F 43 4054 F 40 46428 F 41 32653 F 46 15948 F 47 54595 F 44 55952 F 45 36735 F 51 94327 F 50 42344 F 49 31914 F 48 16413 F 55 10421 F 54 70451 F 53 62486 F 52 86920 F 59 34541 F 58 5747 F 57 28707 F 56 44719 F 63 4696 F 62 51384 F 61 13819 F 60 23653 F 68 80584 F 69 35435 F 70 69238 F 71 92803 F 64 69175 F 65 92656 F 66 69010 F 67 79507 F 76 70802 F 77 33060 F 78 1486 F 79 72340 F 72 18043 F 73 88713 F 74 78076 F 75 10942 F 85 74497 F 84 61039 F 87 86333 F 86 4357 F 81 3322 F 80 82457 F 83 87244 F 82 39637 F 93 34998 F 92 2270 F 95 43010 F 94 29931 F 89 12651 F 88 15473 F 91 75048 F 90 95239 F 98 79804 F 99 36648 F 96 93591 F 97 68641 B 1 68671 B 2 92572 B 3 44609 B 4 70727 B 5 24388 B 6 31910 B 7 20965 B 8 56006 B 9 18597 B 10 80124 B 11 22278 B 12 43122 B 13 88636 B 14 64939 B 15 45179 B 17 99346 B 16 73681 B 19 23871 B 18 61686 B 21 16956 B 20 46044 B 23 29468 B 22 74908 B 25 68553 B 24 34295 B 27 20730 B 26 12133 B 29 5346 B 28 28256 B 31 49854 B 30 33134 B 34 59489 B 35 42469 B 32 88733 B 33 70837 B 38 21360 B 39 2429 B 36 1262 B 37 97300 B 42 79994 B 43 4054 B 40 46428 B 41 32653 B 46 15948 B 47 54595 B 44 55952 B 45 36735 B 51 94327 B 50 42344 B 49 31914 B 48 16413 B 55 10421 B 54 70451 B 53 62486 B 52 86920 B 59 34541 B 58 5747 B 57 28707 B 56 44719 B 63 4696 B 62 51384 B 61 13819 B 60 23653 B 68 80584 B 69 35435 B 70 69238 B 71 92803 B 64 69175 B 65 92656 B 66 69010 B 67 79507 B 76 70802 B 77 33060 B 78 1486 B 79 72340 B 72 18043 B 73 88713 B 74 78076 B 75 10942 B 85 74497 B 84 61039 B 87 86333 B 86 4357 B 81 3322 B 80 82457 B 83 87244 B 82 39637 B 93 34998 B 92 2270 B 95 43010 B 94 29931 B 89 12651 B 88 15473 B 91 75048 B 90 95239 B 98 79804 B 99 36648 B 96 93591 B 97 68641";

        String[] partinput = input.split(" ");

        for (int i = 0; i < partinput.length; i++){
            if (partinput[i].equals("F")){
                if (einnahme.get(Integer.parseInt(partinput[i+1])) != null){
                    einnahme.put(Integer.parseInt(partinput[i+1]),
                            einnahme.get(Integer.parseInt(partinput[i+1]) +
                                    Integer.parseInt(partinput[i+2])));
                } else {
                    einnahme.put(Integer.parseInt(partinput[i+1]),
                                    Integer.parseInt(partinput[i+2]));
                }


            } else if (partinput[i].equals("B")){
                if (bankzahlung.get(Integer.parseInt(partinput[i+1])) != null){
                    bankzahlung.get(Integer.parseInt(partinput[i+1])).add(Integer.parseInt(partinput[i+2]));
                } else {
                    ArrayList<Integer> temp= new ArrayList<>();
                    temp.add(Integer.parseInt(partinput[i+2]));
                    bankzahlung.put(Integer.parseInt(partinput[i+1]),temp);
                }
            }
        }

        for (int i = 1; i < einnahme.size(); i++){
            int counter = 0;

            Collections.sort(bankzahlung.get(i));
            Collections.reverse(bankzahlung.get(i));

            if (einnahme.get(i) < bankzahlung.get(i).get(i)) {
                for(int j = ++i; j < einnahme.size(); j++) {
                    if (bankzahlung.get(i).get(j) >= ) {

                    }
                }
            }
        }
    }
}
