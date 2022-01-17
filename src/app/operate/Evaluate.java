package app.operate;
import app.popup.Warning;
import app.operate.Calculate;

public class Evaluate {
    private int operator_count = 0;
    private int character_count = 0;
    private int unwanted_click_count = 0;
    private float previous_number;
    private float previous_result;
    private String eval_string;
    private String current_operator;
    private String previous_operator;
    private String operators = "asmdpr";
    private boolean equal_repeater = false;
    private boolean operator_selected = false;
    private Calculate calc=new Calculate();


    private void clear() {
        this.equal_repeater = false;
        this.previous_operator = "";
        this.eval_string = "";
        this.operator_selected = false;
        this.character_count = 0;
        this.operator_count = 0;
        this.unwanted_click_count =0;
        this.current_operator = "";
    }

    private void do_repeat() {
        float result = 0;

        result = calc.calculate(this.previous_result, this.previous_number, this.previous_operator);
        this.previous_result = result;
        this.eval_string = Float.toString(result);
        this.equal_repeater = true;
    }

    private void do_evaluation() {
        int string_length = this.eval_string.length();
        float result = 0;
        String split_value = this.current_operator;

        try {
            String eval_arr[] = this.eval_string.split(split_value, string_length);
            try {
                result = calc.calculate(Float.parseFloat(eval_arr[eval_arr.length - 2]), Float.parseFloat(eval_arr[eval_arr.length - 1]), this.current_operator);
                this.eval_string = Float.toString(result); 
                this.previous_number = Float.parseFloat(eval_arr[1]);
                this.previous_operator = this.current_operator;
                this.previous_result = result;
                this.equal_repeater = true;
            
            } catch (Exception e) {
                String first_character = Character.toString(this.eval_string.charAt(0));

                if (eval_arr.length < 2){
                    if (this.operators.contains(first_character)) {
                        this.clear();
                    }
                } else {
                    if (this.operators.contains(first_character)) {
                        if (first_character.contains("a")) {
                            this.eval_string = this.eval_string.replace(first_character, "");
                        } 
                        else if (first_character.contains("s")){
                            this.eval_string = this.eval_string.replace("s", "-");
                        } 
                        else {
                            new Warning("You Have Entered A Invalid Combination Of Numbers and Operators");
                            this.eval_string = "";
                        }
                    } else {
                        new Warning("You Have Entered A Invalid Combination Of Numbers and Operators"); 
                    }
                }
            }
        }
        catch (Exception e) {
            this.unwanted_click_count += 1;
            if (this.unwanted_click_count > 3) {
                new Warning("No Values Were Provided To Do Operations On");
                this.unwanted_click_count = 0;
            }
        }
    }

    private String eval_string_assemble(String eval_string) {
        eval_string = eval_string.replaceAll("a", " \\+ ");
        eval_string = eval_string.replaceAll("s", " \\- ");
        eval_string = eval_string.replaceAll("m", " \\* ");
        eval_string = eval_string.replaceAll("d", " \\/ ");
        eval_string = eval_string.replaceAll("p", " \\% ");
        eval_string = eval_string.replaceAll("r", " \\^ ");
        return eval_string;
    }

    private String eval_string_dissemble(String eval_string) {
        eval_string = eval_string.replaceAll(" \\+ ", "a");
        eval_string = eval_string.replaceAll(" \\- ", "s");
        eval_string = eval_string.replaceAll(" \\* ", "m");
        eval_string = eval_string.replaceAll(" \\/ ", "d");
        eval_string = eval_string.replaceAll(" \\% ", "p");
        eval_string = eval_string.replaceAll(" \\^ ", "r");
        return eval_string;
    }

    public String evaluate(String character, String eval_string) {
        this.eval_string = eval_string_dissemble(eval_string);
        if (operators.contains(character)) {
            if (this.operator_selected) {
                StringBuffer buffer_str=new StringBuffer(this.eval_string);
                buffer_str.deleteCharAt(this.eval_string.length() - 1);
                this.eval_string = buffer_str + "";
            } else {
                this.operator_selected = true;
                this.operator_count += 1;
            }

            if (this.operator_count == 2) {
                this.do_evaluation();
                this.operator_count = 1;
            }
            this.equal_repeater = false;
            this.current_operator = character;
            this.eval_string = this.eval_string + character;
        } else {
            this.operator_selected = false;
            if (character == "equals") {
                if (this.equal_repeater) {
                    this.do_repeat();
                } else {
                    this.do_evaluation();
                }
                this.character_count = this.eval_string.length();
                this.operator_count = 0;
            } 
            else if (character == "clear") {
                this.clear();
            }
            else {
                this.equal_repeater = false;
                this.character_count += 1;
                this.eval_string = this.eval_string + character;
            }  
        }

        this.eval_string = this.eval_string_assemble(this.eval_string);
        if (this.eval_string.endsWith(".0")) {
            this.eval_string = this.eval_string.replace(".0", "");
        }

        return this.eval_string;
    }
}