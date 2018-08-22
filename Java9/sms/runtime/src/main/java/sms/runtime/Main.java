package sms.runtime;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CommandRunner commandRunner = new CommandRunner();
        Scanner scanner = new Scanner(System.in);
        String line;
        while (!Objects.equals((line=scanner.nextLine()),"quit")){
            String[] inputs = line.split("\\W");
            commandRunner.run(inputs[0],inputs[1], Arrays.asList(Arrays.copyOfRange(inputs,2,inputs.length)));
        }
    }
}