import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full file path: ");
        String path = sc.next();
        sc.close();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            List<Product> list = new ArrayList<>();
            while(line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double average = list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x, y) -> x+y)/list.size();
            System.out.println("Average price: " + String.format("%.2f", average));


            Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            List<String> productsName = list.stream()
                    .filter(p -> p.getPrice() < average)
                    .map(p -> p.getName())
                    .sorted(comparator.reversed())
                    .collect(Collectors.toList());

            productsName.forEach(System.out::println);
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}