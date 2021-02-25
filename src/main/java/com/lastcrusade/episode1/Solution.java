package com.lastcrusade.episode1;

public class Solution {
	static void getExit(String[][] array, int longueur, int largeur, int xPlayer, int yPlayer, PositionEnum position) {
		while (xPlayer < largeur && yPlayer < longueur) {
			System.err.println(array[xPlayer][yPlayer]);
			switch (position) {
			case TOP:
				switch (array[xPlayer][yPlayer]) {
				case "1":
					xPlayer++;
					position = PositionEnum.TOP;
					System.out.println(xPlayer + " " + yPlayer);
					break;
				case "3":
					xPlayer++;
					position = PositionEnum.TOP;
					System.out.println(xPlayer + " " + yPlayer);
					break;
				case "5":
					yPlayer++;
					position = PositionEnum.LEFT;
					System.out.println(xPlayer + " " + yPlayer);
					break;
				case "7":
					xPlayer++;
					position = PositionEnum.TOP;
					System.out.println(xPlayer + " " + yPlayer);
					break;
				case "9":
					xPlayer++;
					position = PositionEnum.TOP;
					System.out.println(xPlayer + " " + yPlayer);
					break;
				case "10":
					yPlayer--;
					position = PositionEnum.RIGHT;
					System.out.println(xPlayer + " " + yPlayer);
					break;
				case "11":
					yPlayer++;
					position = PositionEnum.LEFT;
					System.out.println(xPlayer + " " + yPlayer);
					break;
				}
				break;
			case LEFT:
				switch (array[xPlayer][yPlayer]) {
				case "1":
					xPlayer++;
					position = PositionEnum.TOP;
					System.out.println(xPlayer + " " + yPlayer);
					break;
				case "2":
					xPlayer++;
					position = PositionEnum.LEFT;
					System.out.println(xPlayer + " " + yPlayer);
					break;
				case "5":
					xPlayer++;
					position = PositionEnum.TOP;
					System.out.println(xPlayer + " " + yPlayer);
					break;
				case "6":
					yPlayer++;
					position = PositionEnum.LEFT;
					System.out.println(xPlayer + " " + yPlayer);
					break;
				case "8":
					xPlayer++;
					position = PositionEnum.TOP;
					System.out.println(xPlayer + " " + yPlayer);
					break;
				case "9":
					xPlayer++;
					position = PositionEnum.TOP;
					System.out.println(xPlayer + " " + yPlayer);
					break;
				case "13":
					xPlayer++;
					position = PositionEnum.TOP;
					System.out.println(xPlayer + " " + yPlayer);
					break;
				}
				break;
			case RIGHT:
				switch (array[xPlayer][yPlayer]) {
				case "1":
					xPlayer++;
					position = PositionEnum.TOP;
					System.out.println(xPlayer + " " + yPlayer);
					break;
				case "2":
					yPlayer--;
					position = PositionEnum.RIGHT;
					System.out.println(xPlayer + " " + yPlayer);
					break;
				case "4":
					xPlayer++;
					position = PositionEnum.TOP;
					System.out.println(xPlayer + " " + yPlayer);
					break;
				case "6":
					yPlayer--;
					position = PositionEnum.RIGHT;
					System.out.println(xPlayer + " " + yPlayer);
					break;
				case "7":
					xPlayer++;
					position = PositionEnum.TOP;
					System.out.println(xPlayer + " " + yPlayer);
					break;
				case "8":
					yPlayer++;
					position = PositionEnum.TOP;
					System.out.println(xPlayer + " " + yPlayer);
					break;
				case "12":
					xPlayer++;
					position = PositionEnum.TOP;
					System.out.println(xPlayer + " " + yPlayer);
					break;
				}
				break;
			}
		}
	}
}
