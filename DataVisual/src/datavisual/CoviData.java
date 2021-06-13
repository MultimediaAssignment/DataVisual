import java.net.*;
import javax.net.ssl.*;
import java.io.*;
import javafx.scene.chart.*;

public class CoviData {
	//JOHOR Covid Data
    public static void retrievejohorData(String selectMonth, XYChart.Series series1){
        try{
            URL url = new URL("https://raw.githubusercontent.com/ynshung/covid-19-malaysia/master/covid-19-my-states-cases.csv");
            HttpsURLConnection hr = (HttpsURLConnection)url.openConnection();
            String filename = url.getFile();    
            //System.out.println(hr.getResponseCode());
            if(hr.getResponseCode()==200){
                InputStream is = hr.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                br.readLine(); // read 1st line to ignore the displaying types first
                String[] values; String line = null; String DATE;
                int count = 1;
                int JH=0;
                while((line = br.readLine()) != null){
                    values = line.split(",");
                    if(selectMonth == "March"){
                        if(count >= 7 && count <= 19){DATE = values[0];JH=Integer.parseInt(values[8]);System.out.println("Date: "+DATE+" Johor: "+JH);series1.getData().add(new XYChart.Data(DATE, JH));}}
                    if(selectMonth == "April"){
                        if(count >= 20 && count <= 49){DATE = values[0];JH=Integer.parseInt(values[8]);System.out.println("Date: "+DATE+" Johor: "+JH);series1.getData().add(new XYChart.Data(DATE, JH));}}
                    if(selectMonth == "May"){
                        if(count >= 50 && count <= 80){DATE = values[0];JH=Integer.parseInt(values[8]);System.out.println("Date: "+DATE+" Johor: "+JH);series1.getData().add(new XYChart.Data(DATE, JH));}}
                    if(selectMonth == "June"){
                        if(count >= 81 && count <= 110){DATE = values[0];JH=Integer.parseInt(values[8]);System.out.println("Date: "+DATE+" Johor: "+JH);series1.getData().add(new XYChart.Data(DATE, JH));}}
                    if(selectMonth == "July"){
                        if(count >= 111 && count <= 141){DATE = values[0];JH=Integer.parseInt(values[8]);System.out.println("Date: "+DATE+" Johor: "+JH);series1.getData().add(new XYChart.Data(DATE, JH));}}
                    if(selectMonth == "August"){
                        if(count >= 142 && count <= 172){DATE = values[0];JH=Integer.parseInt(values[8]);System.out.println("Date: "+DATE+" Johor: "+JH);series1.getData().add(new XYChart.Data(DATE, JH));}}
                    if(selectMonth == "September"){
                        if(count >= 173 && count <= 202){DATE = values[0];JH=Integer.parseInt(values[8]);System.out.println("Date: "+DATE+" Johor: "+JH);series1.getData().add(new XYChart.Data(DATE, JH));}}
                    if(selectMonth == "October"){
                        if(count >= 203 && count <= 233){DATE = values[0];JH=Integer.parseInt(values[8]);System.out.println("Date: "+DATE+" Johor: "+JH);series1.getData().add(new XYChart.Data(DATE, JH));}}      
                    if(selectMonth == "November"){
                        if(count >= 234 && count <= 263){DATE = values[0];JH=Integer.parseInt(values[8]);System.out.println("Date: "+DATE+" Johor: "+JH);series1.getData().add(new XYChart.Data(DATE, JH));}}
                    if(selectMonth == "December"){
                        if(count >= 264 && count <= 294){DATE = values[0];JH=Integer.parseInt(values[8]);System.out.println("Date: "+DATE+" Johor: "+JH);series1.getData().add(new XYChart.Data(DATE, JH));}}
                    count++;}br.close();}
            //System.out.println("File Name: " + filename);
        }  
        catch(Exception e)  {e.printStackTrace();}}
    //KEDAH Covid Data
    public static void retrievekedahData(String selectMonth, XYChart.Series series2){
        try{
            URL url = new URL("https://raw.githubusercontent.com/ynshung/covid-19-malaysia/master/covid-19-my-states-cases.csv");
            HttpsURLConnection hr = (HttpsURLConnection)url.openConnection();
            String filename = url.getFile();    
            //System.out.println(hr.getResponseCode());
            if(hr.getResponseCode()==200){
                InputStream is = hr.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                br.readLine(); // read 1st line to ignore the displaying types first
                String[] values; String line = null; String DATE;
                int count = 1;
                int KD=0;
                while((line = br.readLine()) != null){
                    values = line.split(",");
                    if(selectMonth == "March"){
                        if(count >= 7 && count <= 19){ DATE = values[0];KD=Integer.parseInt(values[2]);System.out.println("Date: "+DATE+" Kedah: "+KD);series2.getData().add(new XYChart.Data(DATE, KD));}}
                    if(selectMonth == "April"){
                        if(count >= 20 && count <= 49){DATE = values[0];KD=Integer.parseInt(values[2]);System.out.println("Date: "+DATE+" Kedah: "+KD);series2.getData().add(new XYChart.Data(DATE, KD));}}
                    if(selectMonth == "May"){
                        if(count >= 50 && count <= 80){DATE = values[0];KD=Integer.parseInt(values[2]);System.out.println("Date: "+DATE+" Kedah: "+KD);series2.getData().add(new XYChart.Data(DATE, KD));}}
                    if(selectMonth == "June"){
                        if(count >= 81 && count <= 110){DATE = values[0];KD=Integer.parseInt(values[2]);System.out.println("Date: "+DATE+" Kedah: "+KD);series2.getData().add(new XYChart.Data(DATE, KD));}}
                    if(selectMonth == "July"){
                        if(count >= 111 && count <= 141){DATE = values[0];KD=Integer.parseInt(values[2]);System.out.println("Date: "+DATE+" Kedah: "+KD);series2.getData().add(new XYChart.Data(DATE, KD));}}
                    if(selectMonth == "August"){
                        if(count >= 142 && count <= 172){DATE = values[0];KD=Integer.parseInt(values[2]);System.out.println("Date: "+DATE+" Kedah: "+KD);series2.getData().add(new XYChart.Data(DATE, KD));}}
                    if(selectMonth == "September"){
                        if(count >= 173 && count <= 202){DATE = values[0];KD=Integer.parseInt(values[2]);System.out.println("Date: "+DATE+" Kedah: "+KD);series2.getData().add(new XYChart.Data(DATE, KD));}}
                    if(selectMonth == "October"){
                        if(count >= 203 && count <= 233){DATE = values[0];KD=Integer.parseInt(values[2]);System.out.println("Date: "+DATE+" Kedah: "+KD);series2.getData().add(new XYChart.Data(DATE, KD));}}      
                    if(selectMonth == "November"){
                        if(count >= 234 && count <= 263){DATE = values[0];KD=Integer.parseInt(values[2]);System.out.println("Date: "+DATE+" Kedah: "+KD);series2.getData().add(new XYChart.Data(DATE, KD));}}
                    if(selectMonth == "December"){
                        if(count >= 264 && count <= 294){DATE = values[0];KD=Integer.parseInt(values[2]);System.out.println("Date: "+DATE+" Kedah: "+KD);series2.getData().add(new XYChart.Data(DATE, KD));}}
                    count++;}br.close();}
            //System.out.println("File Name: " + filename);
        }  
        catch(Exception e)  {e.printStackTrace();}}
    //Kelantan Covid Data
    public static void retrievekelantanData(String selectMonth, XYChart.Series series3){
        try{
            URL url = new URL("https://raw.githubusercontent.com/ynshung/covid-19-malaysia/master/covid-19-my-states-cases.csv");
            HttpsURLConnection hr = (HttpsURLConnection)url.openConnection();
            String filename = url.getFile();    
            //System.out.println(hr.getResponseCode());
            if(hr.getResponseCode()==200){
                InputStream is = hr.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                br.readLine(); // read 1st line to ignore the displaying types first
                String[] values; String line = null; String DATE;
                int count = 1;
                int KE=0;
                while((line = br.readLine()) != null){
                    values = line.split(",");
                    if(selectMonth == "March"){
                        if(count >= 7 && count <= 19){ DATE = values[0];KE=Integer.parseInt(values[11]);System.out.println("Date: "+DATE+" Kelantan: "+KE);series3.getData().add(new XYChart.Data(DATE, KE));}}
                    if(selectMonth == "April"){
                        if(count >= 20 && count <= 49){DATE = values[0];KE=Integer.parseInt(values[11]);System.out.println("Date: "+DATE+" Kelantan: "+KE);series3.getData().add(new XYChart.Data(DATE, KE));}}
                    if(selectMonth == "May"){
                        if(count >= 50 && count <= 80){DATE = values[0];KE=Integer.parseInt(values[11]);System.out.println("Date: "+DATE+" Kelantan: "+KE);series3.getData().add(new XYChart.Data(DATE, KE));}}
                    if(selectMonth == "June"){
                        if(count >= 81 && count <= 110){DATE = values[0];KE=Integer.parseInt(values[11]);System.out.println("Date: "+DATE+" Kelantan: "+KE);series3.getData().add(new XYChart.Data(DATE, KE));}}
                    if(selectMonth == "July"){
                        if(count >= 111 && count <= 141){DATE = values[0];KE=Integer.parseInt(values[11]);System.out.println("Date: "+DATE+" Kelantan: "+KE);series3.getData().add(new XYChart.Data(DATE, KE));}}
                    if(selectMonth == "August"){
                        if(count >= 142 && count <= 172){DATE = values[0];KE=Integer.parseInt(values[11]);System.out.println("Date: "+DATE+" Kelantan: "+KE);series3.getData().add(new XYChart.Data(DATE, KE));}}
                    if(selectMonth == "September"){
                        if(count >= 173 && count <= 202){DATE = values[0];KE=Integer.parseInt(values[11]);System.out.println("Date: "+DATE+" Kelantan: "+KE);series3.getData().add(new XYChart.Data(DATE, KE));}}
                    if(selectMonth == "October"){
                        if(count >= 203 && count <= 233){DATE = values[0];KE=Integer.parseInt(values[11]);System.out.println("Date: "+DATE+" Kelantan: "+KE);series3.getData().add(new XYChart.Data(DATE, KE));}}      
                    if(selectMonth == "November"){
                        if(count >= 234 && count <= 263){DATE = values[0];KE=Integer.parseInt(values[11]);System.out.println("Date: "+DATE+" Kelantan: "+KE);series3.getData().add(new XYChart.Data(DATE, KE));}}
                    if(selectMonth == "December"){
                        if(count >= 264 && count <= 294){DATE = values[0];KE=Integer.parseInt(values[11]);System.out.println("Date: "+DATE+" Kelantan: "+KE);series3.getData().add(new XYChart.Data(DATE, KE));}}
                    count++;}br.close();}
            //System.out.println("File Name: " + filename);
        }  
        catch(Exception e)  {e.printStackTrace();}}
    //Malacca Covid Data
    public static void retrievemalaccaData(String selectMonth, XYChart.Series series4){
        try{
            URL url = new URL("https://raw.githubusercontent.com/ynshung/covid-19-malaysia/master/covid-19-my-states-cases.csv");
            HttpsURLConnection hr = (HttpsURLConnection)url.openConnection();
            String filename = url.getFile();    
            //System.out.println(hr.getResponseCode());
            if(hr.getResponseCode()==200){
                InputStream is = hr.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                br.readLine(); // read 1st line to ignore the displaying types first
                String[] values; String line = null; String DATE;
                int count = 1;
                int ML=0;
                while((line = br.readLine()) != null){
                    values = line.split(",");
                    if(selectMonth == "March"){
                        if(count >= 7 && count <= 19){ DATE = values[0];ML=Integer.parseInt(values[11]);System.out.println("Date: "+DATE+" Malacca: "+ML);series4.getData().add(new XYChart.Data(DATE, ML));}}
                    if(selectMonth == "April"){
                        if(count >= 20 && count <= 49){DATE = values[0];ML=Integer.parseInt(values[11]);System.out.println("Date: "+DATE+" Malacca: "+ML);series4.getData().add(new XYChart.Data(DATE, ML));}}
                    if(selectMonth == "May"){
                        if(count >= 50 && count <= 80){DATE = values[0];ML=Integer.parseInt(values[11]);System.out.println("Date: "+DATE+" Malacca: "+ML);series4.getData().add(new XYChart.Data(DATE, ML));}}
                    if(selectMonth == "June"){
                        if(count >= 81 && count <= 110){DATE = values[0];ML=Integer.parseInt(values[11]);System.out.println("Date: "+DATE+" Malacca: "+ML);series4.getData().add(new XYChart.Data(DATE, ML));}}
                    if(selectMonth == "July"){
                        if(count >= 111 && count <= 141){DATE = values[0];ML=Integer.parseInt(values[11]);System.out.println("Date: "+DATE+" Malacca: "+ML);series4.getData().add(new XYChart.Data(DATE, ML));}}
                    if(selectMonth == "August"){
                        if(count >= 142 && count <= 172){DATE = values[0];ML=Integer.parseInt(values[11]);System.out.println("Date: "+DATE+" Malacca: "+ML);series4.getData().add(new XYChart.Data(DATE, ML));}}
                    if(selectMonth == "September"){
                        if(count >= 173 && count <= 202){DATE = values[0];ML=Integer.parseInt(values[11]);System.out.println("Date: "+DATE+" Malacca: "+ML);series4.getData().add(new XYChart.Data(DATE, ML));}}
                    if(selectMonth == "October"){
                        if(count >= 203 && count <= 233){DATE = values[0];ML=Integer.parseInt(values[11]);System.out.println("Date: "+DATE+" Malacca: "+ML);series4.getData().add(new XYChart.Data(DATE, ML));}}      
                    if(selectMonth == "November"){
                        if(count >= 234 && count <= 263){DATE = values[0];ML=Integer.parseInt(values[11]);System.out.println("Date: "+DATE+" Malacca: "+ML);series4.getData().add(new XYChart.Data(DATE, ML));}}
                    if(selectMonth == "December"){
                        if(count >= 264 && count <= 294){DATE = values[0];ML=Integer.parseInt(values[11]);System.out.println("Date: "+DATE+" Malacca: "+ML);series4.getData().add(new XYChart.Data(DATE, ML));}}
                    count++;}br.close();}
            //System.out.println("File Name: " + filename);
        }  
        catch(Exception e)  {e.printStackTrace();}}
    //NS Covid Data
    public static void retrievensData(String selectMonth, XYChart.Series series5){
        try{
            URL url = new URL("https://raw.githubusercontent.com/ynshung/covid-19-malaysia/master/covid-19-my-states-cases.csv");
            HttpsURLConnection hr = (HttpsURLConnection)url.openConnection();
            String filename = url.getFile();    
            //System.out.println(hr.getResponseCode());
            if(hr.getResponseCode()==200){
                InputStream is = hr.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                br.readLine(); // read 1st line to ignore the displaying types first
                String[] values; String line = null; String DATE;
                int count = 1;
                int NS=0;
                while((line = br.readLine()) != null){
                    values = line.split(",");
                    if(selectMonth == "March"){
                        if(count >= 7 && count <= 19){ DATE = values[0];NS=Integer.parseInt(values[6]);System.out.println("Date: "+DATE+" Negeri.S: "+NS);series5.getData().add(new XYChart.Data(DATE, NS));}}
                    if(selectMonth == "April"){
                        if(count >= 20 && count <= 49){DATE = values[0];NS=Integer.parseInt(values[6]);System.out.println("Date: "+DATE+" Negeri.S: "+NS);series5.getData().add(new XYChart.Data(DATE, NS));}}
                    if(selectMonth == "May"){
                        if(count >= 50 && count <= 80){DATE = values[0];NS=Integer.parseInt(values[6]);System.out.println("Date: "+DATE+" Negeri.S: "+NS);series5.getData().add(new XYChart.Data(DATE, NS));}}
                    if(selectMonth == "June"){
                        if(count >= 81 && count <= 110){DATE = values[0];NS=Integer.parseInt(values[6]);System.out.println("Date: "+DATE+" Negeri.S: "+NS);series5.getData().add(new XYChart.Data(DATE, NS));}}
                    if(selectMonth == "July"){
                        if(count >= 111 && count <= 141){DATE = values[0];NS=Integer.parseInt(values[6]);System.out.println("Date: "+DATE+" Negeri.S: "+NS);series5.getData().add(new XYChart.Data(DATE, NS));}}
                    if(selectMonth == "August"){
                        if(count >= 142 && count <= 172){DATE = values[0];NS=Integer.parseInt(values[6]);System.out.println("Date: "+DATE+" Negeri.S: "+NS);series5.getData().add(new XYChart.Data(DATE, NS));}}
                    if(selectMonth == "September"){
                        if(count >= 173 && count <= 202){DATE = values[0];NS=Integer.parseInt(values[6]);System.out.println("Date: "+DATE+" Negeri.S: "+NS);series5.getData().add(new XYChart.Data(DATE, NS));}}
                    if(selectMonth == "October"){
                        if(count >= 203 && count <= 233){DATE = values[0];NS=Integer.parseInt(values[6]);System.out.println("Date: "+DATE+" Negeri.S: "+NS);series5.getData().add(new XYChart.Data(DATE, NS));}}      
                    if(selectMonth == "November"){
                        if(count >= 234 && count <= 263){DATE = values[0];NS=Integer.parseInt(values[6]);System.out.println("Date: "+DATE+" Negeri.S: "+NS);series5.getData().add(new XYChart.Data(DATE, NS));}}
                    if(selectMonth == "December"){
                        if(count >= 264 && count <= 294){DATE = values[0];NS=Integer.parseInt(values[6]);System.out.println("Date: "+DATE+" Negeri.S: "+NS);series5.getData().add(new XYChart.Data(DATE, NS));}}
                    count++;}br.close();}
            //System.out.println("File Name: " + filename);
        }  
        catch(Exception e)  {e.printStackTrace();}}
    //Pahang Covid Data
    public static void retrievepahangData(String selectMonth, XYChart.Series series6){
        try{
            URL url = new URL("https://raw.githubusercontent.com/ynshung/covid-19-malaysia/master/covid-19-my-states-cases.csv");
            HttpsURLConnection hr = (HttpsURLConnection)url.openConnection();
            String filename = url.getFile();    
            //System.out.println(hr.getResponseCode());
            if(hr.getResponseCode()==200){
                InputStream is = hr.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                br.readLine(); // read 1st line to ignore the displaying types first
                String[] values; String line = null; String DATE;
                int count = 1;
                int PH=0;
                while((line = br.readLine()) != null){
                    values = line.split(",");
                    if(selectMonth == "March"){
                        if(count >= 7 && count <= 19){ DATE = values[0];PH=Integer.parseInt(values[9]);System.out.println("Date: "+DATE+" Pahang: "+PH);series6.getData().add(new XYChart.Data(DATE, PH));}}
                    if(selectMonth == "April"){
                        if(count >= 20 && count <= 49){DATE = values[0];PH=Integer.parseInt(values[9]);System.out.println("Date: "+DATE+" Pahang: "+PH);series6.getData().add(new XYChart.Data(DATE, PH));}}
                    if(selectMonth == "May"){
                        if(count >= 50 && count <= 80){DATE = values[0];PH=Integer.parseInt(values[9]);System.out.println("Date: "+DATE+" Pahang: "+PH);series6.getData().add(new XYChart.Data(DATE, PH));}}
                    if(selectMonth == "June"){
                        if(count >= 81 && count <= 110){DATE = values[0];PH=Integer.parseInt(values[9]);System.out.println("Date: "+DATE+" Pahang: "+PH);series6.getData().add(new XYChart.Data(DATE, PH));}}
                    if(selectMonth == "July"){
                        if(count >= 111 && count <= 141){DATE = values[0];PH=Integer.parseInt(values[9]);System.out.println("Date: "+DATE+" Pahang: "+PH);series6.getData().add(new XYChart.Data(DATE, PH));}}
                    if(selectMonth == "August"){
                        if(count >= 142 && count <= 172){DATE = values[0];PH=Integer.parseInt(values[9]);System.out.println("Date: "+DATE+" Pahang: "+PH);series6.getData().add(new XYChart.Data(DATE, PH));}}
                    if(selectMonth == "September"){
                        if(count >= 173 && count <= 202){DATE = values[0];PH=Integer.parseInt(values[9]);System.out.println("Date: "+DATE+" Pahang: "+PH);series6.getData().add(new XYChart.Data(DATE, PH));}}
                    if(selectMonth == "October"){
                        if(count >= 203 && count <= 233){DATE = values[0];PH=Integer.parseInt(values[9]);System.out.println("Date: "+DATE+" Pahang: "+PH);series6.getData().add(new XYChart.Data(DATE, PH));}}      
                    if(selectMonth == "November"){
                        if(count >= 234 && count <= 263){DATE = values[0];PH=Integer.parseInt(values[9]);System.out.println("Date: "+DATE+" Pahang: "+PH);series6.getData().add(new XYChart.Data(DATE, PH));}}
                    if(selectMonth == "December"){
                        if(count >= 264 && count <= 294){DATE = values[0];PH=Integer.parseInt(values[9]);System.out.println("Date: "+DATE+" Pahang: "+PH);series6.getData().add(new XYChart.Data(DATE, PH));}}
                    count++;}br.close();}
            //System.out.println("File Name: " + filename);
        }  
        catch(Exception e)  {e.printStackTrace();}}
    //Penang Covid Data
    public static void retrievepenangData(String selectMonth, XYChart.Series series7){
        try{
            URL url = new URL("https://raw.githubusercontent.com/ynshung/covid-19-malaysia/master/covid-19-my-states-cases.csv");
            HttpsURLConnection hr = (HttpsURLConnection)url.openConnection();
            String filename = url.getFile();    
            //System.out.println(hr.getResponseCode());
            if(hr.getResponseCode()==200){
                InputStream is = hr.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                br.readLine(); // read 1st line to ignore the displaying types first
                String[] values; String line = null; String DATE;
                int count = 1;
                int PG=0;
                while((line = br.readLine()) != null){
                    values = line.split(",");
                    if(selectMonth == "March"){
                        if(count >= 7 && count <= 19){ DATE = values[0];PG=Integer.parseInt(values[3]);System.out.println("Date: "+DATE+" Penang: "+PG);series7.getData().add(new XYChart.Data(DATE, PG));}}
                    if(selectMonth == "April"){
                        if(count >= 20 && count <= 49){DATE = values[0];PG=Integer.parseInt(values[3]);System.out.println("Date: "+DATE+" Penang: "+PG);series7.getData().add(new XYChart.Data(DATE, PG));}}
                    if(selectMonth == "May"){
                        if(count >= 50 && count <= 80){DATE = values[0];PG=Integer.parseInt(values[3]);System.out.println("Date: "+DATE+" Penang: "+PG);series7.getData().add(new XYChart.Data(DATE, PG));}}
                    if(selectMonth == "June"){
                        if(count >= 81 && count <= 110){DATE = values[0];PG=Integer.parseInt(values[3]);System.out.println("Date: "+DATE+" Penang: "+PG);series7.getData().add(new XYChart.Data(DATE, PG));}}
                    if(selectMonth == "July"){
                        if(count >= 111 && count <= 141){DATE = values[0];PG=Integer.parseInt(values[3]);System.out.println("Date: "+DATE+" Penang: "+PG);series7.getData().add(new XYChart.Data(DATE, PG));}}
                    if(selectMonth == "August"){
                        if(count >= 142 && count <= 172){DATE = values[0];PG=Integer.parseInt(values[3]);System.out.println("Date: "+DATE+" Penang: "+PG);series7.getData().add(new XYChart.Data(DATE, PG));}}
                    if(selectMonth == "September"){
                        if(count >= 173 && count <= 202){DATE = values[0];PG=Integer.parseInt(values[3]);System.out.println("Date: "+DATE+" Penang: "+PG);series7.getData().add(new XYChart.Data(DATE, PG));}}
                    if(selectMonth == "October"){
                        if(count >= 203 && count <= 233){DATE = values[0];PG=Integer.parseInt(values[3]);System.out.println("Date: "+DATE+" Penang: "+PG);series7.getData().add(new XYChart.Data(DATE, PG));}}      
                    if(selectMonth == "November"){
                        if(count >= 234 && count <= 263){DATE = values[0];PG=Integer.parseInt(values[3]);System.out.println("Date: "+DATE+" Penang: "+PG);series7.getData().add(new XYChart.Data(DATE, PG));}}
                    if(selectMonth == "December"){
                        if(count >= 264 && count <= 294){DATE = values[0];PG=Integer.parseInt(values[3]);System.out.println("Date: "+DATE+" Penang: "+PG);series7.getData().add(new XYChart.Data(DATE, PG));}}
                    count++;}br.close();}
            //System.out.println("File Name: " + filename);
        }  
        catch(Exception e)  {e.printStackTrace();}}
    //Perak Covid Data
    public static void retrieveperakData(String selectMonth, XYChart.Series series8){
        try{
            URL url = new URL("https://raw.githubusercontent.com/ynshung/covid-19-malaysia/master/covid-19-my-states-cases.csv");
            HttpsURLConnection hr = (HttpsURLConnection)url.openConnection();
            String filename = url.getFile();    
            //System.out.println(hr.getResponseCode());
            if(hr.getResponseCode()==200){
                InputStream is = hr.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                br.readLine(); // read 1st line to ignore the displaying types first
                String[] values; String line = null; String DATE;
                int count = 1;
                int PK=0;
                while((line = br.readLine()) != null){
                    values = line.split(",");
                    if(selectMonth == "March"){
                        if(count >= 7 && count <= 19){ DATE = values[0];PK=Integer.parseInt(values[4]);System.out.println("Date: "+DATE+" Perak: "+PK);series8.getData().add(new XYChart.Data(DATE, PK));}}
                    if(selectMonth == "April"){
                        if(count >= 20 && count <= 49){DATE = values[0];PK=Integer.parseInt(values[4]);System.out.println("Date: "+DATE+" Perak: "+PK);series8.getData().add(new XYChart.Data(DATE, PK));}}
                    if(selectMonth == "May"){
                        if(count >= 50 && count <= 80){DATE = values[0];PK=Integer.parseInt(values[4]);System.out.println("Date: "+DATE+" Perak: "+PK);series8.getData().add(new XYChart.Data(DATE, PK));}}
                    if(selectMonth == "June"){
                        if(count >= 81 && count <= 110){DATE = values[0];PK=Integer.parseInt(values[4]);System.out.println("Date: "+DATE+" Perak: "+PK);series8.getData().add(new XYChart.Data(DATE, PK));}}
                    if(selectMonth == "July"){
                        if(count >= 111 && count <= 141){DATE = values[0];PK=Integer.parseInt(values[4]);System.out.println("Date: "+DATE+" Perak: "+PK);series8.getData().add(new XYChart.Data(DATE, PK));}}
                    if(selectMonth == "August"){
                        if(count >= 142 && count <= 172){DATE = values[0];PK=Integer.parseInt(values[4]);System.out.println("Date: "+DATE+" Perak: "+PK);series8.getData().add(new XYChart.Data(DATE, PK));}}
                    if(selectMonth == "September"){
                        if(count >= 173 && count <= 202){DATE = values[0];PK=Integer.parseInt(values[4]);System.out.println("Date: "+DATE+" Perak: "+PK);series8.getData().add(new XYChart.Data(DATE, PK));}}
                    if(selectMonth == "October"){
                        if(count >= 203 && count <= 233){DATE = values[0];PK=Integer.parseInt(values[4]);System.out.println("Date: "+DATE+" Perak: "+PK);series8.getData().add(new XYChart.Data(DATE, PK));}}      
                    if(selectMonth == "November"){
                        if(count >= 234 && count <= 263){DATE = values[0];PK=Integer.parseInt(values[4]);System.out.println("Date: "+DATE+" Perak: "+PK);series8.getData().add(new XYChart.Data(DATE, PK));}}
                    if(selectMonth == "December"){
                        if(count >= 264 && count <= 294){DATE = values[0];PK=Integer.parseInt(values[4]);System.out.println("Date: "+DATE+" Perak: "+PK);series8.getData().add(new XYChart.Data(DATE, PK));}}
                    count++;}br.close();}
            //System.out.println("File Name: " + filename);
        }  
        catch(Exception e)  {e.printStackTrace();}}
    //Perlis Covid Data
    public static void retrieveperlisData(String selectMonth, XYChart.Series series9){
        try{
            URL url = new URL("https://raw.githubusercontent.com/ynshung/covid-19-malaysia/master/covid-19-my-states-cases.csv");
            HttpsURLConnection hr = (HttpsURLConnection)url.openConnection();
            String filename = url.getFile();    
            //System.out.println(hr.getResponseCode());
            if(hr.getResponseCode()==200){
                InputStream is = hr.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                br.readLine(); // read 1st line to ignore the displaying types first
                String[] values; String line = null; String DATE;
                int count = 1;
                int PR=0;
                while((line = br.readLine()) != null){
                    values = line.split(",");
                    if(selectMonth == "March"){
                        if(count >= 7 && count <= 19){ DATE = values[0];PR=Integer.parseInt(values[1]);System.out.println("Date: "+DATE+" Perlis: "+PR);series9.getData().add(new XYChart.Data(DATE, PR));}}
                    if(selectMonth == "April"){
                        if(count >= 20 && count <= 49){DATE = values[0];PR=Integer.parseInt(values[1]);System.out.println("Date: "+DATE+" Perlis: "+PR);series9.getData().add(new XYChart.Data(DATE, PR));}}
                    if(selectMonth == "May"){
                        if(count >= 50 && count <= 80){DATE = values[0];PR=Integer.parseInt(values[1]);System.out.println("Date: "+DATE+" Perlis: "+PR);series9.getData().add(new XYChart.Data(DATE, PR));}}
                    if(selectMonth == "June"){
                        if(count >= 81 && count <= 110){DATE = values[0];PR=Integer.parseInt(values[1]);System.out.println("Date: "+DATE+" Perlis: "+PR);series9.getData().add(new XYChart.Data(DATE, PR));}}
                    if(selectMonth == "July"){
                        if(count >= 111 && count <= 141){DATE = values[0];PR=Integer.parseInt(values[1]);System.out.println("Date: "+DATE+" Perlis: "+PR);series9.getData().add(new XYChart.Data(DATE, PR));}}
                    if(selectMonth == "August"){
                        if(count >= 142 && count <= 172){DATE = values[0];PR=Integer.parseInt(values[1]);System.out.println("Date: "+DATE+" Perlis: "+PR);series9.getData().add(new XYChart.Data(DATE, PR));}}
                    if(selectMonth == "September"){
                        if(count >= 173 && count <= 202){DATE = values[0];PR=Integer.parseInt(values[1]);System.out.println("Date: "+DATE+" Perlis: "+PR);series9.getData().add(new XYChart.Data(DATE, PR));}}
                    if(selectMonth == "October"){
                        if(count >= 203 && count <= 233){DATE = values[0];PR=Integer.parseInt(values[1]);System.out.println("Date: "+DATE+" Perlis: "+PR);series9.getData().add(new XYChart.Data(DATE, PR));}}      
                    if(selectMonth == "November"){
                        if(count >= 234 && count <= 263){DATE = values[0];PR=Integer.parseInt(values[1]);System.out.println("Date: "+DATE+" Perlis: "+PR);series9.getData().add(new XYChart.Data(DATE, PR));}}
                    if(selectMonth == "December"){
                        if(count >= 264 && count <= 294){DATE = values[0];PR=Integer.parseInt(values[1]);System.out.println("Date: "+DATE+" Perlis: "+PR);series9.getData().add(new XYChart.Data(DATE, PR));}}
                    count++;}br.close();}
            //System.out.println("File Name: " + filename);
        }  
        catch(Exception e)  {e.printStackTrace();}}
    //Sabah Covid Data
    public static void retrievesabahData(String selectMonth, XYChart.Series series10){
        try{
            URL url = new URL("https://raw.githubusercontent.com/ynshung/covid-19-malaysia/master/covid-19-my-states-cases.csv");
            HttpsURLConnection hr = (HttpsURLConnection)url.openConnection();
            String filename = url.getFile();    
            //System.out.println(hr.getResponseCode());
            if(hr.getResponseCode()==200){
                InputStream is = hr.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                br.readLine(); // read 1st line to ignore the displaying types first
                String[] values; String line = null; String DATE;
                int count = 1;
                int SB=0;
                while((line = br.readLine()) != null){
                    values = line.split(",");
                    if(selectMonth == "March"){
                        if(count >= 7 && count <= 19){ DATE = values[0];SB=Integer.parseInt(values[12]);System.out.println("Date: "+DATE+" Sabah: "+SB);series10.getData().add(new XYChart.Data(DATE, SB));}}
                    if(selectMonth == "April"){
                        if(count >= 20 && count <= 49){DATE = values[0];SB=Integer.parseInt(values[12]);System.out.println("Date: "+DATE+" Sabah: "+SB);series10.getData().add(new XYChart.Data(DATE, SB));}}
                    if(selectMonth == "May"){
                        if(count >= 50 && count <= 80){DATE = values[0];SB=Integer.parseInt(values[12]);System.out.println("Date: "+DATE+" Sabah: "+SB);series10.getData().add(new XYChart.Data(DATE, SB));}}
                    if(selectMonth == "June"){
                        if(count >= 81 && count <= 110){DATE = values[0];SB=Integer.parseInt(values[12]);System.out.println("Date: "+DATE+" Sabah: "+SB);series10.getData().add(new XYChart.Data(DATE, SB));}}
                    if(selectMonth == "July"){
                        if(count >= 111 && count <= 141){DATE = values[0];SB=Integer.parseInt(values[12]);System.out.println("Date: "+DATE+" Sabah: "+SB);series10.getData().add(new XYChart.Data(DATE, SB));}}
                    if(selectMonth == "August"){
                        if(count >= 142 && count <= 172){DATE = values[0];SB=Integer.parseInt(values[12]);System.out.println("Date: "+DATE+" Sabah: "+SB);series10.getData().add(new XYChart.Data(DATE, SB));}}
                    if(selectMonth == "September"){
                        if(count >= 173 && count <= 202){DATE = values[0];SB=Integer.parseInt(values[12]);System.out.println("Date: "+DATE+" Sabah: "+SB);series10.getData().add(new XYChart.Data(DATE, SB));}}
                    if(selectMonth == "October"){
                        if(count >= 203 && count <= 233){DATE = values[0];SB=Integer.parseInt(values[12]);System.out.println("Date: "+DATE+" Sabah: "+SB);series10.getData().add(new XYChart.Data(DATE, SB));}}      
                    if(selectMonth == "November"){
                        if(count >= 234 && count <= 263){DATE = values[0];SB=Integer.parseInt(values[12]);System.out.println("Date: "+DATE+" Sabah: "+SB);series10.getData().add(new XYChart.Data(DATE, SB));}}
                    if(selectMonth == "December"){
                        if(count >= 264 && count <= 294){DATE = values[0];SB=Integer.parseInt(values[12]);System.out.println("Date: "+DATE+" Sabah: "+SB);series10.getData().add(new XYChart.Data(DATE, SB));}}
                    count++;}br.close();}
            //System.out.println("File Name: " + filename);
        }  
        catch(Exception e)  {e.printStackTrace();}}
    //Sarawak Covid Data
    public static void retrievesarawakData(String selectMonth, XYChart.Series series11){
        try{
            URL url = new URL("https://raw.githubusercontent.com/ynshung/covid-19-malaysia/master/covid-19-my-states-cases.csv");
            HttpsURLConnection hr = (HttpsURLConnection)url.openConnection();
            String filename = url.getFile();    
            //System.out.println(hr.getResponseCode());
            if(hr.getResponseCode()==200){
                InputStream is = hr.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                br.readLine(); // read 1st line to ignore the displaying types first
                String[] values; String line = null; String DATE;
                int count = 1;
                int SR=0;
                while((line = br.readLine()) != null){
                    values = line.split(",");
                    if(selectMonth == "March"){
                        if(count >= 7 && count <= 19){ DATE = values[0];SR=Integer.parseInt(values[13]);System.out.println("Date: "+DATE+" Sarawak: "+SR);series11.getData().add(new XYChart.Data(DATE, SR));}}
                    if(selectMonth == "April"){
                        if(count >= 20 && count <= 49){DATE = values[0];SR=Integer.parseInt(values[13]);System.out.println("Date: "+DATE+" Sarawak: "+SR);series11.getData().add(new XYChart.Data(DATE, SR));}}
                    if(selectMonth == "May"){
                        if(count >= 50 && count <= 80){DATE = values[0];SR=Integer.parseInt(values[13]);System.out.println("Date: "+DATE+" Sarawak: "+SR);series11.getData().add(new XYChart.Data(DATE, SR));}}
                    if(selectMonth == "June"){
                        if(count >= 81 && count <= 110){DATE = values[0];SR=Integer.parseInt(values[13]);System.out.println("Date: "+DATE+" Sarawak: "+SR);series11.getData().add(new XYChart.Data(DATE, SR));}}
                    if(selectMonth == "July"){
                        if(count >= 111 && count <= 141){DATE = values[0];SR=Integer.parseInt(values[13]);System.out.println("Date: "+DATE+" Sarawak: "+SR);series11.getData().add(new XYChart.Data(DATE, SR));}}
                    if(selectMonth == "August"){
                        if(count >= 142 && count <= 172){DATE = values[0];SR=Integer.parseInt(values[13]);System.out.println("Date: "+DATE+" Sarawak: "+SR);series11.getData().add(new XYChart.Data(DATE, SR));}}
                    if(selectMonth == "September"){
                        if(count >= 173 && count <= 202){DATE = values[0];SR=Integer.parseInt(values[13]);System.out.println("Date: "+DATE+" Sarawak: "+SR);series11.getData().add(new XYChart.Data(DATE, SR));}}
                    if(selectMonth == "October"){
                        if(count >= 203 && count <= 233){DATE = values[0];SR=Integer.parseInt(values[13]);System.out.println("Date: "+DATE+" Sarawak: "+SR);series11.getData().add(new XYChart.Data(DATE, SR));}}      
                    if(selectMonth == "November"){
                        if(count >= 234 && count <= 263){DATE = values[0];SR=Integer.parseInt(values[13]);System.out.println("Date: "+DATE+" Sarawak: "+SR);series11.getData().add(new XYChart.Data(DATE, SR));}}
                    if(selectMonth == "December"){
                        if(count >= 264 && count <= 294){DATE = values[0];SR=Integer.parseInt(values[13]);System.out.println("Date: "+DATE+" Sarawak: "+SR);series11.getData().add(new XYChart.Data(DATE, SR));}}
                    count++;}br.close();}
            //System.out.println("File Name: " + filename);
        }  
        catch(Exception e)  {e.printStackTrace();}}
    //Selangor Covid Data
    public static void retrieveselangorData(String selectMonth, XYChart.Series series12){
        try{
            URL url = new URL("https://raw.githubusercontent.com/ynshung/covid-19-malaysia/master/covid-19-my-states-cases.csv");
            HttpsURLConnection hr = (HttpsURLConnection)url.openConnection();
            String filename = url.getFile();    
            //System.out.println(hr.getResponseCode());
            if(hr.getResponseCode()==200){
                InputStream is = hr.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                br.readLine(); // read 1st line to ignore the displaying types first
                String[] values; String line = null; String DATE;
                int count = 1;
                int SE=0;
                while((line = br.readLine()) != null){
                    values = line.split(",");
                    if(selectMonth == "March"){
                        if(count >= 7 && count <= 19){ DATE = values[0];SE=Integer.parseInt(values[5]);System.out.println("Date: "+DATE+" Sarawak: "+SE);series12.getData().add(new XYChart.Data(DATE, SE));}}
                    if(selectMonth == "April"){
                        if(count >= 20 && count <= 49){DATE = values[0];SE=Integer.parseInt(values[5]);System.out.println("Date: "+DATE+" Sarawak: "+SE);series12.getData().add(new XYChart.Data(DATE, SE));}}
                    if(selectMonth == "May"){
                        if(count >= 50 && count <= 80){DATE = values[0];SE=Integer.parseInt(values[5]);System.out.println("Date: "+DATE+" Sarawak: "+SE);series12.getData().add(new XYChart.Data(DATE, SE));}}
                    if(selectMonth == "June"){
                        if(count >= 81 && count <= 110){DATE = values[0];SE=Integer.parseInt(values[5]);System.out.println("Date: "+DATE+" Sarawak: "+SE);series12.getData().add(new XYChart.Data(DATE, SE));}}
                    if(selectMonth == "July"){
                        if(count >= 111 && count <= 141){DATE = values[0];SE=Integer.parseInt(values[5]);System.out.println("Date: "+DATE+" Sarawak: "+SE);series12.getData().add(new XYChart.Data(DATE, SE));}}
                    if(selectMonth == "August"){
                        if(count >= 142 && count <= 172){DATE = values[0];SE=Integer.parseInt(values[5]);System.out.println("Date: "+DATE+" Sarawak: "+SE);series12.getData().add(new XYChart.Data(DATE, SE));}}
                    if(selectMonth == "September"){
                        if(count >= 173 && count <= 202){DATE = values[0];SE=Integer.parseInt(values[5]);System.out.println("Date: "+DATE+" Sarawak: "+SE);series12.getData().add(new XYChart.Data(DATE, SE));}}
                    if(selectMonth == "October"){
                        if(count >= 203 && count <= 233){DATE = values[0];SE=Integer.parseInt(values[5]);System.out.println("Date: "+DATE+" Sarawak: "+SE);series12.getData().add(new XYChart.Data(DATE, SE));}}      
                    if(selectMonth == "November"){
                        if(count >= 234 && count <= 263){DATE = values[0];SE=Integer.parseInt(values[5]);System.out.println("Date: "+DATE+" Sarawak: "+SE);series12.getData().add(new XYChart.Data(DATE, SE));}}
                    if(selectMonth == "December"){
                        if(count >= 264 && count <= 294){DATE = values[0];SE=Integer.parseInt(values[5]);System.out.println("Date: "+DATE+" Sarawak: "+SE);series12.getData().add(new XYChart.Data(DATE, SE));}}
                    count++;}br.close();}
            //System.out.println("File Name: " + filename);
        }  
        catch(Exception e)  {e.printStackTrace();}}
    //Terengganu Covid Data
    public static void retrieveterengganuData(String selectMonth, XYChart.Series series13){
        try{
            URL url = new URL("https://raw.githubusercontent.com/ynshung/covid-19-malaysia/master/covid-19-my-states-cases.csv");
            HttpsURLConnection hr = (HttpsURLConnection)url.openConnection();
            String filename = url.getFile();    
            //System.out.println(hr.getResponseCode());
            if(hr.getResponseCode()==200){
                InputStream is = hr.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                br.readLine(); // read 1st line to ignore the displaying types first
                String[] values; String line = null; String DATE;
                int count = 1;
                int TR=0;
                while((line = br.readLine()) != null){
                    values = line.split(",");
                    if(selectMonth == "March"){
                        if(count >= 7 && count <= 19){ DATE = values[0];TR=Integer.parseInt(values[10]);System.out.println("Date: "+DATE+" Terengganu: "+TR);series13.getData().add(new XYChart.Data(DATE, TR));}}
                    if(selectMonth == "April"){
                        if(count >= 20 && count <= 49){DATE = values[0];TR=Integer.parseInt(values[10]);System.out.println("Date: "+DATE+" Terengganu: "+TR);series13.getData().add(new XYChart.Data(DATE, TR));}}
                    if(selectMonth == "May"){
                        if(count >= 50 && count <= 80){DATE = values[0];TR=Integer.parseInt(values[10]);System.out.println("Date: "+DATE+" Terengganu: "+TR);series13.getData().add(new XYChart.Data(DATE, TR));}}
                    if(selectMonth == "June"){
                        if(count >= 81 && count <= 110){DATE = values[0];TR=Integer.parseInt(values[10]);System.out.println("Date: "+DATE+" Terengganu: "+TR);series13.getData().add(new XYChart.Data(DATE, TR));}}
                    if(selectMonth == "July"){
                        if(count >= 111 && count <= 141){DATE = values[0];TR=Integer.parseInt(values[10]);System.out.println("Date: "+DATE+" Terengganu: "+TR);series13.getData().add(new XYChart.Data(DATE, TR));}}
                    if(selectMonth == "August"){
                        if(count >= 142 && count <= 172){DATE = values[0];TR=Integer.parseInt(values[10]);System.out.println("Date: "+DATE+" Terengganu: "+TR);series13.getData().add(new XYChart.Data(DATE, TR));}}
                    if(selectMonth == "September"){
                        if(count >= 173 && count <= 202){DATE = values[0];TR=Integer.parseInt(values[10]);System.out.println("Date: "+DATE+" Terengganu: "+TR);series13.getData().add(new XYChart.Data(DATE, TR));}}
                    if(selectMonth == "October"){
                        if(count >= 203 && count <= 233){DATE = values[0];TR=Integer.parseInt(values[10]);System.out.println("Date: "+DATE+" Terengganu: "+TR);series13.getData().add(new XYChart.Data(DATE, TR));}}      
                    if(selectMonth == "November"){
                        if(count >= 234 && count <= 263){DATE = values[0];TR=Integer.parseInt(values[10]);System.out.println("Date: "+DATE+" Terengganu: "+TR);series13.getData().add(new XYChart.Data(DATE, TR));}}
                    if(selectMonth == "December"){
                        if(count >= 264 && count <= 294){DATE = values[0];TR=Integer.parseInt(values[10]);System.out.println("Date: "+DATE+" Terengganu: "+TR);series13.getData().add(new XYChart.Data(DATE, TR));}}
                    count++;}br.close();}
            //System.out.println("File Name: " + filename);
        }  
        catch(Exception e)  {e.printStackTrace();}}
    //KL Covid Data
    public static void retrieveklData(String selectMonth, XYChart.Series series14){
        try{
            URL url = new URL("https://raw.githubusercontent.com/ynshung/covid-19-malaysia/master/covid-19-my-states-cases.csv");
            HttpsURLConnection hr = (HttpsURLConnection)url.openConnection();
            String filename = url.getFile();    
            //System.out.println(hr.getResponseCode());
            if(hr.getResponseCode()==200){
                InputStream is = hr.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                br.readLine(); // read 1st line to ignore the displaying types first
                String[] values; String line = null; String DATE;
                int count = 1;
                int KL=0;
                while((line = br.readLine()) != null){
                    values = line.split(",");
                    if(selectMonth == "March"){
                        if(count >= 7 && count <= 19){ DATE = values[0];KL=Integer.parseInt(values[14]);System.out.println("Date: "+DATE+" KL: "+KL);series14.getData().add(new XYChart.Data(DATE, KL));}}
                    if(selectMonth == "April"){
                        if(count >= 20 && count <= 49){DATE = values[0];KL=Integer.parseInt(values[14]);System.out.println("Date: "+DATE+" KL: "+KL);series14.getData().add(new XYChart.Data(DATE, KL));}}
                    if(selectMonth == "May"){
                        if(count >= 50 && count <= 80){DATE = values[0];KL=Integer.parseInt(values[14]);System.out.println("Date: "+DATE+" KL: "+KL);series14.getData().add(new XYChart.Data(DATE, KL));}}
                    if(selectMonth == "June"){
                        if(count >= 81 && count <= 110){DATE = values[0];KL=Integer.parseInt(values[14]);System.out.println("Date: "+DATE+" KL: "+KL);series14.getData().add(new XYChart.Data(DATE, KL));}}
                    if(selectMonth == "July"){
                        if(count >= 111 && count <= 141){DATE = values[0];KL=Integer.parseInt(values[14]);System.out.println("Date: "+DATE+" KL: "+KL);series14.getData().add(new XYChart.Data(DATE, KL));}}
                    if(selectMonth == "August"){
                        if(count >= 142 && count <= 172){DATE = values[0];KL=Integer.parseInt(values[14]);System.out.println("Date: "+DATE+" KL: "+KL);series14.getData().add(new XYChart.Data(DATE, KL));}}
                    if(selectMonth == "September"){
                        if(count >= 173 && count <= 202){DATE = values[0];KL=Integer.parseInt(values[14]);System.out.println("Date: "+DATE+" KL: "+KL);series14.getData().add(new XYChart.Data(DATE, KL));}}
                    if(selectMonth == "October"){
                        if(count >= 203 && count <= 233){DATE = values[0];KL=Integer.parseInt(values[14]);System.out.println("Date: "+DATE+" KL: "+KL);series14.getData().add(new XYChart.Data(DATE, KL));}}      
                    if(selectMonth == "November"){
                        if(count >= 234 && count <= 263){DATE = values[0];KL=Integer.parseInt(values[14]);System.out.println("Date: "+DATE+" KL: "+KL);series14.getData().add(new XYChart.Data(DATE, KL));}}
                    if(selectMonth == "December"){
                        if(count >= 264 && count <= 294){DATE = values[0];KL=Integer.parseInt(values[14]);System.out.println("Date: "+DATE+" KL: "+KL);series14.getData().add(new XYChart.Data(DATE, KL));}}
                    count++;}br.close();}
            //System.out.println("File Name: " + filename);
        }  
        catch(Exception e)  {e.printStackTrace();}}
    //Putrajaya Covid Data
    public static void retrieveputrajayaData(String selectMonth, XYChart.Series series15){
        try{
            URL url = new URL("https://raw.githubusercontent.com/ynshung/covid-19-malaysia/master/covid-19-my-states-cases.csv");
            HttpsURLConnection hr = (HttpsURLConnection)url.openConnection();
            String filename = url.getFile();    
            //System.out.println(hr.getResponseCode());
            if(hr.getResponseCode()==200){
                InputStream is = hr.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                br.readLine(); // read 1st line to ignore the displaying types first
                String[] values; String line = null; String DATE;
                int count = 1;
                int PJ=0;
                while((line = br.readLine()) != null){
                    values = line.split(",");
                    if(selectMonth == "March"){
                        if(count >= 7 && count <= 19){ DATE = values[0];PJ=Integer.parseInt(values[14]);System.out.println("Date: "+DATE+" PJ: "+PJ);series15.getData().add(new XYChart.Data(DATE, PJ));}}
                    if(selectMonth == "April"){
                        if(count >= 20 && count <= 49){DATE = values[0];PJ=Integer.parseInt(values[14]);System.out.println("Date: "+DATE+" PJ: "+PJ);series15.getData().add(new XYChart.Data(DATE, PJ));}}
                    if(selectMonth == "May"){
                        if(count >= 50 && count <= 80){DATE = values[0];PJ=Integer.parseInt(values[14]);System.out.println("Date: "+DATE+" PJ: "+PJ);series15.getData().add(new XYChart.Data(DATE, PJ));}}
                    if(selectMonth == "June"){
                        if(count >= 81 && count <= 110){DATE = values[0];PJ=Integer.parseInt(values[14]);System.out.println("Date: "+DATE+" PJ: "+PJ);series15.getData().add(new XYChart.Data(DATE, PJ));}}
                    if(selectMonth == "July"){
                        if(count >= 111 && count <= 141){DATE = values[0];PJ=Integer.parseInt(values[14]);System.out.println("Date: "+DATE+" PJ: "+PJ);series15.getData().add(new XYChart.Data(DATE, PJ));}}
                    if(selectMonth == "August"){
                        if(count >= 142 && count <= 172){DATE = values[0];PJ=Integer.parseInt(values[14]);System.out.println("Date: "+DATE+" PJ: "+PJ);series15.getData().add(new XYChart.Data(DATE, PJ));}}
                    if(selectMonth == "September"){
                        if(count >= 173 && count <= 202){DATE = values[0];PJ=Integer.parseInt(values[14]);System.out.println("Date: "+DATE+" PJ: "+PJ);series15.getData().add(new XYChart.Data(DATE, PJ));}}
                    if(selectMonth == "October"){
                        if(count >= 203 && count <= 233){DATE = values[0];PJ=Integer.parseInt(values[14]);System.out.println("Date: "+DATE+" PJ: "+PJ);series15.getData().add(new XYChart.Data(DATE, PJ));}}      
                    if(selectMonth == "November"){
                        if(count >= 234 && count <= 263){DATE = values[0];PJ=Integer.parseInt(values[14]);System.out.println("Date: "+DATE+" PJ: "+PJ);series15.getData().add(new XYChart.Data(DATE, PJ));}}
                    if(selectMonth == "December"){
                        if(count >= 264 && count <= 294){DATE = values[0];PJ=Integer.parseInt(values[14]);System.out.println("Date: "+DATE+" PJ: "+PJ);series15.getData().add(new XYChart.Data(DATE, PJ));}}
                    count++;}br.close();}
            //System.out.println("File Name: " + filename);
        }  
        catch(Exception e)  {e.printStackTrace();}}
    //Labuan Covid Data
    public static void retrievelabuanData(String selectMonth, XYChart.Series series16){
        try{
            URL url = new URL("https://raw.githubusercontent.com/ynshung/covid-19-malaysia/master/covid-19-my-states-cases.csv");
            HttpsURLConnection hr = (HttpsURLConnection)url.openConnection();
            String filename = url.getFile();    
            //System.out.println(hr.getResponseCode());
            if(hr.getResponseCode()==200){
                InputStream is = hr.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                br.readLine(); // read 1st line to ignore the displaying types first
                String[] values; String line = null; String DATE;
                int count = 1;
                int LB=0;
                while((line = br.readLine()) != null){
                    values = line.split(",");
                    if(selectMonth == "March"){
                        if(count >= 7 && count <= 19){ DATE = values[0];LB=Integer.parseInt(values[16]);System.out.println("Date: "+DATE+" KL: "+LB);series16.getData().add(new XYChart.Data(DATE, LB));}}
                    if(selectMonth == "April"){
                        if(count >= 20 && count <= 49){DATE = values[0];LB=Integer.parseInt(values[16]);System.out.println("Date: "+DATE+" KL: "+LB);series16.getData().add(new XYChart.Data(DATE, LB));}}
                    if(selectMonth == "May"){
                        if(count >= 50 && count <= 80){DATE = values[0];LB=Integer.parseInt(values[16]);System.out.println("Date: "+DATE+" KL: "+LB);series16.getData().add(new XYChart.Data(DATE, LB));}}
                    if(selectMonth == "June"){
                        if(count >= 81 && count <= 110){DATE = values[0];LB=Integer.parseInt(values[16]);System.out.println("Date: "+DATE+" KL: "+LB);series16.getData().add(new XYChart.Data(DATE, LB));}}
                    if(selectMonth == "July"){
                        if(count >= 111 && count <= 141){DATE = values[0];LB=Integer.parseInt(values[16]);System.out.println("Date: "+DATE+" KL: "+LB);series16.getData().add(new XYChart.Data(DATE, LB));}}
                    if(selectMonth == "August"){
                        if(count >= 142 && count <= 172){DATE = values[0];LB=Integer.parseInt(values[16]);System.out.println("Date: "+DATE+" KL: "+LB);series16.getData().add(new XYChart.Data(DATE, LB));}}
                    if(selectMonth == "September"){
                        if(count >= 173 && count <= 202){DATE = values[0];LB=Integer.parseInt(values[16]);System.out.println("Date: "+DATE+" KL: "+LB);series16.getData().add(new XYChart.Data(DATE, LB));}}
                    if(selectMonth == "October"){
                        if(count >= 203 && count <= 233){DATE = values[0];LB=Integer.parseInt(values[16]);System.out.println("Date: "+DATE+" KL: "+LB);series16.getData().add(new XYChart.Data(DATE, LB));}}      
                    if(selectMonth == "November"){
                        if(count >= 234 && count <= 263){DATE = values[0];LB=Integer.parseInt(values[16]);System.out.println("Date: "+DATE+" KL: "+LB);series16.getData().add(new XYChart.Data(DATE, LB));}}
                    if(selectMonth == "December"){
                        if(count >= 264 && count <= 294){DATE = values[0];LB=Integer.parseInt(values[16]);System.out.println("Date: "+DATE+" KL: "+LB);series16.getData().add(new XYChart.Data(DATE, LB));}}
                    count++;}br.close();}
            //System.out.println("File Name: " + filename);
        }  
        catch(Exception e)  {e.printStackTrace();}}
    //All
    public static void retrieveData(String selectMonth, XYChart.Series series1, XYChart.Series series2,
            XYChart.Series series3, XYChart.Series series4, XYChart.Series series5, XYChart.Series series6,
            XYChart.Series series7, XYChart.Series series8, XYChart.Series series9, XYChart.Series series10,
            XYChart.Series series11, XYChart.Series series12, XYChart.Series series13, XYChart.Series series14,
            XYChart.Series series15, XYChart.Series series16){
            try{
                URL url = new URL("https://raw.githubusercontent.com/ynshung/covid-19-malaysia/master/covid-19-my-states-cases.csv");
                HttpsURLConnection hr = (HttpsURLConnection)url.openConnection();
                String filename = url.getFile();    
                //System.out.println(hr.getResponseCode());
                if(hr.getResponseCode()==200){
                    InputStream is = hr.getInputStream();
                    BufferedReader br = new BufferedReader(new InputStreamReader(is));
                    br.readLine(); // read 1st line to ignore the displaying types first
                    String[] values; String line = null; String DATE;
                    int count = 1;
                    int JH=0, KD=0, KE=0, ML=0, NS=0, PH=0, PG=0, PK=0, PR=0, SB=0, SR=0, SE=0, TR=0, 
                        KL=0, PJ=0, LB=0;
                    while((line = br.readLine()) != null){
                        values = line.split(",");
                        if(selectMonth == "March"){
                            if(count >= 7 && count <= 19){
                                DATE = values[0];
                                PR=Integer.parseInt(values[1]); KD=Integer.parseInt(values[2]);
                                PG=Integer.parseInt(values[3]); PK=Integer.parseInt(values[4]);
                                SE=Integer.parseInt(values[5]); NS=Integer.parseInt(values[6]);
                                ML=Integer.parseInt(values[7]); JH=Integer.parseInt(values[8]);
                                PH=Integer.parseInt(values[9]); TR=Integer.parseInt(values[10]);
                                KE=Integer.parseInt(values[11]); SB=Integer.parseInt(values[12]);
                                SR=Integer.parseInt(values[13]); KL=Integer.parseInt(values[14]);
                                PJ=Integer.parseInt(values[15]); LB=Integer.parseInt(values[16]);

                                System.out.println("Date: "+DATE+" Johor: "+JH+" Kedah: "+KD+
                                    " Kelantan: "+KE+" Malacca: "+ML+" NS: "+NS+" Pahang: "+PH+
                                    " Penang: "+PG+" Kedah: "+PK+" Perlis: "+PR+" Sabah: "+SB+
                                    " Sarawak: "+SR+" Selangor: "+SE+" Terengganu: "+TR+" KL: "+KL+
                                    " Putrajaya: "+PJ+" Labuan: "+LB);

                                series1.getData().add(new XYChart.Data(DATE, JH));
                                series2.getData().add(new XYChart.Data(DATE, KD));
                                series3.getData().add(new XYChart.Data(DATE, KE));
                                series4.getData().add(new XYChart.Data(DATE, ML));
                                series5.getData().add(new XYChart.Data(DATE, NS));
                                series6.getData().add(new XYChart.Data(DATE, PH));
                                series7.getData().add(new XYChart.Data(DATE, PG));
                                series8.getData().add(new XYChart.Data(DATE, PK));
                                series9.getData().add(new XYChart.Data(DATE, PR));
                                series10.getData().add(new XYChart.Data(DATE, SB));
                                series11.getData().add(new XYChart.Data(DATE, SR));
                                series12.getData().add(new XYChart.Data(DATE, SE));
                                series13.getData().add(new XYChart.Data(DATE, TR));
                                series14.getData().add(new XYChart.Data(DATE, KL));
                                series15.getData().add(new XYChart.Data(DATE, PJ));
                                series16.getData().add(new XYChart.Data(DATE, LB));
                            }
                        }
                        if(selectMonth == "April"){
                            if(count >= 20 && count <= 49){
                                DATE = values[0];
                                PR=Integer.parseInt(values[1]); KD=Integer.parseInt(values[2]);
                                PG=Integer.parseInt(values[3]); PK=Integer.parseInt(values[4]);
                                SE=Integer.parseInt(values[5]); NS=Integer.parseInt(values[6]);
                                ML=Integer.parseInt(values[7]); JH=Integer.parseInt(values[8]);
                                PH=Integer.parseInt(values[9]); TR=Integer.parseInt(values[10]);
                                KE=Integer.parseInt(values[11]); SB=Integer.parseInt(values[12]);
                                SR=Integer.parseInt(values[13]); KL=Integer.parseInt(values[14]);
                                PJ=Integer.parseInt(values[15]); LB=Integer.parseInt(values[16]);

                                System.out.println("Date: "+DATE+" Johor: "+JH+" Kedah: "+KD+
                                    " Kelantan: "+KE+" Malacca: "+ML+" NS: "+NS+" Pahang: "+PH+
                                    " Penang: "+PG+" Kedah: "+PK+" Perlis: "+PR+" Sabah: "+SB+
                                    " Sarawak: "+SR+" Selangor: "+SE+" Terengganu: "+TR+" KL: "+KL+
                                    " Putrajaya: "+PJ+" Labuan: "+LB);

                                series1.getData().add(new XYChart.Data(DATE, JH));
                                series2.getData().add(new XYChart.Data(DATE, KD));
                                series3.getData().add(new XYChart.Data(DATE, KE));
                                series4.getData().add(new XYChart.Data(DATE, ML));
                                series5.getData().add(new XYChart.Data(DATE, NS));
                                series6.getData().add(new XYChart.Data(DATE, PH));
                                series7.getData().add(new XYChart.Data(DATE, PG));
                                series8.getData().add(new XYChart.Data(DATE, PK));
                                series9.getData().add(new XYChart.Data(DATE, PR));
                                series10.getData().add(new XYChart.Data(DATE, SB));
                                series11.getData().add(new XYChart.Data(DATE, SR));
                                series12.getData().add(new XYChart.Data(DATE, SE));
                                series13.getData().add(new XYChart.Data(DATE, TR));
                                series14.getData().add(new XYChart.Data(DATE, KL));
                                series15.getData().add(new XYChart.Data(DATE, PJ));
                                series16.getData().add(new XYChart.Data(DATE, LB));
                            }
                        }
                        if(selectMonth == "May"){
                            if(count >= 50 && count <= 80){
                                DATE = values[0];
                                PR=Integer.parseInt(values[1]); KD=Integer.parseInt(values[2]);
                                PG=Integer.parseInt(values[3]); PK=Integer.parseInt(values[4]);
                                SE=Integer.parseInt(values[5]); NS=Integer.parseInt(values[6]);
                                ML=Integer.parseInt(values[7]); JH=Integer.parseInt(values[8]);
                                PH=Integer.parseInt(values[9]); TR=Integer.parseInt(values[10]);
                                KE=Integer.parseInt(values[11]); SB=Integer.parseInt(values[12]);
                                SR=Integer.parseInt(values[13]); KL=Integer.parseInt(values[14]);
                                PJ=Integer.parseInt(values[15]); LB=Integer.parseInt(values[16]);

                                System.out.println("Date: "+DATE+" Johor: "+JH+" Kedah: "+KD+
                                    " Kelantan: "+KE+" Malacca: "+ML+" NS: "+NS+" Pahang: "+PH+
                                    " Penang: "+PG+" Kedah: "+PK+" Perlis: "+PR+" Sabah: "+SB+
                                    " Sarawak: "+SR+" Selangor: "+SE+" Terengganu: "+TR+" KL: "+KL+
                                    " Putrajaya: "+PJ+" Labuan: "+LB);

                                series1.getData().add(new XYChart.Data(DATE, JH));
                                series2.getData().add(new XYChart.Data(DATE, KD));
                                series3.getData().add(new XYChart.Data(DATE, KE));
                                series4.getData().add(new XYChart.Data(DATE, ML));
                                series5.getData().add(new XYChart.Data(DATE, NS));
                                series6.getData().add(new XYChart.Data(DATE, PH));
                                series7.getData().add(new XYChart.Data(DATE, PG));
                                series8.getData().add(new XYChart.Data(DATE, PK));
                                series9.getData().add(new XYChart.Data(DATE, PR));
                                series10.getData().add(new XYChart.Data(DATE, SB));
                                series11.getData().add(new XYChart.Data(DATE, SR));
                                series12.getData().add(new XYChart.Data(DATE, SE));
                                series13.getData().add(new XYChart.Data(DATE, TR));
                                series14.getData().add(new XYChart.Data(DATE, KL));
                                series15.getData().add(new XYChart.Data(DATE, PJ));
                                series16.getData().add(new XYChart.Data(DATE, LB));
                            }
                        }
                        if(selectMonth == "June"){
                            if(count >= 81 && count <= 110){
                                DATE = values[0];
                                PR=Integer.parseInt(values[1]); KD=Integer.parseInt(values[2]);
                                PG=Integer.parseInt(values[3]); PK=Integer.parseInt(values[4]);
                                SE=Integer.parseInt(values[5]); NS=Integer.parseInt(values[6]);
                                ML=Integer.parseInt(values[7]); JH=Integer.parseInt(values[8]);
                                PH=Integer.parseInt(values[9]); TR=Integer.parseInt(values[10]);
                                KE=Integer.parseInt(values[11]); SB=Integer.parseInt(values[12]);
                                SR=Integer.parseInt(values[13]); KL=Integer.parseInt(values[14]);
                                PJ=Integer.parseInt(values[15]); LB=Integer.parseInt(values[16]);

                                System.out.println("Date: "+DATE+" Johor: "+JH+" Kedah: "+KD+
                                    " Kelantan: "+KE+" Malacca: "+ML+" NS: "+NS+" Pahang: "+PH+
                                    " Penang: "+PG+" Kedah: "+PK+" Perlis: "+PR+" Sabah: "+SB+
                                    " Sarawak: "+SR+" Selangor: "+SE+" Terengganu: "+TR+" KL: "+KL+
                                    " Putrajaya: "+PJ+" Labuan: "+LB);

                                series1.getData().add(new XYChart.Data(DATE, JH));
                                series2.getData().add(new XYChart.Data(DATE, KD));
                                series3.getData().add(new XYChart.Data(DATE, KE));
                                series4.getData().add(new XYChart.Data(DATE, ML));
                                series5.getData().add(new XYChart.Data(DATE, NS));
                                series6.getData().add(new XYChart.Data(DATE, PH));
                                series7.getData().add(new XYChart.Data(DATE, PG));
                                series8.getData().add(new XYChart.Data(DATE, PK));
                                series9.getData().add(new XYChart.Data(DATE, PR));
                                series10.getData().add(new XYChart.Data(DATE, SB));
                                series11.getData().add(new XYChart.Data(DATE, SR));
                                series12.getData().add(new XYChart.Data(DATE, SE));
                                series13.getData().add(new XYChart.Data(DATE, TR));
                                series14.getData().add(new XYChart.Data(DATE, KL));
                                series15.getData().add(new XYChart.Data(DATE, PJ));
                                series16.getData().add(new XYChart.Data(DATE, LB));
                            }
                        }
                        if(selectMonth == "July"){
                            if(count >= 111 && count <= 141){
                                DATE = values[0];
                                PR=Integer.parseInt(values[1]); KD=Integer.parseInt(values[2]);
                                PG=Integer.parseInt(values[3]); PK=Integer.parseInt(values[4]);
                                SE=Integer.parseInt(values[5]); NS=Integer.parseInt(values[6]);
                                ML=Integer.parseInt(values[7]); JH=Integer.parseInt(values[8]);
                                PH=Integer.parseInt(values[9]); TR=Integer.parseInt(values[10]);
                                KE=Integer.parseInt(values[11]); SB=Integer.parseInt(values[12]);
                                SR=Integer.parseInt(values[13]); KL=Integer.parseInt(values[14]);
                                PJ=Integer.parseInt(values[15]); LB=Integer.parseInt(values[16]);

                                System.out.println("Date: "+DATE+" Johor: "+JH+" Kedah: "+KD+
                                    " Kelantan: "+KE+" Malacca: "+ML+" NS: "+NS+" Pahang: "+PH+
                                    " Penang: "+PG+" Kedah: "+PK+" Perlis: "+PR+" Sabah: "+SB+
                                    " Sarawak: "+SR+" Selangor: "+SE+" Terengganu: "+TR+" KL: "+KL+
                                    " Putrajaya: "+PJ+" Labuan: "+LB);

                                series1.getData().add(new XYChart.Data(DATE, JH));
                                series2.getData().add(new XYChart.Data(DATE, KD));
                                series3.getData().add(new XYChart.Data(DATE, KE));
                                series4.getData().add(new XYChart.Data(DATE, ML));
                                series5.getData().add(new XYChart.Data(DATE, NS));
                                series6.getData().add(new XYChart.Data(DATE, PH));
                                series7.getData().add(new XYChart.Data(DATE, PG));
                                series8.getData().add(new XYChart.Data(DATE, PK));
                                series9.getData().add(new XYChart.Data(DATE, PR));
                                series10.getData().add(new XYChart.Data(DATE, SB));
                                series11.getData().add(new XYChart.Data(DATE, SR));
                                series12.getData().add(new XYChart.Data(DATE, SE));
                                series13.getData().add(new XYChart.Data(DATE, TR));
                                series14.getData().add(new XYChart.Data(DATE, KL));
                                series15.getData().add(new XYChart.Data(DATE, PJ));
                                series16.getData().add(new XYChart.Data(DATE, LB));
                            }
                        }
                        if(selectMonth == "August"){
                            if(count >= 142 && count <= 172){
                                DATE = values[0];
                                PR=Integer.parseInt(values[1]); KD=Integer.parseInt(values[2]);
                                PG=Integer.parseInt(values[3]); PK=Integer.parseInt(values[4]);
                                SE=Integer.parseInt(values[5]); NS=Integer.parseInt(values[6]);
                                ML=Integer.parseInt(values[7]); JH=Integer.parseInt(values[8]);
                                PH=Integer.parseInt(values[9]); TR=Integer.parseInt(values[10]);
                                KE=Integer.parseInt(values[11]); SB=Integer.parseInt(values[12]);
                                SR=Integer.parseInt(values[13]); KL=Integer.parseInt(values[14]);
                                PJ=Integer.parseInt(values[15]); LB=Integer.parseInt(values[16]);

                                System.out.println("Date: "+DATE+" Johor: "+JH+" Kedah: "+KD+
                                    " Kelantan: "+KE+" Malacca: "+ML+" NS: "+NS+" Pahang: "+PH+
                                    " Penang: "+PG+" Kedah: "+PK+" Perlis: "+PR+" Sabah: "+SB+
                                    " Sarawak: "+SR+" Selangor: "+SE+" Terengganu: "+TR+" KL: "+KL+
                                    " Putrajaya: "+PJ+" Labuan: "+LB);

                                series1.getData().add(new XYChart.Data(DATE, JH));
                                series2.getData().add(new XYChart.Data(DATE, KD));
                                series3.getData().add(new XYChart.Data(DATE, KE));
                                series4.getData().add(new XYChart.Data(DATE, ML));
                                series5.getData().add(new XYChart.Data(DATE, NS));
                                series6.getData().add(new XYChart.Data(DATE, PH));
                                series7.getData().add(new XYChart.Data(DATE, PG));
                                series8.getData().add(new XYChart.Data(DATE, PK));
                                series9.getData().add(new XYChart.Data(DATE, PR));
                                series10.getData().add(new XYChart.Data(DATE, SB));
                                series11.getData().add(new XYChart.Data(DATE, SR));
                                series12.getData().add(new XYChart.Data(DATE, SE));
                                series13.getData().add(new XYChart.Data(DATE, TR));
                                series14.getData().add(new XYChart.Data(DATE, KL));
                                series15.getData().add(new XYChart.Data(DATE, PJ));
                                series16.getData().add(new XYChart.Data(DATE, LB));
                            }
                        }
                        if(selectMonth == "September"){
                            if(count >= 173 && count <= 202){
                                DATE = values[0];
                                PR=Integer.parseInt(values[1]); KD=Integer.parseInt(values[2]);
                                PG=Integer.parseInt(values[3]); PK=Integer.parseInt(values[4]);
                                SE=Integer.parseInt(values[5]); NS=Integer.parseInt(values[6]);
                                ML=Integer.parseInt(values[7]); JH=Integer.parseInt(values[8]);
                                PH=Integer.parseInt(values[9]); TR=Integer.parseInt(values[10]);
                                KE=Integer.parseInt(values[11]); SB=Integer.parseInt(values[12]);
                                SR=Integer.parseInt(values[13]); KL=Integer.parseInt(values[14]);
                                PJ=Integer.parseInt(values[15]); LB=Integer.parseInt(values[16]);

                                System.out.println("Date: "+DATE+" Johor: "+JH+" Kedah: "+KD+
                                    " Kelantan: "+KE+" Malacca: "+ML+" NS: "+NS+" Pahang: "+PH+
                                    " Penang: "+PG+" Kedah: "+PK+" Perlis: "+PR+" Sabah: "+SB+
                                    " Sarawak: "+SR+" Selangor: "+SE+" Terengganu: "+TR+" KL: "+KL+
                                    " Putrajaya: "+PJ+" Labuan: "+LB);

                                series1.getData().add(new XYChart.Data(DATE, JH));
                                series2.getData().add(new XYChart.Data(DATE, KD));
                                series3.getData().add(new XYChart.Data(DATE, KE));
                                series4.getData().add(new XYChart.Data(DATE, ML));
                                series5.getData().add(new XYChart.Data(DATE, NS));
                                series6.getData().add(new XYChart.Data(DATE, PH));
                                series7.getData().add(new XYChart.Data(DATE, PG));
                                series8.getData().add(new XYChart.Data(DATE, PK));
                                series9.getData().add(new XYChart.Data(DATE, PR));
                                series10.getData().add(new XYChart.Data(DATE, SB));
                                series11.getData().add(new XYChart.Data(DATE, SR));
                                series12.getData().add(new XYChart.Data(DATE, SE));
                                series13.getData().add(new XYChart.Data(DATE, TR));
                                series14.getData().add(new XYChart.Data(DATE, KL));
                                series15.getData().add(new XYChart.Data(DATE, PJ));
                                series16.getData().add(new XYChart.Data(DATE, LB));
                            }
                        }
                        if(selectMonth == "October"){
                            if(count >= 203 && count <= 233){
                                DATE = values[0];
                                PR=Integer.parseInt(values[1]); KD=Integer.parseInt(values[2]);
                                PG=Integer.parseInt(values[3]); PK=Integer.parseInt(values[4]);
                                SE=Integer.parseInt(values[5]); NS=Integer.parseInt(values[6]);
                                ML=Integer.parseInt(values[7]); JH=Integer.parseInt(values[8]);
                                PH=Integer.parseInt(values[9]); TR=Integer.parseInt(values[10]);
                                KE=Integer.parseInt(values[11]); SB=Integer.parseInt(values[12]);
                                SR=Integer.parseInt(values[13]); KL=Integer.parseInt(values[14]);
                                PJ=Integer.parseInt(values[15]); LB=Integer.parseInt(values[16]);

                                System.out.println("Date: "+DATE+" Johor: "+JH+" Kedah: "+KD+
                                    " Kelantan: "+KE+" Malacca: "+ML+" NS: "+NS+" Pahang: "+PH+
                                    " Penang: "+PG+" Kedah: "+PK+" Perlis: "+PR+" Sabah: "+SB+
                                    " Sarawak: "+SR+" Selangor: "+SE+" Terengganu: "+TR+" KL: "+KL+
                                    " Putrajaya: "+PJ+" Labuan: "+LB);

                                series1.getData().add(new XYChart.Data(DATE, JH));
                                series2.getData().add(new XYChart.Data(DATE, KD));
                                series3.getData().add(new XYChart.Data(DATE, KE));
                                series4.getData().add(new XYChart.Data(DATE, ML));
                                series5.getData().add(new XYChart.Data(DATE, NS));
                                series6.getData().add(new XYChart.Data(DATE, PH));
                                series7.getData().add(new XYChart.Data(DATE, PG));
                                series8.getData().add(new XYChart.Data(DATE, PK));
                                series9.getData().add(new XYChart.Data(DATE, PR));
                                series10.getData().add(new XYChart.Data(DATE, SB));
                                series11.getData().add(new XYChart.Data(DATE, SR));
                                series12.getData().add(new XYChart.Data(DATE, SE));
                                series13.getData().add(new XYChart.Data(DATE, TR));
                                series14.getData().add(new XYChart.Data(DATE, KL));
                                series15.getData().add(new XYChart.Data(DATE, PJ));
                                series16.getData().add(new XYChart.Data(DATE, LB));
                            }
                        }
                        if(selectMonth == "November"){
                            if(count >= 234 && count <= 263){
                                DATE = values[0];
                                PR=Integer.parseInt(values[1]); KD=Integer.parseInt(values[2]);
                                PG=Integer.parseInt(values[3]); PK=Integer.parseInt(values[4]);
                                SE=Integer.parseInt(values[5]); NS=Integer.parseInt(values[6]);
                                ML=Integer.parseInt(values[7]); JH=Integer.parseInt(values[8]);
                                PH=Integer.parseInt(values[9]); TR=Integer.parseInt(values[10]);
                                KE=Integer.parseInt(values[11]); SB=Integer.parseInt(values[12]);
                                SR=Integer.parseInt(values[13]); KL=Integer.parseInt(values[14]);
                                PJ=Integer.parseInt(values[15]); LB=Integer.parseInt(values[16]);

                                System.out.println("Date: "+DATE+" Johor: "+JH+" Kedah: "+KD+
                                    " Kelantan: "+KE+" Malacca: "+ML+" NS: "+NS+" Pahang: "+PH+
                                    " Penang: "+PG+" Kedah: "+PK+" Perlis: "+PR+" Sabah: "+SB+
                                    " Sarawak: "+SR+" Selangor: "+SE+" Terengganu: "+TR+" KL: "+KL+
                                    " Putrajaya: "+PJ+" Labuan: "+LB);

                                series1.getData().add(new XYChart.Data(DATE, JH));
                                series2.getData().add(new XYChart.Data(DATE, KD));
                                series3.getData().add(new XYChart.Data(DATE, KE));
                                series4.getData().add(new XYChart.Data(DATE, ML));
                                series5.getData().add(new XYChart.Data(DATE, NS));
                                series6.getData().add(new XYChart.Data(DATE, PH));
                                series7.getData().add(new XYChart.Data(DATE, PG));
                                series8.getData().add(new XYChart.Data(DATE, PK));
                                series9.getData().add(new XYChart.Data(DATE, PR));
                                series10.getData().add(new XYChart.Data(DATE, SB));
                                series11.getData().add(new XYChart.Data(DATE, SR));
                                series12.getData().add(new XYChart.Data(DATE, SE));
                                series13.getData().add(new XYChart.Data(DATE, TR));
                                series14.getData().add(new XYChart.Data(DATE, KL));
                                series15.getData().add(new XYChart.Data(DATE, PJ));
                                series16.getData().add(new XYChart.Data(DATE, LB));
                            }
                        }
                        if(selectMonth == "December"){
                            if(count >= 264 && count <= 294){
                                DATE = values[0];
                                PR=Integer.parseInt(values[1]); KD=Integer.parseInt(values[2]);
                                PG=Integer.parseInt(values[3]); PK=Integer.parseInt(values[4]);
                                SE=Integer.parseInt(values[5]); NS=Integer.parseInt(values[6]);
                                ML=Integer.parseInt(values[7]); JH=Integer.parseInt(values[8]);
                                PH=Integer.parseInt(values[9]); TR=Integer.parseInt(values[10]);
                                KE=Integer.parseInt(values[11]); SB=Integer.parseInt(values[12]);
                                SR=Integer.parseInt(values[13]); KL=Integer.parseInt(values[14]);
                                PJ=Integer.parseInt(values[15]); LB=Integer.parseInt(values[16]);

                                System.out.println("Date: "+DATE+" Johor: "+JH+" Kedah: "+KD+
                                    " Kelantan: "+KE+" Malacca: "+ML+" NS: "+NS+" Pahang: "+PH+
                                    " Penang: "+PG+" Kedah: "+PK+" Perlis: "+PR+" Sabah: "+SB+
                                    " Sarawak: "+SR+" Selangor: "+SE+" Terengganu: "+TR+" KL: "+KL+
                                    " Putrajaya: "+PJ+" Labuan: "+LB);

                                series1.getData().add(new XYChart.Data(DATE, JH));
                                series2.getData().add(new XYChart.Data(DATE, KD));
                                series3.getData().add(new XYChart.Data(DATE, KE));
                                series4.getData().add(new XYChart.Data(DATE, ML));
                                series5.getData().add(new XYChart.Data(DATE, NS));
                                series6.getData().add(new XYChart.Data(DATE, PH));
                                series7.getData().add(new XYChart.Data(DATE, PG));
                                series8.getData().add(new XYChart.Data(DATE, PK));
                                series9.getData().add(new XYChart.Data(DATE, PR));
                                series10.getData().add(new XYChart.Data(DATE, SB));
                                series11.getData().add(new XYChart.Data(DATE, SR));
                                series12.getData().add(new XYChart.Data(DATE, SE));
                                series13.getData().add(new XYChart.Data(DATE, TR));
                                series14.getData().add(new XYChart.Data(DATE, KL));
                                series15.getData().add(new XYChart.Data(DATE, PJ));
                                series16.getData().add(new XYChart.Data(DATE, LB));
                            }
                        }
                        count++;
                    }
                    br.close();
                }
                //System.out.println("File Name: " + filename);
            }  
            catch(Exception e)  {e.printStackTrace();}    
        }
}