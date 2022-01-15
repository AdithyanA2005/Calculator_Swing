package app;

public class Operate {
    private StringBuffer buffer_str;
    private boolean operator_clicked = true;
    private boolean start_operators = false;
    private String operators = "+-*/%";
    private int character_count = 0;
    private int do_eval = 0;

    private float current_num1;
    private float current_num2;
    private String current_operator;

    private String do_evaluation(String eval_str) {
        float result = 0;
        System.out.println("Evaluation Triggered");
        String[] eval_arr = eval_str.split("\\" + current_operator, eval_str.length());

        if (current_operator == "+") {
            result = Float.parseFloat(eval_arr[0]) + Float.parseFloat(eval_arr[1]);
        } else if (current_operator == "-") {
            result = Float.parseFloat(eval_arr[0]) - Float.parseFloat(eval_arr[1]);
        } else if (current_operator == "*") {
            result = Float.parseFloat(eval_arr[0]) * Float.parseFloat(eval_arr[1]);
        } else if (current_operator == "/") {
            result = Float.parseFloat(eval_arr[0]) / Float.parseFloat(eval_arr[1]);
        } else if (current_operator == "%") {
            result = Float.parseFloat(eval_arr[0]) / 100 * Float.parseFloat(eval_arr[1]);
        }

        eval_str = result + "";      
        return eval_str;
    }

    public String appendCharacter(String character, String eval_string) {
            // System.out.println(current_num1);
            // System.out.println(current_num2);
            // System.out.println(current_operator);

        if (operators.contains(character)) {
            do_eval += 1;
            
            if (do_eval >= 2) {
                eval_string = do_evaluation(eval_string);

                do_eval = 1;
            } else {
                // eval_string = eval_string + character;
            }
            System.out.println(eval_string);

            current_operator = character;
            eval_string = eval_string + character;
        } else {
            character_count += 1;
            eval_string = eval_string + character;
        }


        // if (character == "equals") {
        //     eval_string = do_evaluation(eval_string);
        // } else {
        //     if (operators.contains(character)) {
        //         if (operator_clicked) {
        //             buffer_str = new StringBuffer(eval_string);
        //             buffer_str = buffer_str.deleteCharAt(eval_string.length() - 1);
        //             eval_string = buffer_str + "";
        //         }
        //         operator_clicked = true;
        //     }
        //     else {
        //         operator_clicked = false;
        //     }

            
            
        //     if (character == "backspace") {
        //     }
        //     else if (character == "clear") {
        //         // If Clear Button Is Pressed 
        //         eval_string = "";
                // operator_clicked = false;
        //     } 
        //     else {
        //         // If Any Other Buttons are Pressed 
        //         eval_string += character;
        //     }
        // }
        return eval_string;
    }
}