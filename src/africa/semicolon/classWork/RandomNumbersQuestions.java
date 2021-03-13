package africa.semicolon.classWork;

import java.security.SecureRandom;

public class RandomNumbersQuestions {
    private int result;
    private int score;
    private int firstOperand;
    private int secondOperand;
    private String operator;

  SecureRandom random = new SecureRandom();
  public int setFirstOperand(){
      firstOperand = 1 + random.nextInt(9);
      return firstOperand;
  }
  public int setSecondOperand (){
      secondOperand = 1 + random.nextInt(9);
      return secondOperand;
  }
  public String setOperator(){
      int generatedOperator = 1 + random.nextInt(5);
      switch (generatedOperator){
          case 1:
              operator = "+";
              break;
          case 2:
              operator = "-";
              break;
          case 3:
              operator = "*";
              break;
          case 4:
              operator = "/";
              break;
          case 5:
              operator = "%";
      }
      return operator;
  }
  public void generateQuestion(){
      if (operator.equals("+"))
         result = firstOperand + secondOperand;
      else if (operator.equals("-"))
          result = firstOperand - secondOperand;
      else if (operator.equals("*"))
          result = firstOperand * secondOperand;
      else if (operator.equals("/"))
          result = firstOperand / secondOperand;
      else if (operator.equals("%"))
          result = firstOperand % secondOperand;
  }

  public String question(){
      return firstOperand + " " + operator + " " + secondOperand;
  }
    public int getScore() {
        return score;
    }
  public void evaluate(int input){
      if (input == result){
          score++;
          System.out.println("Correct!");
      } else
          System.out.println("Wrong!");
  }

}
