package com.hackerrank.test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'requestsServed' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY timestamp
     *  2. INTEGER_ARRAY top
     */

    public static int requestsServed(List<Integer> timestamp, List<Integer> top) {
        int requestServed = 0;
        
        for (Integer topInt : top) {
            List<Integer> topRequests = new ArrayList<>();
            for(Integer time:timestamp){
                if(time<=topInt && time.intValue() > 0){
                    topRequests.add(time);
                }                
            }
            Collections.sort(topRequests, Collections.reverseOrder());
            int cnt = 0;
            for(Integer topRequest:topRequests){
                if(cnt < 5){
                    for (Iterator<Integer> iterator = timestamp.iterator(); iterator.hasNext();) {
                        Integer time = iterator.next();
                        if (time.intValue() == topRequest.intValue()) {
                            iterator.remove();
                            requestServed++;
                            cnt++;
                        }
                
                    }
                }
            }

        }
            
        return requestServed;    
        }
        
    

}

public class Solutions3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int timestampCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> timestamp = IntStream.range(0, timestampCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int topCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> top = IntStream.range(0, topCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.requestsServed(timestamp, top);

        System.out.println(String.valueOf(result));
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}

