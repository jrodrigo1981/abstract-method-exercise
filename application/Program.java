package com.rodrigo.aula133.application;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.rodrigo.aula133.entities.Circle;
import com.rodrigo.aula133.entities.Rectangle;
import com.rodrigo.aula133.entities.Shape;
import com.rodrigo.aula133.entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Shape #" + (i + 1) + " data:");
			
			System.out.print("Rectangle or Circle (r/c)? ");
			char choice = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if (choice == 'r') {
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				System.out.print("Height: ");
				Double height = sc.nextDouble();
				
				list.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();
				
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS");
		
		for(Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
	}

}
