package com.hackerrank.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SolutionTimeConversion {

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s) {
		String[] timeString = s.split(":");
		String hr = timeString[0];
		String min = timeString[1];
		String sec = timeString[2].substring(0, 2);
		String time = timeString[2].substring(2);

		StringBuilder convertedTime = new StringBuilder();
		if ("AM".equalsIgnoreCase(time)) {
			if (Integer.parseInt(hr) == 12) {
				hr = "00";
			}
			convertedTime.append(hr).append(":").append(min).append(":").append(sec);
		} else {
			switch (hr) {
			case "01":
				hr = "13";
				break;
			case "02":
				hr = "14";
				break;
			case "03":
				hr = "15";
				break;
			case "04":
				hr = "16";
				break;
			case "05":
				hr = "17";
				break;
			case "06":
				hr = "18";
				break;
			case "07":
				hr = "19";
				break;
			case "08":
				hr = "20";
				break;
			case "09":
				hr = "21";
				break;
			case "10":
				hr = "22";
				break;
			case "11":
				hr = "23";
				break;
			case "12":
				hr = "12";
				break;	
			default:
				throw new IllegalArgumentException("Invalid hr " + hr);
			}
			convertedTime.append(hr).append(":").append(min).append(":").append(sec);
		}

		/*
		 * Write your code here.
		 */

		return convertedTime.toString();
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new
		FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scan.nextLine();

		String result = timeConversion(s);

		bw.write(result);
		bw.newLine();

		bw.close();
	}
}