// 2 Создать файл file.txt. Если файл уже создан, ничего делать не надо. 
// Записать в файл слово TEXT 100 раз: TEXTTEXTTEXTTEXTTEXTTEXT...

import java.nio.file.Files;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class task2 {

    public static void main(String[] args) {
        Path path = Path.of("file.txt");
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            str.append("TEXT");
        }
        String result = str.toString();
        
            if (Files.exists(path)) {
                System.out.println("Найден файл");
            }
            else {
                for (int i = 0; i<100; i++){
                try{
                    
                    Files.writeString(path, result);
                        } catch(IOException e){
                            System.out.println("Error" + e);
                        }
                }
            }    
        } 
     
}
