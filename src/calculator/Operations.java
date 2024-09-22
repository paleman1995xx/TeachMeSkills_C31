package calculator;

import java.util.Arrays;
import java.util.List;

public class Operations {
    private static final List<Operation> operationsList = Arrays.asList(Operation.values());

    public static String calculation(StringBuilder example){
        try {
            Double leftNumber = null, rightNumber = null;
            Operation executionOperation= null;
            for(int i = 1; i < example.length(); i++){
                for(Operation operation: operationsList){
                    if(example.charAt(i) == operation.getOperChar()){
                        executionOperation = operation;
                        leftNumber = Double.parseDouble(example.substring(0, i));
                        rightNumber = Double.parseDouble(example.substring(i+1,example.length()));
                    }
                }
            }
            return getAnswer(leftNumber, rightNumber, executionOperation);
        }catch (Exception ex){
            return "ERROR";
        }
    }

    private static String getAnswer(Double leftNumber, Double rightNumber, Operation operation){
        switch (operation){
            case PLUS -> {
                return String.valueOf(leftNumber + rightNumber);
            }
            case MINUS -> {
                return String.valueOf(leftNumber - rightNumber);
            }
            case MULTIPLY -> {
                return String.valueOf(leftNumber * rightNumber);
            }
            case DIVISION -> {
                return String.valueOf(leftNumber / rightNumber);
            }
            case MOD -> {
                return String.valueOf(leftNumber % rightNumber);
            }
            default -> {
                return "ERROR";
            }
        }
    }

    public static String addTextOperation(StringBuilder stringBuilder, String operation){
        stringBuilder.append(operation);
        return stringBuilder.toString();
    }

    public static String backsOperation(StringBuilder stringBuilder){
        if(!stringBuilder.isEmpty()) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        return stringBuilder.toString();
    }

    public static String clearOperation(){
        return "";
    }
}
