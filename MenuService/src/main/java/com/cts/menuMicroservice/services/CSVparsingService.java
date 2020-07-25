package com.cts.menuMicroservice.services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.menuMicroservice.models.MenuItem;
@Service
public class CSVparsingService {
	
	public static List<MenuItem> parseCSVtoBeanList() {
		
		List<MenuItem> menuItems=new ArrayList<MenuItem>();
		
		String csvFile = "src/main/resources/menu.csv";
        BufferedReader br = null;
        String line = "";
        String splitter = ",";
        MenuItem temp=new MenuItem();
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                String[] entries = line.split(splitter);
                temp.setId(entries[0].trim());
                temp.setType(entries[1].trim());
                temp.setName(entries[2].trim());
                temp.setPrice(entries[3].trim());
                menuItems.add(temp);
                temp=new MenuItem();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return menuItems;
	}
}
